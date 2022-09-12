package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Sach;

public class SachRepository {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Sach> getAll() {
        List<Sach> list = new ArrayList<>();
        String sql = "select ma, ten, sotrang, trangthai from sach";
        try {
            con = DBContext.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Sach s = new Sach();
                s.setMa(rs.getString(1));
                s.setTen(rs.getString(2));
                s.setSoTrang(rs.getInt(3));
                s.setTrangThai(rs.getInt(4));
                list.add(s);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return list;
    }

    public Sach findByMa(String ma) {
        String sql = "select ma, ten, sotrang, trangthai from sach where ma = ?";
        try {
            con = DBContext.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                Sach s = new Sach();
                s.setMa(rs.getString(1));
                s.setTen(rs.getString(2));
                s.setSoTrang(rs.getInt(3));
                s.setTrangThai(rs.getInt(4));
                return s;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public boolean them(Sach s) {
        try {
            String sql = "insert into Sach(ma, ten, sotrang, trangthai) values (?,?,?,?)";
            con = DBContext.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, s.getMa());
            ps.setString(2, s.getTen());
            ps.setInt(3, s.getSoTrang());
            ps.setInt(4, s.getTrangThai());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    public boolean sua(Sach s) {
        try {
            String sql = "update sach set ten = ?, sotrang = ?, trangthai = ? where ma = ?";
            con = DBContext.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(4, s.getMa());
            ps.setString(1, s.getTen());
            ps.setInt(2, s.getSoTrang());
            ps.setInt(3, s.getTrangThai());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    public boolean xoa(String ma) {
        try {
            String sql = "delete from sach where ma = ?";
            con = DBContext.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }
}
