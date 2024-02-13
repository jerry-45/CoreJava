package com.edubridge.equalsmethod;

// Program to demonstrate on equals() method
public class Site {
	private String name;
	private Integer id;
	
	public Site(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
}
