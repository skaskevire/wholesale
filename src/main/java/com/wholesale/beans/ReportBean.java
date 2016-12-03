package com.wholesale.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.wholesale.service.IReportService;
import com.wholesale.service.entity.Report;

/**
 * Report bean
 * 
 * @author Raman Skaskevich
 * */

@Component
@ManagedBean
@SessionScoped
public class ReportBean
{
	@Autowired
	@Qualifier(value = "reportService")
	private IReportService reportService;

	public List<Report> getReportList()
	{
		String companyName = "NBN";
		return reportService.readByCompanyName(companyName);
	}
}

