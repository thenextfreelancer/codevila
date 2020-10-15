package com.scapper.common;

import java.util.Date;
import java.util.List;

public class Course {

	private int id;

	private int courseGroupId;
	
	private CourseProvider provider;
	
	private String courseUrl;

	private List<String> courseKeywords;

	private String courseName;

	private String courseDescription;

	private float ratings;

	private long ratingCounts;

	private long noOfStudents;

	private Tutor tutor;

	private Date lastUpdated;

	private List<VerbalLanguage> supportedLanguages;

	private int price;

	private CourseContent content;

	private String accessTime;

	private List<String> portableDevices;

	private boolean isCertification;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseGroupId;
	}

	public void setCourseId(int courseGroupId) {
		this.courseGroupId = courseGroupId;
	}
	
	public CourseProvider getProvider() {
		return provider;
	}

	public void setProvider(CourseProvider provider) {
		this.provider = provider;
	}

	public String getCourseUrl() {
		return courseUrl;
	}

	public void setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
	}

	public List<String> getCourseKeywords() {
		return courseKeywords;
	}

	public void setCourseKeywords(List<String> courseKeywords) {
		this.courseKeywords = courseKeywords;
	}

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

	public int getCourseGroupId() {
		return courseGroupId;
	}

	public void setCourseGroupId(int courseGroupId) {
		this.courseGroupId = courseGroupId;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public long getRatingCounts() {
		return ratingCounts;
	}

	public void setRatingCounts(long ratingCounts) {
		this.ratingCounts = ratingCounts;
	}

	public long getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(long noOfStudents) {
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
