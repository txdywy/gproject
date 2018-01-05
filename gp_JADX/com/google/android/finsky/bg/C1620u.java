package com.google.android.finsky.bg;

import android.graphics.Rect;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.widget.ae;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

public final class C1620u extends ae {
    public final TextView f8537o;
    public final Rect f8538p = new Rect();

    public C1620u(TextView textView) {
        super(textView);
        this.f8537o = textView;
    }

    protected final int mo1022a(float f, float f2) {
        CharSequence text = this.f8537o.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int offsetForPosition = this.f8537o.getOffsetForPosition(f, f2);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForPosition, offsetForPosition, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return spanned.getSpanStart(clickableSpanArr[0]);
            }
        }
        return Integer.MIN_VALUE;
    }

    protected final void mo1025a(List list) {
        int i = 0;
        CharSequence text = this.f8537o.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
            int length = clickableSpanArr.length;
            while (i < length) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpanArr[i])));
                i++;
            }
        }
    }

    protected final void mo1024a(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan d = m9297d(i);
        if (d != null) {
            accessibilityEvent.setContentDescription(m9296a(d));
            return;
        }
        Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
        accessibilityEvent.setContentDescription(this.f8537o.getText());
    }

    protected final void mo1023a(int i, C0333b c0333b) {
        ClickableSpan d = m9297d(i);
        if (d != null) {
            c0333b.m1776c(m9296a(d));
        } else {
            Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
            c0333b.m1776c(this.f8537o.getText());
        }
        c0333b.m1777c(true);
        c0333b.m1782g(true);
        m9295a(d, this.f8538p);
        if (this.f8538p.isEmpty()) {
            Log.e("LinkAccessibilityHelper", "LinkSpan bounds is empty for: " + i);
            this.f8538p.set(0, 0, 1, 1);
            c0333b.m1772b(this.f8538p);
        } else {
            c0333b.m1772b(m9295a(d, this.f8538p));
        }
        c0333b.m1765a(16);
    }

    protected final boolean mo1026b(int i, int i2) {
        if (i2 == 16) {
            ClickableSpan d = m9297d(i);
            if (d != null) {
                d.onClick(this.f8537o);
                return true;
            }
            Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
        }
        return false;
    }

    private final ClickableSpan m9297d(int i) {
        CharSequence text = this.f8537o.getText();
        if (text instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    private final CharSequence m9296a(ClickableSpan clickableSpan) {
        CharSequence text = this.f8537o.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    private final Rect m9295a(ClickableSpan clickableSpan, Rect rect) {
        CharSequence text = this.f8537o.getText();
        rect.setEmpty();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            Layout layout = this.f8537o.getLayout();
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            spanStart = layout.getLineForOffset(spanStart);
            spanEnd = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(spanStart, rect);
            rect.left = (int) primaryHorizontal;
            if (spanEnd == spanStart) {
                rect.right = (int) primaryHorizontal2;
            }
            rect.offset(this.f8537o.getTotalPaddingLeft(), this.f8537o.getTotalPaddingTop());
        }
        return rect;
    }
}
