package com.google.android.libraries.play.entertainment.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.play.entertainment.p344d.C6038t;
import com.google.android.libraries.play.entertainment.p344d.C6054d;
import com.google.android.libraries.play.entertainment.p344d.C6061h;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.List;

final class C6039i implements C6038t {
    C6039i() {
    }

    public final C6061h mo5264a(C6061h c6061h, C6054d c6054d) {
        if (!c6061h.m27974a()) {
            return c6061h.m27977d();
        }
        C6037h c6037h = (C6037h) c6061h.m27975b();
        Options options = c6037h.f30147c;
        Object obj = (C6034e) C6116b.m28100a(c6037h.f30148d);
        Bitmap b = obj.m27929b();
        try {
            options.inBitmap = obj.m27929b();
            options.inSampleSize = 1;
            options.inJustDecodeBounds = false;
            C6116b.m28104a(BitmapStore.m27914a(c6037h.f30146b, options) == b, "Unexpected change of Bitmap instance");
            List<C6032d> list = c6037h.f30145a.f30144b;
            if (!list.isEmpty()) {
                for (C6032d c6032d : list) {
                    if (c6054d.mo5269b()) {
                        obj.m27930c();
                        return C6061h.f30191b;
                    }
                    c6032d.mo5324a(b);
                }
            }
            Object obj2 = c6037h.f30145a;
            C6116b.m28100a(obj2);
            C6116b.m28104a(obj.f30140d.m27932a(obj2), "This reference is already keyed or released, cannot set key");
            C2986a c2986a = obj.f30138b;
            C6030b c6030b = obj.f30139c;
            synchronized (c2986a.f15670c) {
                C6116b.m28104a(c6030b.f30134c, "Bitmap is already keyed, cannot set key");
                C6116b.m28107b(c6030b.f30135d == 1, "unexpected refCount");
                c6030b.f30134c = false;
                c6030b.f30133b = obj2;
                c2986a.mo3218a(c6030b, obj2);
                C2986a.f15669b.m28054a("Pub %s", c6030b);
            }
            return C6061h.m27972a(obj);
        } catch (Throwable e) {
            BitmapStore.f30103a.m28055a(e, "Decode bmp failed unexpectedly, url=%s", c6037h.f30145a.f30143a);
            obj.m27930c();
            return C6061h.m27973a(e);
        }
    }
}
