package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5588e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class C5067h {
    public final Map f25866a = Collections.synchronizedMap(new WeakHashMap());
    public final Map f25867b = Collections.synchronizedMap(new WeakHashMap());

    final void m23596a(boolean z, Status status) {
        synchronized (this.f25866a) {
            Map hashMap = new HashMap(this.f25866a);
        }
        synchronized (this.f25867b) {
            Map hashMap2 = new HashMap(this.f25867b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((ct) entry.getKey()).m23074c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C5588e) entry2.getKey()).m26584b(new ApiException(status));
            }
        }
    }
}
