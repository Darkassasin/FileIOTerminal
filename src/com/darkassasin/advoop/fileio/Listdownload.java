/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Shreeson Shrestha
 */
public class Listdownload extends fileoperationabs {

    int total = 0;
    BufferedReader reader;

    @Override
    public void operate(String[] tok, String path) {

        try {
            reader=new BufferedReader(new FileReader(new File(path+"extracted.txt")));
            //reader = new BufferedReader(new FileReader(new File(path + "downloadlist.txt")));
            String link = "";
            
           // System.out.println(link);
            int i=0;
            while ((link = reader.readLine())!= null) {
                i++;
                System.out.println(i+"."+link);
                String[] filetokens = link.split("/");
                //System.out.println("Name:"+filetokens[filetokens.length-1]+"\n");
                System.out.println("Downloading from..."+link);
                URL url = new URL(link);
                URLConnection connect = url.openConnection();
                            
                InputStream is = connect.getInputStream();
                //String[] filetokens = link.split("/");
                FileOutputStream os = new FileOutputStream(path + filetokens[filetokens.length - 1]);
                //int i = 0;
                byte[] data = new byte[1024 * 5];
                float filesize = connect.getContentLength();
                System.out.println("Total size:" + filesize/1024);

                while ((i = is.read(data)) != -1) {
                    total = i + total;
                    System.out.println((total / filesize) * 100 + "%");
                    os.write(data, 0, i);
                }
                System.out.println("Download completed.");
                total=0;
                os.close();
                is.close();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
