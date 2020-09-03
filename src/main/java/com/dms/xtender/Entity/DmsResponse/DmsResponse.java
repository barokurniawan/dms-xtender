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
public class DmsResponse {
    private boolean info;
    private String message;
    private Payload items;

    public boolean getInfo() {
        return info;
    }

    public void setInfo(boolean info) {
        this.info = info;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Payload getItems() {
        return items;
    }

    public void setItems(Payload items) {
        this.items = items;
    }
    
    
}
