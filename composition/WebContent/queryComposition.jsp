<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询页</title>
<style type="text/css">
   input{
      width: 250px;
      height: 25px;
   }
   button {
	  width: 50px;
	  height: 30px;
   }
   td{
     width:150px;
     height:30px;
     text-align: center;
   }
</style>
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
   $(function(){
	  $("#btn").click(function(){
		 var key = $("#key").val();
		 $("#tab tr:not(:first)").empty();
		 $.ajax({
			 url:"likeQuery?key="+key,
			 async:true,
			 dataType:"json",
			 success:function(result){
				 for (var i = 0; i < result.length; i++) {
					$("#tab").append("<tr><td>"+result[i].composition_id+"</td><td>"+result[i].composition_name+"</td><td>"+result[i].composition_brief+"</td><td>"+result[i].competitor.author_id+"</td><td>"+result[i].competitor.author+"</td><td>"+result[i].competitor.author_phone+"</td><td>"+result[i].competitor.author_school+"</td><td><a href='pageEdit?author_id="+result[i].competitor.author_id+"'>编辑</a></td></tr>");
				 }
				 }
			 });
	  });
   });
</script>
</head>
<body>
<div>
  <div align="left">
    <font size="4px">关键字</font>
       <input type="text" id="key" name="key" placeholder="优秀作文名字/优秀作者编号/优秀作文作者">&nbsp;
    <button id="btn">搜索</button>
  </div>
  <br>
  <div>
     <table border="1px" id="tab">
        <tr>
          <td>优秀作文编号</td>
          <td>优秀作文名字</td>
          <td>优秀作文简介</td>
          <td>优秀作者编号</td>
          <td>优秀作文作者</td>
          <td>优秀作者电话</td>
          <td>优秀作者学校</td>
          <td>操作</td>
        </tr>
        <c:forEach var="comp" items="${list}" varStatus="i">
        <tr>
          <td>${comp.composition_id}</td>
          <td>${comp.composition_name}</td>
          <td>${comp.composition_brief}</td>
          <td>${comp.competitor.author_id}</td>
          <td>${comp.competitor.author}</td>
          <td>${comp.competitor.author_phone}</td>
          <td>${comp.competitor.author_school}</td>
          <td><a href="editComposition.jsp?index=${i.index}">编辑</a></td>
        </tr>
        </c:forEach>
     </table>
  </div>
</div>
</body>
</html>