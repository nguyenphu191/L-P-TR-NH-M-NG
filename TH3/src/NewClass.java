
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class NewClass {
    
}
    public Object[] toObject(){
        return new Object[]{
          cn.getMa(),cn.getName(),xg.getMa(),songay
        };
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class IOFile {
    // doc ra
    public static <T> List<T> doc(String file){
        List<T> list=new ArrayList<>();
        try {
            ObjectInputStream o=new ObjectInputStream(new FileInputStream(file));
            list=(List<T>)o.readObject();
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    // viet vao
    public static <T> void viet(String file,List<T> arr){
        try {
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(arr);
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
public class ValidException extends Exception{

    public ValidException(String ms) {
        super(ms);
    }
    
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class SinhVien{
    public static int stt=0;
    private String masv;
    private String name;
    private String date;
    private String cla;
    private double mark;

    public SinhVien() {
    }
    public SinhVien( String name,String date, String cla, double mark) {
        stt++;
        this.masv = "B20DCCN"+String.format("%03d", stt);
        this.name = name;
        this.cla = cla;
        this.mark = mark;
        String a[]=date.split("/");
        String day=String.format("%02d", Integer.parseInt(a[0]));
        String month=String.format("%02d", Integer.parseInt(a[1]));
        String year=String.format("%02d", Integer.parseInt(a[2]));
        this.date=day+"/"+month+"/"+year;
    }
    @Override
    public String toString() {
        return masv + " " + name + " " + cla + " " + date + " " + String.format("%.2f", mark);
    } 
}
public class J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2 {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("SV.in");
        Scanner sc=new Scanner(f);
        int n=Integer.parseInt(sc.nextLine());
//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
//        ArrayList<SinhVien> list=new ArrayList<>();
        while(n-->0){
            String name=sc.nextLine();
            String cla=sc.nextLine();
            String date=sc.nextLine();
            double mark=Double.parseDouble(sc.nextLine());
            SinhVien sv=new SinhVien(name,date,cla,mark);
            System.out.println(sv);
//            list.add(sv);
        }
        
//        for(SinhVien x:list){
//            System.out.println(x);
//        }
    }
}

package view;

import controler.IOFile;
import controler.ValidException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BangCong;
import model.CongNhan;
import model.Xuong;
/**
 *
 * @author DELL
 */
public class FormMain extends javax.swing.JFrame {

    private List<CongNhan> listCN;
    private List<Xuong> listXG;
    private List<BangCong> listCC;
    private DefaultTableModel tmCN,tmXG,tmCC;
    private String fCN,fXG,fCC;
    public FormMain() {
        initComponents();
        fCN="src/controler/CN.dat";
        fXG="src/controler/XG.dat";
        fCC="src/controler/CC.dat";
        if(new File(fCN).exists()){
            listCN=IOFile.doc(fCN);
        }else{
            listCN=new ArrayList<>();
        }
        if(new File(fXG).exists()){
            listXG=IOFile.doc(fXG);
        }else{
            listXG=new ArrayList<>();
        }
        if(new File(fCC).exists()){
            listCC=IOFile.doc(fCC);
        }else{
            listCC=new ArrayList<>();
        }
        
        tmCN=(DefaultTableModel)tbCN.getModel();
        tmXG=(DefaultTableModel)tbXG.getModel();
        tmCC=(DefaultTableModel)tbCC.getModel();
        docCN();
        docXG();
        docCC();
        setButtonCN(true);
        setButtonXG(true);
        eventCN();
        eventXG();
        eventCC();
    }
    private void docCN(){
        tmCN.setRowCount(0);
        for (CongNhan i : listCN){
            tmCN.addRow(i.toObjects());
        }
    }
    private void docXG(){
        tmXG.setRowCount(0);
        for (Xuong i : listXG){
            tmXG.addRow(i.toObjects());
        }
    }
    private void docCC(){
        tmCC.setRowCount(0);
        for (BangCong i : listCC){
            tmCC.addRow(i.toObject());
        }
    }
    private void setButtonCN(boolean b){
        themCN.setEnabled(b);
        capnhatCN.setEnabled(!b);
        boquaCN.setEnabled(!b);
    }
    private void setButtonXG(boolean b){
        themXG.setEnabled(b);
        capnhatXG.setEnabled(!b);
        boquaXG.setEnabled(!b);
    }
    private void eventXG(){
        themXG.addActionListener(e-> {
            maXG.setText(1000+listXG.size()+"");
            nameXG.requestFocus();
            setButtonXG(false);
        });
        capnhatXG.addActionListener(e-> {
            Xuong x=new Xuong(Integer.parseInt(maXG.getText()),
                    nameXG.getText(),
                    Integer.parseInt(hsXG.getSelectedItem().toString())
            );
            listXG.add(x);
            tmXG.addRow(x.toObjects());
            setButtonXG(true);
            maXG.setText("");
            nameXG.setText("");
            hsXG.setSelectedItem(1);
        });
        suaXG.addActionListener(e->{
            int row=tbXG.getSelectedRow();
            if(row>=0&&row<=tbXG.getRowCount()){
                Xuong x=new Xuong(Integer.parseInt(maXG.getText()),
                    nameXG.getText(),
                    Integer.parseInt(hsXG.getSelectedItem().toString())
                );
                listXG.set(row, x);
                tmXG.removeRow(row);
                tmXG.insertRow(row, x.toObjects());
                maXG.setText("");
                nameXG.setText("");
                hsXG.setSelectedItem(1);
                setButtonXG(true);
            }else{
                JOptionPane.showMessageDialog(this, "Chon dong de sua");
            }
        });
        luuXG.addActionListener(e->{
            IOFile.viet(fXG, listXG);
        });
        boquaXG.addActionListener(e->{
            maXG.setText("");
            nameXG.setText("");
            hsXG.setSelectedItem(1);
            setButtonXG(true);
        });
    }
    private void eventCN(){
        themCN.addActionListener(e-> {
            maCN.setText(1000+listCN.size()+"");
            nameCN.requestFocus();
            setButtonCN(false);
        });
        capnhatCN.addActionListener(e-> {
            try {
                if(!phoneCN.getText().matches("\\d+")){
                    throw new ValidException("Dien thoai can nhap so");
                }
                CongNhan c=new CongNhan(Integer.parseInt(maCN.getText()),
                        nameCN.getText(),
                        adrCN.getText(),
                        phoneCN.getText(),
                        Integer.parseInt(bacCN.getSelectedItem().toString())
                );
                listCN.add(c);
                tmCN.addRow(c.toObjects());
                setButtonCN(true);
                maCN.setText("");
                nameCN.setText("");
                phoneCN.setText("");
                adrCN.setText("");
                bacCN.setSelectedItem("1");
            } catch (ValidException ex) {
                JOptionPane.showMessageDialog(this, ex);
                phoneCN.setText("");
                phoneCN.requestFocus();
            }
        });
        xoaCN.addActionListener(e->{
            int row=tbCN.getSelectedRow();
            if(row>=0&&row<=tbCN.getRowCount()){
                listCN.remove(row);
                tmCN.removeRow(row);
            }else{
                JOptionPane.showMessageDialog(this, "Chon dong de xoa");
            }
        });
        luuCN.addActionListener(e->{
            IOFile.viet(fCN, listCN);
        });
        boquaCN.addActionListener(e->{
            maCN.setText("");
            nameCN.setText("");
            phoneCN.setText("");
            adrCN.setText("");
            bacCN.setSelectedItem("1");
            setButtonCN(true);
        });
    }
    private int getSoNgay(int maCN){
        int so=0;
        for(BangCong i : listCC){
            if(i.getCn().getMa()==maCN){
                so+=i.getSongay();
            }
        }
        return so;
    }
    private CongNhan getCongNhan(int maCN){
        for(CongNhan i : listCN){
            if(i.getMa()==maCN){
                return i;
            }
        }
        return null;
    }
     private Xuong getXuong(int ma){
        for(Xuong i : listXG){
            if(i.getMa()==ma){
                return i;
            }
        }
        return null;
    }
    private void eventCC(){
        lamtuoi.addActionListener(e->{
            maCNCC.removeAllItems();
            for(CongNhan i : listCN){
                maCNCC.addItem(i.getMa()+"");
            }
            maXGCC.removeAllItems();
            for(Xuong i : listXG){
                maXGCC.addItem(i.getMa()+"");
            }
        });
        themCC.addActionListener(e->{
            try {
                int maCN=Integer.parseInt(maCNCC.getSelectedItem().toString());
                int maXG=Integer.parseInt(maXGCC.getSelectedItem().toString());
                int ngay=Integer.parseInt(songay.getText());
                if(getSoNgay(maCN)+ngay>31){
                    JOptionPane.showMessageDialog(this, "So ngay lon hon 31");
                }else{
                    BangCong b=new BangCong(getCongNhan(maCN),
                            getXuong(maXG),ngay
                    );
                    listCC.add(b);
                    tmCC.addRow(b.toObject());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Nhap so");
            }
        });
        luuCC.addActionListener(e->{
            IOFile.viet(fCC, listCC);
        });
        sapxepCC.addActionListener(e->{
            int index=chonsapxep.getSelectedIndex();
            if(index==0){
                listCC.sort(new Comparator<BangCong>(){
                    @Override
                    public int compare(BangCong o1, BangCong o2) {
                           return o1.getCn().getName().compareToIgnoreCase(o2.getCn().getName());
                    }
                });
            }else if (index==1){
                listCC.sort(new Comparator<BangCong>(){
                    @Override
                    public int compare(BangCong o1, BangCong o2) {
                        return o1.getSongay()-o2.getSongay();
                    }
                });
            }
        });
        tmCC.setRowCount(0);
        for(BangCong i: listCC){
            tmCC.addRow(i.toObject());
        }
    }
private void tbXGMouseClicked(java.awt.event.MouseEvent evt) {                                  
        int row=tbCN.getSelectedRow();
        if(row>=0&&row<=tbCN.getRowCount()){
            maXG.setText(tmXG.getValueAt(row, 0).toString());
            nameXG.setText(tmXG.getValueAt(row, 1).toString());
            for (int i=0;i<hsXG.getItemCount();i++){
                if(hsXG.getItemAt(i).equals(tmXG.getValueAt(row, 2).toString())){
                    hsXG.setSelectedIndex(i);
                }
            }
        }
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BAI2 {
    public static void main(String[] args) {
        QuanLyTuLieu q=new QuanLyTuLieu();
        Scanner in=new Scanner(System.in);
        q.nhapBao(in);
        q.nhapSachHoc(in);
        q.out();
    }
}
class TuLieu{
    public static int stt=0;
    private String ma,nxb;
    private double gia;
    private int sl;

    public TuLieu() {
    }

    public TuLieu(String nxb, double gia, int sl) {
        stt++;
        this.nxb = nxb;
        this.gia = gia;
        this.sl = sl;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
}
interface ITuLieu{
    public double getGia();
}
class Bao extends TuLieu implements ITuLieu{
    private String ngay,ten;

    public Bao() {
    }

    public Bao(String ten,String nxb,String ngay, double gia, int sl) {
        super(nxb, gia, sl);
        this.ngay = ngay;
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setMa(){
        super.setMa("");
        String name=getTen().toUpperCase();
        String x=name.charAt(0)+String.format("%03d", stt);
        setMa(x);
    }
    
    @Override
    public double getGia(){
        double x=super.getGia();
        if(getSl()>200){
            x=x*95/100;
        }
        if(getNgay().charAt(3)=='0'&&(getNgay().charAt(4)=='1'||getNgay().charAt(4)=='2')){
            x=x*95/100;
        }
        return x;
    }
    @Override
    public String toString() {
        return super.getMa()+" "+ten +" " + ngay +" "+ getNxb()+" "+Math.round(getGia());
    }
}
class SachHoc extends TuLieu implements ITuLieu{
    private String ten,tg;
    private int sot;

    public SachHoc() {
    }

    public SachHoc(String ten, String tg, int sot, String nxb, double gia, int sl) {
        super(nxb, gia, sl);
        this.ten = ten;
        this.tg = tg;
        this.sot = sot;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public int getSot() {
        return sot;
    }

    public void setSot(int sot) {
        this.sot = sot;
    }
    public void setMa(){
        super.setMa("");
        String name=getTen();
        String[] arr=name.split("\\s+");
        String x=arr[0].toUpperCase()+String.format("%03d", stt);
        setMa(x);
    }
    @Override
    public double getGia(){
        double x=super.getGia();
        if(getSot()<=300){
            x=x*95/100;
        }else if(getSot()<=500){
            x=x*9/10;
        }else if(getSl()>500){
            x=x*85/100;
        }
        if(getSl()>500){
            x=x*9/10;
        }
        return x;
    }
    @Override
    public String toString() {
        return super.getMa()+" "+getTen()+" "+getNxb()+" "+getSot()+" "+Math.round(getGia());
    }
    
}
class QuanLyTuLieu{
    private List<TuLieu> list=new ArrayList<>();

    public QuanLyTuLieu() {
    }

    public List<TuLieu> getList() {
        return list;
    }

    public void setList(List<TuLieu> list) {
        this.list = list;
    }
    public void nhapBao(Scanner in){
        String ten=in.nextLine();
        String nxb=in.nextLine();
        String ngay=in.nextLine();
        double gia=Double.parseDouble(in.nextLine());
        int sl=Integer.parseInt(in.nextLine());
        Bao a=new Bao(ten,nxb,ngay,gia,sl);
        a.setMa();
        list.add(a);
    }
    public void nhapSachHoc(Scanner in){
        String ten=in.nextLine();
        String tg=in.nextLine();
        int sot=Integer.parseInt(in.nextLine());
        String nxb=in.nextLine();
        double gia=Double.parseDouble(in.nextLine());
        int sl=Integer.parseInt(in.nextLine());
        SachHoc a=new SachHoc(ten,tg,sot,nxb,gia,sl);
        a.setMa();
        list.add(a);
    }
    public void out(){
        for(TuLieu x: list){
            System.out.println(x);
        }
    }
}
//nhi dong
//thieu nhi
//01/06/2023
//23000
//100
//mua ha
//Le an Thu
//80
//kim dong
//90000
//200
    }           
