package com.google.common.p415b;

import java.io.Serializable;

public abstract class ag implements Serializable, Comparable {
    public final Comparable f34280a;

    ag(Comparable comparable) {
        this.f34280a = comparable;
    }

    abstract void mo5873a(StringBuilder stringBuilder);

    abstract boolean mo5874a(Comparable comparable);

    abstract void mo5875b(StringBuilder stringBuilder);

    public abstract int hashCode();

    public int mo5871a(ag agVar) {
        if (agVar == aj.f34282b) {
            return 1;
        }
        if (agVar == ah.f34281b) {
            return -1;
        }
        int b = bw.m31776b(this.f34280a, agVar.f34280a);
        if (b != 0) {
            return b;
        }
        boolean z = this instanceof ai;
        if (z == (agVar instanceof ai)) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    public Comparable mo5872a() {
        return this.f34280a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ag)) {
            return false;
        }
        try {
            if (mo5871a((ag) obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        }
    }

    static ag m31702b(Comparable comparable) {
        return new ai(comparable);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return mo5871a((ag) obj);
    }
}
