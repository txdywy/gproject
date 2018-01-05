package com.google.android.finsky.wear;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.scheduler.p238b.C4026d;

public class bl extends ah {
    protected final boolean mo1168a(C4026d c4026d) {
        C4025c d = c4026d.m18859d();
        Context context = C1473m.f7980a.f7981b;
        C1473m.f7980a.al().m22452a(context.getApplicationContext(), ak.m22447a(context, d.m18854b("node_id"), d.m18854b("hygiene_reason"), d.m18852a("is_foreground")));
        return false;
    }

    protected final boolean k_(int i) {
        return false;
    }
}
