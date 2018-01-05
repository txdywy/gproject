package com.google.android.play.search;

import android.content.Context;
import android.text.Spannable;
import android.text.style.TextAppearanceSpan;

public abstract class al {
    public final Context f32347a;

    protected al(Context context) {
        this.f32347a = context;
    }

    protected abstract CharSequence mo5430a(String str, String str2, int i, int i2);

    protected final void m29433a(int i, Spannable spannable, int i2, int i3) {
        if (i2 != i3) {
            spannable.setSpan(new TextAppearanceSpan(this.f32347a, i), i2, i3, 0);
        }
    }
}
