package com.testing.drools.test.events.continuous;

import java.util.Date;

public class AnomalyEventInsert extends AnomalyEvent {
    public AnomalyEventInsert(Date ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "AnomalyEventInsert{" +
                "ts=" + ts +
                '}';
    }
}
