<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>10元商店-購物車</title>
</head>
<body>
<body style="padding: 15px">
	
	<form class="pure-form" method="post"
		action="${pageContext.request.contextPath}/servlet/cart">
		<fieldset>
			<legend>10元商店-購物車</legend>
			編號<input type="text" name="id" value="">
			<p />
			禮品: ...
			<p />
			<button type="submit" class="pure-button pure-button-primary">結帳</button>
			<button type="button"
				onclick="location.href='${pageContext.request.contextPath}/index.jsp'"
				class="pure-button pure-button-primary">繼續購物</button>
			<button type="button"
				onclick="location.href='${pageContext.request.contextPath}/servlet/cart?type=2'"
				class="pure-button pure-button-primary">查詢訂單紀錄</button>
		</fieldset>
	</form>
</body>
</html>