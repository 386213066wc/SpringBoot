import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@RequestMapping("/abc")
public class Application {
	
	 @RequestMapping("/hello")
	 @ResponseBody
	    public String greeting(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		 String remoteAddr = request.getRemoteAddr();
		 System.out.println(remoteAddr);
		 String characterEncoding = request.getCharacterEncoding();
		 System.out.println(characterEncoding);
	        return "Hello World!";
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }
}
