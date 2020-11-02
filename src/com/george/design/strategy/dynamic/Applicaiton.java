package com.george.design.strategy.dynamic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Applicaiton {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("./config.properties"));
    }
}
