package collection.property.test;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest1 {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration en = p.propertyNames();		//Enumeration : 마우스 포커스 지정
		while(en.hasMoreElements()) {
			String name = (String)en.nextElement();
			String value = p.getProperty(name);
			
			System.out.println(name + "=========================" + value);
		}
	}

}
