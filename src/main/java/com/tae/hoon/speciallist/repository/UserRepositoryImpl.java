package com.tae.hoon.speciallist.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tae.hoon.speciallist.domain.QUser;
import com.tae.hoon.speciallist.domain.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserQueryRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<User> findByNameUsingQueryDsl(String name) {
        QUser user = QUser.user;
        return queryFactory.selectFrom(user)
                .select(user)
                .where(user.name.eq(name)).fetch();
    }
}
