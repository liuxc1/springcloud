package com.liuxc.www.microcloud.config.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.tomcat.util.codec.binary.Base64;

import java.nio.charset.Charset;

/**
 * @author L
 * zuul  认证过滤器
 */
public class AuthorizationRequestFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        String auth = "liuxc:liuxc"; // 认证原始信息
        byte[] encode = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));// 进行加密处理
        String authHeader = "Basic " + new String(encode);
        currentContext.addZuulRequestHeader("Authorization", authHeader);

        return null;
    }
}
