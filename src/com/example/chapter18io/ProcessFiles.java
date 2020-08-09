package com.example.chapter18io;

import java.io.File;
import java.io.IOException;

public class ProcessFiles {
    public interface Strategy {
        void process(File file);
    }

    private Strategy strategy;
    private String ext;
    public ProcessFiles(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }

    public void start(String[] args) {
        if(args.length == 0) {
            processDirectoryTree(new File("."));
        } else {
            for (String arg: args) {
                File file = new File(arg);
                if(file.isDirectory()) {
                    processDirectoryTree(file);
                } else {
                    if(arg.endsWith("." + ext)) {
                        arg += "." + ext;
                    }
                    try {
                        strategy.process(new File(arg).getCanonicalFile());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void processDirectoryTree(File root) {
        for (File file : Directory.walk(root, ".*\\." + ext)) {
            strategy.process(file);
        }
    }

    public static void main(String[] args) {
        // exclusively handle java files
        new ProcessFiles(x -> System.out.println("We find a java file named <" + x + ">"), "java").start(args);
    }
}
