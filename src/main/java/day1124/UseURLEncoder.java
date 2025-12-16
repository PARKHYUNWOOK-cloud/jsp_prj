package day1124;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UseURLEncoder {

	public static void main(String[] args) throws UnsupportedEncodingException {

			String name="민병조";
			System.out.println(name);
			
			//문자열을 Web parameter 형식으로 변환일 
			String enName=URLEncoder.encode(name,"UTF-8");
			System.out.println(enName);
			//id=%EB%AF%BC%EB%B3%91%EC%A1%B0
			
			
			
			String deName=URLDecoder.decode(name,"UTF-8");
			System.out.println(deName);
			
			
			//String 사용.
			String str=new String(URLDecoder.decode(enName,"8859_1").getBytes("8859_1"),"UTF-8");
			
			System.out.println("--"+str);
			
	}//main
}//class
