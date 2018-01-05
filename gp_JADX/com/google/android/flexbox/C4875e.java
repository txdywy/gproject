package com.google.android.flexbox;

final class C4875e implements Comparable {
    public int f25228a;
    public int f25229b;

    C4875e() {
    }

    public final String toString() {
        return "Order{order=" + this.f25229b + ", index=" + this.f25228a + '}';
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C4875e c4875e = (C4875e) obj;
        if (this.f25229b != c4875e.f25229b) {
            return this.f25229b - c4875e.f25229b;
        }
        return this.f25228a - c4875e.f25228a;
    }
}
