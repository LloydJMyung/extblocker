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
public class CustomExt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 7, nullable = false)
    private String name;

    @Builder
    public CustomExt(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
