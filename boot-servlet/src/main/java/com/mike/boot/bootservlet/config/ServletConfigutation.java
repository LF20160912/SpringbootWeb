package com.mike.boot.bootservlet.config;

        import com.mike.boot.bootservlet.filter.MyFilter;
        import com.mike.boot.bootservlet.listener.Listener;
        import com.mike.boot.bootservlet.servlet.MyServlet;
        import org.springframework.boot.SpringBootConfiguration;
        import org.springframework.boot.web.servlet.FilterRegistrationBean;
        import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
        import org.springframework.boot.web.servlet.ServletRegistrationBean;
        import org.springframework.context.annotation.Bean;


        import java.util.Arrays;

@SpringBootConfiguration//第二种方式：手动配置方式
public class ServletConfigutation {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean<MyServlet> myServlet = new ServletRegistrationBean<>();
        myServlet.setServlet(new MyServlet());
        myServlet.setUrlMappings(Arrays.asList("/my"));
        return myServlet;
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<MyFilter> myFilter = new FilterRegistrationBean<>();
        myFilter.setFilter(new MyFilter());
        myFilter.setUrlPatterns(Arrays.asList("/*"));
        return myFilter;
    }
    @Bean
    public ServletListenerRegistrationBean listenerRegistrationBean(){
        ServletListenerRegistrationBean<Listener> myListener = new ServletListenerRegistrationBean<>();
        myListener.setListener(new Listener());
        return myListener;
    }
}
