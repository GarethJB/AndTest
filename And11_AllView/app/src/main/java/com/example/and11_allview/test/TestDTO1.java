package com.example.and11_allview.test;

public class TestDTO1 {
    String tv_test1f_title,tv_test1f_info, tv_test1f_price,tv_test1f_like;
    int photo;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public TestDTO1(String tv_test1f_title, String tv_test1f_info, String tv_test1f_price, String tv_test1f_like, int photo) {
        this.tv_test1f_title = tv_test1f_title;
        this.tv_test1f_info = tv_test1f_info;
        this.tv_test1f_price = tv_test1f_price;
        this.tv_test1f_like = tv_test1f_like;
        this.photo = photo;

    }

    public String getTv_test1f_title() {
        return tv_test1f_title;
    }

    public void setTv_test1f_title(String tv_test1f_title) {
        this.tv_test1f_title = tv_test1f_title;
    }

    public String getTv_test1f_info() {
        return tv_test1f_info;
    }

    public void setTv_test1f_info(String tv_test1f_info) {
        this.tv_test1f_info = tv_test1f_info;
    }

    public String getTv_test1f_price() {
        return tv_test1f_price;
    }

    public void setTv_test1f_price(String tv_test1f_price) {
        this.tv_test1f_price = tv_test1f_price;
    }

    public String getTv_test1f_like() {
        return tv_test1f_like;
    }

    public void setTv_test1f_like(String tv_test1f_like) {
        this.tv_test1f_like = tv_test1f_like;
    }
}
