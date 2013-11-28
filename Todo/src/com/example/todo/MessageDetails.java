package com.example.todo;

public class MessageDetails {
    int icon ;
    String from;
    String sub;
    String desc;
    String time;

    public String getName() {
        return from;
    }

    public void setName(String from) {
        this.from = from;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
    
    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
