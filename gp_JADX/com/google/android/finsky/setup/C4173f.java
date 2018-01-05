package com.google.android.finsky.setup;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class C4173f extends ContentObserver {
    public final Context f21087a;
    public C4141c f21088b;

    C4173f(Handler handler, Context context) {
        super(handler);
        this.f21087a = context;
    }

    public final void onChange(boolean z) {
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        if (m19494a(this.f21087a).m19383a()) {
            m19494a(this.f21087a).m19384b();
        }
    }

    private final C4141c m19494a(Context context) {
        if (this.f21088b == null) {
            this.f21088b = new C4141c(context);
        }
        return this.f21088b;
    }
}
