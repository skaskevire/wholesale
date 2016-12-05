
package com.wholesale.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.wholesale.dao.IDao;
import com.wholesale.dao.entity.ReportDO;

/**
 * Implementation of {@IDao}
 * 
 * @author Raman_Skaskevich
 */

public class MockDao implements IDao<ReportDO, Integer>
{
	@Override
	public void create(ReportDO entity)
	{
	}


	@Override
	public void update(ReportDO entity)
	{
	}


	@Override
	public void delete(ReportDO entity)
	{
	}

	@Override
	public ReportDO read(Integer id)
	{
		return null;
	}

	@Override
	public List<ReportDO> readAll()
	{
		return null;
	}

	@Override
	public List<ReportDO> readByParam(String paramName, String paramValue)
	{
		List<ReportDO> list = new ArrayList<ReportDO>();
		for (int i = 0; i < 10; i++)
		{
			list.add(createMockedReportDOObject());
		}
		return list;
	}

	private ReportDO createMockedReportDOObject()
	{
		ReportDO report = new ReportDO();
		report.setCurrentTier(new Random().nextInt(8) + 1);
		report.setFnnNumber("NS1234" + new Random().nextInt(8) + 1);
		report.setIsp("ISP" + new Random().nextInt(8) + 1);
		report.setKbpsOrSIO(new Random().nextInt(8) * 10 * new Random().nextInt(8) * 10);
		report.setLastMonthTier(new Random().nextInt(8) + 1);
		report.setNetworkSIDCount(new Random().nextInt(8) * 10 * new Random().nextInt(8) * 10);
		report.setPeakBandwidthKBPS(new Random().nextInt(8) * 1000 * 0.123);
		return report;
	}
}
