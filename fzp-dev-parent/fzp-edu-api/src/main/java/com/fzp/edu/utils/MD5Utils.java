package com.fzp.edu.utils;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class MD5Utils {
    public static String md5(String source) {

        // 1.判断 source 是否有效
        if (source == null || source.length() == 0) {
            // 2.如果不是有效的字符串抛出异常
            throw new RuntimeException("字符串不可为空");
        }
        try {
            // 3.获取 MessageDigest 对象
            String algorithm = "md5";
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            // 4.获取明文字符串对应的字节数组
            byte[] input = source.getBytes();
            //执行加密
            byte[] output = messageDigest.digest(input);
            // 6.创建 BigInteger 对象
            int signum = 1;
            BigInteger bigInteger = new BigInteger(signum, output);
            // 7.按照 16 进制将 bigInteger 的值转换为大写字符串
            int radix = 16;
            String encoded = bigInteger.toString(radix).toUpperCase();
            return encoded;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            log.error("e:{}", e);
            return null;
        }
    }

    public static void main(String[] args) {
        String pwd = MD5Utils.md5("123456"+"使用随机生成");
        // 123456通过md5加密永远都是这个《单向》 E10ADC3949BA59ABBE56E057F20F883E
        //  fzp&*67834  盐值 不能全部用户都使用同一个，应该使用随机的，否则一旦被破解，所有用户都不安全。
        System.out.println(pwd);
        // 明文一样，无论怎么传递，生成的密文都是一样的，可以通过简单比对就可以逆向出明文
        // 在线MD5 破解工具 https://www.cmd5.com/
    }
}