package com.example.chapter18io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println(file.getAbsolutePath());
        String[] list = file.list(new DirFilter(".+iml$"));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String d : list) {
            System.out.println(d);
        }
    }
}

class DirFilter implements FilenameFilter {

    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}