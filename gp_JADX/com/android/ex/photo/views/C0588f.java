package com.android.ex.photo.views;

import android.widget.ProgressBar;

public final class C0588f {
    public final ProgressBar f3923a;
    public final ProgressBar f3924b;
    public boolean f3925c = true;

    public C0588f(ProgressBar progressBar, ProgressBar progressBar2) {
        this.f3923a = progressBar;
        this.f3924b = progressBar2;
        m4185a(this.f3925c);
    }

    public final void m4186a(int i) {
        if (i == 4 || i == 8) {
            this.f3924b.setVisibility(i);
            this.f3923a.setVisibility(i);
            return;
        }
        m4185a(this.f3925c);
    }

    private final void m4185a(boolean z) {
        int i;
        int i2 = 8;
        ProgressBar progressBar = this.f3924b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        ProgressBar progressBar2 = this.f3923a;
        if (!z) {
            i2 = 0;
        }
        progressBar2.setVisibility(i2);
    }
}
