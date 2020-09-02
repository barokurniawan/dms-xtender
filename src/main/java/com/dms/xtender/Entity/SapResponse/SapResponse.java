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
public class SapResponse {
    private String intId;
    private String ids;
    private boolean success;
    private SapMessage[] msgs;

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public SapMessage[] getMsgs() {
        return msgs;
    }

    public void setMsgs(SapMessage[] msgs) {
        this.msgs = msgs;
    }   
}
