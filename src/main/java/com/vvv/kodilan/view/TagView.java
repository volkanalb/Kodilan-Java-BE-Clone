package com.vvv.kodilan.view;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagView {
	private List<Tag> tags;
	private Integer currentPage;
	private String firstPageUrl;
	private Integer from;
	private Integer lastPage;
	private String lastPageUrl;
	private String nextPageUrl;
	private String path;
	private Integer perPage;
	private String prevPageUrl;
	private Integer to;
	private Integer total;

	@JsonProperty("data")
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@JsonProperty("current_page")
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	@JsonProperty("first_page_url")
	public String getFirstPageUrl() {
		return firstPageUrl;
	}

	public void setFirstPageUrl(String firstPageUrl) {
		this.firstPageUrl = firstPageUrl;
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	@JsonProperty("last_page")
	public Integer getLastPage() {
		return lastPage;
	}

	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}

	@JsonProperty("last_page_url")
	public String getLastPageUrl() {
		return lastPageUrl;
	}

	public void setLastPageUrl(String lastPageUrl) {
		this.lastPageUrl = lastPageUrl;
	}

	@JsonProperty("next_page_url")
	public String getNextPageUrl() {
		return nextPageUrl;
	}

	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@JsonProperty("per_page")
	public Integer getPerPage() {
		return perPage;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	@JsonProperty("prev_page_url")
	public String getPrevPageUrl() {
		return prevPageUrl;
	}

	public void setPrevPageUrl(String prevPageUrl) {
		this.prevPageUrl = prevPageUrl;
	}

	public Integer getTo() {
		return to;
	}

	public void setTo(Integer to) {
		this.to = to;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
