package com.squareup.haha.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface VisibleForTesting {

    public enum Visibility {
        PROTECTED,
        PACKAGE,
        PRIVATE
    }

    Visibility visibility() default Visibility.PRIVATE;
}
