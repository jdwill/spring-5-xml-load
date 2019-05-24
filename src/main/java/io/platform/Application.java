package io.platform;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext context = ApplicationContextProvider.getApplicationContext();
        HelloWorld  obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println("\n\n");
        System.out.println("----------     ----------     ----------");
        System.out.println(obj.getMessage());
        System.out.println("----------     ----------     ----------");
        System.out.println("\n\n");
        
//        AbstractXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:parent-context.xml");
//        HelloWorld parent = (HelloWorld) applicationContext.getBean("helloParent");
//        System.out.println("\n\n");
//        System.out.println("~~~~~~~~~~     ~~~~~~~~~~     ~~~~~~~~~~");
//        System.out.println(parent.getMessage());
//        System.out.println("~~~~~~~~~~     ~~~~~~~~~~     ~~~~~~~~~~");
//        System.out.println("\n\n");
//        new CXFServlet();
    }

}
