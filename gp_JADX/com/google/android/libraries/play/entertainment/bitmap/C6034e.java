package com.google.android.libraries.play.entertainment.bitmap;

import android.graphics.Bitmap;
import com.google.android.libraries.play.entertainment.p344d.C6033a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.lang.ref.ReferenceQueue;

public final class C6034e implements C6033a {
    public static final C6090b f30136a = C6090b.m28050a();
    public static volatile ReferenceQueue f30137e;
    public final C2986a f30138b;
    public final C6030b f30139c;
    public final C6035f f30140d;

    C6034e(C2986a c2986a, C6030b c6030b, boolean z) {
        this.f30138b = c2986a;
        this.f30139c = c6030b;
        this.f30140d = new C6035f(this, f30137e, z, c6030b.f30133b);
    }

    public final Bitmap m27929b() {
        C6116b.m28104a(!this.f30140d.m27931a(), "Cannot reuse a released BitmapReference");
        return this.f30139c.f30132a;
    }

    public final void m27930c() {
        boolean z = true;
        C6116b.m28104a(this.f30140d.m27933b(), "BitmapReference released multiple times");
        C2986a c2986a = this.f30138b;
        C6030b c6030b = this.f30139c;
        synchronized (c2986a.f15670c) {
            if (c6030b.f30135d <= 0) {
                z = false;
            }
            C6116b.m28103a(z);
            c6030b.f30135d--;
            C2986a.f15669b.m28054a("decremented ref count for entry %s", c6030b);
            if (c6030b.f30135d == 0) {
                c2986a.mo3220c();
            }
        }
    }

    public final void mo5263a() {
        m27930c();
    }

    public static void m27927d() {
        ReferenceQueue referenceQueue = f30137e;
        if (referenceQueue != null) {
            while (true) {
                C6035f c6035f = (C6035f) referenceQueue.poll();
                if (c6035f == null) {
                    return;
                }
                if (!c6035f.m27931a()) {
                    f30136a.m28058b(null, "Leaked BitmapReference for a bitmap with (historic) key %s", c6035f.f30141a);
                }
            }
        }
    }

    static {
        Object obj = new Object();
    }
}
