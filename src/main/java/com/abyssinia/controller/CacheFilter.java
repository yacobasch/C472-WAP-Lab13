
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter( urlPatterns = {"/login"},
            filterName = "CacheFilter"
    )

public class CacheFilter implements Filter {

    private ServletContext context;

        public void init(FilterConfig fConfig) throws ServletException {
            this.context = fConfig.getServletContext();
            this.context.log("CacheFilter initialized");
        }

        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;

            res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            res.setDateHeader("Expires", 0); // proxies
            chain.doFilter(req, res);
        }

        public void destroy() {
        }
    }