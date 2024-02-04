package com.guidetojavaemployment.designpatterns.structuralpattern.facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        return new File("tmp");
    }
}
