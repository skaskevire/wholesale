package com.wholesale.util;

/**
 * Handled companies enum
 * 
 * @author Raman Skaskevich
 * */
public enum CompanyEnum {
	NBN("nbn"), DSL("dsl");
	private String name;
	
	CompanyEnum(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}
