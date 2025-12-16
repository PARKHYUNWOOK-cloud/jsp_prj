package day1201;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductService {

	public List<ProductDTO> searchPrd(){
		List<ProductDTO> list= new ArrayList<ProductDTO>();
	
		list.add(new ProductDTO("img_1.jpg","음...? 뭐지 이자식은?","뭘봐",3500,new Date()));
		list.add(new ProductDTO("img_2.jpg","몰루?","혹시 민병조씨를 아는가?",32500,new Date(System.currentTimeMillis()-(60*60*24*1))));
		list.add(new ProductDTO("img_3.jpg","이건 못 참지?","오늘도 수고 하셨습니다. 안녕히",500,new Date(System.currentTimeMillis()-(60*60*24*2))));
		
		return list;
	}//searchPrd
		
}//class 
