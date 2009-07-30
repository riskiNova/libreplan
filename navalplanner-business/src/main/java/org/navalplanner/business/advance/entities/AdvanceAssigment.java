package org.navalplanner.business.advance.entities;

import java.math.BigDecimal;
import java.util.Set;

import org.navalplanner.business.orders.entities.OrderElement;
import org.navalplanner.business.workreports.entities.WorkReportLine;

public class AdvanceAssigment{
    private Long id;

    @SuppressWarnings("unused")
    private long version;

    private boolean reportGlobalAdvance;

    private BigDecimal maxValue;

    private OrderElement orderElement;

    private AdvanceType advanceType;

    Set<AdvanceMeasurement> advanceMeasurements;

    public AdvanceAssigment(boolean reportGlobalAdvance, BigDecimal maxValue) {
        this.reportGlobalAdvance = reportGlobalAdvance;
        this.maxValue = maxValue;
        this.maxValue.setScale(2);
    }

    public Long getId() {
        return id;
    }

    public long getVersion() {
        return version;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
        this.maxValue.setScale(2);
    }

    public BigDecimal getMaxValue() {
        return this.maxValue;
    }

    public void setReportGlobalAdvance(boolean reportGlobalAdvance) {
        this.reportGlobalAdvance = reportGlobalAdvance;
    }

    public boolean getReportGlobalAdvance() {
        return this.reportGlobalAdvance;
    }

    public void setOrderElement(OrderElement orderElement) {
        this.orderElement = orderElement;
    }

    public OrderElement getOrderElement() {
        return this.orderElement;
    }

    public void setAdvanceType(AdvanceType advanceType) {
        this.advanceType = advanceType;
    }

    public AdvanceType getAdvanceType() {
        return this.advanceType;
    }

    public void setAdvanceMeasurements(Set<AdvanceMeasurement> advanceMeasurements) {
        this.advanceMeasurements = advanceMeasurements;
    }

    public Set<AdvanceMeasurement> getAdvanceMeasurements() {
        return this.advanceMeasurements;
    }
}
