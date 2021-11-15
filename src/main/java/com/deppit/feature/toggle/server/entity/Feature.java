package com.deppit.feature.toggle.server.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "feature", schema = "deppit")
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "name", nullable = false)
    private String name;
    @Basic
    @Column(name = "enable", nullable = false)
    private Boolean enable;
}