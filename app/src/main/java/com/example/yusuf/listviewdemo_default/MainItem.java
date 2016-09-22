package com.example.yusuf.listviewdemo_default;

import java.io.Serializable;

/**
 * Created by Yusuf on 2016/9/22.
 */

public class MainItem implements Serializable {
    String title;
    String second;

    public MainItem(String title, String second) {
        this.title = title;
        this.second = second;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}
