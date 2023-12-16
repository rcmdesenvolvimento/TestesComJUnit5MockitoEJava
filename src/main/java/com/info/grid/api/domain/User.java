package com.info.grid.api.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 70)
    private String name;

    @Column(length = 100, unique = true)
    private String email;

    @Column(length = 50)
    private String password;

}
