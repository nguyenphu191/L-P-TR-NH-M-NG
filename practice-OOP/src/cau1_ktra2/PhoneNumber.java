/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1_ktra2;

/**
 *
 * @author DELL
 */
public class PhoneNumber {
    private int mavung;
    private int noivung;

    public PhoneNumber(int mavung, int noivung) {
        this.mavung = mavung;
        this.noivung = noivung;
    }

    public int getMavung() {
        return mavung;
    }

    public void setMavung(int mavung) {
        this.mavung = mavung;
    }

    public int getNoivung() {
        return noivung;
    }

    public void setNoivung(int noivung) {
        this.noivung = noivung;
    }

    @Override
    public String toString() {
        if(mavung<100){
            return String.format("%03d-%07d",mavung,noivung);
        }else{
            return String.format("%04d-%07d",mavung,noivung);
        }
    }  
}
