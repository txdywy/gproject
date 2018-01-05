package com.google.android.libraries.play.entertainment.bitmap;

import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.play.entertainment.p344d.C6038t;
import com.google.android.libraries.play.entertainment.p344d.C6054d;
import com.google.android.libraries.play.entertainment.p344d.C6061h;

final class C6043l implements C6038t {
    public final C2986a f30153a;
    public final boolean f30154b;

    C6043l(C2986a c2986a, boolean z) {
        this.f30153a = c2986a;
        this.f30154b = z;
    }

    public final C6061h mo5264a(C6061h c6061h, C6054d c6054d) {
        if (!c6061h.m27974a()) {
            return c6061h;
        }
        C6037h c6037h = (C6037h) c6061h.m27975b();
        Options options = c6037h.f30147c;
        try {
            C6034e a = this.f30153a.m15428a(options.outWidth, options.outHeight, BitmapStore.f30104b, this.f30154b);
            if (a == null) {
                return C6061h.m27973a(new NeedsAllocationException(c6037h));
            }
            c6037h.f30148d = a;
            return c6061h;
        } catch (Throwable e) {
            return C6061h.m27973a(e);
        }
    }
}
