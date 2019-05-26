package com.lisg.rw.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: sharding-jdbc-rw
 * @description: user
 * @author: Reagan Li
 * @create: 2019-05-25 22:16
 **/

@Entity
@Table(name="user")
@Data
public class User {

    @Id
    private Long id;

    private String city;

    private String name;
}
