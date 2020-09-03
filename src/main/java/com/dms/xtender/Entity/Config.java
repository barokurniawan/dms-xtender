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
    String DmsAddress = "";
    String FetchData = "";
    String SitEndPoint = "";
    String SaveData = "";
    String FunctionName = "";
    String IntId = "";
    String IdField = "";

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

    public String getFunctionName() {
        return FunctionName;
    }

    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    public String getIntId() {
        return IntId;
    }

    public void setIntId(String IntId) {
        this.IntId = IntId;
    }

    public String getIdField() {
        return IdField;
    }

    public void setIdField(String IdField) {
        this.IdField = IdField;
    }
}
