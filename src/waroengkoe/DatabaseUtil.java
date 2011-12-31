package waroengkoe;

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
        
    public static void createDatabaseStructure(String user, String password){
            try{
                String url = "jdbc:mysql://localhost/";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                dbConnection = DriverManager.getConnection("jdbc:mysql://localhost/", 
                        user, password);
                Statement stmt = dbConnection.createStatement();
                
                stmt.executeUpdate("CREATE DATABASE universitas");
                
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `mahasiswa` (" 
                        + "`nim` varchar(9) NOT NULL,"
                        + "`nama` varchar(50) NOT NULL,"
                        + "`tanggal_lahir` date NOT NULL,"
                        + "`jurusan` varchar(50) NOT NULL,"
                        + "`alamat` varchar(500) NOT NULL,"
                        + "PRIMARY KEY (`nim`)"
                        + ") ENGINE=MyISAM DEFAULT CHARSET=utf8;");
                
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `matakuliah` ("
                        + "`kode_mtk` varchar(5) NOT NULL,"
                        + "`nama_mtk` varchar(30) NOT NULL,"
                        + "`sks` int(10) unsigned NOT NULL,"
                        + "`semester` int(11) unsigned NOT NULL,"
                        + "PRIMARY KEY (`kode_mtk`)"
                        + ") ENGINE=MyISAM DEFAULT CHARSET=latin1;");
                
            }catch(SQLException e){
                System.err.println("DatabaseUtil.createDatabaseStructure: " 
                        + e.getMessage());
            }
    }
}
