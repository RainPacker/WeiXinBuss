package com.alipay.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.sun.security.ntlm.Client;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.util.WebUtils;
import com.taobao.api.request.*;
import com.taobao.api.response.AlipayTopatsUserAccountreportGetResponse;

public class Atest {
 public static 	String url="http://gw.api.taobao.com/router/rest";
// publiic static final String url="http://gw.api.tbsandbox.com/router/rest";
 public static 	String appKey="23222132";
 public static	String appSecret="8f620463daf6dab6ded1ead0c27c3900";

	//AlipayUserAccountreportGetRequest req=new AlipayUserAccountreportGetRequest();
	public static void main(String args[]) throws ParseException, ApiException{
		//AlipayClient aclient=new DefaultAlipayClient(url, appId,key);
		TaobaoClient client=new DefaultTaobaoClient(url, appKey,appSecret);
		AlipayTopatsUserAccountreportGetRequest req=new AlipayTopatsUserAccountreportGetRequest();
		
		req.setFields("create_time,type,business_type,balance,in_amount,out_amount,alipay_order_no,merchant_order_no,self_user_id,opt_user_id,memo");
		Date dateTime1 = SimpleDateFormat.getDateTimeInstance().parse("2000-01-01 00:00:00");
		req.setStartTime(dateTime1);
		Date dateTime2 = SimpleDateFormat.getDateTimeInstance().parse("2000-01-02 00:00:00");
		req.setEndTime(dateTime2);
		req.setType("PAYMENT");
		AlipayTopatsUserAccountreportGetResponse response = client.execute(req,"6102103537d10082633cd3bbdc5c310b672c35d38ad67e0889328125");
	System.out.println(response.getBody());	
	
	/* String url="https://oauth.taobao.com/token";
      Map<String,String> props=new HashMap<String,String>();
      props.put("grant_type","authorization_code");
//测试时，需把test参数换成自己应用对应的值
//      props.put("code","11111");
      props.put("client_id","23222132");
      props.put("client_secret","8f620463daf6dab6ded1ead0c27c3900");
      props.put("redirect_uri","http://www.test.com");
      props.put("view","web");
      String s="";
      try{s=WebUtils.doPost(url, props, 30000, 30000);
      System.out.println(s);
      }catch(IOException e){
          e.printStackTrace();}
    }*/
	}
	
}
	
	/*TaobaoClient client2=new DefaultTaobaoClient(url, appId, key);
	OpenAccountTokenApplyRequest req=new OpenAccountTokenApplyRequest();
	req.setTokenTimestamp(12232345666L);
	req.setOpenAccountId(123L);
	req.setIsvAccountId("124");
	req.setUuid("jijdf9003882hndkfk");
	req.setLoginStateExpireIn(123L);
	OpenAccountTokenApplyResponse response = client.execute(req);*/
	/*TaobaoClient client=new DefaultTaobaoClient(url, appkey, secret);
	TopAuthTokenCreateRequest req=new TopAuthTokenCreateRequest();
	req.setCode("0_ebKlCPqc6OD8RBlB0DzfnpUg2");
	TopAuthTokenCreateResponse response = client.execute(req);*/
	

