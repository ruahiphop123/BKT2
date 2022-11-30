package com.example.baikiemtra3;

public class TacGia{
    private String tenTacGia, moTa;
    private int hinhAnh;
    private float sao;

    public TacGia(String tenTacGia, String moTa, int hinhAnh, float sao) {
        this.tenTacGia = tenTacGia;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.sao = sao;
    }

    public TacGia() {
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public float getSao() {
        return sao;
    }

    public void setSao(float sao) {
        this.sao = sao;
    }
}
