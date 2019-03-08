package org.oasis.model;

import java.io.Serializable;

public class CsOvdReason implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_ovd_reason.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_ovd_reason.case_id
     *
     * @mbg.generated
     */
    private Integer caseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_ovd_reason.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_ovd_reason.reason
     *
     * @mbg.generated
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_ovd_reason.create_time
     *
     * @mbg.generated
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_ovd_reason.update_time
     *
     * @mbg.generated
     */
    private Long updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cs_ovd_reason
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_ovd_reason.id
     *
     * @return the value of cs_ovd_reason.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_ovd_reason.id
     *
     * @param id the value for cs_ovd_reason.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_ovd_reason.case_id
     *
     * @return the value of cs_ovd_reason.case_id
     *
     * @mbg.generated
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_ovd_reason.case_id
     *
     * @param caseId the value for cs_ovd_reason.case_id
     *
     * @mbg.generated
     */
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_ovd_reason.type
     *
     * @return the value of cs_ovd_reason.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_ovd_reason.type
     *
     * @param type the value for cs_ovd_reason.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_ovd_reason.reason
     *
     * @return the value of cs_ovd_reason.reason
     *
     * @mbg.generated
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_ovd_reason.reason
     *
     * @param reason the value for cs_ovd_reason.reason
     *
     * @mbg.generated
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_ovd_reason.create_time
     *
     * @return the value of cs_ovd_reason.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_ovd_reason.create_time
     *
     * @param createTime the value for cs_ovd_reason.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_ovd_reason.update_time
     *
     * @return the value of cs_ovd_reason.update_time
     *
     * @mbg.generated
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_ovd_reason.update_time
     *
     * @param updateTime the value for cs_ovd_reason.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_ovd_reason
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", caseId=").append(caseId);
        sb.append(", type=").append(type);
        sb.append(", reason=").append(reason);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}