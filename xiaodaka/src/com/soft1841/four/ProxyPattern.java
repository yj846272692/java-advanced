package com.soft1841.four;

public class ProxyPattern {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
