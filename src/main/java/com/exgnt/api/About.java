package com.exgnt.api;

public class About {

	public About() {
		title = "Chassis";
		revision = "0.0.1";
		description = "A template API Framework";
		applicationName = "API Chassis";
	}

	String title, revision, description, applicationName;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
}
