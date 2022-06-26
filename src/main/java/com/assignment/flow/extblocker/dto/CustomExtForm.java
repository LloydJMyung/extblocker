package com.assignment.flow.extblocker.dto;

import com.assignment.flow.extblocker.entity.CustomExt;

public class CustomExtForm {
    private String name;

    public CustomExt toEntity() {
        return CustomExt.builder()
            .id(null)
            .name(name)
            .build();
    }
}
