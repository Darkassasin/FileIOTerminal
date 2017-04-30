/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkassasin.FileIOTerminal;

import com.darkassasin.advoop.fileio.FileOperationFactory;
import com.darkassasin.advoop.fileio.fileoperationabs;
import java.util.Scanner;

/**
 *
 * @author Shreeson Shrestha
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    static String path = "c:/users/shree/desktop/";

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the file command:");
            String line = scan.nextLine();
            String[] tokens = line.split(" ");
            fileoperationabs fileop = FileOperationFactory.get(tokens[0]);
            if (fileop == null) {
                System.out.println("Check the syntax");
            } else {
                fileop.operate(tokens, path);
            }
        }
    }

}
