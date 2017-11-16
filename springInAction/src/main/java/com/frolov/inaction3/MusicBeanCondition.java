package com.frolov.inaction3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MusicBeanCondition implements Condition{
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata data) {
		return true;
	}
}
