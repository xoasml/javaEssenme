package example;

import java.util.Properties;

public class Source38_PropertiesEx4 {
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		
		System.out.println("java.version : " + prop.getProperty("java.version"));
		System.out.println("user.lenguage : " + prop.getProperty("user.lenguage"));
		
		prop.list(System.out);
	
	}
}
