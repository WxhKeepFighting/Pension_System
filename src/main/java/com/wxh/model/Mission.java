package com.wxh.model;

import lombok.Data;

@Data
public class Mission {
    private Integer id;

    private String missionId;
    private Service service;

    private String missionApplicantId;
    private UApplicant uApplicant;

    private String missionVolunteerId;
    private UVolunteer uVolunteer;

    private String missionEventId;
    private Event event;

    private String missionStatus;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

//    public UApplicant getuApplicant() {
//        return uApplicant;
//    }
//
//    public void setuApplicant(UApplicant uApplicant) {
//        this.uApplicant = uApplicant;
//    }
//
//    public UVolunteer getuVolunteer() {
//        return uVolunteer;
//    }
//
//    public void setuVolunteer(UVolunteer uVolunteer) {
//        this.uVolunteer = uVolunteer;
//    }
//
//    public Event getEvent() {
//        return event;
//    }
//
//    public void setEvent(Event event) {
//        this.event = event;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getMissionId() {
//        return missionId;
//    }
//
//    public void setMissionId(String missionId) {
//        this.missionId = missionId == null ? null : missionId.trim();
//    }
//
//    public String getMissionApplicantId() {
//        return missionApplicantId;
//    }
//
//    public void setMissionApplicantId(String missionApplicantId) {
//        this.missionApplicantId = missionApplicantId == null ? null : missionApplicantId.trim();
//    }
//
//    public String getMissionVolunteerId() {
//        return missionVolunteerId;
//    }
//
//    public void setMissionVolunteerId(String missionVolunteerId) {
//        this.missionVolunteerId = missionVolunteerId == null ? null : missionVolunteerId.trim();
//    }
//
//    public String getMissionEventId() {
//        return missionEventId;
//    }
//
//    public void setMissionEventId(String missionEventId) {
//        this.missionEventId = missionEventId == null ? null : missionEventId.trim();
//    }
//
//    public String getMissionStatus() {
//        return missionStatus;
//    }
//
//    public void setMissionStatus(String missionStatus) {
//        this.missionStatus = missionStatus == null ? null : missionStatus.trim();
//    }
}