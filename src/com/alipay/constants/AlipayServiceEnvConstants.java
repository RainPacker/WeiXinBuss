/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.constants;

/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 * 
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝服务窗获取*/
    public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";

    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      = "GBK";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           = "GBK";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的服务窗id  这里只是个测试id
    public static final String APP_ID            = "2015011500025707";

    //开发者请使用openssl生成的密钥替换此处  请看文档：https://fuwu.alipay.com/platform/doc.htm#2-1接入指南
    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJcQLeGARVyR16yeaDaoWs+R1fibrCxxVM235eZb6RPAq8wWHSEEyoCWyrslTGfgNzwZWhaNQCQDCEE3kQwcun7u5aE0Mhewf0iLNOB/zZbvpyCPbQeYA9kmwsvM27n/dqB2cwzqri5jwS3mHDvSEzvO2bcCiVBOzOPMUJqOL63rAgMBAAECgYBA7zB5rVSjbQGDbvgm/olCjlKmsev5kqG8aB9HvRxcZEa0zJCq389YJPlyJp9IS4YSrGcgKIl4sWD7/7G2viafvmiNRZdemgO1Gsprc7hT6uF/WjRI2pfTL/wj/GNtYS9MFBL1chjfg+UABZZuZjRbl2RwSRmtkAhclaIXJhZ60QJBAMalmHoyoZrN9pt/da+mUO34sJjmsl9z4iVzOkb6AlZSk5277dkHDM6TarEbkKnHYo3xNQN79cXmfIeGI9yibjkCQQDCrZN2Q5QPeV48cldbFT0EbAitw/sjmcpQsevUDnc3eFCbjEdhRf2nRq5Kq/4g2MuiRRoRf/UYXzbXm/Tes31DAkAFvzSyFFTojZzc0sss0br1p4Q0aDgw2sFoI/VDqGf451qt7YnsBXAxacJkbU+6GbKYOKo395Ycq5ZetVrEP07BAkBP8Tc8uUNzl0M7TzjQDkigKDzoHjJizCRoPqe4zLfn72Aqf9BQAY3Hwx6PS1Fv65aza+zogsMC3xaGM2S6jrpBAkEAtQJRMbYv4EfGw/e9rFjpNc9G8ztIJTKGZQvCQldQYqFOH9TTOXj2MRr0/UhNUf1YlIVhGNW6GEfdMOUwdxaIcg==";

    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCXEC3hgEVckdesnmg2qFrPkdX4m6wscVTNt+XmW+kTwKvMFh0hBMqAlsq7JUxn4Dc8GVoWjUAkAwhBN5EMHLp+7uWhNDIXsH9IizTgf82W76cgj20HmAPZJsLLzNu5/3agdnMM6q4uY8Et5hw70hM7ztm3AolQTszjzFCaji+t6wIDAQAB";

    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}
