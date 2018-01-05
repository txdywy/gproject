package com.google.android.finsky.ak;

import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class C1208j implements C1207b {
    public final /* synthetic */ Object f7329a;

    C1208j(Object obj) {
        this.f7329a = obj;
    }

    public final /* synthetic */ Object mo1528a(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            FinskyLog.m21669e("Got %d records from primary key(%s) lookup", Integer.valueOf(list.size()), this.f7329a);
        }
        return list.get(0);
    }
}
