package com.google.common.p415b;

import com.google.common.p414a.C6925j;
import com.google.common.p414a.C6926a;

public abstract class ak implements Iterable {
    public final C6925j f34283a = C6926a.f34255a;

    protected ak() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Object obj = 1;
        for (Object append : (Iterable) this.f34283a.mo5845a(this)) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            obj = null;
            stringBuilder.append(append);
        }
        return stringBuilder.append(']').toString();
    }
}
