package com.wholesale.dao.entity;

/**
 * 
 * Report Data object
 *
 * @author Raman Skaskevich
 * */
public class ReportDO
{
	private String isp;
	private String fnnNumber;
	private Double peakBandwidthKBPS;
	private Integer networkSIDCount;
	private Integer kbpsOrSIO;
	private Integer currentTier;
	private Integer lastMonthTier;
	
	public String getIsp()
	{
		return isp;
	}
	public void setIsp(String isp)
	{
		this.isp = isp;
	}
	public String getFnnNumber()
	{
		return fnnNumber;
	}
	public void setFnnNumber(String fnnNumber)
	{
		this.fnnNumber = fnnNumber;
	}
	public Double getPeakBandwidthKBPS()
	{
		return peakBandwidthKBPS;
	}
	public void setPeakBandwidthKBPS(Double peakBandwidthKBPS)
	{
		this.peakBandwidthKBPS = peakBandwidthKBPS;
	}
	public Integer getNetworkSIDCount()
	{
		return networkSIDCount;
	}
	public void setNetworkSIDCount(Integer networkSIDCount)
	{
		this.networkSIDCount = networkSIDCount;
	}
	public Integer getKbpsOrSIO()
	{
		return kbpsOrSIO;
	}
	public void setKbpsOrSIO(Integer kbpsOrSIO)
	{
		this.kbpsOrSIO = kbpsOrSIO;
	}
	public Integer getCurrentTier()
	{
		return currentTier;
	}
	public void setCurrentTier(Integer currentTier)
	{
		this.currentTier = currentTier;
	}
	public Integer getLastMonthTier()
	{
		return lastMonthTier;
	}
	public void setLastMonthTier(Integer lastMonthTier)
	{
		this.lastMonthTier = lastMonthTier;
	}	
}
