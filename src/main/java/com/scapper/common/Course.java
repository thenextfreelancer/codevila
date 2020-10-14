package com.scapper.common;

import java.util.Date;
import java.util.List;

public class Course {
	
	private String courseName;
	
	private String courseDescription;
	
	private String ratings;
	
	private String stars;
	
	private String noOfStudents;
	
	private Tutor tutor;
	
	private Date lastUpdated;
	
	private List<VerbalLanguage> supportedLanguages;
	
	private int price;
	
	private CourseContent content;
	
	private String accessTime;
	
	private List<String> portableDevices;
	
	private boolean isCertification;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	public String getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(String noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public List<VerbalLanguage> getSupportedLanguages() {
		return supportedLanguages;
	}

	public void setSupportedLanguages(List<VerbalLanguage> supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public CourseContent getContent() {
		return content;
	}

	public void setContent(CourseContent content) {
		this.content = content;
	}

	public String getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(String accessTime) {
		this.accessTime = accessTime;
	}

	public List<String> getPortableDevices() {
		return portableDevices;
	}

	public void setPortableDevices(List<String> portableDevices) {
		this.portableDevices = portableDevices;
	}

	public boolean isCertification() {
		return isCertification;
	}

	public void setCertification(boolean isCertification) {
		this.isCertification = isCertification;
	}
	
}
