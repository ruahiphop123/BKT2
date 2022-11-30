package com.example.baikiemtra3;

public class TacPhamModel {
    private String ten, moTa;
    private int HinhAnh;
    private float Sao;

    public TacPhamModel(String ten, String moTa, int hinhAnh, float sao) {
        this.ten = ten;
        this.moTa = moTa;
        HinhAnh = hinhAnh;
        Sao = sao;
    }

    public TacPhamModel() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public float getSao() {
        return Sao;
    }

    public void setSao(float sao) {
        Sao = sao;
    }
}
