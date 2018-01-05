package com.squareup.haha.perflib;

import com.squareup.haha.annotations.NonNull;
import java.util.Arrays;

public final class Field {
    @NonNull
    public final String mName;
    @NonNull
    public final Type mType;

    public Field(@NonNull Type type, @NonNull String str) {
        this.mType = type;
        this.mName = str;
    }

    @NonNull
    public final Type getType() {
        return this.mType;
    }

    @NonNull
    public final String getName() {
        return this.mName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return false;
        }
        Field field = (Field) obj;
        if (this.mType == field.mType && this.mName.equals(field.mName)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.mType, this.mName});
    }
}
