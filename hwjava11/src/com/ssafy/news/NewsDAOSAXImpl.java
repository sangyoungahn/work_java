package com.ssafy.news;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class NewsDAOSAXImpl implements INewsDAO {
	List<News> list = new ArrayList<News>();
	
	@Override
	public List<News> getNewsList(String url) {
		list.clear();
		connectNews(url);
		return list;
	}

	@Override
	public News search(int index) {
		return list.get(index);
	}
	
	private void connectNews(String url) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			MyHandler handler = new MyHandler();
			parser.parse(new URL(url).openConnection().getInputStream(), handler);
		}catch(Exception e) {
			
		}
	}
	
	class MyHandler extends DefaultHandler {
		private StringBuffer b;
		private News n;
	    private boolean flag;

	    @Override
	    public void startDocument() throws SAXException {
	    	list = new ArrayList<News>();
	    	b = new StringBuffer();
	    }
	    
	    @Override
	    public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {
	    	if(name.equalsIgnoreCase("item")) {
	    		n = new News();
	    	}
	    }
	    
	    @Override
	    public void characters(char[] ch, int start, int length) throws SAXException {
	    	b.append(ch, start, length);
	    }
	    
	    @Override
	    public void endElement(String uri, String localName, String name) throws SAXException {
	    	if(n!=null) {
	    		if(name.equalsIgnoreCase("title")) {
	    			n.setTitle(b.toString().trim());
	    		} else if(name.equalsIgnoreCase("link")) {
	    			n.setLink(b.toString().trim());
	    		} else if(name.equalsIgnoreCase("description")) {
	    			n.setDesc(b.toString().trim());
	    		} else if(name.equalsIgnoreCase("item")) {
	    			list.add(n);
	    		}
	    		b.setLength(0);
	    	}
	    	b.setLength(0);
	    }
	}

}
