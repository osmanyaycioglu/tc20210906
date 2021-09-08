package com.java.training.pattern.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class File implements Iterable<File> {

    private List<File> subFiles;
    private String     name;

    public File(final String nameParam) {
        super();
        this.name = nameParam;
    }

    public void add(final File file) {
        if (this.subFiles == null) {
            this.subFiles = new ArrayList<>();
        }
        this.subFiles.add(file);
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
            for (File fileLoc : this.subFiles) {
                bufferLoc.append(fileLoc.toString(level + 1));
            }
        }
        return bufferLoc.toString();
    }

    @Override
    public Iterator<File> iterator() {
        return this.subFiles.iterator();
    }


}
