//コードの汚さは一人前
//DB再生成
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
		conn = DriverManager.getConnection("jdbc:sqlite:../Celestial Craft Fleet Fleet Battle Formation Simurator/bin/com/tofu4956/ccffbfs/sqlfile/Seilordatabase.s3db", "tofuccfbfs", "youneedeattofu");
		stmt = conn.createStatement();

		//テーブル作成
		stmt.executeUpdate("create table seilordata( name string, rank integer, Dhp INTEGER, Datk INTEGER, Mskill TEXT, FskillR TEXT, SkillS TEXT)" );

		//値を入力する
		stmt.execute( "insert into seilordata values ( 'サキ', 5, 764, 692,'ブリザードロア', 'フリーズロア', 'アイシクルレイン')" );

		//結果を表示する
		rs = stmt.executeQuery("select * from seilordata");
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