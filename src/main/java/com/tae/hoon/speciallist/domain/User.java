package com.tae.hoon.speciallist.domain;

import com.tae.hoon.speciallist.Enum.Gender;
import com.tae.hoon.speciallist.Enum.GenderConvertor;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "SEQ")
    private Long seq;

    @Column(name = "GENDER")
    @Convert(converter = GenderConvertor.class)
    private Gender gender;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "COMPANY_SEQ")
    private Company company;
}
