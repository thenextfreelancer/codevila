package com.scapper.common;

import java.util.Map;

public interface Scraper {

	public String COURSE_LIST_INPUT_FILE = "";
	
	public Map<String, Course> scrap(String courseKeyword);
	
	public void store(Map<String, Course> courseDetail);
	
}
