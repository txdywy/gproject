package com.google.common.p415b;

import java.util.Set;

final class aa extends C6941z implements Set {
    aa(C6942y c6942y) {
        super(c6942y);
    }

    public final int hashCode() {
        int i = 0;
        for (Object next : this) {
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            } else {
                hashCode = 0;
            }
            i = ((i + hashCode) ^ -1) ^ -1;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        return ca.m31781a((Set) this, obj);
    }
}
