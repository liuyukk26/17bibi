<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
<!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
<!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
<!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
<!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
<ul class="page-sidebar-menu  page-header-fixed page-sidebar-menu-hover-submenu " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
    <li class="start active ">
		<a href="index.html">
		<i class="icon-home"></i>
		<span class="title">系统首页</span>
		<span class="selected"></span>
		</a>
	</li>
	
	<li>
		<a href="javascript:;">
		<i class="icon-settings"></i>
		<span class="title">系统管理</span>
		<span class="arrow "></span>
		</a>
		<ul class="sub-menu">
			<li>
				<a href="javascript:;">
				<i class="icon-user"></i> 用户管理 <span class="arrow"></span>
				</a>
					<ul class="sub-menu">
						<li>
							<a href="login.html">
							查看用户</a>
						</li>
						<li>
							<a href="login_2.html">
							新增用户</a>
						</li>
						<li>
							<a href="login_3.html">
							修改用户</a>
						</li>
						<li>
							<a href="#">删除用户</a>
						</li>
					</ul>
			</li>
			<li>
				<a href="javascript:;">
				<i class="icon-globe"></i> 权限管理 <span class="arrow"></span>
				</a>
				<ul class="sub-menu">
					<li>
						<a href="#"><i class="icon-tag"></i> Sample Link 1</a>
					</li>
					<li>
						<a href="#"><i class="icon-pencil"></i> Sample Link 1</a>
					</li>
					<li>
						<a href="#"><i class="icon-graph"></i> Sample Link 1</a>
					</li>
				</ul>
			</li>
			<li>
				<a href="#">
				<i class="icon-bar-chart"></i>组管理 </a>
			</li>
			<li>
				<a href="#">
				<i class="icon-bar-chart"></i>操作日志 </a>
			</li>
			<li>
				<a href="#">
				<i class="icon-bar-chart"></i>登录信息 </a>
			</li>
			<li>
				<a href="#">
				<i class="icon-bar-chart"></i>菜单管理</a>
			</li>
		</ul>
		
	</li>
</ul>