package org.structuralPattern.compsite;

import org.structuralPattern.compsite.file.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractFile file1,file2,file3,file4,file5,file6;
        AbstractFile folder1,folder2,folder3;
        file1 = new ImageFile("1.png");
        file2 = new VideoFile("1.mp4");
        file3 = new TextFile("1.txt");

        file4 = new ImageFile("2.png");
        file5 = new VideoFile("2.mp4");
        file6 = new VideoFile("2.txt");

        folder1 = new Folder("文件夹1");
        folder2 = new Folder("文件夹2");
        folder3 = new Folder("父文件夹");

        folder1.add(file1);
        folder1.add(file2);
        folder1.add(file3);

        folder2.add(file4);
        folder2.add(file5);
        folder2.add(file6);

        folder3.add(folder1);
        folder3.add(folder2);

        folder3.killVirus();
    }
}
