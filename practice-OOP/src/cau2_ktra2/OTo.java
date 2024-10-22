/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2_ktra2;

/**
 *
 * @author DELL
 */
public class OTo extends PTGT{
    private String kieudongco;
    private int socho;

    public OTo() {
    }

    public OTo(String kieudongco, int socho, String ma, String hangsx, String mau, int namsx, int giaban) {
        super(ma, hangsx, mau, namsx, giaban);
        this.kieudongco = kieudongco;
        this.socho = socho;
    }

    public String getKieudongco() {
        return kieudongco;
    }

    public void setKieudongco(String kieudongco) {
        this.kieudongco = kieudongco;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    @Override
    public String toString() {
        return "O to : kieu dong co:"+kieudongco + " so cho :" + socho+" ma:"+ getMa()+" hang sx:"+getHangsx()+" nam sx:"+getNamsx()+" gia ban:"+getGiaban();
    }
    
}
