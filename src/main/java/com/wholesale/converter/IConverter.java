package com.wholesale.converter;

/**
 * Converter between dao layer objects and business logic objects
 * 
 * @author Raman_Skaskevich@epam.com
 * */
public interface IConverter<T, K> {
	
	/**
	 * Converts object K to object T
	 * 
	 * */
	public K convert(T t);

}
