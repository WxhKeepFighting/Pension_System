package com.wxh.model;

import lombok.Data;

@Data
public class MissionView {
    private Integer id;

    private String missionId;

    private String missionApplicantId;

    private String missionVolunteerId;

    private String missionEventId;

    private String missionStatus;

    private String eventMean;

    private Integer credit;

    private String serviceStime;

    private String serviceEtime;

    private String vName;

    private String vPhone;

    private String vAddress;

    private String aName;

    private Integer aAge;

    private String aPhone;

    private String aAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId == null ? null : missionId.trim();
    }

    public String getMissionApplicantId() {
        return missionApplicantId;
    }

    public void setMissionApplicantId(String missionApplicantId) {
        this.missionApplicantId = missionApplicantId == null ? null : missionApplicantId.trim();
    }

    public String getMissionVolunteerId() {
        return missionVolunteerId;
    }

    public void setMissionVolunteerId(String missionVolunteerId) {
        this.missionVolunteerId = missionVolunteerId == null ? null : missionVolunteerId.trim();
    }

    public String getMissionEventId() {
        return missionEventId;
    }

    public void setMissionEventId(String missionEventId) {
        this.missionEventId = missionEventId == null ? null : missionEventId.trim();
    }

    public String getMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(String missionStatus) {
        this.missionStatus = missionStatus == null ? null : missionStatus.trim();
    }

    public String getEventMean() {
        return eventMean;
    }

    public void setEventMean(String eventMean) {
        this.eventMean = eventMean == null ? null : eventMean.trim();
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getServiceStime() {
        return serviceStime;
    }

    public void setServiceStime(String serviceStime) {
        this.serviceStime = serviceStime == null ? null : serviceStime.trim();
    }

    public String getServiceEtime() {
        return serviceEtime;
    }

    public void setServiceEtime(String serviceEtime) {
        this.serviceEtime = serviceEtime == null ? null : serviceEtime.trim();
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public String getvPhone() {
        return vPhone;
    }

    public void setvPhone(String vPhone) {
        this.vPhone = vPhone == null ? null : vPhone.trim();
    }

    public String getvAddress() {
        return vAddress;
    }

    public void setvAddress(String vAddress) {
        this.vAddress = vAddress == null ? null : vAddress.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public Integer getaAge() {
        return aAge;
    }

    public void setaAge(Integer aAge) {
        this.aAge = aAge;
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone == null ? null : aPhone.trim();
    }

    public String getaAddress() {
        return aAddress;
    }

    public void setaAddress(String aAddress) {
        this.aAddress = aAddress == null ? null : aAddress.trim();
    }
}