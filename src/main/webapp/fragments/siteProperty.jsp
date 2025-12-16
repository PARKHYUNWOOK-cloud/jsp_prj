<%@page import="kr.co.sist.siteProperty.SiteProperty"%>
<%@page import="kr.co.sist.siteProperty.SitePropertyVO"%>
<%@ page language="java" 
    pageEncoding="UTF-8"%>
    
    
<%
        SitePropertyVO spVo=SiteProperty.spVO;
        	application.setAttribute("SiteProperty",spVo);
        	application.setAttribute("CommonURL",spVo.getProtocol()+spVo.getServer_name()+spVo.getContext_root());
        %>