package com.example.myapplication.ui.main.Adapter;

public class TrangChu_chucnang {
    private String Chucnang;
    private String Thuoctinh;
    private int photo;
    public TrangChu_chucnang(){
    };

    public TrangChu_chucnang(String chucnang, String thuoctinh, int photo) {
        Chucnang = chucnang;
        Thuoctinh = thuoctinh;
        this.photo = photo;
    }

    public String getChucnang() {
        return Chucnang;
    }

    public void setChucnang(String chucnang) {
        Chucnang = chucnang;
    }


    public String getThuoctinh() {
        return Thuoctinh;
    }

    public void setThuoctinh(String thuoctinh) {
        Thuoctinh = thuoctinh;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
