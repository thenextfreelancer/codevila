package com.scapper.common;

import java.util.List;

public class CourseGroup {

	private int id;

	private String name;

	private String description;

	private List<String> searchKeywords;

	private List<Integer> associatedCourseGroupIds;

	private List<Integer> associatedCourseIds;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getSearchKeywords() {
		return searchKeywords;
	}

	public void setSearchKeywords(List<String> searchKeywords) {
		this.searchKeywords = searchKeywords;
	}

	public List<Integer> getAssociatedCourseGroupIds() {
		return associatedCourseGroupIds;
	}

	public void setAssociatedCourseGroupIds(List<Integer> associatedCourseGroupIds) {
		this.associatedCourseGroupIds = associatedCourseGroupIds;
	}

	public List<Integer> getAssociatedCourseIds() {
		return associatedCourseIds;
	}

	public void setAssociatedCourseIds(List<Integer> associatedCourseIds) {
		this.associatedCourseIds = associatedCourseIds;
	}

}
