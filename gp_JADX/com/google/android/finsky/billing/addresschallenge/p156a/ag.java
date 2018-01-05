package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.Comparator;
import java.util.Map;

final class ag implements Comparator {
    public final /* synthetic */ Map f8827a;

    ag(Map map) {
        this.f8827a = map;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Integer) this.f8827a.get((C1709d) obj)).intValue() - ((Integer) this.f8827a.get((C1709d) obj2)).intValue();
    }
}
