package com.tae.hoon.speciallist.repository;

import com.tae.hoon.speciallist.domain.User;

import java.util.List;

public interface UserQueryRepository {
    List<User> findByNameUsingQueryDsl(String name);

}
