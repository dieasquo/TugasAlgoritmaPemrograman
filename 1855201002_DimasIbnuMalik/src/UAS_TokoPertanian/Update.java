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
public class Update {

    Koneksi connect = new Koneksi();

    public void edit(String id, String nama, String harga, String kategori, String jumlah_terjual, String total_pendapatan) {

        try {

            connect.koneksi();
            Statement statement = connect.con.createStatement();

            String sql_nama = "update data_barang set nama_barang='" + nama + "'where kode='" + id + "'";
            String sql_kategori = "update data_barang set kategori='" + kategori + "'where kode='" + id + "'";
            String sql_harga = "update data_barang set harga='" + harga + "'where kode='" + id + "'";
            String sql_harga_beli = "update data_barang set jumlah_terjual='" + jumlah_terjual + "'where kode='" + id + "'";
            String sql_jumlah = "update data_barang set total_pendapatan='" + total_pendapatan + "'where kode='" + id + "'";

            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_harga);
            statement.executeUpdate(sql_kategori);
            statement.executeUpdate(sql_harga_beli);
            statement.executeUpdate(sql_jumlah);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
