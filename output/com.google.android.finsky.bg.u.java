package com.google.android.finsky.bg;

import android.graphics.Rect;
import android.support.v4.view.a.b;
import android.support.v4.widget.ae;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

protected final class com.google.android.finsky.bg.u extends android.support.v4.widget.ae
{

    public final TextView o;
    public final Rect p;

    u(TextView p0) {
        android.support.v4.widget.ae(p0);
        this.p = new Rect();
        this.o = p0;
    }

    private final Rect a(ClickableSpan p0, Rect p1) {
        v0 = this.o.getText();
        p1.setEmpty();
        if (v0 instanceof Spanned) {
            v1 = ((Spanned)v0).getSpanStart(p0);
            v0 = ((Spanned)v0).getSpanEnd(p0);
            v2 = this.o.getLayout();
            v3 = v2.getPrimaryHorizontal(v1);
            v1 = v2.getLineForOffset(v1);
            v2.getLineBounds(v1, p1);
            p1.left = (int)v3;
            if (v2.getLineForOffset(v0) == v1)
                p1.right = (int)v2.getPrimaryHorizontal(v0);
            p1.offset(this.o.getTotalPaddingLeft(), this.o.getTotalPaddingTop());
        }
        return p1;
    }

    private final CharSequence a(ClickableSpan p0) {
        v0 = this.o.getText();
        if (v0 instanceof Spanned)
            v0 = ((Spanned)v0).subSequence(((Spanned)v0).getSpanStart(p0), ((Spanned)v0).getSpanEnd(p0));
        return v0;
    }

    private final ClickableSpan d(int p0) {
        v0 = this.o.getText();
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

    protected final int a(float p0, float p1) {
        v0 = this.o.getText();
        if (v0 instanceof Spanned) {
            v1 = this.o.getOffsetForPosition(p0, p1);
            v1 = (ClickableSpan[])((Spanned)v0).getSpans(v1, v1, ClickableSpan);
            if (v1.length == 1) {
                v0 = ((Spanned)v0).getSpanStart(v1[0]);
                return v0;
            }
        }
        v0 = -2147483648;
        return v0;
    }

    protected final void a(int p0, android.support.v4.view.a.b p1) {
        v0 = this.d(p0);
        if (v0 != 0)
            p1.c(this.a(v0));
        else {
            Log.e("LinkAccessibilityHelper", 40 + "LinkSpan is null for offset: " + p0);
            p1.c(this.o.getText());
        }
        p1.c(1);
        p1.g(1);
        this.a(v0, this.p);
        if (!this.p.isEmpty())
            p1.b(this.a(v0, this.p));
        else {
            Log.e("LinkAccessibilityHelper", 41 + "LinkSpan bounds is empty for: " + p0);
            this.p.set(0, 0, 1, 1);
            p1.b(this.p);
        }
        p1.a(16);
    }

    protected final void a(int p0, AccessibilityEvent p1) {
        v0 = this.d(p0);
        if (v0 != 0)
            p1.setContentDescription(this.a(v0));
        else {
            Log.e("LinkAccessibilityHelper", 40 + "LinkSpan is null for offset: " + p0);
            p1.setContentDescription(this.o.getText());
        }
    }

    protected final void a(List p0) {
        v2 = 0;
        v0 = this.o.getText();
        if (v0 instanceof Spanned) {
            v1 = (ClickableSpan[])((Spanned)v0).getSpans(0, ((Spanned)v0).length(), ClickableSpan);
            while (v2 < v1.length) {
                p0.add(Integer.valueOf(((Spanned)v0).getSpanStart(v1[v2])));
                v2 = v2 + 1;
            }
        }
    }

    protected final boolean b(int p0, int p1) {
        if (p1 == 16) {
            v0 = this.d(p0);
            if (v0 != 0) {
                v0.onClick(this.o);
                v0 = 1;
                return v0;
            }
            Log.e("LinkAccessibilityHelper", 40 + "LinkSpan is null for offset: " + p0);
        }
        v0 = 0;
        return v0;
    }

}
