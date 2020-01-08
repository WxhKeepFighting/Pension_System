package com.wxh.model;

import java.util.ArrayList;
import java.util.List;

public class MissionViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionViewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNull() {
            addCriterion("mission_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNotNull() {
            addCriterion("mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIdEqualTo(String value) {
            addCriterion("mission_id =", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotEqualTo(String value) {
            addCriterion("mission_id <>", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThan(String value) {
            addCriterion("mission_id >", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_id >=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThan(String value) {
            addCriterion("mission_id <", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThanOrEqualTo(String value) {
            addCriterion("mission_id <=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLike(String value) {
            addCriterion("mission_id like", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotLike(String value) {
            addCriterion("mission_id not like", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdIn(List<String> values) {
            addCriterion("mission_id in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotIn(List<String> values) {
            addCriterion("mission_id not in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdBetween(String value1, String value2) {
            addCriterion("mission_id between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotBetween(String value1, String value2) {
            addCriterion("mission_id not between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdIsNull() {
            addCriterion("mission_applicant_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdIsNotNull() {
            addCriterion("mission_applicant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdEqualTo(String value) {
            addCriterion("mission_applicant_id =", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdNotEqualTo(String value) {
            addCriterion("mission_applicant_id <>", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdGreaterThan(String value) {
            addCriterion("mission_applicant_id >", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_applicant_id >=", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdLessThan(String value) {
            addCriterion("mission_applicant_id <", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdLessThanOrEqualTo(String value) {
            addCriterion("mission_applicant_id <=", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdLike(String value) {
            addCriterion("mission_applicant_id like", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdNotLike(String value) {
            addCriterion("mission_applicant_id not like", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdIn(List<String> values) {
            addCriterion("mission_applicant_id in", values, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdNotIn(List<String> values) {
            addCriterion("mission_applicant_id not in", values, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdBetween(String value1, String value2) {
            addCriterion("mission_applicant_id between", value1, value2, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdNotBetween(String value1, String value2) {
            addCriterion("mission_applicant_id not between", value1, value2, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdIsNull() {
            addCriterion("mission_volunteer_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdIsNotNull() {
            addCriterion("mission_volunteer_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdEqualTo(String value) {
            addCriterion("mission_volunteer_id =", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdNotEqualTo(String value) {
            addCriterion("mission_volunteer_id <>", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdGreaterThan(String value) {
            addCriterion("mission_volunteer_id >", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_volunteer_id >=", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdLessThan(String value) {
            addCriterion("mission_volunteer_id <", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdLessThanOrEqualTo(String value) {
            addCriterion("mission_volunteer_id <=", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdLike(String value) {
            addCriterion("mission_volunteer_id like", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdNotLike(String value) {
            addCriterion("mission_volunteer_id not like", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdIn(List<String> values) {
            addCriterion("mission_volunteer_id in", values, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdNotIn(List<String> values) {
            addCriterion("mission_volunteer_id not in", values, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdBetween(String value1, String value2) {
            addCriterion("mission_volunteer_id between", value1, value2, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdNotBetween(String value1, String value2) {
            addCriterion("mission_volunteer_id not between", value1, value2, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdIsNull() {
            addCriterion("mission_event_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdIsNotNull() {
            addCriterion("mission_event_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdEqualTo(String value) {
            addCriterion("mission_event_id =", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdNotEqualTo(String value) {
            addCriterion("mission_event_id <>", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdGreaterThan(String value) {
            addCriterion("mission_event_id >", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_event_id >=", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdLessThan(String value) {
            addCriterion("mission_event_id <", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdLessThanOrEqualTo(String value) {
            addCriterion("mission_event_id <=", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdLike(String value) {
            addCriterion("mission_event_id like", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdNotLike(String value) {
            addCriterion("mission_event_id not like", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdIn(List<String> values) {
            addCriterion("mission_event_id in", values, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdNotIn(List<String> values) {
            addCriterion("mission_event_id not in", values, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdBetween(String value1, String value2) {
            addCriterion("mission_event_id between", value1, value2, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdNotBetween(String value1, String value2) {
            addCriterion("mission_event_id not between", value1, value2, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionStatusIsNull() {
            addCriterion("mission_status is null");
            return (Criteria) this;
        }

        public Criteria andMissionStatusIsNotNull() {
            addCriterion("mission_status is not null");
            return (Criteria) this;
        }

        public Criteria andMissionStatusEqualTo(String value) {
            addCriterion("mission_status =", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusNotEqualTo(String value) {
            addCriterion("mission_status <>", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusGreaterThan(String value) {
            addCriterion("mission_status >", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mission_status >=", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusLessThan(String value) {
            addCriterion("mission_status <", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusLessThanOrEqualTo(String value) {
            addCriterion("mission_status <=", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusLike(String value) {
            addCriterion("mission_status like", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusNotLike(String value) {
            addCriterion("mission_status not like", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusIn(List<String> values) {
            addCriterion("mission_status in", values, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusNotIn(List<String> values) {
            addCriterion("mission_status not in", values, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusBetween(String value1, String value2) {
            addCriterion("mission_status between", value1, value2, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusNotBetween(String value1, String value2) {
            addCriterion("mission_status not between", value1, value2, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andEventMeanIsNull() {
            addCriterion("event_mean is null");
            return (Criteria) this;
        }

        public Criteria andEventMeanIsNotNull() {
            addCriterion("event_mean is not null");
            return (Criteria) this;
        }

        public Criteria andEventMeanEqualTo(String value) {
            addCriterion("event_mean =", value, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanNotEqualTo(String value) {
            addCriterion("event_mean <>", value, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanGreaterThan(String value) {
            addCriterion("event_mean >", value, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanGreaterThanOrEqualTo(String value) {
            addCriterion("event_mean >=", value, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanLessThan(String value) {
            addCriterion("event_mean <", value, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanLessThanOrEqualTo(String value) {
            addCriterion("event_mean <=", value, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanLike(String value) {
            addCriterion("event_mean like", value, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanNotLike(String value) {
            addCriterion("event_mean not like", value, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanIn(List<String> values) {
            addCriterion("event_mean in", values, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanNotIn(List<String> values) {
            addCriterion("event_mean not in", values, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanBetween(String value1, String value2) {
            addCriterion("event_mean between", value1, value2, "eventMean");
            return (Criteria) this;
        }

        public Criteria andEventMeanNotBetween(String value1, String value2) {
            addCriterion("event_mean not between", value1, value2, "eventMean");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Integer value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Integer value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Integer value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Integer value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Integer value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Integer> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Integer> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Integer value1, Integer value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andServiceStimeIsNull() {
            addCriterion("service_stime is null");
            return (Criteria) this;
        }

        public Criteria andServiceStimeIsNotNull() {
            addCriterion("service_stime is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStimeEqualTo(String value) {
            addCriterion("service_stime =", value, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeNotEqualTo(String value) {
            addCriterion("service_stime <>", value, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeGreaterThan(String value) {
            addCriterion("service_stime >", value, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeGreaterThanOrEqualTo(String value) {
            addCriterion("service_stime >=", value, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeLessThan(String value) {
            addCriterion("service_stime <", value, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeLessThanOrEqualTo(String value) {
            addCriterion("service_stime <=", value, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeLike(String value) {
            addCriterion("service_stime like", value, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeNotLike(String value) {
            addCriterion("service_stime not like", value, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeIn(List<String> values) {
            addCriterion("service_stime in", values, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeNotIn(List<String> values) {
            addCriterion("service_stime not in", values, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeBetween(String value1, String value2) {
            addCriterion("service_stime between", value1, value2, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceStimeNotBetween(String value1, String value2) {
            addCriterion("service_stime not between", value1, value2, "serviceStime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeIsNull() {
            addCriterion("service_etime is null");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeIsNotNull() {
            addCriterion("service_etime is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeEqualTo(String value) {
            addCriterion("service_etime =", value, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeNotEqualTo(String value) {
            addCriterion("service_etime <>", value, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeGreaterThan(String value) {
            addCriterion("service_etime >", value, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeGreaterThanOrEqualTo(String value) {
            addCriterion("service_etime >=", value, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeLessThan(String value) {
            addCriterion("service_etime <", value, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeLessThanOrEqualTo(String value) {
            addCriterion("service_etime <=", value, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeLike(String value) {
            addCriterion("service_etime like", value, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeNotLike(String value) {
            addCriterion("service_etime not like", value, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeIn(List<String> values) {
            addCriterion("service_etime in", values, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeNotIn(List<String> values) {
            addCriterion("service_etime not in", values, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeBetween(String value1, String value2) {
            addCriterion("service_etime between", value1, value2, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andServiceEtimeNotBetween(String value1, String value2) {
            addCriterion("service_etime not between", value1, value2, "serviceEtime");
            return (Criteria) this;
        }

        public Criteria andVNameIsNull() {
            addCriterion("v_name is null");
            return (Criteria) this;
        }

        public Criteria andVNameIsNotNull() {
            addCriterion("v_name is not null");
            return (Criteria) this;
        }

        public Criteria andVNameEqualTo(String value) {
            addCriterion("v_name =", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotEqualTo(String value) {
            addCriterion("v_name <>", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThan(String value) {
            addCriterion("v_name >", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThanOrEqualTo(String value) {
            addCriterion("v_name >=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThan(String value) {
            addCriterion("v_name <", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThanOrEqualTo(String value) {
            addCriterion("v_name <=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLike(String value) {
            addCriterion("v_name like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotLike(String value) {
            addCriterion("v_name not like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameIn(List<String> values) {
            addCriterion("v_name in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotIn(List<String> values) {
            addCriterion("v_name not in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameBetween(String value1, String value2) {
            addCriterion("v_name between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotBetween(String value1, String value2) {
            addCriterion("v_name not between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVPhoneIsNull() {
            addCriterion("v_phone is null");
            return (Criteria) this;
        }

        public Criteria andVPhoneIsNotNull() {
            addCriterion("v_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVPhoneEqualTo(String value) {
            addCriterion("v_phone =", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneNotEqualTo(String value) {
            addCriterion("v_phone <>", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneGreaterThan(String value) {
            addCriterion("v_phone >", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("v_phone >=", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneLessThan(String value) {
            addCriterion("v_phone <", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneLessThanOrEqualTo(String value) {
            addCriterion("v_phone <=", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneLike(String value) {
            addCriterion("v_phone like", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneNotLike(String value) {
            addCriterion("v_phone not like", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneIn(List<String> values) {
            addCriterion("v_phone in", values, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneNotIn(List<String> values) {
            addCriterion("v_phone not in", values, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneBetween(String value1, String value2) {
            addCriterion("v_phone between", value1, value2, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneNotBetween(String value1, String value2) {
            addCriterion("v_phone not between", value1, value2, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVAddressIsNull() {
            addCriterion("v_address is null");
            return (Criteria) this;
        }

        public Criteria andVAddressIsNotNull() {
            addCriterion("v_address is not null");
            return (Criteria) this;
        }

        public Criteria andVAddressEqualTo(String value) {
            addCriterion("v_address =", value, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressNotEqualTo(String value) {
            addCriterion("v_address <>", value, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressGreaterThan(String value) {
            addCriterion("v_address >", value, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressGreaterThanOrEqualTo(String value) {
            addCriterion("v_address >=", value, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressLessThan(String value) {
            addCriterion("v_address <", value, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressLessThanOrEqualTo(String value) {
            addCriterion("v_address <=", value, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressLike(String value) {
            addCriterion("v_address like", value, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressNotLike(String value) {
            addCriterion("v_address not like", value, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressIn(List<String> values) {
            addCriterion("v_address in", values, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressNotIn(List<String> values) {
            addCriterion("v_address not in", values, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressBetween(String value1, String value2) {
            addCriterion("v_address between", value1, value2, "vAddress");
            return (Criteria) this;
        }

        public Criteria andVAddressNotBetween(String value1, String value2) {
            addCriterion("v_address not between", value1, value2, "vAddress");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andAAgeIsNull() {
            addCriterion("a_age is null");
            return (Criteria) this;
        }

        public Criteria andAAgeIsNotNull() {
            addCriterion("a_age is not null");
            return (Criteria) this;
        }

        public Criteria andAAgeEqualTo(Integer value) {
            addCriterion("a_age =", value, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeNotEqualTo(Integer value) {
            addCriterion("a_age <>", value, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeGreaterThan(Integer value) {
            addCriterion("a_age >", value, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_age >=", value, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeLessThan(Integer value) {
            addCriterion("a_age <", value, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeLessThanOrEqualTo(Integer value) {
            addCriterion("a_age <=", value, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeIn(List<Integer> values) {
            addCriterion("a_age in", values, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeNotIn(List<Integer> values) {
            addCriterion("a_age not in", values, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeBetween(Integer value1, Integer value2) {
            addCriterion("a_age between", value1, value2, "aAge");
            return (Criteria) this;
        }

        public Criteria andAAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("a_age not between", value1, value2, "aAge");
            return (Criteria) this;
        }

        public Criteria andAPhoneIsNull() {
            addCriterion("a_phone is null");
            return (Criteria) this;
        }

        public Criteria andAPhoneIsNotNull() {
            addCriterion("a_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAPhoneEqualTo(String value) {
            addCriterion("a_phone =", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotEqualTo(String value) {
            addCriterion("a_phone <>", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneGreaterThan(String value) {
            addCriterion("a_phone >", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("a_phone >=", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLessThan(String value) {
            addCriterion("a_phone <", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLessThanOrEqualTo(String value) {
            addCriterion("a_phone <=", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLike(String value) {
            addCriterion("a_phone like", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotLike(String value) {
            addCriterion("a_phone not like", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneIn(List<String> values) {
            addCriterion("a_phone in", values, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotIn(List<String> values) {
            addCriterion("a_phone not in", values, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneBetween(String value1, String value2) {
            addCriterion("a_phone between", value1, value2, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotBetween(String value1, String value2) {
            addCriterion("a_phone not between", value1, value2, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAAddressIsNull() {
            addCriterion("a_address is null");
            return (Criteria) this;
        }

        public Criteria andAAddressIsNotNull() {
            addCriterion("a_address is not null");
            return (Criteria) this;
        }

        public Criteria andAAddressEqualTo(String value) {
            addCriterion("a_address =", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotEqualTo(String value) {
            addCriterion("a_address <>", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressGreaterThan(String value) {
            addCriterion("a_address >", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressGreaterThanOrEqualTo(String value) {
            addCriterion("a_address >=", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLessThan(String value) {
            addCriterion("a_address <", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLessThanOrEqualTo(String value) {
            addCriterion("a_address <=", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLike(String value) {
            addCriterion("a_address like", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotLike(String value) {
            addCriterion("a_address not like", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressIn(List<String> values) {
            addCriterion("a_address in", values, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotIn(List<String> values) {
            addCriterion("a_address not in", values, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressBetween(String value1, String value2) {
            addCriterion("a_address between", value1, value2, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotBetween(String value1, String value2) {
            addCriterion("a_address not between", value1, value2, "aAddress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}