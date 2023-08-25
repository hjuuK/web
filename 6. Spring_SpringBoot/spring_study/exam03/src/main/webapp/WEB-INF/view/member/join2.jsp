<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="action" value="/member/join" />

<form:form method="POST" action="${action}" modelAttribute="joinForm">
    <dl>
        <dt>아이디</dt>
        <dd>
            <form:input path="userId" />
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <form:password path="userPw" />
        </dd>
    </dl>
    <dl>
        <dt>비밀번호확인</dt>
        <dd>
            <form:password path="userPwRe" />
        </dd>
    </dl>
    <button type="submit">가입하기</button>
</form:form>