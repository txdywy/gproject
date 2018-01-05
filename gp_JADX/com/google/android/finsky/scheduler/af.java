package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C2919a;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.scheduler.p238b.C4026d;
import java.util.ArrayList;
import java.util.List;

final class af implements C2919a {
    public final /* synthetic */ aa f20197a;

    af(aa aaVar) {
        this.f20197a = aaVar;
    }

    public final /* synthetic */ C4809e mo3198a(Object obj) {
        List<C4026d> list = (List) obj;
        List arrayList = new ArrayList();
        for (C4026d c4026d : list) {
            if (c4026d.f20249a.f20183k) {
                arrayList.add(c4026d.m18861f().m18870a(false).m18863a());
            }
        }
        if (arrayList.isEmpty()) {
            return this.f20197a.f20196c.mo4401a(Boolean.valueOf(true));
        }
        return this.f20197a.f20194a.mo1522a(arrayList).mo4397a(new ag());
    }
}
