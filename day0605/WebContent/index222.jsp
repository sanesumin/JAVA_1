<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form name="frmControl" method="post" action="ctrlProc.jsp">
	=======안방 조명=====<br>
	끄기<input name="one" type="radio" value="0"><br>
	켜기<input name="one" type="radio" value="1"><br><br>
	
	=======거실 조명===<br>
	끄기<input name="two" type="radio" value="0"><br>
	켜기<input name="two" type="radio" value="1"><br><br>
	
	======욕실 조명====<br>
	끄기<input name="three" type="radio" value="0"><br>
	켜기<input name="three" type="radio" value="1"><br><br>
	
	<input type="submit" value="전송">
	</form>

</body>
</html>