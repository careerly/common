package com.owl.common.content;

/**
 * 
 * 全局状态码表
 * 
 * @auther tangqing
 * 
 */
public class Status {  
	public static final int 	success_status 	= 10000;
	public static final String 	success_info 	= "操作成功";
	
	
	public static final int 	appkey_error_status 	= 10001;
	public static final String 	appkey_error_info 	= "参数错误";//缺少appkey
	
	public static final int 	appsecurity_error_status 	= 10002;
	public static final String 	appsecurity_error_info 	= "参数错误";//非法的key值
	
	/*public static final int 	sign_success_status 	= 10003;
	public static final String 	sign_success_info 	= "验证签名成功";*/
	
	public static final int 	sign_error_status 	= 10004;
	public static final String 	sign_error_info 	= "参数错误";//签名验证失败
	
	public static final int 	time_error_status 	= 10005;
	public static final String 	time_error_info 	= "请求已过有效时限";
	
	public static final int 	timeFormat_error_status 	= 10006;
	public static final String 	timeFormat_error_info 	= "非法的时间参数";
	
	public static final int 	login_error_status 	= 10007;
	public static final String 	login_error_info 	= "用户名或密码错误！";
	
	public static final int 	account_error_status 	= 10008;
	public static final String 	account_error_info 	= "请输入账号";
	
	public static final int 	pwd_error_status 	= 10009;
	public static final String 	pwd_error_info 	= "请输入密码";
	
	public static final int 	send_checkcode_error_status 	= 10010;
	public static final String 	send_checkcode_error_info 	= "验证码发送失败";
	
	public static final int 	phone_fmt_error_status 	= 10011;
	public static final String 	phone_fmt_error_info 	= "手机号码格式错误";
	
	public static final int 	checkcode_empty_error_status 	= 10012;
	public static final String 	checkcode_empty_error_info 	= "验证码不能为空";
	
	public static final int 	checkcode_error_status 	= 10013;
	public static final String 	checkcode_error_info 	= "验证码错误";
	
	public static final int 	usertype_error_status 	= 10014;
	public static final String 	usertype_error_info 	= "用户角色错误";
	
	public static final int 	company_empty_error_status 	= 10015;
	public static final String 	company_empty_error_info 	= "请输入公司名称";
	
	public static final int 	position_empty_error_status 	= 10016;
	public static final String 	position_empty_error_info 	= "请输入职位名称";
	
	public static final int 	realname_empty_error_status 	= 10017;
	public static final String 	realname_empty_error_info 	= "请输入真实姓名";
	
	public static final int     phone_empty_error_status = 10018;
	public static final String 	phone_empty_error_info 	= "请输入手机号";
	
	public static final int     phone_exist_error_status = 10019;
	public static final String 	phone_exist_error_info 	= "该手机号已被注册";
	
	public static final int 	checkcode_type_error_status 	= 10020;
	public static final String 	checkcode_type_error_info 	= "验证码类型错误";
	
	public static final int     phone_not_exist_error_status = 10021;
	public static final String 	phone_not_exist_error_info 	= "该手机号未注册";
	
	public static final int     token_empty_error_status = 10022;
	public static final String 	token_empty_error_info 	= "token不能为空";
	
	public static final int     token_error_status = 10023;
	public static final String 	token_error_info 	= "无效的token";
	
	public static final int     user_not_exist_error_status = 10025;
	public static final String 	user_not_exist_error_info 	= "用户不存在";
	
	public static final int     ticket_exist_error_status = 10026;
	public static final String 	ticket_exist_error_info = "门票已经存在";
	
	public static final int     ticket_not_exist_error_status = 10027;
	public static final String 	ticket_not_exist_error_info = "请选择门票";	
	
	public static final int     ticket_id_error_status = 10028;
	public static final String 	ticket_id_error_info = "门票id为空";
	
	public static final int     ticket_type_error_status = 10029;
	public static final String 	ticket_type_error_info = "门票类型为空";
	
	public static final int 	login_timeout_status 	= 10030;
	public static final String 	login_timeout_info 	= "登录超时！";
	
	public static final int 	shop_adderror_status 	= 10031;
	public static final String 	shop_adderror_info 	= "添加门店失败！";
	
