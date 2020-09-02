/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dms.xtender.Utils;

import javax.swing.JTextArea;

/**
 *
 * @author 0395
 */
public class LogMessage {
    private static LogMessage Instance;
    private JTextArea TargetControll;

    public LogMessage(JTextArea targetControll){
        TargetControll = targetControll;
    }
    
    public static LogMessage GetInstance(JTextArea targetControll){
        if(Instance == null){
            Instance = new LogMessage(targetControll);
        }
        
        return Instance;
    }
    
    public void Add(String message){
        TargetControll.append(message + "\n");
    }
}
