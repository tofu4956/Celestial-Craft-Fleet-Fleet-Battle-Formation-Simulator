
package com.tofu4956.ccffbfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FBFSSeilorinfo {

private static Connection conn;
private static Statement stmt;
private static ResultSet rs;

public static void main(String[] args)  {

	try {
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:../Celestial Craft Fleet Fleet Battle Formation Simurator/bin/com/tofu4956/ccffbfs/sqlfile/Seilordatabase", "tofuccfbfs", "youneedeattofu");
		stmt = conn.createStatement();

		//テーブル作成
		stmt.executeUpdate("create table test1( name string, rank integer )" );

		//値を入力する
		stmt.execute( "insert into test1 values ( 'サキ', 5 )" );

		//結果を表示する
		rs = stmt.executeQuery("select * from test1");
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("rank"));
		}

		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//接続を閉じる
					conn.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}
}