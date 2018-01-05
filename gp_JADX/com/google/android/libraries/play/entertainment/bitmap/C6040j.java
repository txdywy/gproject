package com.google.android.libraries.play.entertainment.bitmap;

import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.play.entertainment.p192l.C6099d;
import com.google.android.libraries.play.entertainment.p344d.C6038t;
import com.google.android.libraries.play.entertainment.p344d.C6054d;
import com.google.android.libraries.play.entertainment.p344d.C6061h;

final class C6040j implements C6038t {
    public final C6036g f30149a;
    public final /* synthetic */ BitmapStore f30150b;

    C6040j(BitmapStore bitmapStore, C6036g c6036g) {
        this.f30150b = bitmapStore;
        this.f30149a = c6036g;
    }

    public final C6061h mo5264a(C6061h c6061h, C6054d c6054d) {
        if (!c6061h.m27974a()) {
            return c6061h.m27977d();
        }
        C6099d c6099d = (C6099d) c6061h.m27975b();
        Options options = new Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = BitmapStore.f30104b;
        BitmapStore.m27914a(c6099d, options);
        if (options.outWidth > 0 && options.outHeight > 0) {
            return C6061h.m27972a(new C6037h(this.f30149a, c6099d, options));
        }
        BitmapStore.f30103a.m28055a(null, "Decode bmp failed, url=%s", this.f30149a.f30143a);
        this.f30150b.f30106d.mo3215a(c6099d.f30256a);
        return BitmapStore.f30105c;
    }
}
