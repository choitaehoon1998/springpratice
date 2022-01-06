package com.tae.hoon.speciallist.repository;

import com.tae.hoon.speciallist.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserQueryRepository {

}
