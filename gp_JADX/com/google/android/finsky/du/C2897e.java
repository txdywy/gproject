package com.google.android.finsky.du;

import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.C2719i;

final class C2897e implements Runnable {
    public final /* synthetic */ String f15406a;
    public final /* synthetic */ C2896d f15407b;

    C2897e(C2896d c2896d, String str) {
        this.f15407b = c2896d;
        this.f15406a = str;
    }

    public final void run() {
        C2896d c2896d = this.f15407b;
        String str = this.f15406a;
        if (((C2233o) c2896d.f15403e.mo1a()).m11650a(str)) {
            c2896d.f15405g = new C2719i(((C1287h) c2896d.f15401c.mo1a()).mo2015a(), C1289l.m7694a(str));
            c2896d.f15405g.m11918a(new C2898f(c2896d, str));
        }
    }
}
