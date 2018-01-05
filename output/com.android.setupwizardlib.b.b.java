package com.android.setupwizardlib.b;

import android.graphics.Rect;
import android.support.v4.view.a.b;
import android.support.v4.widget.ae;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

protected final class com.android.setupwizardlib.b.b extends android.support.v4.widget.ae
{

    public final com.android.setupwizardlib.b.a o;

    b(com.android.setupwizardlib.b.a p0, View p1) {
        this.o = p0;
        android.support.v4.widget.ae(p1);
    }

    protected final int a(float p0, float p1) {
        v0 = this.o.a.getText();
        if (v0 instanceof Spanned) {
            if (this.o.a.getLayout() == 0)
                v1 = -1;
            else
                v1 = this.o.a.getLayout().getOffsetForHorizontal(this.o.a.getLayout().getLineForVertical((int)(Math.min((float)(this.o.a.getHeight() - this.o.a.getTotalPaddingBottom() - 1), Math.max(0, p1 - (float)this.o.a.getTotalPaddingTop())) + (float)this.o.a.getScrollY())), Math.min((float)(this.o.a.getWidth() - this.o.a.getTotalPaddingRight() - 1), Math.max(0, p0 - (float)this.o.a.getTotalPaddingLeft())) + (float)this.o.a.getScrollX());
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
        v2 = this.o.a(p0);
        if (v2 != 0)
            p1.c(this.o.a(v2));
        else {
            Log.e("LinkAccessibilityHelper", 40 + "LinkSpan is null for offset: " + p0);
            p1.c(this.o.a.getText());
        }
        p1.c(1);
        p1.g(1);
        v0 = this.o.a.getText();
        this.o.e.setEmpty();
        if (v0 instanceof Spanned) {
            v4 = this.o.a.getLayout();
            if (v4 != 0) {
                v5 = ((Spanned)v0).getSpanStart(v2);
                v0 = ((Spanned)v0).getSpanEnd(v2);
                v2 = v4.getPrimaryHorizontal(v5);
                v6 = v4.getPrimaryHorizontal(v0);
                v5 = v4.getLineForOffset(v5);
                v4.getLineBounds(v5, this.o.e);
                if (v4.getLineForOffset(v0) == v5) {
                    this.o.e.left = (int)Math.min(v2, v6);
                    this.o.e.right = (int)Math.max(v2, v6);
                }
                else if (v4.getParagraphDirection(v5) == -1)
                    this.o.e.right = (int)v2;
                else
                    this.o.e.left = (int)v2;
                this.o.e.offset(this.o.a.getTotalPaddingLeft(), this.o.a.getTotalPaddingTop());
            }
        }
        if (this.o.e.isEmpty()) {
            Log.e("LinkAccessibilityHelper", 41 + "LinkSpan bounds is empty for: " + p0);
            this.o.e.set(0, 0, 1, 1);
        }
        p1.b(this.o.e);
        p1.a(16);
    }

    protected final void a(int p0, AccessibilityEvent p1) {
        v1 = this.o.a(p0);
        if (v1 != 0)
            p1.setContentDescription(this.o.a(v1));
        else {
            Log.e("LinkAccessibilityHelper", 40 + "LinkSpan is null for offset: " + p0);
            p1.setContentDescription(this.o.a.getText());
        }
    }

    protected final void a(List p0) {
        v2 = 0;
        v0 = this.o.a.getText();
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
            v1 = this.o.a(p0);
            if (v1 != 0) {
                v1.onClick(this.o.a);
                v0 = 1;
                return v0;
            }
            Log.e("LinkAccessibilityHelper", 40 + "LinkSpan is null for offset: " + p0);
        }
        v0 = 0;
        return v0;
    }

}
