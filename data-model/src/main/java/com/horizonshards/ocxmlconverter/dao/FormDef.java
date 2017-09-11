package com.horizonshards.ocxmlconverter.dao;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by csaba on 11/09/2017.
 */
public class FormDef {

    private String formOID;
    private String formName;
    private List<String> groupRefs;

    public FormDef(String formOID, String formName) {
        this.formOID = formOID;
        this.formName = formName;
        this.groupRefs = new ArrayList<>();
    }

    public String getFormOID() {
        return formOID;
    }

    public void setFormOID(String formOID) {
        this.formOID = formOID;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public List<String> getGroupRefs() {
        return groupRefs;
    }

    public void setGroupRefs(List<String> groupRefs) {
        this.groupRefs = groupRefs;
    }
}
