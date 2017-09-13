package com.owl.common.content;

public class FinVal {

        /**
         * 标签类型： 系统文章标签
         */
        public static final int TAG_TYPE_SYSTEM = 1;

        /**
         * 标签类型： 用户自定义标签
         */
        public static final int TAG_TYPE_IDENTIFY = 2;

        /**
         * 默认翻页数据 页码
         */
        public static final int DEFAULT_PAGE = 1;

        /**
         * 默认翻页数据 每页条数
         */
        public static final int DEFAULT_PAGESIZE = 20;

        public static final int DEFAULT_TRUE = 1;
        public static final int DEFAULT_FALSE = 0;
        
        /**
         * 支付方式 1微信，2支付宝，3现金
         */
        public static final int PAYSOURCE_TYPE_WECHAT = 1;
        public static final int PAYSOURCE_TYPE_ALIPAY = 2;
        public static final int PAYSOURCE_TYPE_CASH = 3;


    	/**
    	 * 上传文章图片文件名
    	 * */
    	public static final String ARTICLE = "article";
        
        /**
         * 支付状态  1.已支付，2等待支付，3已退款，4取消
         */
        public static final int PAYSTATUS_PAYED = 1;
        public static final int PAYSTATUS_WAIT = 2;
        public static final int PAYSTATUS_NOPAY = 3;
        public static final int PAYSTATUS_CANCEL = 4;
        
        /**
    	 * 网页端session保存时间：半个小时
    	 * */
    	public static final int     WEB_SESSION_EXPIRECE=60*30;
    	
    	public static final String OWL_TOKEN="OWL_TOKEN";//h5的token
    	
    	public static final String OWL_MANAGE_TOKEN="OWL_MANAGE_TOKEN";//管理后台的token
    	
    	/**
    	 * web页面session的key
    	 * */
    	public static final String WEB_SESSION_KEY="WEB_SESSION_";
    	
    	public static final String MANAGE_WEB_SESSION_KEY="MANAGE_WEB_SESSION_";
    	
    	public static final String LAST_LOGIN_KEY="LAST_LOGIN_KEY";
    	
    	
    	/**
    	 * 认证状态：提交
    	 * */
    	public static final Integer AUTH_STATUS_SUBMIT=1;

}
