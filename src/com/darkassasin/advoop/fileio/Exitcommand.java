/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.advoop.fileio;

/**
 *
 * @author Shreeson Shrestha
 */
public class Exitcommand extends fileoperationabs{

    @Override
    public void operate(String[] tokens,String path) {
        System.exit(0);
    }
    
}
