
package com.wholesale.service;

import java.util.List;

import com.wholesale.dao.entity.ReportDO;
import com.wholesale.service.entity.Report;

public interface IReportService extends IGenericService<Report, ReportDO, Integer>
{

	List<Report> readByCompanyName(String companyName);

}
