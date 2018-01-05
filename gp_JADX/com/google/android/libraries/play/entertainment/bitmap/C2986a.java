package com.google.android.libraries.play.entertainment.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

public abstract class C2986a {
    public static final C6090b f15669b = C6090b.m28050a();
    public final Object f15670c = new Object();

    public abstract C6030b mo3216a();

    public abstract C6030b mo3217a(Object obj);

    public abstract void mo3218a(C6030b c6030b, Object obj);

    public abstract void mo3219b();

    public abstract void mo3220c();

    public final C6034e m15430b(Object obj) {
        C6034e a;
        C6116b.m28100a(obj);
        C6034e.m27927d();
        synchronized (this.f15670c) {
            C6030b a2 = mo3217a(obj);
            if (a2 != null) {
                f15669b.m28054a("get() - found bitmap for key: %s, entry: %s", obj, a2);
                a = m15425a(a2);
            } else {
                f15669b.m28054a("get() - no bitmap found for key: %s", obj);
                a = null;
            }
        }
        return a;
    }

    public final C6034e m15428a(int i, int i2, Config config, boolean z) {
        C6034e a;
        boolean z2 = true;
        if (i <= 0 || i2 <= 0) {
            z2 = false;
        }
        C6116b.m28106b(z2);
        C6116b.m28100a((Object) config);
        C6034e.m27927d();
        synchronized (this.f15670c) {
            mo3216a();
            if (z) {
                f15669b.m28054a("Alloc %s", new C6030b(Bitmap.createBitmap(i, i2, config)));
                mo3219b();
                a = m15425a(r2);
            } else {
                a = null;
            }
        }
        return a;
    }

    private final C6034e m15425a(C6030b c6030b) {
        c6030b.f30135d++;
        return new C6034e(this, c6030b, c6030b.f30134c);
    }
}
