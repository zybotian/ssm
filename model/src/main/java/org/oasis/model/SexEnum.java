package org.oasis.model;

/**
 * @author tianbo
 * @date 2019-03-06
 */
public enum SexEnum {
    MALE("男", "先生"),
    FEMALE("女", "女士"),;

    private String sex;
    private String desc;

    SexEnum(String sex, String desc) {
        this.sex = sex;
        this.desc = desc;
    }

    public String getSex() {
        return sex;
    }

    public String getDesc() {
        return desc;
    }
}
