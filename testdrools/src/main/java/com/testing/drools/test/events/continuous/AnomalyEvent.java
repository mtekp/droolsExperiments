package com.testing.drools.test.events.continuous;

import java.util.Date;

public class AnomalyEvent {
	
	protected Date ts;
	
	public AnomalyEvent() {
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
}
