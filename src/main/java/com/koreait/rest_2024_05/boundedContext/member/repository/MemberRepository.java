package com.koreait.rest_2024_05.boundedContext.member.repository;

import com.koreait.rest_2024_05.boundedContext.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}