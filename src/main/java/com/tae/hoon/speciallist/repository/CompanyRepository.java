package com.tae.hoon.speciallist.repository;

import com.tae.hoon.speciallist.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long>, CompanyQueryRepository {
}
