package com.example.and11_allview.listfrag;

public class ItemDTO {
    String name;
    int cnt;

    public ItemDTO(String name, int cnt) {
        this.name = name;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
