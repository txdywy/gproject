package com.google.android.finsky.stream.controllers.p145d;

import com.google.android.finsky.stream.base.C1169s;

final class C4373g implements C4371e {
    public final /* synthetic */ C4372f f22189a;

    C4373g(C4372f c4372f) {
        this.f22189a = c4372f;
    }

    public final void mo4182a(String str) {
        C1169s c1169s = this.f22189a;
        int a = c1169s.m20490a(str);
        if (a >= 0) {
            int a2 = c1169s.mo1508a();
            c1169s.g.m14695e(a);
            c1169s.f22173F = c1169s.g.m14698m();
            if (c1169s.f22173F != 0 || c1169s.g.f14901t) {
                c1169s.C.mo4088b(c1169s, (a + 0) + 1, 1);
            } else {
                c1169s.C.mo4088b(c1169s, 0, a2);
            }
        }
    }
}
