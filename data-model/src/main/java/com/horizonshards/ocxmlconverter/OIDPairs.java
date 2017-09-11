package com.horizonshards.ocxmlconverter;

/*
 * Created by csaba on 11/09/2017.
 */

/**
 * Stores the OID compositions in an EVENT_OID##FORM_OID##GROUP_OID##ITEM_OID format
 *
 */
public class OIDPairs {

    private String sourceOIDComp;
    private String targetOIDComp;

    public OIDPairs() {
    }

    public OIDPairs(String sourceOIDComp) {
        this.sourceOIDComp = sourceOIDComp;
    }

    public String getSourceOIDComp() {
        return sourceOIDComp;
    }

    public void setSourceOIDComp(String sourceOIDComp) {
        this.sourceOIDComp = sourceOIDComp;
    }

    public String getTargetOIDComp() {
        return targetOIDComp;
    }

    public void setTargetOIDComp(String targetOIDComp) {
        this.targetOIDComp = targetOIDComp;
    }
}

