package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\TestAutomationFramework\\src\\test\\resources\\configFiles\\config.properties");
		Properties p=new Properties();
		p.load(fr);
System.out.println(p.getProperty("browser"));
System.out.println(p.getProperty("testurl"));
	}
	 
	





	}
