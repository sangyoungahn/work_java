package com.ssafy.weather;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherDAO {
	
	List<Weather> list = new ArrayList<Weather>();
	
	public List<Weather> getNewsList(String url) {
		list.clear();	//기존의 리스트를 다 지우고 해야함
		connectXML(url);	//GUI 리스트에 풀력...
		return list;
	}
	
	//1. 파서 리턴
	private void connectXML(String url) {	//getNewsList에서 값을 리턴하므로 여기서는 리턴 안해줘도 됨
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			MyHandler handler = new MyHandler();
			parser.parse(new URL(url).openConnection().getInputStream(), handler);
		}catch(Exception e) {
			
		}
		
	}
	
	//2. PARSING...url, handler
	class MyHandler extends DefaultHandler {
		private Weather weather;
		private StringBuffer sb;
		
		@Override
		public void startDocument() throws SAXException {
			list = new ArrayList<Weather>();
			sb = new StringBuffer();
		}
		
		@Override
		public void startElement(String uri, String localName, String name, Attributes attributes)
				throws SAXException {
			if(name.equalsIgnoreCase("data")) {
				weather = new Weather();
			}
		}
		
		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			sb.append(ch, start, length);
		}
		
		@Override
		public void endElement(String uri, String localName, String name) throws SAXException {
			if(weather!=null) {
				if(name.equalsIgnoreCase("hour")) {
					weather.setHour(sb.toString().trim());
				}else if(name.equalsIgnoreCase("temp")) {
					weather.setTemp(sb.toString().trim());
				}else if(name.equalsIgnoreCase("wfKor")) {
					weather.setWfKor(sb.toString().trim());
				}else if(name.equalsIgnoreCase("reh")) {
					weather.setReh(sb.toString().trim());
				}else if(name.equalsIgnoreCase("data")) {
					list.add(weather);
				}
				sb.setLength(0);	//버퍼 초기화
			}
			sb.setLength(0);
		}
	}
}
