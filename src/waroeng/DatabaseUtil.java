package waroeng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class utility untuk pekerjaan yang berhubungan dengan basis data
 * @author indraginanjar@gmail.com
 */
public class DatabaseUtil {
    /**
     * private-kan constructor agar tidak bisa dibuat intance dari kelas ini
     * (sesuai dengan konsepnya sebagai utility class
     */ 
    private DatabaseUtil(){
    }
    /**
     * Koneksi ke server basis data (MySQL)
     */
    private static Connection dbConnection;

    /**
     * Jika belum ada koneksi yang aktif buat, koneksi yang baru. Tetapi jika
     * sudah ada koneksi yang aktif, berikan koneksi itu.
     * @return koneksi ke basis data, "null" jika gagal membuat koneksi.
     */
    public static Connection getConnection() {
        if(dbConnection == null){
            // ganti user dan password sesuai pengaturan pengguna pada server
            String user = "root";
            String password = "root";
            try{
                String url = "jdbc:mysql://localhost/waroeng";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                dbConnection = DriverManager.getConnection(url, user, password);
            }catch(SQLException e){
                System.err.println("DatabaseUtil.getConnection: " + e.getMessage());
            }
        }
        return dbConnection;
    }
        
}
