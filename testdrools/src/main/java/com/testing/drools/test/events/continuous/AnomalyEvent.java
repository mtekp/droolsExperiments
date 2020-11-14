package com.testing.drools.test.events.continuous;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

public class AnomalyEvent {

	public AnomalyEvent() {
	}

	public AnomalyEvent(LocalDate ts) {
		this.ts = Date.from(ts.atStartOfDay().toInstant( ZoneOffset.UTC));

	}

	protected AnomalyEvent(Date ts) {
		this.ts = ts;

	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}


	protected Date ts;

}
