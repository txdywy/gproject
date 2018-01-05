package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.p167r.C3961b;
import java.util.Comparator;

final class ac implements Comparator {
    ac() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C3961b c3961b = (C3961b) obj;
        C3961b c3961b2 = (C3961b) obj2;
        if (c3961b.f19991i != c3961b2.f19991i) {
            return c3961b.f19991i - c3961b2.f19991i;
        }
        return c3961b.f19992j - c3961b2.f19992j;
    }
}
