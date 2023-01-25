package org.structuralPattern.proxy;

import sun.applet.AppletClassLoader;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Searcher searcher = new SearcherProxy();
        searcher.doSearch("willow","hello world");
    }
}
