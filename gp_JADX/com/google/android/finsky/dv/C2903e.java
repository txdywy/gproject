package com.google.android.finsky.dv;

import java.util.HashSet;
import java.util.Set;

public final class C2903e {
    public boolean f15437a;
    public boolean f15438b;
    public boolean f15439c;
    public boolean f15440d;
    public Set f15441e = new HashSet();

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2903e)) {
            return false;
        }
        C2903e c2903e = (C2903e) obj;
        if (this.f15437a == c2903e.f15437a && this.f15438b == c2903e.f15438b && this.f15439c == c2903e.f15439c && this.f15440d == c2903e.f15440d && this.f15441e.equals(c2903e.f15441e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        if (this.f15437a) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = (i * 1000) + ((this.f15438b ? 1 : 0) * 10000);
        if (this.f15439c) {
            i = 1;
        } else {
            i = 0;
        }
        i = (i * 100000) + i3;
        if (!this.f15440d) {
            i2 = 0;
        }
        i += i2 * 1000000;
        i2 = i;
        for (String hashCode : this.f15441e) {
            i2 = (hashCode.hashCode() % 1000) + i2;
        }
        return i2;
    }
}
