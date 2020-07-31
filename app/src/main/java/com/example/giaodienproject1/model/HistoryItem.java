package com.example.giaodienproject1.model;

public class HistoryItem {
    private String date;
    private int coin;
    private String hinhThuc;

    public HistoryItem(String date, int coin, String hinhThuc) {
        this.date = date;
        this.coin = coin;
        this.hinhThuc = hinhThuc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }
}
