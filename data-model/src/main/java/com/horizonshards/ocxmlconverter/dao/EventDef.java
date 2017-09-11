package com.horizonshards.ocxmlconverter.dao;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by csaba on 11/09/2017.
 */
public class EventDef {

    private String eventOID;
    private String eventName;
    private String eventRepeating;
    private List<String> formRefs;


    public EventDef(String eventOID, String eventName, String eventRepeating) {
        this.eventOID = eventOID;
        this.eventName = eventName;
        this.eventRepeating = eventRepeating;
        this.formRefs = new ArrayList<>();
    }

    public String getEventOID() {
        return eventOID;
    }

    public void setEventOID(String eventOID) {
        this.eventOID = eventOID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventRepeating() {
        return eventRepeating;
    }

    public void setEventRepeating(String eventRepeating) {
        this.eventRepeating = eventRepeating;
    }

    public List<String> getFormRefs() {
        return formRefs;
    }

    public void setFormRefs(List<String> formRefs) {
        this.formRefs = formRefs;
    }
}
