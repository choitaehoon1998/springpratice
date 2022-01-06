package com.tae.hoon.speciallist.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@Table(name = "COMPANY")
public class Company {

    @Id
    @Column(name = "SEQ")
    private Long seq;

    @Column(name = "NAME")
    private String name;

    @OneToMany
    private List<User> users = new ArrayList<>();
}
