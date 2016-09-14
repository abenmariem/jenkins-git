package springmvc.java.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext container) throws ServletException {
	
		//This config replaces web.xml config
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        
        //Webconfig class is responsible for creating the configuration of the dispatcher service
        //Webconfig is responsible for creating beans
        //replaces contextconfiglocation in web.xml
        rootContext.register(WebConfig.class);
        //Manage the lifecycle of rootcontext
        container.addListener(new ContextLoaderListener(rootContext));
        
        //create dispatcher servlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(rootContext);
            
        rootContext.setServletContext(container);
 
        //Register the dispatcher servlet
        //replaces servlet mapping in web.xml
        ServletRegistration.Dynamic registration = container.addServlet("dispatcherServlet", dispatcherServlet);
 
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
		
	}
	

}
