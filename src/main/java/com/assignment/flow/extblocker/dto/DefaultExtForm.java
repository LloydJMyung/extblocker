package com.assignment.flow.extblocker.dto;

import com.assignment.flow.extblocker.entity.DefaultExt;
import lombok.Data;

@Data
public class DefaultExtForm {
    private String name;
    private boolean toggle;

    public DefaultExt toEntity() {
        return DefaultExt.builder()
                .id(null)
                .name(name)
                .toggle(toggle)
                .build();
    }

}
