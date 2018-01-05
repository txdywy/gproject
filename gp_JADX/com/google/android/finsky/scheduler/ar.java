package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final /* synthetic */ class ar implements C1207b {
    public final ak f20225a;

    ar(ak akVar) {
        this.f20225a = akVar;
    }

    public final Object mo1528a(Object obj) {
        ak akVar = this.f20225a;
        List list = (List) obj;
        if (list.size() == 1) {
            akVar.f20209j.m18907a(2529).m18895a((C4026d) list.get(0)).m18900b(akVar.f20206g.m13184a(null));
            if (akVar.f20200a != null) {
                akVar.f20200a.m18933b();
            } else {
                akVar.m18818c(-1);
            }
            return Boolean.valueOf(true);
        }
        if (list.size() > 1) {
            FinskyLog.m21669e("More than expected number of rows (1) deleted", new Object[0]);
        }
        return Boolean.valueOf(false);
    }
}
