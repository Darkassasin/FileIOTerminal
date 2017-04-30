/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Shreeson Shrestha
 */
public class Renamecommand extends fileoperationabs {

    @Override
    public void operate(String[] tok, String path) {
        File oldfile=new File(path + tok[1]);
        try {
            FileReader fr = new FileReader(oldfile);
            FileWriter fw = new FileWriter(new File(path + tok[2]));
            if (tok.length > 2) {
                int i = 0;
                while ((i = fr.read()) != -1) {
                    fw.write(i);
                }
                fw.close();
                fr.close();
                oldfile.delete();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
