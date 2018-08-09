<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("euc-kr"); %> 
<%@page import="java.io.*"%>
<%

  String fileName = "db.txt"; //생성할 파일명
  String fileDir = "/"; //파일을 생성할 디렉토리
  String filePath = request.getRealPath(fileDir) + ""; //파일을 생성할 전체경로
  filePath += fileName; //생성할 파일명을 전체경로에 결합
  //out.println(filePath+"\n\n\n");//
  try{

	  File f = new File(filePath); // 파일객체생성
	  f.createNewFile(); //파일생성
	
	  // 파일쓰기
	  FileWriter fw = new FileWriter(filePath); //파일쓰기객체생성
	  //String data = "파일에다 아무거나 적습니다.
	  //\n이거는 두번째 줄인데 아무거나 적습니다";
	  String one = request.getParameter("one");
	  String two = request.getParameter("two");
	  String three = request.getParameter("three");
	  String data= one+two+three;
	  
	  fw.write(data); //파일에다 작성
	  fw.close(); //파일핸들 닫기
  
	  /*FileReader fr = new FileReader(filePath); //파일읽기객체생성
	  BufferedReader br = new BufferedReader(fr); //버퍼리더객체생성

	  String line = null; 
	  while((line=br.readLine())!=null){ //라인단위 읽기
	    out.println(line + "<br>"); 
	  }*/
	  
	  
  }catch (IOException e){ 
	    System.out.println(e.toString()); //에러 발생시 메시지 출력
	  }

%>

   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>홈오토메이션 보고[조명]</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.1.0/jquery.mobile-1.1.0.min.css" />
    <script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.1.0/jquery.mobile-1.1.0.min.js"></script>
</head>
<body>
	<div data-role="page" id="page1" data-title="조명 선택">
		<div data-role="header">
			<h1>조명 조정 결과 보고</h1>
		</div>
	<div data-role="content">	
		<ul data-role="listview" data-inset="true">
			<li>안방 조명</li>
			<li><%=request.getParameter("one") %><br><br></li>
			
			<li>거실 조명</li>
			<li><%=request.getParameter("two") %><br><br></li>
			
			<li>욕실 조명</li>
			<li><%=request.getParameter("three") %><br><br></li>
		</ul>
	</div>
	<div data-role="footer">
		<h4>&copy;2018 SUMIN</h4>
	</div>
</body>
</html>