package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.ArrayList;

final class C1721p implements Runnable {
    public C1709d f8995a;
    public final /* synthetic */ C1715j f8996b;

    public C1721p(C1715j c1715j, C1709d c1709d) {
        this.f8996b = c1715j;
        this.f8995a = c1709d;
    }

    public final void run() {
        C1715j c1715j = this.f8996b;
        C1709d c1709d = this.f8995a;
        ArrayList arrayList = c1715j.f8985v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1719n c1719n = (C1719n) obj;
            if (c1719n.f8992c == c1709d) {
                c1719n.m9607a(c1715j.m9593a(c1719n.f8992c), "");
            }
        }
    }
}
