/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Shreeson Shrestha
 */
public class createfile extends fileoperationabs{
    
    @Override
    public void operate(String[] tok,String path) {
        //TerminalFrame tf= new TerminalFrame();
        System.out.println(tok[tok.length-1]);
        File file= new File(path+tok[tok.length-1]);
        try {
            if(!file.exists()){
                file.createNewFile();
                //tf.terminalpane.append("\n"+tok[1]+" File created");
                System.out.println(tok[1]+" File created\n\nFile Properteis:");
                System.out.println("Directory:"+file.isDirectory());
                System.out.println("File:"+file.isAbsolute());
                System.out.println("Hidden:"+file.isHidden());
                
            }
            else{
                //tf.terminalpane.append("\nFile Exists\n File Properteis:");
                System.out.println("File Exists\n File Properteis:");
                System.out.println("Directory:"+file.isDirectory());
                System.out.println("File:"+file.isAbsolute());
                System.out.println("Hidden:"+file.isHidden());
                System.out.println("Total Space:"+file.getTotalSpace()/(1024*1024)+"MB");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

}
