/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Shreeson Shrestha
 */
public class Downloadcommand extends fileoperationabs{
    int total=0;
    @Override
    public void operate(String[] tok,String path) {
        try {
            if(tok.length>1){
                String link=tok[1];
                URL url= new URL(link);
                URLConnection connect=url.openConnection();
                
            InputStream is= connect.getInputStream();
             String[] filetokens=link.split("/");
            FileOutputStream os= new FileOutputStream(path+filetokens[filetokens.length-1]);
            int i=0;
            byte[] data= new byte[1024*10];
            float filesize=connect.getContentLength();    
            System.out.println("Total size:"+filesize);
            
            while((i=is.read(data))!=-1){
                total=i+total;
                System.out.println((total/filesize)*100+"%");
                os.write(data,0,i);
            }
            os.close();
            is.close();
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

}
