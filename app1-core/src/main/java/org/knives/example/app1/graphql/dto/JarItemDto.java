package org.knives.example.app1.graphql.dto;

public class JarItemDto {
    String desc;
    String code;

    public JarItemDto() {
    }

    public JarItemDto(String code, String desc) {
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
