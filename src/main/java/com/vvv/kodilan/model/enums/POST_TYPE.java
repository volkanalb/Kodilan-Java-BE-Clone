package com.vvv.kodilan.model.enums;

public enum POST_TYPE {
	FULLTIME(1, "TAM ZAMANLI"), PARTTIME(2, "YARI ZAMANLI"), TRAINEE(3, "STAJYER"), FREELANCER(4, "FREELANCE");

	private Integer id;
	private String name;

	POST_TYPE(Integer id, String name) {
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
