package com.google.android.libraries.play.entertainment.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p192l.C6099d;
import com.google.android.libraries.play.entertainment.p344d.C6038t;
import com.google.android.libraries.play.entertainment.p344d.C6041o;
import com.google.android.libraries.play.entertainment.p344d.C6061h;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6117c;
import com.google.android.libraries.play.entertainment.p351m.C6118d;
import java.io.Closeable;
import java.util.concurrent.Executor;

public final class BitmapStore {
    public static final C6090b f30103a = C6090b.m28050a();
    public static final Config f30104b = Config.ARGB_8888;
    public static final C6061h f30105c = C6061h.m27973a(new Exception("Cannot decode bounds"));
    public final C2983e f30106d;
    public final C2986a f30107e;
    public final Executor f30108f;
    public final C6038t f30109g;
    public final C6041o f30110h;
    public final C6038t f30111i = new C6039i();

    final class NeedsAllocationException extends Exception {
        public final C6037h f30102a;

        NeedsAllocationException(C6037h c6037h) {
            this.f30102a = c6037h;
        }
    }

    public BitmapStore(C2983e c2983e, C2986a c2986a, Executor executor, Executor executor2) {
        this.f30106d = (C2983e) C6116b.m28100a((Object) c2983e);
        this.f30107e = (C2986a) C6116b.m28100a((Object) c2986a);
        this.f30108f = (Executor) C6116b.m28100a((Object) executor);
        this.f30109g = new C6043l(c2986a, false);
        this.f30110h = new C6042k((Executor) C6116b.m28100a((Object) executor2), new C6043l(c2986a, true));
    }

    static Bitmap m27914a(C6099d c6099d, Options options) {
        Closeable b = c6099d.mo5292b();
        try {
            C6117c c6117c = (C6117c) b;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c6117c.m28108a(), c6117c.f30289a, c6117c.f30290b, options);
            return decodeByteArray;
        } finally {
            C6118d.m28110a(b);
        }
    }
}
