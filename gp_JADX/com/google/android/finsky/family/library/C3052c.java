package com.google.android.finsky.family.library;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.stream.base.C1169s;

final class C3052c implements OnClickListener {
    public final /* synthetic */ C3050a f15926a;

    C3052c(C3050a c3050a) {
        this.f15926a = c3050a;
    }

    public final void onClick(View view) {
        C1169s c1169s = this.f15926a;
        c1169s.f15923b.mo2311b(C0954a.aD);
        c1169s.f15924c = true;
        c1169s.C.mo4088b(c1169s, 0, 1);
        this.f15926a.f15922a.onClick(view);
    }
}
