package org.knives.example.app1.graphql.dto;

public class WarItemDto {
    String desc;
    String code;

    public WarItemDto() {
    }

    public WarItemDto(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
