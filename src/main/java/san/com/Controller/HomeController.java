package san.com.Controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.apache.log4j.PropertyConfigurator;
@Controller  //This must be used to define it is a controller
public class HomeController {
	
	final static Logger logger = Logger.getLogger(HomeController.class);
	//PropertyConfigurator.configure("log4jproperties");
	@RequestMapping(value = "/")   //when url with / on default GET is called, it will show just string due to
	//ResponseBody annotation to display only string
	public @ResponseBody String chkUser2() {
		
		logger.info("This is an info log entry");
		logger.error("This is an error log entry");
		return "index page is called";
		
		//when this is called, it will do all the logging via logger and checks the properties
		//of log4j.properties file in default src folder
		// this program will write all the loggs to files in c:\san\san.log file
		
    }
	
	@RequestMapping(value = "/hello",method=RequestMethod.GET)  //  /hello url will call hello.jsp
	public String testUser2() {
		return "hello";
    }
	
}
