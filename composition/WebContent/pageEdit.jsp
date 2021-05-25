<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑页</title>
<style type="text/css">
   td{
     width: 100px;
     height: 20px;
   }
</style>
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
$(function(){
	
});
</script>
</head>
<body>
<div align="center">
<form action="editComposition" method="post">
<table cellpadding="0" cellspacing="0" border="0">
<tr>
   <td colspan="2">
      <input type="hidden" id="composition_id" value="${list1[0].composition_id}" name="composition_id">
   </td>
</tr>
<tr>
   <td>优秀作文名字</td>
   <td><input type="text" value="${list1[0].composition_name}" name="composition_name"></td>
</tr>
<tr>
   <td></td>
   <td></td>
</tr>
<tr>
   <td>优秀作文简介</td>
   <td>
     <input type="text" value="${list1[0].composition_brief}" name="composition_brief">
   </td>
</tr>
<tr>
   <td><input type="hidden" name="competitor.author_id" value="${list1[0].competitor.author_id}"></td>
   <td></td>
</tr>
<tr>
   <td>优秀作文作者</td>
   <td><input type="text" value="${list1[0].competitor.author}" name="competitor.author" ></td>
</tr>
<tr>
   <td></td>
   <td></td>
</tr>
<tr>
   <td>优秀作者电话</td>
   <td><input type="text" value="${list1[0].competitor.author_phone}" name="competitor.author_phone"></td>
</tr>
<tr>
   <td></td>
   <td></td>
</tr>
<tr>
   <td colspan="2" align="center">
      <input type="submit" value="提交">
   </td>
</tr>
</table>
</form>
</div>
</body>
</html>