package com.testing.drools.test.events.continuous;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

public class AnomalyEventInsert extends AnomalyEvent {
    public AnomalyEventInsert(LocalDate ts) {
        this.ts = Date.from(ts.atStartOfDay().toInstant( ZoneOffset.UTC));
    }

    @Override
    public String toString() {
        return "AnomalyEventInsert{" +
                "ts=" + ts +
                '}';
    }
}
