package com.android.setupwizardlib.b;

import android.graphics.Rect;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.support.v4.view.a.b;
import android.support.v4.view.a.f;
import android.support.v4.view.b;
import android.support.v4.widget.ae;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;

public final class com.android.setupwizardlib.b.a extends android.support.v4.view.b
{

    public final TextView a;
    public final Rect e;
    public final android.support.v4.widget.ae f;

    a(TextView p0) {
        android.support.v4.view.b();
        this.e = new Rect();
        if (Build$VERSION.SDK_INT <= 25)
            this.f = new com.android.setupwizardlib.b.b(this, p0);
        else
            this.f = 0;
        this.a = p0;
    }

    public final android.support.v4.view.a.f a(View p0) {
        if (this.f != 0)
            v0 = this.f.a(p0);
        else
            v0 = super.a(p0);
        return v0;
    }

    final ClickableSpan a(int p0) {
        v0 = this.a.getText();
        if (v0 instanceof Spanned) {
            v0 = (ClickableSpan[])((Spanned)v0).getSpans(p0, p0, ClickableSpan);
            if (v0.length == 1) {
                v0 = v0[0];
                return v0;
            }
        }
        v0 = 0;
        return v0;
    }

    final CharSequence a(ClickableSpan p0) {
        v0 = this.a.getText();
        if (v0 instanceof Spanned)
            v0 = ((Spanned)v0).subSequence(((Spanned)v0).getSpanStart(p0), ((Spanned)v0).getSpanEnd(p0));
        return v0;
    }

    public final void a(View p0, int p1) {
        if (this.f != 0)
            this.f.a(p0, p1);
        else
            super.a(p0, p1);
    }

    public final void a(View p0, android.support.v4.view.a.b p1) {
        if (this.f != 0)
            this.f.a(p0, p1);
        else
            super.a(p0, p1);
    }

    public final void a(View p0, AccessibilityEvent p1) {
        if (this.f != 0)
            this.f.a(p0, p1);
        else
            super.a(p0, p1);
    }

    public final boolean a(View p0, int p1, Bundle p2) {
        if (this.f != 0)
            v0 = this.f.a(p0, p1, p2);
        else
            v0 = super.a(p0, p1, p2);
        return v0;
    }

    public final boolean a(ViewGroup p0, View p1, AccessibilityEvent p2) {
        if (this.f != 0)
            v0 = this.f.a(p0, p1, p2);
        else
            v0 = super.a(p0, p1, p2);
        return v0;
    }

    public final void b(View p0, AccessibilityEvent p1) {
        if (this.f != 0)
            this.f.b(p0, p1);
        else
            super.b(p0, p1);
    }

    public final boolean c(View p0, AccessibilityEvent p1) {
        if (this.f != 0)
            v0 = this.f.c(p0, p1);
        else
            v0 = super.c(p0, p1);
        return v0;
    }

    public final void d(View p0, AccessibilityEvent p1) {
        if (this.f != 0)
            this.f.d(p0, p1);
        else
            super.d(p0, p1);
    }

}
