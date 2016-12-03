
package com.wholesale.converter.impl;

import com.wholesale.converter.IConverter;
import com.wholesale.dao.entity.ReportDO;
import com.wholesale.service.entity.Report;

public class ReportDOConverter implements IConverter<ReportDO, Report>
{

	@Override
	public Report convert(ReportDO source)
	{
		Report target = new Report();
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
