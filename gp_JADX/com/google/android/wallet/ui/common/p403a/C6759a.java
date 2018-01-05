package com.google.android.wallet.ui.common.p403a;

import android.graphics.Rect;
import android.support.v4.view.a.b;
import android.support.v4.widget.ae;
import android.text.Layout;
import android.text.Spanned;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import com.google.android.wallet.ui.common.ClickSpan;
import java.util.List;

public final class C6759a extends ae {
    public final TextView f33508o;
    public final Rect f33509p = new Rect();

    public C6759a(TextView textView) {
        super(textView);
        this.f33508o = textView;
    }

    protected final int m30708a(float f, float f2) {
        CharSequence text = this.f33508o.getText();
        if (text instanceof Spanned) {
            int i;
            Spanned spanned = (Spanned) text;
            TextView textView = this.f33508o;
            if (textView.getLayout() == null) {
                i = -1;
            } else {
                i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((float) ((textView.getHeight() - textView.getTotalPaddingBottom()) - 1), Math.max(0.0f, f2 - ((float) textView.getTotalPaddingTop()))) + ((float) textView.getScrollY()))), Math.min((float) ((textView.getWidth() - textView.getTotalPaddingRight()) - 1), Math.max(0.0f, f - ((float) textView.getTotalPaddingLeft()))) + ((float) textView.getScrollX()));
            }
            ClickSpan[] clickSpanArr = (ClickSpan[]) spanned.getSpans(i, i, ClickSpan.class);
            if (clickSpanArr.length == 1) {
                return spanned.getSpanStart(clickSpanArr[0]);
            }
        }
        return Integer.MIN_VALUE;
    }

    protected final void m30711a(List list) {
        int i = 0;
        CharSequence text = this.f33508o.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            ClickSpan[] clickSpanArr = (ClickSpan[]) spanned.getSpans(0, spanned.length(), ClickSpan.class);
            int length = clickSpanArr.length;
            while (i < length) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickSpanArr[i])));
                i++;
            }
        }
    }

    protected final void m30710a(int i, AccessibilityEvent accessibilityEvent) {
        ClickSpan d = m30707d(i);
        if (d != null) {
            accessibilityEvent.setContentDescription(m30706a(d));
            return;
        }
        Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
        accessibilityEvent.setContentDescription(this.f33508o.getText());
    }

    protected final void m30709a(int i, b bVar) {
        ClickSpan d = m30707d(i);
        if (d != null) {
            bVar.c(m30706a(d));
        } else {
            Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
            bVar.c(this.f33508o.getText());
        }
        bVar.c(true);
        bVar.g(true);
        m30705a(d, this.f33509p);
        if (this.f33509p.isEmpty()) {
            Log.e("LinkAccessibilityHelper", "LinkSpan bounds is empty for: " + i);
            this.f33509p.set(0, 0, 1, 1);
            bVar.b(this.f33509p);
        } else {
            bVar.b(m30705a(d, this.f33509p));
        }
        bVar.a(16);
    }

    protected final boolean m30712b(int i, int i2) {
        if (i2 == 16) {
            ClickSpan d = m30707d(i);
            if (d != null) {
                d.onClick(this.f33508o);
                return true;
            }
            Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
        }
        return false;
    }

    private final ClickSpan m30707d(int i) {
        CharSequence text = this.f33508o.getText();
        if (text instanceof Spanned) {
            ClickSpan[] clickSpanArr = (ClickSpan[]) ((Spanned) text).getSpans(i, i, ClickSpan.class);
            if (clickSpanArr.length == 1) {
                return clickSpanArr[0];
            }
        }
        return null;
    }

    private final CharSequence m30706a(ClickSpan clickSpan) {
        CharSequence text = this.f33508o.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickSpan), spanned.getSpanEnd(clickSpan));
    }

    private final Rect m30705a(ClickSpan clickSpan, Rect rect) {
        CharSequence text = this.f33508o.getText();
        rect.setEmpty();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickSpan);
            int spanEnd = spanned.getSpanEnd(clickSpan);
            Layout layout = this.f33508o.getLayout();
            if (layout == null) {
                Log.e("LinkAccessibilityHelper", "Unable to getBoundsForSpan because view layout is null");
            } else {
                float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                spanStart = layout.getLineForOffset(spanStart);
                spanEnd = layout.getLineForOffset(spanEnd);
                layout.getLineBounds(spanStart, rect);
                rect.left = (int) primaryHorizontal;
                if (spanEnd == spanStart) {
                    rect.right = (int) primaryHorizontal2;
                }
                rect.offset(this.f33508o.getTotalPaddingLeft(), this.f33508o.getTotalPaddingTop());
            }
        }
        return rect;
    }
}
