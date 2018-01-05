package com.google.android.finsky.appdiscoveryservice.p128b;

import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import java.util.Comparator;
import java.util.Map;

final class C1319l implements Comparator {
    public final /* synthetic */ Map f7819a;

    C1319l(Map map) {
        this.f7819a = map;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((String) this.f7819a.get(((InstantAppInfo) obj).m17188a())).compareTo((String) this.f7819a.get(((InstantAppInfo) obj2).m17188a()));
    }
}
