<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="zh">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->

    <head>
        <meta charset="utf-8" />
        <%@ include file="../base/title.jsp"%>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="../assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
        <link href="../assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
        <!-- END GLOBAL MANDATORY STYLES -->
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link href="../assets/global/css/components.min.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="../assets/global/css/plugins.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME GLOBAL STYLES -->
        <!-- BEGIN THEME LAYOUT STYLES -->
        <link href="../assets/layouts/layout2/css/layout.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/layouts/layout2/css/themes/blue.min.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="../assets/layouts/layout2/css/custom.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME LAYOUT STYLES -->
        <link rel="shortcut icon" href="favicon.ico" /> </head>
    <!-- END HEAD -->

    <body class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
        <!-- BEGIN HEADER -->
        <%@ include file="../base/head.jsp" %>
        <!-- END HEADER -->
        <!-- BEGIN HEADER & CONTENT DIVIDER -->
        <div class="clearfix"> </div>
        <!-- END HEADER & CONTENT DIVIDER -->
        <!-- BEGIN CONTAINER -->
        <div class="page-container">
            <!-- BEGIN SIDEBAR -->
            <div class="page-sidebar-wrapper">
                <!-- END SIDEBAR -->
                <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                <!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                <div class="page-sidebar navbar-collapse collapse">
                    <!-- BEGIN SIDEBAR MENU -->
                    <%@ include file="../base/left.jsp" %>
                    <!-- END SIDEBAR MENU -->
                </div>
                <!-- END SIDEBAR -->
            </div>
            <!-- END SIDEBAR -->
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                <!-- BEGIN CONTENT BODY -->
                <div class="page-content">
                    <!-- BEGIN PAGE HEADER-->
                    <!-- BEGIN THEME PANEL -->
                    <%@ include file="../base/theme.jsp"%>
                    <!-- END THEME PANEL -->
                    <h3 class="page-title"> 添加系统用户
                        <small>在这里可以添加系统用户</small>
                    </h3>
                    <div class="page-bar">
                        <ul class="page-breadcrumb">
                            <li>
                                <i class="icon-home"></i>
                                <a href="index.html">主页</a>
                                <i class="fa fa-angle-right"></i>
                            </li>
                            <li>
                                <span>系统管理</span>
                                <i class="fa fa-angle-right"></i>
                            </li>
                            <li>
                                <span>用户管理</span>
                            </li>
                        </ul>
                        <div class="page-toolbar">
                            <div class="btn-group pull-right">
                                <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true"> 选项
                                    <i class="fa fa-angle-down"></i>
                                </button>
                                <ul class="dropdown-menu pull-right" role="menu">
                                    <li>
                                        <a href="#">
                                            <i class="icon-bell"></i> 操作</a>
                                    </li>
                                    <li class="divider"> </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-bag"></i> 分隔链接</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- END PAGE HEADER-->
                    
                    <!-- BEGIN CONTENT BODY -->
                    <div class="portlet box green">
	                    <div class="portlet-title">
	                        <div class="caption">
	                            <i class="fa fa-gift"></i>添加系统用户</div>
	                        <div class="tools">
	                            <a href="javascript:;" class="collapse"> </a>
	                            <a href="javascript:;" class="remove"> </a>
	                        </div>
	                    </div>
	                    <div class="portlet-body form">
	                        <!-- BEGIN FORM-->
	                        <form action="#" class="form-horizontal">
	                            <div class="form-body">
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">帐号</label>
	                                    <div class="col-md-4">
	                                        <input type="text" class="form-control input-circle" placeholder="帐号">
	                                    </div>
	                                </div>
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">密码</label>
	                                    <div class="col-md-4">
	                                        <div class="input-group">
	                                            <input type="password" class="form-control input-circle-left" placeholder="密码">
	                                            <span class="input-group-addon input-circle-right">
	                                                <i class="fa fa-user"></i>
	                                            </span>
	                                        </div>
	                                    </div>
	                                </div>
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">确认密码</label>
	                                    <div class="col-md-4">
	                                        <div class="input-group">
	                                            <input type="password" class="form-control input-circle-left" placeholder="确认密码">
	                                            <span class="input-group-addon input-circle-right">
	                                                <i class="fa fa-user"></i>
	                                            </span>
	                                        </div>
	                                    </div>
	                                </div>
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">用户姓名</label>
	                                    <div class="col-md-4">
	                                        <input type="text" class="form-control input-circle" placeholder="用户姓名">
	                                    </div>
	                                </div>
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">电子邮箱</label>
	                                    <div class="col-md-4">
	                                        <div class="input-group">
	                                            <span class="input-group-addon input-circle-left">
	                                                <i class="fa fa-envelope"></i>
	                                            </span>
	                                            <input type="email" class="form-control input-circle-right" placeholder="电子邮箱"> </div>
	                                    </div>
	                                </div>
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">手机号</label>
	                                    <div class="col-md-4">
	                                        <input type="text" class="form-control input-circle" placeholder="手机号">
	                                    </div>
	                                </div>
	                            </div>
	                            <div class="form-actions">
	                                <div class="row">
	                                    <div class="col-md-offset-3 col-md-9">
	                                        <button type="submit" class="btn btn-circle green">提交</button>
	                                        <button type="button" class="btn btn-circle grey-salsa btn-outline">取消</button>
	                                    </div>
	                                </div>
	                            </div>
	                        </form>
	                        <!-- END FORM-->
	                    </div>
	                </div>
                	<!-- END CONTENT BODY -->
                </div>
            </div>
            <!-- END CONTENT -->
            <!-- BEGIN QUICK SIDEBAR -->
            <%@ include file="../base/right.jsp" %>
            <!-- END QUICK SIDEBAR -->
        </div>
        <!-- END CONTAINER -->
        <!-- BEGIN FOOTER -->
        <%@ include file="../base/footer.jsp" %>
        <!-- END FOOTER -->
        <!--[if lt IE 9]>
		<script src="../assets/global/plugins/respond.min.js"></script>
		<script src="../assets/global/plugins/excanvas.min.js"></script> 
		<![endif]-->
        <!-- BEGIN CORE PLUGINS -->
        <script src="../assets/global/plugins/jquery.min.js" type="text/javascript"></script>
        <script src="../assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
        <script src="../assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
        <script src="../assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="../assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="../assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
        <script src="../assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->
        <!-- BEGIN THEME GLOBAL SCRIPTS -->
        <script src="../assets/global/scripts/app.min.js" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->
        <!-- BEGIN THEME LAYOUT SCRIPTS -->
        <script src="../assets/layouts/layout2/scripts/layout.min.js" type="text/javascript"></script>
        <script src="../assets/layouts/layout2/scripts/demo.min.js" type="text/javascript"></script>
        <script src="../assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
        <!-- END THEME LAYOUT SCRIPTS -->
    </body>

</html>