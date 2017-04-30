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
public class FileOperationFactory {

    public static fileoperationabs get(String param) {
        if (param.equalsIgnoreCase("create")) {
            return new createfile();
        } else if (param.equalsIgnoreCase("write")) {
            return new writefile();
        } else if (param.equalsIgnoreCase("copy")) {
            return new copycommand();
        } else if (param.equalsIgnoreCase("exit")) {
            return new Exitcommand();
        } else if (param.equalsIgnoreCase("download")) {
            return new Downloadcommand();
        }else if (param.equalsIgnoreCase("downcontent")) {
            return new URLData();
        } else if (param.equalsIgnoreCase("rename")) {
            return new Renamecommand();
        }else if (param.equalsIgnoreCase("Md")) {
            return new Mdcommand();
        }else if (param.equalsIgnoreCase("Rd")) {
            return new Rdcommand();
        }
        return null;
    }
}
