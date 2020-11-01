package com.example.designpattern.proxy;

import com.example.designpattern.proxy.base.Icon;

import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    ImageIcon imageIcon;//被代理的对象
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getWidth() {
        if (imageIcon != null) {
            return imageIcon.getWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getHeight() {
        if (imageIcon != null) {
            return imageIcon.getHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading cover, please wait...", x + 300, y + 300);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageUrl, "Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                retrievalThread.start();
            }
        }
    }
}
