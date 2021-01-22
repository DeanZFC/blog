<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<% pageContext.setAttribute("APP_PATH", request.getContextPath());%>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>写日记</title>
		<link type="image/vnd.microsoft.icon" href="${APP_PATH }/img/favicon.png" rel="shortcut icon">
		<link rel="stylesheet" href="${APP_PATH }/css/style.css"/>
		<script type="text/javascript" src="${APP_PATH }/js/top.min.js"></script>
		<script type="text/javascript" src="${APP_PATH }/js/top.js"></script>
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
				<!-- 导入css/js -->
				<script type="text/javascript" charset="utf-8" src="${APP_PATH }/ckeditor/ckeditor.js"></script>
				<section class="blockGroup">
					<h1>撰写日记</h1>
					<form action="writediary" method="post">
					<input type="hidden"  id="diary" name="diary"/>
					<textarea id="diary1" name="diary1">Hello World!</textarea>
					
					<input type="submit" value="发布" onclick="onWritediary();" style="background-color:#0055AA;color: white;font-size: 15px;
            	height:60px;width: 90%;display:inline-block;float: left;margin-left: 55px;" />
            	<script type="text/javascript">
						CKEDITOR.replace("diary1");
						
						function onWritediary(){
							var diaryText = CKEDITOR.instances.diary1.document.getBody().getText(); //取得纯文本
							//alert(diaryText);
							$("#diary").val(diaryText);
						}
					</script>
            	</form>
				</section>
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