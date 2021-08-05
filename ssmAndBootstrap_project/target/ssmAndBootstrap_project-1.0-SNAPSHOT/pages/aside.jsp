<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!-- CSS -->
<%--侧边导航栏页面--%>
<aside class="main-sidebar">
	<section class="sidebar">
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user-logo.jpg"
					 class="img-circle" alt="侧边导航栏头像">
			</div>
			<div class="pull-left info">
				<p>
					<security:authentication property="principal.username" />
				</p>
				<a href="#"><i class="fa fa-skype text-success"></i>&nbsp;管理员&nbsp;:&nbsp;${user.username}
				</a>
			</div>
		</div>

		<ul class="sidebar-menu">
			<li class="header" style="font-weight: bold;font-size: 15px;">系统功能菜单</li>
			<li id="admin-index"><a
					href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="bi bi-house-fill"></i> <span>&nbsp;后台首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="bi bi-person-circle"></i>
				<span>&nbsp;用户信息管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li><a
							href="${pageContext.request.contextPath}/pages/user-list.jsp"> <i
							class="fa fa-circle-o"></i> 员工管理
					</a></li>
					<li><a
							href="${pageContext.request.contextPath}/pages/userrole-list.jsp"> <i
							class="fa fa-circle-o"></i> 角色管理
					</a></li>

					<li><a
							href="${pageContext.request.contextPath}/pages/providers-list.jsp">
						<i class="fa fa-circle-o"></i> 供应商管理
					</a></li>
				</ul></li>
			<li class="treeview"><a href="#"> <i class="bi bi-cart4"></i>
				<span>&nbsp;商品订单管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li><a
							href="${pageContext.request.contextPath}/pages/order-list.jsp">
						<i class="fa fa-circle-o"></i> 商品管理
					</a></li>

					<li><a
							href="${pageContext.request.contextPath}/pages/site-list.jsp">
						<i class="fa fa-circle-o"></i> 订单管理
					</a></li>

				</ul></li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>