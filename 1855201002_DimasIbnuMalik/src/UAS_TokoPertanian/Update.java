/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13_UpdateDelete;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Update {

    Koneksi konek = new Koneksi();

    public void update(int nim, String nama, String alamat, String jenis) {

        try {

            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql_nama = "update identitas set nama='" + nama + "'where nim='" + nim + "'";
            String sql_alamat = "update identitas set alamat='" + alamat + "'where nim='" + nim + "'";
            String sql_jenis = "update identitas set jenis='" + jenis + "'where nim='" + nim + "'";

//            UPDATE `identitas` SET `nim`=[value-1],`nama`=[value-2],`alamat`=[value-3],`jenis`=[value-4] WHERE 1
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jenis);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
