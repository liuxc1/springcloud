package com.liuxc.www.microcloud.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author L
 * @date 2019/1/13 - 18:17
 */
@Component
public class ProductProviderFallback implements FallbackProvider {

    @Override
    public ClientHttpResponse fallbackResponse(Throwable cause) {

        return getClientHttpResponse();
    }

    @Override
    public String getRoute() {
        return null; //api服务id，如果需要所有调用都支持回退，则return "*"或return null
    }

    @Override
    public ClientHttpResponse fallbackResponse() {

        return getClientHttpResponse();
    }

    private ClientHttpResponse getClientHttpResponse(){

        return  new ClientHttpResponse() {

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.add("Content-Type", "text/html; charset=UTF-8");
                return headers;
            }

            @Override
            public InputStream getBody() throws IOException {

                return new ByteArrayInputStream("\"message\":\"路由失败！\"".getBytes());
            }

            /**
             * 网关向api服务请求是失败了，但是消费者客户端向网关发起的请求是OK的，
             * 不应该把api的404,500等问题抛给客户端
             * 网关和api服务集群对于客户端来说是黑盒子
             */
            @Override
            public HttpStatus getStatusCode() throws IOException {

                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {

                return HttpStatus.OK.value();
            }

            @Override
            public String getStatusText() throws IOException {

                return HttpStatus.OK.getReasonPhrase();
            }

            @Override
            public void close() {

            }
        };
    }

}
