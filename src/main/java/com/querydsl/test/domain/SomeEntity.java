package com.querydsl.test.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.querydsl.core.annotations.QueryEntity;

@Entity
@QueryEntity
public class SomeEntity {

	@Id
	private Long id;

	private String foo;
}
