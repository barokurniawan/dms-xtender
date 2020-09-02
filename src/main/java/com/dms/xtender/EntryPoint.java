/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dms.xtender;

import com.dms.xtender.Entity.Config;
import com.dms.xtender.Entity.User;
import com.dms.xtender.Logic.ConfigAL;
import com.google.gson.Gson;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

/**
 *
 * @author 0395
 */
public class EntryPoint {
    public static Config config;
    public static User user;
    
    public static void main(String[] args) {
        ConfigAL ConfigAccessor = ConfigAL.GetInstance();
        config = ConfigAccessor.GetConfig();
        String bindMessage = System.getProperty("data");
        if(bindMessage == null || "".equals(bindMessage))
        {
            JOptionPane.showMessageDialog(null, "Binding Message is empty");
            User mUser = new User();
            mUser.setUid(1);
            mUser.setName("Invalid Binding Message");
            
            user = mUser;
        } else {
            bindMessage = URLDecoder.decode(bindMessage, StandardCharsets.UTF_8);
            String[] param = bindMessage.split("smartdepot:");
            if(param.length < 1 && param[1] == null){
                JOptionPane.showMessageDialog(null, "Binding Message format is invalid");
                System.exit(1);
            }

            try
            {
                Gson gson = new Gson();
                user = gson.fromJson(param[1], User.class);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                System.exit(1);
            }            
        }
        
        new MainForm().setVisible(true);
    }
}
