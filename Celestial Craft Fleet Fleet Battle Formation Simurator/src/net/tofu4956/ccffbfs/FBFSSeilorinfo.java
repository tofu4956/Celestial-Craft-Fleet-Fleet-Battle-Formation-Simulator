//コードの汚さは一人前
//DB再生成(削除予定
package net.tofu4956.ccffbfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FBFSSeilorinfo {

private static Connection conn;
private static Statement stmt;
private static ResultSet rs;

public static void main(String[] args) throws SQLException  {

	try {
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:../Celestial Craft Fleet Fleet Battle Formation Simurator/bin/com/tofu4956/ccffbfs/sqlfile/Seilordatabase.s3db", "tofuccfbfs", "youneedeattofu");
		stmt = conn.createStatement();

		stmt.executeUpdate("create table seilordata( name string, rank integer, Dhp INTEGER, Datk INTEGER, Mskill TEXT, FskillR TEXT, FskillS TEXT)" );

		stmt.execute( "insert into seilordata values ( 'サキ', 5, 764, 692,'ブリザードロア', 'フリーズロア', 'アイシクルレイン')" );

		rs = stmt.executeQuery("select * from seilordata");
		while(rs.next()) {
			System.out.println("completed.");
		}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Wrong DBTable or DBTable version is old. CCFFBFS will be recreating database...");
			conn = DriverManager.getConnection("jdbc:sqlite:../Celestial Craft Fleet Fleet Battle Formation Simurator/bin/com/tofu4956/ccffbfs/sqlfile/Seilordatabase.s3db", "tofuccfbfs", "youneedeattofu");
			stmt = conn.createStatement();
			stmt.executeUpdate("create table seilordata( name string, rank integer, Dhp INTEGER, Datk INTEGER, Mskill string, FskillR string, FskillS string)" );
			stmt.execute("insert into seilordata values ( 'サキ', 5, 764, 692,'ブリザードロア', 'フリーズロア', 'アイシクルレイン')" );
			rs = stmt.executeQuery("select * from seilordata");
			//動作確認用
			while(rs.next()) {
				System.out.println("completed.");
			}
		} finally {
			if(conn != null) {
				try {
					//接続を閉じる
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}