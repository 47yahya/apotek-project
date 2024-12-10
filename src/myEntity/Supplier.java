/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myEntity;
import java.util.Date;
/**
 *
 * @author user
 */
public class Supplier {
    private String nama_pembeli, nama_industri, nama_obat, Qty, harga_obat, Total;

    public Supplier() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String Qty) {
        this.Qty = Qty;
    }

    public String getHarga_obat() {
        return harga_obat;
    }

    public void setHarga_obat(String harga_obat) {
        this.harga_obat = harga_obat;
    }

    public String getNama_industri() {
        return nama_industri;
    }

    public void setNama_industri(String nama_industri) {
        this.nama_industri = nama_industri;
    }


    
    public Supplier(String nama_pembeli, String nama_industri, String nama_obat, String id_beli, String Qty, String harga_obat) {
        this.nama_pembeli = nama_pembeli;
        this.nama_industri = nama_industri;
        this.nama_obat = nama_obat;
        this.Qty = Qty;
        this.harga_obat = harga_obat; 
    }

    public Supplier(String Total) {
        this.Total = Total;
    }
   
    private int id_beli;

    public Supplier(int id_beli) {
        this.id_beli = id_beli;
    }

    public int getId_beli() {
        return id_beli;
    }

    public void setId_beli(int id_beli) {
        this.id_beli = id_beli;
    }

    private Date tanggal_beli;

    public Supplier(Date tanggal_beli) {
        this.tanggal_beli = tanggal_beli;
    }

    public Date getTanggal_beli() {
        return tanggal_beli;
    }

    public void setTanggal_beli(Date tanggal_beli) {
        this.tanggal_beli = tanggal_beli;
    }

    
}
