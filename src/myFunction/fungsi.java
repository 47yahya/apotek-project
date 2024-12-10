/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myFunction;
import java.sql.*;
import myConnection.koneksi;
/**
 *
 * @author user
 */
public class fungsi {
    static Connection Cnn;
    static koneksi db = new koneksi();
    static Statement st;
    static int i;
    
    //eksekusi perintah insert, update, delete
    public static int EQuery (String sql) throws SQLException {
        i = 0;
        try{
            Cnn = db.getConnection();
            st = Cnn.createStatement();
            i = st.executeUpdate(sql);
            return i;
        }
        catch (Exception e){
            return i;
        }
        finally {
            Cnn.close();
        }
    }
}
