
package com.wholesale.service;

import java.util.List;

import com.wholesale.dao.entity.ReportDO;
import com.wholesale.service.entity.Report;

/**
 * Adds additional logic to {@GenericService}
 * ( read by company name )
 * 
 * @author Raman Skaskevich
 * */
public interface IReportService extends IGenericService<Report, ReportDO, Integer>
{

	/**
	 * Reads by company name
	 * 
	 * @return List<Report>
	 * 				list of reports
	 * @param companyName
	 * 				companyName
	 * */
	List<Report> readByCompanyName(String companyName);

}
