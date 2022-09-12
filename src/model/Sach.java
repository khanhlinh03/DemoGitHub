
package model;


public class Sach {
    private String id, ma, ten;
    private int soTrang, trangThai;

    public Sach(String id, String ma, String ten, int soTrang, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.soTrang = soTrang;
        this.trangThai = trangThai;
    }

    public Sach(String ma, String ten, int soTrang, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.soTrang = soTrang;
        this.trangThai = trangThai;
    }

    public Sach() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
