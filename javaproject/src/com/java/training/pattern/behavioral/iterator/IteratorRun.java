package com.java.training.pattern.behavioral.iterator;

public class IteratorRun {

    public static void main(final String[] args) {
        FileEx fileLoc = new FileEx("root");
        FileEx l1aLoc = new FileEx("l1a");
        l1aLoc.add(new FileEx("l2a"));
        l1aLoc.add(new FileEx("l2b"));
        l1aLoc.add(new FileEx("l2c"));
        fileLoc.add(l1aLoc);
        fileLoc.add(new FileEx("l1b"));
        fileLoc.add(new FileEx("l1c"));

        IMyIterator<FileEx> iteratorLoc = fileLoc.getIterator();

        while (iteratorLoc.hasNext()) {
            FileEx nextLoc = iteratorLoc.getNext();
            System.out.println(nextLoc.getName());
        }

    }
}
