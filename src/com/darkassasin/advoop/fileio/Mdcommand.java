/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Shreeson Shrestha
 */
public class Mdcommand extends fileoperationabs {
    @Override
    public void operate(String[] tok, String path) {
        File file = new File(path + tok[1]);
        file.mkdir();
        System.out.println(tok[1]+" directory made");
    }
}
