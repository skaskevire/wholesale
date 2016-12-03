
package com.wholesale.converter.impl;

import com.wholesale.converter.IConverter;
import com.wholesale.dao.entity.ReportDO;
import com.wholesale.service.entity.Report;

public class ReportConverter implements IConverter<Report, ReportDO>
{

	@Override
	public ReportDO convert(Report source)
	{
		ReportDO target = new ReportDO();
		target.setCurrentTier(source.getCurrentTier());
		target.setFnnNumber(source.getFnnNumber());
		target.setIsp(source.getIsp());
		target.setKbpsOrSIO(source.getKbpsOrSIO());
		target.setLastMonthTier(source.getLastMonthTier());
		target.setNetworkSIDCount(source.getNetworkSIDCount());
		target.setPeakBandwidthKBPS(source.getPeakBandwidthKBPS());
		return target;
	}

}
