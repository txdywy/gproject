package com.google.android.finsky.p226m;

import android.content.Context;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C3741b {
    public final C3744e f18886a;
    public final Map f18887b = new HashMap();
    public final List f18888c = new ArrayList();
    public long f18889d = 0;

    public C3741b(C3744e c3744e) {
        this.f18886a = c3744e;
    }

    public final void m17619a(C3742c c3742c) {
        this.f18888c.add(c3742c);
    }

    public final void m17621b(C3742c c3742c) {
        this.f18888c.remove(c3742c);
    }

    public final C3740a m17617a(String str) {
        return (C3740a) this.f18887b.get(str);
    }

    public final boolean m17620a() {
        return (this.f18887b == null || this.f18887b.size() == 0) ? false : true;
    }

    public final void m17618a(Context context, C2495w c2495w) {
        if ((this.f18889d < System.currentTimeMillis() - ((Long) C0955b.hJ.m28964b()).longValue() ? 1 : 0) != 0) {
            this.f18889d = System.currentTimeMillis();
            bb.m21792a(new C3743d(this, context, c2495w), new Void[0]);
        }
    }
}
