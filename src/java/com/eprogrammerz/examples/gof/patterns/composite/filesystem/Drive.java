package com.eprogrammerz.examples.gof.patterns.composite.filesystem;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Drive implements FileSystem {
    protected String name;

    protected Collection<FileSystem> fileSystems = new ArrayList<FileSystem>();

    public Drive(String name) {
        this.name = name;
    }

    public void addFileSystem(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    public int getSizeInBytes() {
        int sizeInBytes = 0;
        for (FileSystem fileSystem : fileSystems) {
            sizeInBytes += fileSystem.getSizeInBytes();
        }
        return sizeInBytes;
    }

    public void print() {
        System.out.println("- drive " + name);
        for (FileSystem fileSystem : fileSystems) {
            fileSystem.print();
        }
    }
}