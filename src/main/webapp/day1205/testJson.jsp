<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%--      
<%@ include file="../fragments/siteProperty.jsp" %> --%>
    


<%
//trimDirectiveWhitespaces="true" 
//이거쓰면 페이지 소스 보기에서 공백 없어짐..ㄹㅇ


//1.JSONObject 생성
JSONObject jsonObj = new JSONObject();

//2. 값할당
jsonObj.put("name", "민병조로로로로로");
jsonObj.put("age", 25);
jsonObj.put("flag",true);
jsonObj.put("date",new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

//3. 출력
//out.print(jsonObj);
out.print(jsonObj.toJSONString());
%>