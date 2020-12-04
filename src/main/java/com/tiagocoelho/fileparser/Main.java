/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.fileparser;

import com.tiagocoelho.fileparser.file.File;
import com.tiagocoelho.fileparser.file.TextFileFactory;

/**
 *
 * @author Tiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1 = new TextFileFactory().createFile("docx");
        FileParser parser1 = new ImageFileParser(new TextFileParser());
        FileParser parser2 = new FileParserBuilder().parseImage().parseText().build();
        parser2.parseFile(f1);
        
    }
}
