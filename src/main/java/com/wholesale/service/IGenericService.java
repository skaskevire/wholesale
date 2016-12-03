package com.wholesale.service;

import java.util.List;

/**
 * Performs calls to dao layer, entity conversion.
 *  Buffer between dao layer and actions
 * 
 * @author Raman_Skaskevich@epam.com
 * */
public interface IGenericService<E, EDO, K> {
	/**
	 * 
	 * creates entity
	 * 
	 * @param T
	 *            entity
	 * 
	 * */
	void create(E entity);

	/**
	 * 
	 * updates entity
	 * 
	 * @param T
	 *            entity
	 * 
	 * */
	void update(E entity);

	/**
	 * 
	 * removes entity
	 * 
	 * @param T
	 *            entity
	 * 
	 * */
	void delete(K id);

	/**
	 * 
	 * reads entity
	 * 
	 * @return T entity
	 * 
	 * */
	E read(K id);
	
	List<E> readAll();
}
