package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurIdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurIdExample() {
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

        public Criteria andCurIdIsNull() {
            addCriterion("CUR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNotNull() {
            addCriterion("CUR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdEqualTo(String value) {
            addCriterion("CUR_ID =", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotEqualTo(String value) {
            addCriterion("CUR_ID <>", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThan(String value) {
            addCriterion("CUR_ID >", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_ID >=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThan(String value) {
            addCriterion("CUR_ID <", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThanOrEqualTo(String value) {
            addCriterion("CUR_ID <=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLike(String value) {
            addCriterion("CUR_ID like", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotLike(String value) {
            addCriterion("CUR_ID not like", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdIn(List<String> values) {
            addCriterion("CUR_ID in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotIn(List<String> values) {
            addCriterion("CUR_ID not in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdBetween(String value1, String value2) {
            addCriterion("CUR_ID between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotBetween(String value1, String value2) {
            addCriterion("CUR_ID not between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andIjDdIsNull() {
            addCriterion("IJ_DD is null");
            return (Criteria) this;
        }

        public Criteria andIjDdIsNotNull() {
            addCriterion("IJ_DD is not null");
            return (Criteria) this;
        }

        public Criteria andIjDdEqualTo(Date value) {
            addCriterion("IJ_DD =", value, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdNotEqualTo(Date value) {
            addCriterion("IJ_DD <>", value, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdGreaterThan(Date value) {
            addCriterion("IJ_DD >", value, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdGreaterThanOrEqualTo(Date value) {
            addCriterion("IJ_DD >=", value, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdLessThan(Date value) {
            addCriterion("IJ_DD <", value, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdLessThanOrEqualTo(Date value) {
            addCriterion("IJ_DD <=", value, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdIn(List<Date> values) {
            addCriterion("IJ_DD in", values, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdNotIn(List<Date> values) {
            addCriterion("IJ_DD not in", values, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdBetween(Date value1, Date value2) {
            addCriterion("IJ_DD between", value1, value2, "ijDd");
            return (Criteria) this;
        }

        public Criteria andIjDdNotBetween(Date value1, Date value2) {
            addCriterion("IJ_DD not between", value1, value2, "ijDd");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andExcRtoIsNull() {
            addCriterion("EXC_RTO is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIsNotNull() {
            addCriterion("EXC_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO =", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO <>", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO >", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO >=", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoLessThan(BigDecimal value) {
            addCriterion("EXC_RTO <", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO <=", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO in", values, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO not in", values, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO between", value1, value2, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO not between", value1, value2, "excRto");
            return (Criteria) this;
        }

        public Criteria andAccNoIrIsNull() {
            addCriterion("ACC_NO_IR is null");
            return (Criteria) this;
        }

        public Criteria andAccNoIrIsNotNull() {
            addCriterion("ACC_NO_IR is not null");
            return (Criteria) this;
        }

        public Criteria andAccNoIrEqualTo(String value) {
            addCriterion("ACC_NO_IR =", value, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrNotEqualTo(String value) {
            addCriterion("ACC_NO_IR <>", value, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrGreaterThan(String value) {
            addCriterion("ACC_NO_IR >", value, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NO_IR >=", value, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrLessThan(String value) {
            addCriterion("ACC_NO_IR <", value, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrLessThanOrEqualTo(String value) {
            addCriterion("ACC_NO_IR <=", value, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrLike(String value) {
            addCriterion("ACC_NO_IR like", value, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrNotLike(String value) {
            addCriterion("ACC_NO_IR not like", value, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrIn(List<String> values) {
            addCriterion("ACC_NO_IR in", values, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrNotIn(List<String> values) {
            addCriterion("ACC_NO_IR not in", values, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrBetween(String value1, String value2) {
            addCriterion("ACC_NO_IR between", value1, value2, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIrNotBetween(String value1, String value2) {
            addCriterion("ACC_NO_IR not between", value1, value2, "accNoIr");
            return (Criteria) this;
        }

        public Criteria andAccNoIpIsNull() {
            addCriterion("ACC_NO_IP is null");
            return (Criteria) this;
        }

        public Criteria andAccNoIpIsNotNull() {
            addCriterion("ACC_NO_IP is not null");
            return (Criteria) this;
        }

        public Criteria andAccNoIpEqualTo(String value) {
            addCriterion("ACC_NO_IP =", value, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpNotEqualTo(String value) {
            addCriterion("ACC_NO_IP <>", value, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpGreaterThan(String value) {
            addCriterion("ACC_NO_IP >", value, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NO_IP >=", value, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpLessThan(String value) {
            addCriterion("ACC_NO_IP <", value, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpLessThanOrEqualTo(String value) {
            addCriterion("ACC_NO_IP <=", value, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpLike(String value) {
            addCriterion("ACC_NO_IP like", value, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpNotLike(String value) {
            addCriterion("ACC_NO_IP not like", value, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpIn(List<String> values) {
            addCriterion("ACC_NO_IP in", values, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpNotIn(List<String> values) {
            addCriterion("ACC_NO_IP not in", values, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpBetween(String value1, String value2) {
            addCriterion("ACC_NO_IP between", value1, value2, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoIpNotBetween(String value1, String value2) {
            addCriterion("ACC_NO_IP not between", value1, value2, "accNoIp");
            return (Criteria) this;
        }

        public Criteria andAccNoChkIsNull() {
            addCriterion("ACC_NO_CHK is null");
            return (Criteria) this;
        }

        public Criteria andAccNoChkIsNotNull() {
            addCriterion("ACC_NO_CHK is not null");
            return (Criteria) this;
        }

        public Criteria andAccNoChkEqualTo(String value) {
            addCriterion("ACC_NO_CHK =", value, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkNotEqualTo(String value) {
            addCriterion("ACC_NO_CHK <>", value, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkGreaterThan(String value) {
            addCriterion("ACC_NO_CHK >", value, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NO_CHK >=", value, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkLessThan(String value) {
            addCriterion("ACC_NO_CHK <", value, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkLessThanOrEqualTo(String value) {
            addCriterion("ACC_NO_CHK <=", value, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkLike(String value) {
            addCriterion("ACC_NO_CHK like", value, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkNotLike(String value) {
            addCriterion("ACC_NO_CHK not like", value, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkIn(List<String> values) {
            addCriterion("ACC_NO_CHK in", values, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkNotIn(List<String> values) {
            addCriterion("ACC_NO_CHK not in", values, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkBetween(String value1, String value2) {
            addCriterion("ACC_NO_CHK between", value1, value2, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andAccNoChkNotBetween(String value1, String value2) {
            addCriterion("ACC_NO_CHK not between", value1, value2, "accNoChk");
            return (Criteria) this;
        }

        public Criteria andExcRtoEIsNull() {
            addCriterion("EXC_RTO_E is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoEIsNotNull() {
            addCriterion("EXC_RTO_E is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoEEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_E =", value, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoENotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_E <>", value, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoEGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO_E >", value, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_E >=", value, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoELessThan(BigDecimal value) {
            addCriterion("EXC_RTO_E <", value, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoELessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_E <=", value, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoEIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_E in", values, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoENotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_E not in", values, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_E between", value1, value2, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_E not between", value1, value2, "excRtoE");
            return (Criteria) this;
        }

        public Criteria andExcRtoIIsNull() {
            addCriterion("EXC_RTO_I is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIIsNotNull() {
            addCriterion("EXC_RTO_I is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_I =", value, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoINotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_I <>", value, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoIGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO_I >", value, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoIGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_I >=", value, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoILessThan(BigDecimal value) {
            addCriterion("EXC_RTO_I <", value, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoILessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_I <=", value, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoIIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_I in", values, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoINotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_I not in", values, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoIBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_I between", value1, value2, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoINotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_I not between", value1, value2, "excRtoI");
            return (Criteria) this;
        }

        public Criteria andExcRtoOIsNull() {
            addCriterion("EXC_RTO_O is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoOIsNotNull() {
            addCriterion("EXC_RTO_O is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoOEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_O =", value, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoONotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_O <>", value, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoOGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO_O >", value, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoOGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_O >=", value, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoOLessThan(BigDecimal value) {
            addCriterion("EXC_RTO_O <", value, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoOLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_O <=", value, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoOIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_O in", values, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoONotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_O not in", values, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoOBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_O between", value1, value2, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andExcRtoONotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_O not between", value1, value2, "excRtoO");
            return (Criteria) this;
        }

        public Criteria andIdSgtIsNull() {
            addCriterion("ID_SGT is null");
            return (Criteria) this;
        }

        public Criteria andIdSgtIsNotNull() {
            addCriterion("ID_SGT is not null");
            return (Criteria) this;
        }

        public Criteria andIdSgtEqualTo(String value) {
            addCriterion("ID_SGT =", value, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtNotEqualTo(String value) {
            addCriterion("ID_SGT <>", value, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtGreaterThan(String value) {
            addCriterion("ID_SGT >", value, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtGreaterThanOrEqualTo(String value) {
            addCriterion("ID_SGT >=", value, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtLessThan(String value) {
            addCriterion("ID_SGT <", value, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtLessThanOrEqualTo(String value) {
            addCriterion("ID_SGT <=", value, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtLike(String value) {
            addCriterion("ID_SGT like", value, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtNotLike(String value) {
            addCriterion("ID_SGT not like", value, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtIn(List<String> values) {
            addCriterion("ID_SGT in", values, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtNotIn(List<String> values) {
            addCriterion("ID_SGT not in", values, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtBetween(String value1, String value2) {
            addCriterion("ID_SGT between", value1, value2, "idSgt");
            return (Criteria) this;
        }

        public Criteria andIdSgtNotBetween(String value1, String value2) {
            addCriterion("ID_SGT not between", value1, value2, "idSgt");
            return (Criteria) this;
        }

        public Criteria andDepIsNull() {
            addCriterion("DEP is null");
            return (Criteria) this;
        }

        public Criteria andDepIsNotNull() {
            addCriterion("DEP is not null");
            return (Criteria) this;
        }

        public Criteria andDepEqualTo(String value) {
            addCriterion("DEP =", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotEqualTo(String value) {
            addCriterion("DEP <>", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThan(String value) {
            addCriterion("DEP >", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThanOrEqualTo(String value) {
            addCriterion("DEP >=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThan(String value) {
            addCriterion("DEP <", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThanOrEqualTo(String value) {
            addCriterion("DEP <=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLike(String value) {
            addCriterion("DEP like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotLike(String value) {
            addCriterion("DEP not like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepIn(List<String> values) {
            addCriterion("DEP in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotIn(List<String> values) {
            addCriterion("DEP not in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepBetween(String value1, String value2) {
            addCriterion("DEP between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotBetween(String value1, String value2) {
            addCriterion("DEP not between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andDeproNoIsNull() {
            addCriterion("DEPRO_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeproNoIsNotNull() {
            addCriterion("DEPRO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeproNoEqualTo(String value) {
            addCriterion("DEPRO_NO =", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoNotEqualTo(String value) {
            addCriterion("DEPRO_NO <>", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoGreaterThan(String value) {
            addCriterion("DEPRO_NO >", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEPRO_NO >=", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoLessThan(String value) {
            addCriterion("DEPRO_NO <", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoLessThanOrEqualTo(String value) {
            addCriterion("DEPRO_NO <=", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoLike(String value) {
            addCriterion("DEPRO_NO like", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoNotLike(String value) {
            addCriterion("DEPRO_NO not like", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoIn(List<String> values) {
            addCriterion("DEPRO_NO in", values, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoNotIn(List<String> values) {
            addCriterion("DEPRO_NO not in", values, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoBetween(String value1, String value2) {
            addCriterion("DEPRO_NO between", value1, value2, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoNotBetween(String value1, String value2) {
            addCriterion("DEPRO_NO not between", value1, value2, "deproNo");
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