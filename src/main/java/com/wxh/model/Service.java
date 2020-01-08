package com.wxh.model;

import lombok.Data;

@Data
public class Service {
    private String missionId;

    private String serviceStatus;

    private String serviceStime;

    private String serviceEtime;

    private String serviceSpic;

    private String serviceEpic;

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId == null ? null : missionId.trim();
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus == null ? null : serviceStatus.trim();
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

    public String getServiceSpic() {
        return serviceSpic;
    }

    public void setServiceSpic(String serviceSpic) {
        this.serviceSpic = serviceSpic == null ? null : serviceSpic.trim();
    }

    public String getServiceEpic() {
        return serviceEpic;
    }

    public void setServiceEpic(String serviceEpic) {
        this.serviceEpic = serviceEpic == null ? null : serviceEpic.trim();
    }
}