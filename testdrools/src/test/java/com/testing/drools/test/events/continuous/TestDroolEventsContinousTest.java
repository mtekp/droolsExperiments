package com.testing.drools.test.events.continuous;

import java.io.IOException;
import java.time.LocalDate;

import org.droolsassert.DroolsAssert;
import org.droolsassert.DroolsSession;
import org.junit.Rule;
import org.junit.Test;

@DroolsSession("test/events/continuous/*.drl")
public class TestDroolEventsContinousTest extends DroolsAssert {
	
	@Rule
	public DroolsAssert droolsAssert = this;
	
	@Test
	public void withInitialState() throws IOException {
		AnomalyEventInsert m1 = new AnomalyEventInsert(LocalDate.now());
		insertAndFire(m1);
		
		AnomalyEventInsert m2 = new AnomalyEventInsert(LocalDate.now());
		insertAndFire(m2);
		
		AnomalyEventInsert m3 = new AnomalyEventInsert(LocalDate.now());
		insertAndFire(m3);
		
		AnomalyEventInsert m4 = new AnomalyEventInsert(LocalDate.now().plusDays(1));
		insertAndFire(m4);
		
		AnomalyEventInsert m5 = new AnomalyEventInsert(LocalDate.now().plusDays(2));
		insertAndFire(m5);
		
		AnomalyEventInsert m6 = new AnomalyEventInsert(LocalDate.now().plusDays(3));
		insertAndFire(m6);
	}
}
