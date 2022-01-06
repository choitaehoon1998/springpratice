package com.tae.hoon.speciallist.repository;

import com.tae.hoon.speciallist.Enum.Gender;
import com.tae.hoon.speciallist.domain.Company;
import com.tae.hoon.speciallist.domain.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CompanyRepository companyRepository;

    @BeforeEach
    void setUp() {

        Company company = Company
                .builder()
                .seq(1L)
                .name("회사1")
                .build();
        companyRepository.save(company);

        User user = User.builder()
                .seq(1L)
                .name("최태훈")
                .age(26)
                .company(company)
                .gender(Gender
                        .MAN)
                .build();
        userRepository.save(user);
    }

    @AfterEach
    void tearDown() {
        userRepository.deleteAll();
        companyRepository.deleteAll();
    }

    @Test
    @DisplayName("Seq 저장되는지 테스트")
    void saveSeqTest() {
        List<User> userList = userRepository.findAll();

        User savedUser = userList.get(0);
        assertEquals(1L, savedUser.getSeq());
    }

    @Test
    @DisplayName("이름 저장되는지 테스트")
    void saveNameTest() {
        List<User> userList = userRepository.findAll();

        User savedUser = userList.get(0);
        assertEquals("최태훈", savedUser.getName());
    }

    @Test
    @DisplayName("나이 저장되는지 테스트")
    void saveAgeTest() {
        List<User> userList = userRepository.findAll();
        User savedUser = userList.get(0);
        assertEquals(26, savedUser.getAge());
    }

    @Test
    @DisplayName("성별 저장되는지 테스트")
    void saveGenderTest() {
        List<User> userList = userRepository.findAll();
        User savedUser = userList.get(0);
        assertEquals(Gender.MAN, savedUser.getGender());
        assertEquals(Gender.MAN.getValue(), savedUser.getGender().getValue());
        assertEquals(Gender.MAN.getCode(), savedUser.getGender().getCode());
    }

    @Test
    @DisplayName("회사 저장되는지 테스트")
    void saveCompanyTest() {
        List<User> userList = userRepository.findAll();
        User savedUser = userList.get(0);
        assertEquals(Gender.MAN, savedUser.getGender());
        assertEquals(Gender.MAN.getValue(), savedUser.getGender().getValue());
        assertEquals(Gender.MAN.getCode(), savedUser.getGender().getCode());
    }

    @Test
    @DisplayName("QueryDsl을 통한 User Name 조회 테스트")
    void queryDslUserNameSelectTest() {
        List<User> userList = userRepository.findByNameUsingQueryDsl("최태훈");
        User savedUser = userList.get(0);
        assertEquals("최태훈", savedUser.getName());
    }

}