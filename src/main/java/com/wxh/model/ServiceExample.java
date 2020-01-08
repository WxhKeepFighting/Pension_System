package com.wxh.model;

import java.util.ArrayList;
import java.util.List;

public class ServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceExample() {
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

        public Criteria andServiceStatusIsNull() {
            addCriterion("service_status is null");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIsNotNull() {
            addCriterion("service_status is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStatusEqualTo(String value) {
            addCriterion("service_status =", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotEqualTo(String value) {
            addCriterion("service_status <>", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusGreaterThan(String value) {
            addCriterion("service_status >", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("service_status >=", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLessThan(String value) {
            addCriterion("service_status <", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLessThanOrEqualTo(String value) {
            addCriterion("service_status <=", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLike(String value) {
            addCriterion("service_status like", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotLike(String value) {
            addCriterion("service_status not like", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIn(List<String> values) {
            addCriterion("service_status in", values, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotIn(List<String> values) {
            addCriterion("service_status not in", values, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusBetween(String value1, String value2) {
            addCriterion("service_status between", value1, value2, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotBetween(String value1, String value2) {
            addCriterion("service_status not between", value1, value2, "serviceStatus");
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

        public Criteria andServiceSpicIsNull() {
            addCriterion("service_spic is null");
            return (Criteria) this;
        }

        public Criteria andServiceSpicIsNotNull() {
            addCriterion("service_spic is not null");
            return (Criteria) this;
        }

        public Criteria andServiceSpicEqualTo(String value) {
            addCriterion("service_spic =", value, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicNotEqualTo(String value) {
            addCriterion("service_spic <>", value, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicGreaterThan(String value) {
            addCriterion("service_spic >", value, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicGreaterThanOrEqualTo(String value) {
            addCriterion("service_spic >=", value, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicLessThan(String value) {
            addCriterion("service_spic <", value, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicLessThanOrEqualTo(String value) {
            addCriterion("service_spic <=", value, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicLike(String value) {
            addCriterion("service_spic like", value, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicNotLike(String value) {
            addCriterion("service_spic not like", value, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicIn(List<String> values) {
            addCriterion("service_spic in", values, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicNotIn(List<String> values) {
            addCriterion("service_spic not in", values, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicBetween(String value1, String value2) {
            addCriterion("service_spic between", value1, value2, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceSpicNotBetween(String value1, String value2) {
            addCriterion("service_spic not between", value1, value2, "serviceSpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicIsNull() {
            addCriterion("service_epic is null");
            return (Criteria) this;
        }

        public Criteria andServiceEpicIsNotNull() {
            addCriterion("service_epic is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEpicEqualTo(String value) {
            addCriterion("service_epic =", value, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicNotEqualTo(String value) {
            addCriterion("service_epic <>", value, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicGreaterThan(String value) {
            addCriterion("service_epic >", value, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicGreaterThanOrEqualTo(String value) {
            addCriterion("service_epic >=", value, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicLessThan(String value) {
            addCriterion("service_epic <", value, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicLessThanOrEqualTo(String value) {
            addCriterion("service_epic <=", value, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicLike(String value) {
            addCriterion("service_epic like", value, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicNotLike(String value) {
            addCriterion("service_epic not like", value, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicIn(List<String> values) {
            addCriterion("service_epic in", values, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicNotIn(List<String> values) {
            addCriterion("service_epic not in", values, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicBetween(String value1, String value2) {
            addCriterion("service_epic between", value1, value2, "serviceEpic");
            return (Criteria) this;
        }

        public Criteria andServiceEpicNotBetween(String value1, String value2) {
            addCriterion("service_epic not between", value1, value2, "serviceEpic");
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