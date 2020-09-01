/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dms.xtender.Logic;

import com.dms.xtender.Entity.Config;
import com.dms.xtender.SettingForm;
import com.moandjiezana.toml.Toml;
import com.moandjiezana.toml.TomlWriter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 0395
 */
public class ConfigAL 
{
    private String ConfigFilePath = "C:\\smartdepot\\config.toml";
    private static ConfigAL Instance;
    private File ConfigFile;
    private Config config;
    
    public ConfigAL(){
        ConfigFile = new File(ConfigFilePath);
        if(!ConfigFile.exists())
        {
            try {
                boolean info = ConfigFile.createNewFile();
                if(info){
                    Config ConfigClass = new Config();
                    TomlWriter tomlWriter = new TomlWriter();
                    tomlWriter.write(ConfigClass, ConfigFile);
                }
            } catch (IOException ex) {
                Logger.getLogger(SettingForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try
        {
            SetConfig(new Toml().read(ConfigFile).to(Config.class));   
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public Config GetConfig(){
        return config;
    }
    
    private void SetConfig(Config config){
        this.config = config;
    }
    
    public static ConfigAL GetInstance(){
        if(Instance == null)
        {
            Instance = new ConfigAL();
        }
        
        return Instance;
    }
    
    public Boolean CreateConfig(Config config){
        try {
            TomlWriter tomlWriter = new TomlWriter();
            tomlWriter.write(config, ConfigFile);
        } catch (IOException ex) {
            Logger.getLogger(ConfigAL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }
    
    public void Refresh()
    {
        Instance = new ConfigAL();
    }
}
