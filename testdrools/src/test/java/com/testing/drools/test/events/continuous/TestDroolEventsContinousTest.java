package com.testing.drools.test.events.continuous;

import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class TestDroolEventsContinousTest {
	SessionProxy sp;
    Date startDate = new Date();

    @Test
    public void withInitialState() throws IOException {
        sp = new TestDroolEventsContinous();

        // insert EventDataMessage within one minute 6 times
        var si = startDate.toInstant();



        var m1 = new AnomalyEventInsert(LocalDate.now());

        sp.insert(m1);


        var m2 = new AnomalyEventInsert(LocalDate.now());
        sp.insert(m2);


        var m3 = new AnomalyEventInsert(LocalDate.now());
        sp.insert(m3);

        var m4 = new AnomalyEventInsert(LocalDate.now().plusDays(1));
        sp.insert(m4);


        var m5 = new AnomalyEventInsert(LocalDate.now().plusDays(2));
        sp.insert(m5);


        var m6 = new AnomalyEventInsert(LocalDate.now().plusDays(3));
        sp.insert(m6);


    }

}
