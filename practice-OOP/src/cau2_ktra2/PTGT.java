/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2_ktra2;

/**
 *
 * @author DELL
 */
public class PTGT {
    private String ma,hangsx,mau;
    private int namsx,giaban;

    public PTGT() {
    }
    public PTGT(String ma, String hangsx, String mau, int namsx, int giaban) {
        this.ma = ma;
        this.hangsx = hangsx;
        this.mau = mau;
        this.namsx = namsx;
        this.giaban = giaban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return " ";
    }
    
}
