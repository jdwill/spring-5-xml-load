package io.platform;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.ApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MainWebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(final ServletContext sc) throws ServletException {
 
        AnnotationConfigWebApplicationContext root = 
          new AnnotationConfigWebApplicationContext();
         
        root.scan("io.platform");
        sc.addListener(new ContextLoaderListener(root));
 
        ServletRegistration.Dynamic appServlet = 
          sc.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping("/");
        
        ApplicationContext context = ApplicationContextProvider.getApplicationContext();
        HelloWorld  obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println("\n\n");
        System.out.println("----------     ----------     ----------");
        System.out.println(obj.getMessage());
        System.out.println("----------     ----------     ----------");
        System.out.println("\n\n");
    }
}
