package com.testing.drools.test.events.continuous;

import static java.util.concurrent.TimeUnit.DAYS;

import java.io.IOException;
import java.util.Date;

import org.droolsassert.DroolsAssert;
import org.droolsassert.DroolsSession;
import org.junit.Rule;
import org.junit.Test;

@DroolsSession("test/events/continuous/*")
public class TestDroolEventsContinousTest extends DroolsAssert {
	
	@Rule
	public DroolsAssert droolsAssert = this;
	
	@Test
	public void withInitialState() throws IOException {
		
		insertAndFire(new AnomalyEventInsert(new Date(DAYS.toMillis(0))));
		insertAndFire(new AnomalyEventInsert(new Date(DAYS.toMillis(0))));
		insertAndFire(new AnomalyEventInsert(new Date(DAYS.toMillis(0))));
		
		advanceTime(1, DAYS);
		insertAndFire(new AnomalyEventInsert(new Date(DAYS.toMillis(1))));
		
		advanceTime(1, DAYS);
		insertAndFire(new AnomalyEventInsert(new Date(DAYS.toMillis(2))));
		
		advanceTime(1, DAYS);
		insertAndFire(new AnomalyEventInsert(new Date(DAYS.toMillis(3))));

		advanceTime(3, DAYS);
	}
}
