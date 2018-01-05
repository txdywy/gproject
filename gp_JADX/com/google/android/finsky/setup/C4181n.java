package com.google.android.finsky.setup;

import android.content.Context;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p108z.C4819c;
import java.util.concurrent.Executors;

public final class C4181n {
    public final Context f21102a;
    public final C4819c f21103b;
    public final C2320a f21104c;

    public C4181n(Context context, C4817d c4817d, C2320a c2320a) {
        this.f21102a = context;
        this.f21103b = c4817d.mo4399a(Executors.newSingleThreadExecutor());
        this.f21104c = c2320a;
    }
}
