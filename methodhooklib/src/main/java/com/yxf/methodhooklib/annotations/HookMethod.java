package com.yxf.methodhooklib.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author miqt
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface HookMethod {
}
