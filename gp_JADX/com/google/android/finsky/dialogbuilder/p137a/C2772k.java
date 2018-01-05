package com.google.android.finsky.dialogbuilder.p137a;

import com.google.android.finsky.dialogbuilder.layout.C1939f;
import com.google.android.finsky.dialogbuilder.p154b.C2788c;
import com.google.android.finsky.utils.C4683n;

final class C2772k implements C1939f {
    public final /* synthetic */ C2771j f15052a;

    C2772k(C2771j c2771j) {
        this.f15052a = c2771j;
    }

    public final void mo2545Y() {
        if (this.f15052a.f15050d.m14910a()) {
            this.f15052a.f15051e.setVisibility(4);
        }
        C2788c c2788c = this.f15052a.f15049c;
        String str = this.f15052a.f15048b.c;
        String str2 = this.f15052a.f15048b.d;
        c2788c.f15083c = this.f15052a.f15050d.getCalendarDate();
        c2788c.f15081a.m14868a(str2, c2788c.f15083c != null);
        if (c2788c.f15083c == null) {
            c2788c.f15082b.m14869a(str);
        } else {
            c2788c.f15082b.m14870a(str, C4683n.m21823a(c2788c.f15083c.getTime()));
        }
    }
}
