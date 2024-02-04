package com.guidetojavaemployment.designpatterns.structuralpattern.facade;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        return file;
    }
    public static VideoFile convert(VideoFile buffer, Codec codec) {
        return buffer;
    }
}
