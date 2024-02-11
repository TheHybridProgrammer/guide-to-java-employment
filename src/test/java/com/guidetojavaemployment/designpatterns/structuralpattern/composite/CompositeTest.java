package com.guidetojavaemployment.designpatterns.structuralpattern.composite;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompositeTest {

    @Test
    void shouldTest() {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory dir1 = new Directory("Folder 1");
        Directory dir2 = new Directory("Folder 2");

        dir1.addComponent(file1);
        dir1.addComponent(file2);
        dir2.addComponent(dir1);

        String fileSystemDetails = dir2.showDetails();
        assertThat(fileSystemDetails).isEqualTo("""
                Directory: Folder 2
                Contents:
                Directory: Folder 1
                Contents:
                File: file1.txtFile: file2.txt""");
    }

}