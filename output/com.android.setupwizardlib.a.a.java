package com.android.setupwizardlib.a;

import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.os.Build$VERSION;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

public final class com.android.setupwizardlib.a.a extends ClickableSpan
{

    public static final Typeface a;

    static {
        com.android.setupwizardlib.a.a.a = Typeface.create("sans-serif-medium", 0);
    }

    a() {
        ClickableSpan();
    }

    public final void onClick(View p0) {
  0:    v1 = 0;
  3:    if (p0 instanceof com.android.setupwizardlib.a.c)
  8:        v1 = ((com.android.setupwizardlib.a.c)p0).a(this);
 12:    if (v1 != 0) goto 63;
 14:    v0 = p0.getContext();
 20:    if (!(v0 instanceof com.android.setupwizardlib.a.b)) goto 42;
 22:    v0 = (com.android.setupwizardlib.a.b)v0;
 24:    if (v0 == 0) goto 63;
 26:    v0.a();
 29:    v0 = 1;
 30:    if (v0 != 0) {
 36:        if (Build$VERSION.SDK_INT >= 19)
 38:            p0.cancelPendingInputEvents();
        }
        else
 59:        Log.w("LinkSpan", "Dropping click event. No listener attached.");
 41:    return;
 44:    if (!(v0 instanceof ContextWrapper)) goto 53;
 48:    v0 = ((ContextWrapper)v0).getBaseContext();
 52:    goto 18;
 53:    v0 = 0;
 54:    goto 24;
 63:    v0 = v1;
 64:    goto 30;
    }

    public final void updateDrawState(TextPaint p0) {
        super.updateDrawState(p0);
        p0.setUnderlineText(0);
        p0.setTypeface(com.android.setupwizardlib.a.a.a);
    }

}
