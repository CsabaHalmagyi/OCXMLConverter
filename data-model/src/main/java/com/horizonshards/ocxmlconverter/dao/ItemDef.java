package com.horizonshards.ocxmlconverter.dao;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by csaba on 11/09/2017.
 */
public class ItemDef {

    private String itemOID;
    private String itemName;
    private List<String> formRef;

    public ItemDef(String itemOID, String itemName) {
        this.itemOID = itemOID;
        this.itemName = itemName;
        this.formRef = new ArrayList<>();
    }

    public String getItemOID() {
        return itemOID;
    }

    public void setItemOID(String itemOID) {
        this.itemOID = itemOID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public List<String> getFormRef() {
        return formRef;
    }

    public void setFormRef(List<String> formRef) {
        this.formRef = formRef;
    }
}
