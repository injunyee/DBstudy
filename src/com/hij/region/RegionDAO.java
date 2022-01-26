package com.hij.region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hij.connection.DBConnector;

public class RegionDAO
{
private DBConnector dbCoonector;
	
	public RegionDAO()
	{
		dbCoonector = new DBConnector();
	}
	
	public int setInsert(RegionDTO rdto) throws Exception
	{
		//1.db연결
		Connection con = dbCoonector.getConnection();
		//2.sql query문 생성
		String sql = "INSERT INTO REGIONS(REGION_ID, REGION_NAME) VALUES(?, ?)";
		//3.미리보내기
		PreparedStatement st = con.prepareStatement(sql);
		//4.?값 처리
		st.setInt(1, rdto.getRegion_id());
		st.setString(2, rdto.getRegion_name());
		//5.최종 전송
		int result = st.executeUpdate();
		//auto commit 로 재설정
		con.setAutoCommit(false);
		//6.연결된 자원들 해제시키기
		st.close();
		con.close();
		
		return result;
	}
	
	public int setDelete(RegionDTO rdto) throws ClassNotFoundException, SQLException
	{
		Connection con = dbCoonector.getConnection();
		String sql = "DELETE FROM REGIONS WHERE REGION_ID = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, rdto.getRegion_id());
		int result = st.executeUpdate();
		con.setAutoCommit(false);
		st.close();
		con.close();
		
		return result;
	}
	
	public int setChange(int[] num) throws ClassNotFoundException, SQLException
	{
		Connection con = dbCoonector.getConnection();
		String sql = "UPDATE REGIONS SET REGION_ID = ? WHERE REGION_ID = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num[1]);
		st.setInt(2, num[0]);
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
}
