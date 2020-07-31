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
public class Delete {

    Koneksi connect = new Koneksi();

    public void delete(String id) {

        try {

            connect.koneksi();
            Statement statement = connect.con.createStatement();

            String sql = "delete from data_barang where kode = '" + id + "'";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
