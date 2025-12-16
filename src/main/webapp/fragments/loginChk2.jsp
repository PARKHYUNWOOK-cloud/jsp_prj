<%@ page language="java" pageEncoding="UTF-8"%>
    

<%-- <c:if(${sessionScope.userId ==null}){
		alert("로그인한 사용자만 글을 쓸 수 있습니다.");
		location.href="${CommonURL}/login/loginFrm.jsp";
		/* 이거 사용자에게 꼭 넘어갈래? 물어봐야됨!! */
}//end if 
     --%>

<c:if test="${sessionScope.userId ==null}">
<c:redirect url="${CommonURL}/login/loginFrm.jsp"/>
</c:if>