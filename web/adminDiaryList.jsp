<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<% pageContext.setAttribute("APP_PATH", request.getContextPath());%>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>所有用户</title>
		<link type="image/vnd.microsoft.icon" href="${APP_PATH }/img/favicon.png" rel="shortcut icon">
		<link rel="stylesheet" href="${APP_PATH }/css/style.css"/>
		<script type="text/javascript" src="${APP_PATH }/js/top.min.js"></script>
		<script type="text/javascript" src="${APP_PATH }/js/top.js"></script>
		<script type="text/javascript" src="${APP_PATH }/js/jquery.1.4.2.min.js"></script>
		<!-- Bootstrap文件 -->
		<link rel="stylesheet" href="${APP_PATH}/bootstrap/css/bootstrap.min.css" >
		<script type="text/javascript" src="${APP_PATH}/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript">  
		    function del(id){  
		        $.get("${APP_PATH}/deleteUser?id=" + id,function(data){  
		            if("success" == data.result){  
		                alert("删除成功");  
		                window.location.reload();  
		            }else{  
		                alert("删除失败");  
		            }  
		        });  
		    }  
		</script> 
	</head>
	<body>
		<div class="bodycontent">
			<div id="midd">
				<header class="header"><!--页头 -->
					<div class="logonav">
						<div class="logo">
							<div class="logogravatar">
								<a href="${APP_PATH }" title="SunLife">
									<div class="blogname">Sun<span class="names">Life</span></div>
								</a>
							</div>
						</div>
						<nav id="top-nav" class="winfo">
							<ul>
								<li><a href="${APP_PATH }">首页</a></li>
								<li><a href="${APP_PATH }/writeblog.jsp">写文章</a></li>
								<li><a href="${APP_PATH }/adminblog">管理文章</a></li>
								<li><a href="${APP_PATH }/writediary.jsp">写日记</a></li>
								<li><a href="${APP_PATH }/admindiary">管理日记</a></li>
								<li><a href="${APP_PATH }/getAllUser">管理用户</a></li>
							</ul>
						</nav>
					</div>
				</header>
				<div class="clear"></div>
				
				<!-- bootstrap表格 -->
				<div class="container">
					<h1>${msg}</h1>
					<a href="${APP_PATH}/adminblog">点击刷新</a>
					<div class="row">
						<div class="col-md-22">
							<table class="table table-hover">
							  	<thead>			
									<tr class="danger">
										<th>#</th>
										<th>内容</th>
							      		<th>发布时间</th>
										<th>操作</th>
									</tr>
								</thead>
							<tbody>
								<c:forEach var="diarysInfo" items="${diarys.list}">
								<tr>
									<td>${diarysInfo.diaryid}</td>    
			                        <td>${diarysInfo.diary}</td>  
			                        <td>${diarysInfo.time}</td>  
			                        <td>  
			                            <!-- <a href="${APP_PATH}/getBlog?id=${diarysInfo.diaryid}">编辑</a> -->  
			                            <a href="${APP_PATH}/deleteDiaryById?diaryid=${diarysInfo.diaryid }">删除</a>  
			                        </td>  
			                    </tr>
								</c:forEach>
							</tbody>
							</table>
						</div>	
					</div>
				<!-- 分页信息 -->
				<div class="row">
					<div class="col-md-6">
						当前<span class="label label-default">${diarys.pageNum }</span>页
						|总<span class="label label-default">${diarys.pages }</span>页
						|总<span class="label label-default">${diarys.total }</span>篇文章.	
					</div>
					<div class="col-md-6">
						<nav aria-label="Page navigation">
						  <ul class="pagination">
						  	<li><a href="${APP_PATH}/admindiary?pn=1">首页</a></li>
						  	<c:if test="${diarys.hasPreviousPage}">
							    <li>
							      <a href="${APP_PATH}/admindiary?pn=${diarys.pageNum-1}" aria-label="Previous">
							        <span aria-hidden="true">&laquo;</span>
							      </a>
							    </li>
						    </c:if>
						    <c:forEach items="${diarys.navigatepageNums}" var="navigatepageNums">
						    	<c:if test="${navigatepageNums==diarys.pageNum }">
						    		<li class="active"><a>${navigatepageNums }</a></li>
						    	</c:if>
						    	<c:if test="${navigatepageNums!=diarys.pageNum }">
						    		<li><a href="${APP_PATH}/admindiary?pn=${navigatepageNums}">${navigatepageNums }</a></li>
						    	</c:if>
						    </c:forEach>
						    <c:if test="${diarys.hasNextPage}">
							    <li>
							      <a href="${APP_PATH}/admindiary?pn=${diarys.pageNum+1}" aria-label="Next">
							        <span aria-hidden="true">&raquo;</span>
							      </a>
							    </li>
						    </c:if>
						    <li><a href="${APP_PATH}/admindiary?pn=${diarys.pages }">末页</a></li>
						  </ul>
						</nav>			
					</div>					
				</div>
				</div>				
			</div>
			<div class="clear"></div>
		<footer>
			<div class="foote">	
			&copy;2017 SunLife. All Rights Reserved. Theme by Guoliangjun Design
			</div>
		</footer>
		</div>
		<div id="share">
			<a id="totop" title="返回顶部">返回顶部</a>
			<a href="http://weibo.com/jiomer" target="_blank" class="sina">关注新浪微博</a>
			<a href="http://199604.com"  target="_blank" class="tencent">记忆角落</a>
		</div>
	</body>
</html>