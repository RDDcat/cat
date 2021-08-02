package com.weeklycat.cat.member.repository;

import com.weeklycat.cat.member.domain.Member;

import java.util.List;
import java.util.Optional;

public class LocalMemberRepository implements MemberRepository{

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
