/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.fileparser;

import com.tiagocoelho.fileparser.file.File;

public class FileParserNullObject extends FileParser {
    
    public FileParserNullObject() {
        super(null);
    }

    @Override
    public void parseFile(File file) {
        System.out.println("File couldn't be parsed.");
    }

}
