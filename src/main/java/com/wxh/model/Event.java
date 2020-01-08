package com.wxh.model;

import lombok.Data;

@Data
public class Event {
    private String eventId;

    private String eventMean;

    private Integer credit;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getEventMean() {
        return eventMean;
    }

    public void setEventMean(String eventMean) {
        this.eventMean = eventMean == null ? null : eventMean.trim();
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}