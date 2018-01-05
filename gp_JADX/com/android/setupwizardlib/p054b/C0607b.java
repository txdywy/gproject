package com.android.setupwizardlib.p054b;

import android.graphics.Rect;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.widget.ae;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

final class C0607b extends ae {
    public final /* synthetic */ C0606a f3951o;

    C0607b(C0606a c0606a, View view) {
        this.f3951o = c0606a;
        super(view);
    }

    protected final int mo1022a(float f, float f2) {
        C0606a c0606a = this.f3951o;
        CharSequence text = c0606a.f3948a.getText();
        if (text instanceof Spanned) {
            int i;
            Spanned spanned = (Spanned) text;
            TextView textView = c0606a.f3948a;
            if (textView.getLayout() == null) {
                i = -1;
            } else {
                i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((float) ((textView.getHeight() - textView.getTotalPaddingBottom()) - 1), Math.max(0.0f, f2 - ((float) textView.getTotalPaddingTop()))) + ((float) textView.getScrollY()))), Math.min((float) ((textView.getWidth() - textView.getTotalPaddingRight()) - 1), Math.max(0.0f, f - ((float) textView.getTotalPaddingLeft()))) + ((float) textView.getScrollX()));
            }
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return spanned.getSpanStart(clickableSpanArr[0]);
            }
        }
        return Integer.MIN_VALUE;
    }

    protected final void mo1025a(List list) {
        int i = 0;
        CharSequence text = this.f3951o.f3948a.getText();
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
        C0606a c0606a = this.f3951o;
        ClickableSpan a = c0606a.m4223a(i);
        if (a != null) {
            accessibilityEvent.setContentDescription(c0606a.m4224a(a));
            return;
        }
        Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
        accessibilityEvent.setContentDescription(c0606a.f3948a.getText());
    }

    protected final void mo1023a(int i, C0333b c0333b) {
        C0606a c0606a = this.f3951o;
        ClickableSpan a = c0606a.m4223a(i);
        if (a != null) {
            c0333b.m1776c(c0606a.m4224a(a));
        } else {
            Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
            c0333b.m1776c(c0606a.f3948a.getText());
        }
        c0333b.m1777c(true);
        c0333b.m1782g(true);
        Rect rect = c0606a.f3949e;
        CharSequence text = c0606a.f3948a.getText();
        rect.setEmpty();
        if (text instanceof Spanned) {
            Layout layout = c0606a.f3948a.getLayout();
            if (layout != null) {
                Spanned spanned = (Spanned) text;
                int spanStart = spanned.getSpanStart(a);
                int spanEnd = spanned.getSpanEnd(a);
                float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                spanStart = layout.getLineForOffset(spanStart);
                spanEnd = layout.getLineForOffset(spanEnd);
                layout.getLineBounds(spanStart, rect);
                if (spanEnd == spanStart) {
                    rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                    rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
                } else if (layout.getParagraphDirection(spanStart) == -1) {
                    rect.right = (int) primaryHorizontal;
                } else {
                    rect.left = (int) primaryHorizontal;
                }
                rect.offset(c0606a.f3948a.getTotalPaddingLeft(), c0606a.f3948a.getTotalPaddingTop());
            }
        }
        if (c0606a.f3949e.isEmpty()) {
            Log.e("LinkAccessibilityHelper", "LinkSpan bounds is empty for: " + i);
            c0606a.f3949e.set(0, 0, 1, 1);
        }
        c0333b.m1772b(c0606a.f3949e);
        c0333b.m1765a(16);
    }

    protected final boolean mo1026b(int i, int i2) {
        C0606a c0606a = this.f3951o;
        if (i2 == 16) {
            ClickableSpan a = c0606a.m4223a(i);
            if (a != null) {
                a.onClick(c0606a.f3948a);
                return true;
            }
            Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
        }
        return false;
    }
}
