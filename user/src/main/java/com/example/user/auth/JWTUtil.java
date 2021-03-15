package com.example.user.auth;

import com.example.common.pojo.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: day20200514_mallproj
 * @BelongsPackage: com.wn.auth
 * @Author: 殷俊
 * @CreateTime: 2020-05-14 11:47
 * @Description:JWT工具类1
 */
@Component
public class JWTUtil {
    /**
     * 登录成功
     * @param user
     * @param response
     */
    public static void login(User user, HttpServletResponse response){
        //根据传入的user对象生成token,设置过期时间为30分钟
        String token = generateToken(user, 30);
        //向浏览器写入携带token的cookie，键为utoken，过期时间30分钟
        responseCookie("utoken", token,1800,response);
    }

    /**
     * 获取用户信息
     * @param token
     * @return
     */
    public static User getUserInfo(String token){
        User user = ParseToken(token);
        return user;
    }

    /**
     * 退出登录
     * @param response
     */
    public static void loginOut(HttpServletResponse response){
        //向浏览器的cookie写入新的不能被识别的token,过期时间为0
        JWTUtil.responseCookie("utoken","xxx",0,response);
    }
    /**
     * 生成token
     * @param user      荷载数据
     * @param time      过期时间,单位分钟
     * @return  token
     * @throws Exception
     */
    public static String generateToken(User user, Integer time) {
        String token = "";
        try {
            token = Jwts.builder()
                    .claim("id", user.getId()).claim("username", user.getAccount())
                    .setExpiration(DateTime.now().plusMinutes(time).toDate())
                    .signWith(SignatureAlgorithm.RS256, RsaUtils.getPrivateKey(RsaUtils.PRIVATEKEY_PATH))
                    .compact();
        }catch (Exception e){
            System.out.println("token生成失败");
        }
        return token;
    }

    /**
     * 解析token
     * @param token     要解析的token
     * @return          返回解析后的user对象
     * @throws Exception
     */
    public static User ParseToken(String token){
        User user =null;
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(RsaUtils.getPublicKey(RsaUtils.PUBLICKEY_PATH)).parseClaimsJws(token);
            Claims body = claimsJws.getBody();
            //从荷载中通过键获取数据
            int id = Integer.parseInt(body.get("id").toString());
            String username = body.get("username").toString();
            user = new User();
            user.setId(id);
            user.setAccount(username);
        } catch (Exception e) {
            System.out.println("token解析失败");
        }
        return user;
    }
    /**
     * 向浏览器写入cookie
     * @param key       cookie的键
     * @param value     cookie的值
     * @param time      cookie的过期时间
     * @param response  response对象
     */
    public static void responseCookie(String key, String value, Integer time , HttpServletResponse response){
        //创建cookie对象，并向cookie对象中写入token
        Cookie cookie = new Cookie(key, value);
        //设置 cookie 适用的域
        cookie.setDomain("wn.com");
        //设置 cookie 过期的时间（以秒为单位）
        cookie.setMaxAge(time);
        //设置允许操作cookie的路径，"/":表示一级域名为bajin.com的请求都能操作cookie
        cookie.setPath("/");
        response.addCookie(cookie);
    }
}
