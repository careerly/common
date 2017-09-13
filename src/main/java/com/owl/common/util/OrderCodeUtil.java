package com.owl.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class OrderCodeUtil {
   /**
    * 生成订单号方法
    * @return
    */
	 public static String generateOrderSeries(){
		    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		    Date date = new Date();
		    String str = simpleDateFormat.format(date);
		    Random random = new Random();
		    int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
		    return str+rannum;
		}
}
