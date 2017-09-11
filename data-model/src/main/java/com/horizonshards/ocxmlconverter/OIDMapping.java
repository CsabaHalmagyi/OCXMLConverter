package com.horizonshards.ocxmlconverter;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by csaba on 11/09/2017.
 */
public class OIDMapping {

    private Map<String, OIDPairs> mapping;

    public OIDMapping() {

        this.mapping = new HashMap<>();
    }

    public Map<String, OIDPairs> getMapping() {
        return mapping;
    }

    public void setMapping(Map<String, OIDPairs> mapping) {
        this.mapping = mapping;
    }
}
