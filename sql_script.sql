CREATE DB course_vila;

USE course_vila;

CREATE TABLE `cv_course_group` (
	`id` INT NOT NULL AUTO_INCREMENT COMMENT 'unique id of course group',
	`name` VARCHAR NOT NULL COMMENT 'name of course group',
	`description` VARCHAR NOT NULL COMMENT 'description of course group',
	`search_keywords` VARCHAR NOT NULL COMMENT 'keywords used to search this course group',
	`associated_course_groups` VARCHAR COMMENT 'other course groups associated with this group',
	`associated_course_ids` VARCHAR COMMENT 'associated courses with this course group. this is a recursive dependency',
	PRIMARY KEY (`id`)
);

CREATE TABLE `cv_course` (
	`id` INT NOT NULL AUTO_INCREMENT COMMENT 'course id',
	`course_group_id` INT NOT NULL COMMENT 'course group id',
	`name` VARCHAR NOT NULL COMMENT 'name of the course',
	`search_keywords` VARCHAR COMMENT 'keywords to search this course. this is different from course group keyword search',
	`description` VARCHAR COMMENT 'description of the course',
	`course_provider` VARCHAR COMMENT 'website providing course',
	`course_url` VARCHAR COMMENT 'open url of the course',
	`rating` FLOAT COMMENT 'average rating out of 5',
	`rating_count` INT COMMENT 'number of students who provided ratings',
	`student_count` INT COMMENT 'number of students enrolled',
	`last_updated` DATE COMMENT 'date on course updated by tutor/owner',
	`supported_lang` VARCHAR COMMENT 'course support on languaues',
	`price` INT NOT NULL COMMENT 'course cost',
	`course_content_id` INT COMMENT 'course content id',
	`accessibility` VARCHAR COMMENT 'access time of course for student e.g. lifetime',
	`devices` VARCHAR COMMENT 'devices supported',
	`certification` BOOLEAN COMMENT 'certification is provided or not',
	`created_on` DATE NOT NULL COMMENT 'course inserted on db',
	`updated_on` DATE NOT NULL COMMENT 'course updated on db',
	PRIMARY KEY (`id`,`course_group_id`)
);

CREATE TABLE `cv_course_content` (
	`id` INT NOT NULL AUTO_INCREMENT COMMENT 'course content id',
	`course_id` INT NOT NULL COMMENT 'course id for content',
	`duration` FLOAT NOT NULL COMMENT 'duration in hours',
	`resource_count` INT,
	`lecture_count` INT,
	`section_count` INT,
	PRIMARY KEY (`id`)
);

CREATE TABLE `cv_tutor_info` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR NOT NULL COMMENT 'name of the tutor',
	`fb_profile` VARCHAR COMMENT 'FB profile url if any',
	`twitter_handle` VARCHAR COMMENT 'Twitter handle if any',
	`linkedin_profile` VARCHAR COMMENT 'LinkedIn profile url if any',
	`git_profile` VARCHAR COMMENT 'GIT profile url if any',
	`sof_profile` VARCHAR COMMENT 'StackOverFlow profile url if any',
	`experience_month` INT COMMENT 'experience in months',
	`background_info` VARCHAR COMMENT 'other info',
	PRIMARY KEY (`id`)




















