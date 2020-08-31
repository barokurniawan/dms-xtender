/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dms.xtender;

import com.dms.xtender.Entity.Config;
import com.dms.xtender.Logic.ConfigAL;

/**
 *
 * @author 0395
 */
public class EntryPoint {
    public static Config config;
    
    public static void main(String[] args) {
        ConfigAL ConfigAccessor = ConfigAL.GetInstance();
        config = ConfigAccessor.GetConfig();
        
        new MainForm().setVisible(true);
    }
}
