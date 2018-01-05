package com.google.archivepatcher.p406a;

public final class C6879o implements Comparable {
    public final long f33989a;
    public final long f33990b;
    public final Object f33991c;

    public C6879o(long j, long j2, Object obj) {
        this.f33989a = j;
        this.f33990b = j2;
        this.f33991c = obj;
    }

    public final String toString() {
        long j = this.f33989a;
        long j2 = this.f33990b;
        String valueOf = String.valueOf(this.f33991c);
        return new StringBuilder(String.valueOf(valueOf).length() + 67).append("offset ").append(j).append(", length ").append(j2).append(", metadata ").append(valueOf).toString();
    }

    public final int hashCode() {
        return (((this.f33991c == null ? 0 : this.f33991c.hashCode()) + ((((int) (this.f33990b ^ (this.f33990b >>> 32))) + 31) * 31)) * 31) + ((int) (this.f33989a ^ (this.f33989a >>> 32)));
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
        C6879o c6879o = (C6879o) obj;
        if (this.f33990b != c6879o.f33990b) {
            return false;
        }
        if (this.f33991c == null) {
            if (c6879o.f33991c != null) {
                return false;
            }
        } else if (!this.f33991c.equals(c6879o.f33991c)) {
            return false;
        }
        if (this.f33989a != c6879o.f33989a) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C6879o c6879o = (C6879o) obj;
        if (this.f33989a < c6879o.f33989a) {
            return -1;
        }
        if (this.f33989a > c6879o.f33989a) {
            return 1;
        }
        return 0;
    }
}
