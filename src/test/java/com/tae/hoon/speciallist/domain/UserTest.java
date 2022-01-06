package com.tae.hoon.speciallist.domain;

import com.tae.hoon.speciallist.Enum.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("User 의 getName() 메소드 테스트")
    public void getName() {
        final User user = User.builder().name("최태훈").age(26).gender(Gender.MAN).build();
        final String name = user.getName();

        assertEquals("최태훈", name);
    }

    @Test
    @DisplayName("User 의 getAge() 메소드 테스트")
    public void getAge() {
        final User user = User.builder().name("최태훈").age(26).gender(Gender.MAN).build();
        final int age = user.getAge();

        assertEquals(26, age);
    }

    @Test
    @DisplayName("User 의 getGender() 메소드 테스트")
    public void getGender() {
        final User user = User.builder().name("최태훈").age(26).gender(Gender.MAN).build();
        final Gender gender = user.getGender();
        assertEquals(Gender.MAN, gender);
    }

}