/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.fileparser;

import com.tiagocoelho.fileparser.file.File;

/**
 *
 * @author Tiago
 */
public abstract class FileParser {

    protected FileParser next;

    protected FileParser() {
        this.next = new FileParserNullObject();
    }

    protected FileParser(FileParser next) {
        this.next = next;
    }

    public void setNext(FileParser next) {
        this.next = next;
    }

    public abstract void parseFile(File file);
}
