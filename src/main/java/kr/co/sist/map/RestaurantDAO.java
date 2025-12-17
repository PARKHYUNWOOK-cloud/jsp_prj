package kr.co.sist.map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.board.BoardDTO;
import kr.co.sist.dao.DbConn;

public class RestaurantDAO {

	
	private static RestaurantDAO rDAO;
	
	
	private RestaurantDAO() {
		
	}
	
	public static RestaurantDAO getInstance() {
		if(rDAO==null) {
			rDAO=new RestaurantDAO();
			
		}//end if	
		return rDAO;
	}//getInstance;
	
	
	public List<RestaurantDTO> selectAllRestaurant(String id) throws SQLException{
		
		List<RestaurantDTO> list = new ArrayList<RestaurantDTO>();
		
		DbConn dbCon = DbConn.getInstance("jdbc/dbcp");
	      
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try{
	         //1.JNDI객체 생성
	         con = dbCon.getConn();
	         //2.DataSource 어기
	         //3.Connection얻기
	         //4.쿼리문 생성 객체 얻기 
	         StringBuilder selectRestaurant = new StringBuilder();
	         selectRestaurant
	         .append("   select rest_num, rest_name, menu, lat, lng, input_date    ")
	         .append("   from RESTAURANT2  ")
	         .append("   where id=?");
	         
	         pstmt = con.prepareStatement(selectRestaurant.toString());
	         
	         
	         //5.바인등 변수 값 설정
	         int pstmtIdx=0;
					pstmt.setString(1, id);

	         //6.조회결과 얻기
				RestaurantDTO rDTO = null;
	         	rs=pstmt.executeQuery();
	         while(rs.next()) {
	        	 rDTO= new RestaurantDTO();
	        	 
	        	 rDTO.setRest_num(rs.getInt("rest_num"));
	            
	            list.add(rDTO);
	            
	         }//end while
	      }finally {
	         //7.연결 끊기 
	         dbCon.dbClose(rs, pstmt, con);
	      }//end finally
				
		

		
		
		return list;
	}//selectAllRestaurant
	
	
	
	
	public void insertRestaurant(RestaurantDTO rDTO) throws SQLException{
		
		
		
	}//insertRestaurant
	
	
	
}//class 
