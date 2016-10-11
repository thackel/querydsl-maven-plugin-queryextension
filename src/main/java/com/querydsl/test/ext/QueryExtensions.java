package com.querydsl.test.ext;

import com.querydsl.core.annotations.QueryDelegate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.StringPath;

public class QueryExtensions {

	@QueryDelegate(String.class)
	public static BooleanExpression isFoo(StringPath path) {
		return path.eq("foo");
	}

}
