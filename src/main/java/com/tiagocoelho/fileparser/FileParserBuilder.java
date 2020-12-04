/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiagocoelho.fileparser;

/**
 *
 * @author Tiago
 */
public class FileParserBuilder {

    FileParser parser;

    private void addParserToEnd(FileParser currentParser, FileParser newParser) {
        if (currentParser.next.getClass() == FileParserNullObject.class) {
            currentParser.setNext(newParser);
        } else {
            addParserToEnd(currentParser.next, newParser);
        }
    }

    private FileParser appendParser(String type) {
        FileParser newParser = null;

        switch (type) {
            case "text":
                newParser = new TextFileParser();
                break;
            case "image":
                newParser = new ImageFileParser();
                break;
        }

        if (parser == null) {
            parser = newParser;
        } else {
            addParserToEnd(parser, newParser);
        }

        return parser;
    }

    public FileParser build() {
        return this.parser;
    }

    public FileParserBuilder parseImage() {
        appendParser("image");
        return this;
    }

    public FileParserBuilder parseText() {
        appendParser("text");
        return this;
    }
}
