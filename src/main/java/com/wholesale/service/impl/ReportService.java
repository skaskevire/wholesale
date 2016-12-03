
package com.wholesale.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wholesale.dao.entity.ReportDO;
import com.wholesale.service.IReportService;
import com.wholesale.service.entity.Report;

public class ReportService extends GenericService<Report, ReportDO, Integer>
		implements IReportService
{
	@Override
	public List<Report> readByCompanyName(String companyName)
	{
		List<ReportDO> reportDOList = dao.readByParam("companyName", companyName);
		List<Report> reportList = new ArrayList<Report>();
		for(ReportDO reportDO : reportDOList)
		{
			reportList.add(inverseConverter.convert(reportDO));
		}
		return reportList;
	}

}
