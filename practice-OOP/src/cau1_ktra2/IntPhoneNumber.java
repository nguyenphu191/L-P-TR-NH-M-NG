/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1_ktra2;

/**
 *
 * @author DELL
 */
public class IntPhoneNumber extends PhoneNumber{
    private int maqg;

    public IntPhoneNumber(int maqg, int mavung, int noivung) {
        super(mavung, noivung);
        this.maqg = maqg;
    }

    public int getMaqg() {
        return maqg;
    }

    public void setMaqg(int maqg) {
        this.maqg = maqg;
    }

    @Override
    public String toString() {
        if(getMavung()<100){
            return maqg+"-"+String.format("%02d-%07d",getMavung(),getNoivung());
        }else{
            return maqg+"-"+String.format("%03d-%07d",getMavung(),getNoivung());
        }
    }    
}
