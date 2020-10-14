package com.scapper.udemy;

import org.openqa.selenium.By;

public class PageVariables {
	protected static final String BASE_URL = "https://www.udemy.com/";

	protected static final By searchBar = By.name("q");

	protected static final By coursesBy = By.cssSelector("[class$=course-list--container--] > div");

	protected static final By courseLink = By.tagName("a");
	
	protected static final By courseInfoBy = By.className("course-landing-page__main-content");
	
	protected static final By courseTitleBy = By.cssSelector("h1[data-purpose='lead-title']");  //getText from parent courseInfoBy
	
	protected static final By courseDescBy = By.cssSelector("div[data-purpose='lead-headline']");  //getText from parent courseInfoBy
	
	protected static final By courseBestSellerBadgeBy = By.className("clp-lead__badge-ratings-enrollment");  //if 2 children? "BestSeller":"Not a bestseller"
	
	protected static final By courseStarsBy = By.className("course-landing-page__main-content");
	
	protected static final By courseRatingsBy = By.className("course-landing-page__main-content");
	
	protected static final By courseStudentsBy = By.className("course-landing-page__main-content");
	
	protected static final By courseTutorsBy = By.className("course-landing-page__main-content");
	
	protected static final By courseLastUpdatedBy = By.className("course-landing-page__main-content");
	
	protected static final By courseLanguagesBy = By.className("course-landing-page__main-content");
	
	protected static final By courseSectionsBy = By.className("course-landing-page__main-content");
	
	protected static final By courseLecturesBy = By.className("course-landing-page__main-content");
	
	protected static final By courseDurationBy = By.className("course-landing-page__main-content");
	
	protected static final By courseAccessBy = By.className("course-landing-page__main-content");
	
	protected static final By courseDeviceSupportBy = By.className("course-landing-page__main-content");
	
	protected static final By courseCertificationBy = By.className("course-landing-page__main-content");
	
	protected static final By courseDiscountedPriceBy = By.className("course-landing-page__main-content");
	
	protected static final By courseOriginalPriceBy = By.className("course-landing-page__main-content");
	
	protected static final By courseDiscountPercentageBy = By.className("course-landing-page__main-content");
	
}
