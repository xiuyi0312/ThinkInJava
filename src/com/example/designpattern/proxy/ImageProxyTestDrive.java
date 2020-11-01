package com.example.designpattern.proxy;

import com.example.designpattern.proxy.base.Icon;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageProxyTestDrive {
    Component component;
    public static void main(String[] args) throws MalformedURLException {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();

    }

    public ImageProxyTestDrive() throws MalformedURLException {
        Icon icon = new ImageProxy(new URL(""));
        Component component = new Component() {
        };
    }
}
