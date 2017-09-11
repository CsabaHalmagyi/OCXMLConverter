package com.horizonshards.ocxmlconverter.dao;

/*
 * Created by csaba on 11/09/2017.
 */
public class StudyDef {

    private String studyOID;
    private String protocolName;
    private boolean isSite;

    public StudyDef(String studyOID, String protocolName, boolean isSite) {
        this.studyOID = studyOID;
        this.protocolName = protocolName;
        this.isSite = isSite;
    }

    public String getStudyOID() {
        return studyOID;
    }

    public void setStudyOID(String studyOID) {
        this.studyOID = studyOID;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public boolean isSite() {
        return isSite;
    }

    public void setSite(boolean site) {
        isSite = site;
    }
}
