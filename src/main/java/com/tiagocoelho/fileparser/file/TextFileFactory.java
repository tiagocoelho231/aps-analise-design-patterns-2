/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.fileparser.file;

public class TextFileFactory implements FileFactory {

    @Override
    public File createFile(String type) {
        if (type.equals("docx")) {
            return new DocxFile();
        } else {
            return new TxtFile();
        }
    }
}
