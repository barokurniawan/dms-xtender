/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dms.xtender.Entity.SapResponse;

/**
 *
 * @author 0395
 */
public class SapMessage {
    private String MSG_STR;
    private String MSG_REF1;
    private String PACKG_UUID;
    private String BUS_UUID;

    public String getMSG_STR() {
        return MSG_STR;
    }

    public void setMSG_STR(String MSG_STR) {
        this.MSG_STR = MSG_STR;
    }

    public String getMSG_REF1() {
        return MSG_REF1;
    }

    public void setMSG_REF1(String MSG_REF1) {
        this.MSG_REF1 = MSG_REF1;
    }

    public String getPACKG_UUID() {
        return PACKG_UUID;
    }

    public void setPACKG_UUID(String PACKG_UUID) {
        this.PACKG_UUID = PACKG_UUID;
    }

    public String getBUS_UUID() {
        return BUS_UUID;
    }

    public void setBUS_UUID(String BUS_UUID) {
        this.BUS_UUID = BUS_UUID;
    }
}
