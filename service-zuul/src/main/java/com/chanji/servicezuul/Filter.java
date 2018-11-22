package com.chanji.servicezuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * zuul网关
 *
 * @author ChanJi
 * @create 2018-08-02 9:14
 **/
@Component
public class Filter extends ZuulFilter {
    public static final Logger log = LoggerFactory.getLogger(Filter.class);

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
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if (accessToken != null) {
            return null;
        }

        log.warn("token is empty");

        //sendZuulResponse(false),就等于对其它过滤器一路开了红灯，都不会被执行了，直到SendResponseFilter，输出Response的内容。
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);

        try {
            ctx.getResponse().getWriter().write("token is empty");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
