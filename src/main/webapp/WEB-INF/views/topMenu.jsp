<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Data サンプル メニュー</title>
<style type="text/css">
.menu {
	display: block;
	width: 300px;
	padding-top: 10px;
	padding-bottom: 10px;
	text-align: center;
	border: 2px solid;
	border-color: #aaaaaa #444444 #444444 #aaaaaa;
	text-decoration: none;
	color: #444444;
}

.menu:hover {
	background-color: #ffcccc;
}

.menu:hover {
	color: #000000;
}

.menu:visited {
	color: #000000;
}
</style>
</head>
<body>
	<h1>従業員管理システム</h1>
	<hr />
	<div>
		<table>
			<tr>
				<td><a href="empList" class="menu">従業員一覧</a></td>
			</tr>
			<tr>
				<td><a href="empList" class="menu">従業員検索</a></td>
			</tr>
			<tr>
				<td><a href="empList" class="menu">部署一覧</a></td>
			</tr>
			<tr>
				<td><a href="empList" class="menu">従業員登録</a></td>
			</tr>
			<tr>
				<td><a href="empList" class="menu">従業員変更／削除</a></td>
			</tr>
		</table>
	</div>
</body>
</html>