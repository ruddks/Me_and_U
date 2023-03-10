package com.Me_and_U.project.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RegGatherVO {
	private int regGatherNo;
	private String regGatherTitle;
	private String regGatherDiscript;
	private String regGatherArea;
	private String regGatherAreasub;
	private String regGatherImg;
	
	//모임 시작 및 종료일자 형식 변경에 따른 포맷 형식 변경
//	private Date regGatherStartDate;
//	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
//	private Date regGatherEndDate;
//	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
	private String regGatherStartDate;
	private String regGatherEndDate;
	
	public String getRegGatherStartDate() {
		return regGatherStartDate;
	}
	public void setRegGatherStartDate(String regGatherStartDate) {
		this.regGatherStartDate = regGatherStartDate;
	}
	public String getRegGatherEndDate() {
		return regGatherEndDate;
	}
	public void setRegGatherEndDate(String regGatherEndDate) {
		this.regGatherEndDate = regGatherEndDate;
	}
	
	private int regGatherMaxNum;	// 모임 최대정원
	private int regGatherNowNum;	// 모임 현재정원
	
	private String memId;
	private int ctgNo;
	private int subctgNo;
	
	
	public int getRegGatherNo() {
		return regGatherNo;
	}
	public void setRegGatherNo(int regGatherNo) {
		this.regGatherNo = regGatherNo;
	}
	public String getRegGatherTitle() {
		return regGatherTitle;
	}
	public void setRegGatherTitle(String regGatherTitle) {
		this.regGatherTitle = regGatherTitle;
	}
	public String getRegGatherDiscript() {
		return regGatherDiscript;
	}
	public void setRegGatherDiscript(String regGatherDiscript) {
		this.regGatherDiscript = regGatherDiscript;
	}
	public String getRegGatherArea() {
		return regGatherArea;
	}
	public void setRegGatherArea(String regGatherArea) {
		this.regGatherArea = regGatherArea;
	}
	public String getRegGatherAreasub() {
		return regGatherAreasub;
	}
	public void setRegGatherAreasub(String regGatherAreasub) {
		this.regGatherAreasub = regGatherAreasub;
	}
	public String getRegGatherImg() {
		return regGatherImg;
	}
	public void setRegGatherImg(String regGatherImg) {
		this.regGatherImg = regGatherImg;
	}
//	public Date getRegGatherStartDate() {
//		return regGatherStartDate;
//	}
//	public void setRegGatherStartDate(Date regGatherStartDate) {
//		this.regGatherStartDate = regGatherStartDate;
//	}
//	public Date getRegGatherEndDate() {
//		return regGatherEndDate;
//	}
//	public void setRegGatherEndDate(Date regGatherEndDate) {
//		this.regGatherEndDate = regGatherEndDate;
//	}
	public int getRegGatherMaxNum() {
		return regGatherMaxNum;
	}
	public void setRegGatherMaxNum(int regGatherMaxNum) {
		this.regGatherMaxNum = regGatherMaxNum;
	}
	public int getRegGatherNowNum() {
		return regGatherNowNum;
	}
	public void setRegGatherNowNum(int regGatherNowNum) {
		this.regGatherNowNum = regGatherNowNum;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public int getCtgNo() {
		return ctgNo;
	}
	public void setCtgNo(int ctgNo) {
		this.ctgNo = ctgNo;
	}
	public int getSubctgNo() {
		return subctgNo;
	}
	public void setSubctgNo(int subctgNo) {
		this.subctgNo = subctgNo;
	}
}
