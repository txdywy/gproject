package com.google.android.libraries.p321b.p322a;

import android.database.ContentObserver;

final class C5846b extends ContentObserver {
    public final /* synthetic */ C5845a f29335a;

    C5846b(C5845a c5845a) {
        this.f29335a = c5845a;
        super(null);
    }

    public final void onChange(boolean z) {
        C5845a c5845a = this.f29335a;
        synchronized (c5845a.f29333e) {
            c5845a.f29334f = null;
        }
    }
}