	public static final int 	shop_updateerror_status 	= 10032;
	public static final String 	shop_updateerror_info 	= "修改门店失败！";
	
	public static final int 	ticket_noselecterror_status 	= 10033;
	public static final String 	ticket_noselecterror_info 	= "没有选择展会门票！";
	
	public static final int 	user_existerror_status 	= 10034;
	public static final String 	user_existerror_info 	= "用户名已经存在！";
	
	public static final int 	ticket_existerror_status 	= 10035;
	public static final String 	ticket_existerror_info 	= "门票名称已经存在！";
	
	public static final int 	ticket_snerror_status 	= 10036;
	public static final String 	ticket_snerror_info 	= "门票序列号为空！";
	
	public static final int 	ticket_macerror_status 	= 10037;
	public static final String 	ticket_macerror_info 	= "门票MAC地址为空！";
	
	public static final int role_not_exist_status=10038;
	public static final String role_not_exist_info="群组不存在";
	
	public static final int 	shop_no_exist_status 	= 10039;
	public static final String 	shop_no_exist_info 	= "门店id为空！";
	
	public static final int 	ticket_noexisterror_status 	= 10040;
	public static final String 	ticket_noexisterror_info 	= "门票不存在！";
	
	
	public static final int 	order_noexisterror_status 	= 10041;
	public static final String 	order_noexisterror_info 	= "订单不存在！";
	
	
	public static final int useraccount_empty_status=10096;
	public static final String useraccount_empty_info="请输入用户名";
	
	public static final int pwd_confirm_error_status=10097;
	public static final String pwd_confirm_error_info="两次输入密码不一致";
	
	public static final int role_empty_error_status=10098;
	public static final String role_empty_error_info="请选择用户组";
	
	public static final int useraccount_exist_status=10099;
	public static final String useraccount_exist_info="用户名已存在";
	
	public static final int old_pwd_error_status=10100;
	public static final String old_pwd_error_info="旧密码错误";
	
	public static final int    param_error_status=10083;
	public static final String param_error_info="参数错误";
	
	public static final int group_name_empty_status=10101;
	public static final String group_name_empty_info="请输入管理组名称";
	
	public static final int group_desc_empty_status=10102;
	public static final String group_desc_empty_info="请输入管理组描述";
	
	public static final int group_permission_empty_status=10103;
	public static final String group_permission_empty_info="请选择管理组权限";
	
	public static final int group_name_exist_status=10104;
	public static final String group_name_exist_info="管理组已经存在，请勿重复添加";
	
	public static final int group_no_exist_status=10105;
	public static final String group_no_exist_info="管理组不存在或已被删除";
	
	public static final int system_role_opera_error_status=10112;
	public static final String system_role_opera_error_info="超级管理组权限，禁止操作";
	
	public static final int 	access_deny_status 	= 403;
	public static final String 	access_deny_info 	= "权限不足,请联系管理员";
	
	public static final int		file_empty_status=10027;
	public static final String  file_empty_info="请选择文件";
	
	public static final int 	img_type_error_status=10028;
	public static final String  img_type_error_info="图片类型错误";
	
	public static final int 	upload_error_status=10029;
	public static final String 	upload_error_info="文件上传失败";
	
	public static final int		file_type_error_status=10030;
	public static final String  file_type_error_info="文件类型错误";
	
	public static final int system_admin_opera_error_status=10131;
	public static final String system_admin_opera_error_info="超级管理组禁止删除";
	
	public static final int admin_no_exist_status=10132;
	public static final String admin_no_exist_info="管理员不存在或已被删除";
	
	
	public static final int     newsname_empty_error_status = 10133;
	public static final String 	newsname_empty_error_info 	= "新闻名字不能为空!";
	public static final int     newsintro_empty_error_status = 10134;
	public static final String 	newsintro_empty_error_info 	= "新闻介绍不能为空!";
	public static final int     news_notexist_error_status = 10135;
	public static final String 	news_notexist_error_info 	= "新闻不存在!";
	public static final int		article_not_exist_status=10031;
	public static final String  article_not_exist_info="文章不存在";
	
	
	
}  

