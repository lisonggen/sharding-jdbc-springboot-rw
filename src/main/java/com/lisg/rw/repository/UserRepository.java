package com.lisg.rw.repository;

import com.lisg.rw.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: sharding-jdbc-rw
 * @description: UserRepository
 * @author: Reagan Li
 * @create: 2019-05-25 22:18
 **/
public interface UserRepository extends JpaRepository<User,Long> {
}
