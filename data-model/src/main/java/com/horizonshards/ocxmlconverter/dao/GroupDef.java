package com.horizonshards.ocxmlconverter.dao;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by csaba on 11/09/2017.
 */
public class GroupDef {

    private String groupOID;
    private String groupName;
    private List<String> itemRefs;

    public GroupDef(String groupOID, String groupName) {
        this.groupOID = groupOID;
        this.groupName = groupName;
        this.itemRefs = new ArrayList<>();
    }

    public String getGroupOID() {
        return groupOID;
    }

    public void setGroupOID(String groupOID) {
        this.groupOID = groupOID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getItemRefs() {
        return itemRefs;
    }

    public void setItemRefs(List<String> itemRefs) {
        this.itemRefs = itemRefs;
    }
}
