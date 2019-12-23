package com.shanbei.domain;

public class Info {
	private Integer id;
	private String cardno;
	private String created;
	private Double jd;
	private Double wd;
	private Double distance;
	
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public Integer getId() {
		return id;
	}
	public String getCardno() {
		return cardno;
	}
	public String getCreated() {
		return created;
	}
	public Double getJd() {
		return jd;
	}
	public Double getWd() {
		return wd;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public void setJd(Double jd) {
		this.jd = jd;
	}
	public void setWd(Double wd) {
		this.wd = wd;
	}
	
}
