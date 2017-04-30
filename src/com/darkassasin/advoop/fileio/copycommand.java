/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Shreeson Shrestha
 */
public class copycommand extends fileoperationabs{
    Scanner ip= new Scanner(System.in);
    @Override
    public void operate(String[] tok,String path) {
        try {
            if(tok.length>2){
            FileInputStream is= new FileInputStream(path+tok[1]);
            //System.out.println("Enter the path to be copied");
            //String paths=ip.next();
            FileOutputStream os= new FileOutputStream(path+tok[2]);
            int i=0;
            byte[] data= new byte[1024];
            while((i=is.read(data))!=-1){
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
