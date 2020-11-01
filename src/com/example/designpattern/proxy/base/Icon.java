package com.example.designpattern.proxy.base;

import java.awt.*;

public interface Icon {
    int getWidth();
    int getHeight();
    void paintIcon(final Component c, Graphics g, int x, int y);
}
