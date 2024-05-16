package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.example.common.DBManager;
import com.example.entity.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "※ここにSQL文を書く";
		try {
			
			
			// ※ここにSQL実行処理を書く
			
			// ※ここに結果の操作処理を書く
			
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member findById(int id){
		Connection con = DBManager.createConnection();
		String sql = "※ここにSQL文を書く";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ※ここに?に値を埋め込む処理を書く
				
			// ※ここにSQL実行処理を書く
			
			// ※ここに結果の操作処理を書く
			
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "※ここにSQL文を書く";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ※ここに?に値を埋め込む処理を書く
			
			// ※ここにSQL実行処理を書く
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

}
