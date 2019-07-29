package com.District;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DistrictInfo {
	@Id
	String name;
	float demand,supply,downtime;
	
	public DistrictInfo(String name, float demand, float supply, float downtime) {
		super();
		this.name = name;
		this.demand = demand;
		this.supply = supply;
		this.downtime = downtime;
	}

	public DistrictInfo() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDemand() {
		return demand;
	}

	public void setDemand(float demand) {
		this.demand = demand;
	}

	public float getSupply() {
		return supply;
	}

	public void setSupply(float supply) {
		this.supply = supply;
	}

	public float getDowntime() {
		return downtime;
	}

	public void setDowntime(float downtime) {
		this.downtime = downtime;
	}

	
	
}
