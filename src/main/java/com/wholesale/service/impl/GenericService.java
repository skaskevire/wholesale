package com.wholesale.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wholesale.converter.IConverter;
import com.wholesale.dao.IDao;
import com.wholesale.service.IGenericService;

/**
 * Implementation of {@IGenericService}
 * 
 * @author Raman_Skaskevich@epam.com
 * 
 * */
public class GenericService<E, EDO, K>  implements IGenericService<E,EDO, K> {
	protected IDao<EDO, K> dao;

	private IConverter<E, EDO> converter;

	protected IConverter<EDO, E> inverseConverter;

	/**
	 * {@inheritDoc}
	 * 
	 * */
	@Override
	public void create(E entity) {
		EDO entityDO = converter.convert(entity);
		dao.create(entityDO);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * */
	@Override
	public void update(E entity) {
		EDO entityDO = converter.convert(entity);
		dao.update(entityDO);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * */
	@Override
	public void delete(K id) {
		EDO entity = dao.read(id);
		dao.delete(entity);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * */
	@Override
	public E read(K id) {
		EDO entityDO = dao.read(id);
		return inverseConverter.convert(entityDO);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * */
	@Override
	public List<E> readAll() {
		List<EDO> entityDOList = dao.readAll();
		List<E> entityList = new ArrayList<E>();
		for(EDO edo : entityDOList)
		{
			entityList.add(inverseConverter.convert(edo));
		}
		return entityList;
	}
	
	public void setDao(IDao<EDO, K> dao) {
		this.dao = dao;
	}

	public void setConverter(IConverter<E, EDO> converter) {
		this.converter = converter;
	}

	public void setInverseConverter(IConverter<EDO, E> inverseConverter) {
		this.inverseConverter = inverseConverter;
	}
}
