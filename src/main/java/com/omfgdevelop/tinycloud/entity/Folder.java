package com.omfgdevelop.tinycloud.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "folder")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "path")
    private String path;

    @ManyToOne(targetEntity = User.class)
    private User user;
}
