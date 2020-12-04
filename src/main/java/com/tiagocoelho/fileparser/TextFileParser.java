/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.fileparser;

import com.tiagocoelho.fileparser.file.File;

public class TextFileParser extends FileParser {
    
    public TextFileParser() {
        super();
    }

    public TextFileParser(FileParser parser) {
        super(parser);
    }
    
    @Override
    public void parseFile(File file) {
        switch (file.getType()) {
            case "docx":
                System.out.println("docx File");
                break;
            case "txt":
                System.out.println("txt File");
                break;
            default:
                next.parseFile(file);
                break;
        }
    }
    
}
