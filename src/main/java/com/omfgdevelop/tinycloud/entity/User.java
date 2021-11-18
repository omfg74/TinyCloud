package com.omfgdevelop.tinycloud.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tinycloud_user")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @OneToMany
    private Set<Folder> folders;

    @OneToMany
    private Set<FileEntity> files;

    @OneToMany
    private Set<Role> roles;
}
