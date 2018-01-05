package com.google.android.instantapps.common.loading.ui;

import android.widget.ProgressBar;

final class C5836v {
    public final ProgressBar f29303a;
    public final ProgressBar f29304b;
    public boolean f29305c;
    public final /* synthetic */ C5822h f29306d;

    C5836v(C5822h c5822h, ProgressBar progressBar, ProgressBar progressBar2) {
        this.f29306d = c5822h;
        this.f29303a = progressBar;
        this.f29304b = progressBar2;
    }

    final void m27251a(int i) {
        this.f29303a.setProgress(i);
        this.f29304b.setProgress(i);
    }

    final void m27250a() {
        this.f29303a.setIndeterminate(false);
        this.f29304b.setIndeterminate(false);
    }

    final void m27252b() {
        this.f29303a.setMax(100);
        this.f29304b.setMax(100);
    }
}
