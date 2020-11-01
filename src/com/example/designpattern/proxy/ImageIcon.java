package com.example.designpattern.proxy;

import com.example.designpattern.proxy.base.Icon;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon {

    private String name;
    private URL imageUrl;

    public ImageIcon(URL imageUrl, String name) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }
}
