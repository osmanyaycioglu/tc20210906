package com.java.training.pattern.structural.composite;

public class FileRun {

    public static void main(final String[] args) {
        File fileLoc = new File("root");
        File l1aLoc = new File("l1a");
        l1aLoc.add(new File("l2a"));
        l1aLoc.add(new File("l2b"));
        l1aLoc.add(new File("l2c"));
        fileLoc.add(l1aLoc);
        fileLoc.add(new File("l1b"));
        fileLoc.add(new File("l1c"));
        System.out.println(fileLoc.toString(0));
        System.out.println("-------------------");
        for (File file2Loc : fileLoc) {
            System.out.println("file : " + file2Loc.getName());
        }
    }
}
