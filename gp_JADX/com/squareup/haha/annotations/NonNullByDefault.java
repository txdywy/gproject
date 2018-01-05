package com.squareup.haha.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface NonNullByDefault {
}
