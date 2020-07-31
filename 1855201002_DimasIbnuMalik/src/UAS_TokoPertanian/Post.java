/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_TokoPertanian;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Post {

    Koneksi connect = new Koneksi();

    public void post(String kode, String nama_barang, String kategori, int harga, int jumlah, int total_pendapatan) {

        try {

            connect.koneksi();
            Statement statement = connect.con.createStatement();
            String sql = "INSERT INTO `data_barang`(`kode`, `nama_barang`, `kategori`, `harga`, `jumlah_terjual`, `total_pendapatan`) VALUES ('" + kode + "','" + nama_barang + "','" + kategori + "','" + harga + "','" + jumlah + "','" + total_pendapatan + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
