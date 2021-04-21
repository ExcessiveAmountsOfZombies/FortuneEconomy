package com.epherical.fortune.impl.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IntegerValue {
    int value();
    String configPath() default "";
    String comment() default "";
    String[] oldVars() default "";
}
