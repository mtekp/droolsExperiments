package com.testing.drools.test.events.continuous;


public class TestDroolEventsContinous extends SessionProxy {
    private static final String SESSION_NAME = "TestDroolEventsContinous";

    private long counter = 0;


    @Override
    protected String getSessionName() {
        return SESSION_NAME;
    }


}
