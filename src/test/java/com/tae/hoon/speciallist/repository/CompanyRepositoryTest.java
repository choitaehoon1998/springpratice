package com.tae.hoon.speciallist.repository;

import com.tae.hoon.speciallist.domain.Company;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyRepositoryTest {

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
    }

    @AfterEach
    void tearDown() {
        companyRepository.deleteAll();
    }
}