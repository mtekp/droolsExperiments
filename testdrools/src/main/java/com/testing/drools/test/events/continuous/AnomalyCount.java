package com.testing.drools.test.events.continuous;

import org.kie.api.definition.type.Role;

import java.util.Date;

@org.kie.api.definition.type.Role(Role.Type.EVENT)
@org.kie.api.definition.type.Timestamp("anomalyDate")
//@org.kie.api.definition.type.Expires("1d")
public class AnomalyCount {

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

    private Date anomalyDate;

    private int anomalyCount = 0;
}
