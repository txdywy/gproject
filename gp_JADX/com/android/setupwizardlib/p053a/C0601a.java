package com.android.setupwizardlib.p053a;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

public final class C0601a extends ClickableSpan {
    public static final Typeface f3941a = Typeface.create("sans-serif-medium", 0);

    public final void onClick(View view) {
        boolean z;
        boolean z2 = false;
        if (view instanceof C0603c) {
            z2 = ((C0603c) view).mo1032a(this);
        }
        if (!z2) {
            C0602b c0602b;
            Context context = view.getContext();
            while (!(context instanceof C0602b)) {
                if (!(context instanceof ContextWrapper)) {
                    c0602b = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            c0602b = (C0602b) context;
            if (c0602b != null) {
                c0602b.m4218a();
                z = true;
                if (z) {
                    Log.w("LinkSpan", "Dropping click event. No listener attached.");
                } else if (VERSION.SDK_INT >= 19) {
                    view.cancelPendingInputEvents();
                }
            }
        }
        z = z2;
        if (z) {
            Log.w("LinkSpan", "Dropping click event. No listener attached.");
        } else if (VERSION.SDK_INT >= 19) {
            view.cancelPendingInputEvents();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(f3941a);
    }
}
