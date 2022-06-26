package com.assignment.flow.extblocker.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@NoArgsConstructor
@Entity
public class DefaultExt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 7, nullable = false)
    private String name;

    @Column(length = 1, nullable = false)
    private boolean toggle;

    @Builder
    public DefaultExt(Long id, String name, boolean toggle) {
        this.id = id;
        this.name = name;
        this.toggle = toggle;
    }

}
