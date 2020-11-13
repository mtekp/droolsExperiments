package com.testing.drools.test.events.continuous;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

public class TestDroolEventsContinousTest {
	SessionProxy sp;
    Date startDate = new Date();

    @Test
    public void withInitialState() throws IOException {
        sp = new TestDroolEventsContinous();

        // insert EventDataMessage within one minute 6 times
        Instant si = startDate.toInstant();



        AnomalyEventInsert m1 = new AnomalyEventInsert(LocalDate.now());

        sp.insert(m1);


        AnomalyEventInsert m2 = new AnomalyEventInsert(LocalDate.now());
        sp.insert(m2);


        AnomalyEventInsert m3 = new AnomalyEventInsert(LocalDate.now());
        sp.insert(m3);

        AnomalyEventInsert m4 = new AnomalyEventInsert(LocalDate.now().plusDays(1));
        sp.insert(m4);


        AnomalyEventInsert m5 = new AnomalyEventInsert(LocalDate.now().plusDays(2));
        sp.insert(m5);


        AnomalyEventInsert m6 = new AnomalyEventInsert(LocalDate.now().plusDays(3));
        sp.insert(m6);


    }

}
