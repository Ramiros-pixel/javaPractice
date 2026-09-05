package config;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//Menampilkan session import baru
import view.viewCore;



public class main {
	private static final String JBDC_DRIVER = "jdbc:mysql://localhost:3306/db_prak_pbd";
	private static final String NAME_DB= "root";
	private static final String PW = "";
	
	private static Connection connect;
	private static Statement statement;
	private static ResultSet resultData;
	
	public static void main (String[] args) throws ClassNotFoundException, SQLException{	
		connection();
	}
	
	private static void connection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect = DriverManager.getConnection(JBDC_DRIVER, 
															NAME_DB,
															PW);
		System.out.println("dapet");

		while(true) {
			System.out.println("\n=====Menu======\n"
					+"1. Lihat Semua Data Barang\n"
					+"2. Detail Data Barang\n" +
					"3. Cari Data Barang\n"+
					"4. Tambah Data Barang\n" +
					"5. Update Data Barang\n"+
					"Pilih 1/2/3/4/5/6"
					);
			
			Scanner input= new Scanner(System.in);
			String pilihan = input.next();
			
			System.out.println(pilihan);
			
			if (pilihan.equalsIgnoreCase("0")) {
				System.out.println("Thanks");
				break;
			}
			
			switch(pilihan) {
			case "1":
				viewCore.getAllData();
				break;
			case "2":
				System.out.println("Detail Data Barang");
				break;
			case "3":
				System.out.println("Cari Data barang");
				break;
			case "4":
				System.out.println("Tambah Data Barang");
				break;
			case "5":
				System.out.println("Update Data Barang");
				break;
			}	
		}
	
	}
	
	public static String getAllData() {
		String data = "maaf tidak ada data";
		try {
			//FROM connect config
			statement = connect.createStatement();
			//In here for the input querry
			String query = "SELECT idBarang, namaBarang FROM tblbarang";
			//make a bucket for save the result of query
			resultData = statement.executeQuery(query);
			data = "";
			
			//Loop show the data
			while(resultData.next()) {
				data+= "id Barang: " + resultData.getInt("idBarang") + ", Nama Barang: " +
			resultData.getString("namaBarang")+ "\n";
				
			}
		}
		catch(Exception e){
			
		}
		return data;
		
		
	}
	
	
}
