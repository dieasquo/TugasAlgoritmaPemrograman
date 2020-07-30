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

    public void post(String kode, String nama_barang, int harga, String kategori, int harga_beli, int jumlah) {

        try {
            
            connect.koneksi();
            Statement statement = connect.con.createStatement();
            String sql = "insert into data_barang (`kode`, `nama_barang`, `harga`, `kategori`, `harga_beli`, `jumlah`)" + "values('" + kode + "', '" + nama_barang + "'," + harga + ",'" + kategori + "','" + harga_beli + "','" + jumlah + "')";
            statement.executeUpdate(sql);
            statement.close();
//            System.out.print("berhasil menyimpan");

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
