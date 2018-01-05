package com.google.archivepatcher.applier;

import com.google.archivepatcher.p406a.C6876l;
import com.google.archivepatcher.p406a.C6879o;

public final class C6884b {
    public final C6876l f33992a;
    public final C6879o f33993b;
    public final C6879o f33994c;
    public final long f33995d;

    public C6884b(C6876l c6876l, C6879o c6879o, C6879o c6879o2, long j) {
        this.f33992a = c6876l;
        this.f33993b = c6879o;
        this.f33994c = c6879o2;
        this.f33995d = j;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f33993b == null ? 0 : this.f33993b.hashCode()) + (((this.f33994c == null ? 0 : this.f33994c.hashCode()) + 31) * 31)) * 31) + ((int) (this.f33995d ^ (this.f33995d >>> 32)))) * 31;
        if (this.f33992a != null) {
            i = this.f33992a.hashCode();
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C6884b c6884b = (C6884b) obj;
        if (this.f33994c == null) {
            if (c6884b.f33994c != null) {
                return false;
            }
        } else if (!this.f33994c.equals(c6884b.f33994c)) {
            return false;
        }
        if (this.f33993b == null) {
            if (c6884b.f33993b != null) {
                return false;
            }
        } else if (!this.f33993b.equals(c6884b.f33993b)) {
            return false;
        }
        if (this.f33995d != c6884b.f33995d) {
            return false;
        }
        if (this.f33992a != c6884b.f33992a) {
            return false;
        }
        return true;
    }
}
