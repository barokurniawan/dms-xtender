/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dms.xtender.Entity.DmsResponse;

/**
 *
 * @author 0395
 */
public class Payload {
    private String INT_ID;
    private String TOTALROW;
    private String BUS_DATE;
    private String PST_DATE;
    private String PKG_UUID;
    private String GEN_TIME;
    private String SY_SOURCE;
    private String COMP_CODE;
    private PayloadItems[] SAP_ITEMS;
    private String[] SAP_ERR_ITEMS;

    public String getINT_ID() {
        return INT_ID;
    }

    public void setINT_ID(String INT_ID) {
        this.INT_ID = INT_ID;
    }

    public String getTOTALROW() {
        return TOTALROW;
    }

    public void setTOTALROW(String TOTALROW) {
        this.TOTALROW = TOTALROW;
    }

    public String getBUS_DATE() {
        return BUS_DATE;
    }

    public void setBUS_DATE(String BUS_DATE) {
        this.BUS_DATE = BUS_DATE;
    }

    public String getPST_DATE() {
        return PST_DATE;
    }

    public void setPST_DATE(String PST_DATE) {
        this.PST_DATE = PST_DATE;
    }

    public String getPKG_UUID() {
        return PKG_UUID;
    }

    public void setPKG_UUID(String PKG_UUID) {
        this.PKG_UUID = PKG_UUID;
    }

    public String getGEN_TIME() {
        return GEN_TIME;
    }

    public void setGEN_TIME(String GEN_TIME) {
        this.GEN_TIME = GEN_TIME;
    }

    public String getSY_SOURCE() {
        return SY_SOURCE;
    }

    public void setSY_SOURCE(String SY_SOURCE) {
        this.SY_SOURCE = SY_SOURCE;
    }

    public String getCOMP_CODE() {
        return COMP_CODE;
    }

    public void setCOMP_CODE(String COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }
    
    
}
