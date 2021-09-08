package com.java.training.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileEx implements Iterable<FileEx> {

    private final List<FileEx> subFiles = new ArrayList<>();
    private String             name;

    public FileEx(final String nameParam) {
        super();
        this.name = nameParam;
    }


    public void add(final FileEx file) {
        this.subFiles.add(file);
    }


    public IMyIterator<FileEx> getIterator() {
        return new MyIterator(this.subFiles);
    }

    public static class MyIterator implements IMyIterator<FileEx> {


        private final List<FileEx> subFiles;
        private int                index = 0;

        public MyIterator(final List<FileEx> subFiles) {
            this.subFiles = new ArrayList<>(subFiles);
        }

        @Override
        public boolean hasNext() {
            return this.index < this.subFiles.size();
        }

        @Override
        public FileEx getNext() {
            return this.subFiles.get(this.index++);
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }


    public String toString(final int level) {
        StringBuffer bufferLoc = new StringBuffer();
        bufferLoc.append("name=");
        bufferLoc.append(this.name);
        bufferLoc.append("\n");
        for (int iLoc = 0; iLoc < (level + 1); iLoc++) {
            bufferLoc.append("\t");
        }
        if (this.subFiles != null) {
            for (FileEx fileLoc : this.subFiles) {
                bufferLoc.append(fileLoc.toString(level + 1));
            }
        }
        return bufferLoc.toString();
    }

    @Override
    public Iterator<FileEx> iterator() {
        return this.subFiles.iterator();
    }


}
