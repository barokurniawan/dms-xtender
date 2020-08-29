/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dms.xtender.Entity;

/**
 *
 * @author 0395
 */
public class Config {
    String DmsAddress = "http://103.93.161.49:3100/";
    String FetchData = "";
    String SitEndPoint = "";
    String SaveData = "";

    public String getFetchData() {
        return FetchData;
    }

    public void setFetchData(String FetchData) {
        this.FetchData = FetchData;
    }

    public String getSitEndPoint() {
        return SitEndPoint;
    }

    public void setSitEndPoint(String SitEndPoint) {
        this.SitEndPoint = SitEndPoint;
    }

    public String getSaveData() {
        return SaveData;
    }

    public void setSaveData(String SaveData) {
        this.SaveData = SaveData;
    }
    
    public String GetDmsAddress()
    {
        return DmsAddress;
    }
    
    public void SetDmsAddress(String httpAddress)
    {
        DmsAddress = httpAddress;
    }
}
