package com.wuxin.collections;

import java.util.Properties;

public class DataSource {
    public DataSource() {
    }



    public Properties getProperties() {

        return properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private   Properties properties;
}
