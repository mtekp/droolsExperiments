package com.testing.drools.test.events.continuous;

import java.util.Date;

public class AnomalyCount {
	
	private Date anomalyDate;
	private int anomalyCount = 0;
	
	public AnomalyCount(Date anomalyDate, int anomalyCount) {
		this.anomalyDate = anomalyDate;
		this.anomalyCount = anomalyCount;
	}
	
	public Date getAnomalyDate() {
		return anomalyDate;
	}
	
	public void setAnomalyDate(Date anomalyDate) {
		this.anomalyDate = anomalyDate;
	}
	
	public int getAnomalyCount() {
		return anomalyCount;
	}
	
	public void setAnomalyCount(int anomalyCount) {
		this.anomalyCount = anomalyCount;
	}
	
	@Override
	public String toString() {
		return "AnomalyCount{" +
				"anomalyDate=" + anomalyDate +
				", anomalyCount=" + anomalyCount +
				'}';
	}
}
