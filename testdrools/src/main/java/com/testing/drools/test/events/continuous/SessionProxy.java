package com.testing.drools.test.events.continuous;


import org.kie.api.KieServices;
import org.kie.api.KieServices.Factory;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public abstract class SessionProxy {
    protected static Logger logger = LoggerFactory.getLogger(SessionProxy.class);
    private KieSession session;
    boolean eventReceivedInfile = false;

    public SessionProxy() {
    }

    protected abstract String getSessionName();


    private KieSession getSession() throws IOException {
        if (this.session == null) {
            synchronized (this) {
                this.session = this.buildSession();
                this.session.setGlobal("logger", logger);
            }
        }

        return this.session;
    }

    protected KieSession buildSession() throws IOException {
        KieServices var1 = Factory.get();
        KieContainer var2 = var1.newKieClasspathContainer(this.getClass().getClassLoader());
        return var2.newKieSession(this.getSessionName());
    }

    public void insert(Object var1) throws IOException {
        this.eventReceivedInfile = true;
        KieSession var3 = this.getSession();
        var3.insert(var1);
        var3.fireAllRules();

    }


}
