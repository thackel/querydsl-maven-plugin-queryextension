package com.querydsl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.querydsl.test.domain.QSomeEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QdsltestApplicationTests {

	@Test
	public void contextLoads() {
		QSomeEntity.someEntity.foo.isFoo();
	}

}
