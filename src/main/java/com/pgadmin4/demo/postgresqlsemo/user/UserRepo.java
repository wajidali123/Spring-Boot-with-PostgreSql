package com.pgadmin4.demo.postgresqlsemo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<UserEntity, Integer> {
}
