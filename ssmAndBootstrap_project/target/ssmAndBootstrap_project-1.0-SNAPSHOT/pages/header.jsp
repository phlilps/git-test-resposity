<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--头部页面--%>
<header class="main-header">
	<a href="all-admin-index.html" class="logo" style="background-color: lightpink">

		<span class="logo-mini"><b>后台</b></span>
		<span class="logo-lg"><img
				src="${pageContext.request.contextPath}/img/buy.png"
				class="img-circle" alt=""><b>超市订单管理系统</b></span>
	</a>
	<nav class="navbar navbar-static-top" style="background-color: lightpink	">
		<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
			role="button"> <span class="sr-only">Toggle navigation</span>
		</a>

		<div class="navbar-custom-menu">
			<ul class="nav navbar-nav">

				<li class="dropdown user user-menu"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"> <img
						src="${pageContext.request.contextPath}/img/user-logo.jpg"
						class="user-image" alt="右边用户的头像"> <span class="hidden-xs">
							<security:authentication property="principal.username" />
					</span>

				</a>
					<ul class="dropdown-menu">

						<li class="user-header" style="background-color: lightpink"><img
							src="${pageContext.request.contextPath}/img/user-logo.jpg"
							class="img-circle" alt="头部单击进去的用户头像"></li>

						<!-- Menu Footer-->
						<li class="user-footer">
							<div class="pull-left">
								<%--<a href="${pageContext.request.contextPath}/user/" class="btn btn-default btn-flat"></a>--%>
							</div>
							<div class="pull-right">
								<a href="${pageContext.request.contextPath}/user/logOut "
									class="btn btn-default btn-flat">退出登录</a>
							</div>
						</li>
					</ul></li>

			</ul>
		</div>
	</nav>
</header>
<!-- 页面头部 /-->