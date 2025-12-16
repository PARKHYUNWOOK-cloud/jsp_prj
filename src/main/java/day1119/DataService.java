package day1119;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataService {

	public List<imgDTO> searchImg(){
		List<imgDTO> list = null;
		DateDAO dDAO=new DateDAO();
		
		if(new Random().nextBoolean()) {
			list=dDAO.selectImg();
		}//end if
		
		if(list==null) {
			list=new ArrayList<imgDTO>();
		}//end if
		
		
		return list;
	}
}
