/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.fileparser;

import com.tiagocoelho.fileparser.file.File;

public class ImageFileParser extends FileParser {

    public ImageFileParser() {
        super();
    }

    public ImageFileParser(FileParser parser) {
        super(parser);
    }

    @Override
    public void parseFile(File file) {
        switch (file.getType()) {
            case "jpg":
                System.out.println("jpg File");
                break;
            case "png":
                System.out.println("png File");
                break;
            default:
                next.parseFile(file);
                break;
        }
    }

}
