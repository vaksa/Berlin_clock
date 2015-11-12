package com.becomejavasenior.filters;

import com.becomejavasenior.CompressionResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressionFilter implements Filter {

    private ServletContext ctx;
    private FilterConfig cfg;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.cfg = filterConfig;
        this.ctx = cfg.getServletContext();
        ctx.log(cfg.getFilterName() + " initialized.");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String valid_encodings = request.getHeader("Accept-Encoding");

        if(valid_encodings.indexOf("gzip") > -1){
            CompressionResponseWrapper wrappedResponse = new CompressionResponseWrapper(response);
            wrappedResponse.setHeader("Content-Encoding", "gzip");
            filterChain.doFilter(request, wrappedResponse);

            GZIPOutputStream gzipOS = wrappedResponse.getGZIPOutputStream();
            gzipOS.finish();

            ctx.log(cfg.getFilterName() + ": finished the request.");
        }else{
            ctx.log(cfg.getFilterName() + ": no encoding performed.");
            filterChain.doFilter(request, response);

        }
    }

    @Override
    public void destroy() {
        ctx = null;
        cfg = null;
    }
}
