package com.tae.hoon.speciallist.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CompanyRepositoryImpl implements CompanyQueryRepository {
    private final JPAQueryFactory queryFactory;
}
