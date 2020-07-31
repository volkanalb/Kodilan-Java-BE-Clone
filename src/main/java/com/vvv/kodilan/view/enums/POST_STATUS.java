package com.vvv.kodilan.view.enums;

public enum POST_STATUS {
	DISAPPROVED(0, "ONAYLANMADI"), APPROVED(1, "ONAYLANDI"), UNPUBLISHED(2, "YAYINLANMADI");

	private Integer id;
	private String name;

	POST_STATUS(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
