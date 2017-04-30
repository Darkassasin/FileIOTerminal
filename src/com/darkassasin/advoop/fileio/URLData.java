/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Shreeson Shrestha
 */
public class URLData extends fileoperationabs{
    int total=0;
    BufferedWriter bwriter;
    @Override
    public void operate(String[] tok,String path) {
        try {
            String link=tok[1];
            URL url= new URL(link);
            URLConnection connect=url.openConnection();  
            BufferedReader ureader= new BufferedReader(new InputStreamReader(connect.getInputStream()));
            String line="";
            bwriter= new BufferedWriter(new FileWriter(path+"sample.txt"));
            while((line=ureader.readLine())!=null){
                System.out.println(line);
                bwriter.write(line);
            }
             ureader.close();
             bwriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

}
