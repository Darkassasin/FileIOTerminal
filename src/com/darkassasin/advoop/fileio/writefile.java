/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Shreeson Shrestha
 */
public class writefile extends fileoperationabs {

    @Override
    public void operate(String[] tok, String path) {
        String line = "";
        StringBuilder paragraph =new StringBuilder();
        try {
            File file = new File(path + tok[1]);
            if (file.exists()) {
                FileWriter writer = new FileWriter(file);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                while ((line = bufferedReader.readLine())!=null) {
                    paragraph.append(line);
                    if(line.equalsIgnoreCase("exit")){
                        System.exit(0);
                    }
                }
                System.out.println("Content written to file "+tok[1]);
                //} while (!line.equals("exit"));
                bufferedReader.close();
                writer.write(paragraph.toString());
                writer.close();
            } else {
                System.out.println("File " + tok[1] + " doesn't exists");
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
