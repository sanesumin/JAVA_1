<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("euc-kr"); %> 
<%@page import="java.io.*"%>
<%

  String fileName = "db.txt"; //������ ���ϸ�
  String fileDir = "/"; //������ ������ ���丮
  String filePath = request.getRealPath(fileDir) + ""; //������ ������ ��ü���
  filePath += fileName; //������ ���ϸ��� ��ü��ο� ����
  //out.println(filePath+"\n\n\n");//
  try{

	  File f = new File(filePath); // ���ϰ�ü����
	  f.createNewFile(); //���ϻ���
	
	  // ���Ͼ���
	  FileWriter fw = new FileWriter(filePath); //���Ͼ��ⰴü����
	  //String data = "���Ͽ��� �ƹ��ų� �����ϴ�.
	  //\n�̰Ŵ� �ι�° ���ε� �ƹ��ų� �����ϴ�";
	  String one = request.getParameter("one");
	  String two = request.getParameter("two");
	  String three = request.getParameter("three");
	  String data= one+two+three;
	  
	  fw.write(data); //���Ͽ��� �ۼ�
	  fw.close(); //�����ڵ� �ݱ�
  
	  /*FileReader fr = new FileReader(filePath); //�����бⰴü����
	  BufferedReader br = new BufferedReader(fr); //���۸�����ü����

	  String line = null; 
	  while((line=br.readLine())!=null){ //���δ��� �б�
	    out.println(line + "<br>"); 
	  }*/
	  
	  
  }catch (IOException e){ 
	    System.out.println(e.toString()); //���� �߻��� �޽��� ���
	  }

%>

   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Ȩ������̼� ����[����]</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.1.0/jquery.mobile-1.1.0.min.css" />
    <script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.1.0/jquery.mobile-1.1.0.min.js"></script>
</head>
<body>
	<div data-role="page" id="page1" data-title="���� ����">
		<div data-role="header">
			<h1>���� ���� ��� ����</h1>
		</div>
	<div data-role="content">	
		<ul data-role="listview" data-inset="true">
			<li>�ȹ� ����</li>
			<li><%=request.getParameter("one") %><br><br></li>
			
			<li>�Ž� ����</li>
			<li><%=request.getParameter("two") %><br><br></li>
			
			<li>��� ����</li>
			<li><%=request.getParameter("three") %><br><br></li>
		</ul>
	</div>
	<div data-role="footer">
		<h4>&copy;2018 SUMIN</h4>
	</div>
</body>
</html>