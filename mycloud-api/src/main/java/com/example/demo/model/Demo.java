package com.example.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by wancheng on 2018/7/5.
 */

@Accessors(chain = true)
public class Demo implements Serializable {

    private String description;

    private String name;

    public Demo(String description) {
        this.description = description;
    }

    public Demo() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
