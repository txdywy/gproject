package org.chromium.base.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface UsedByReflection {
}
