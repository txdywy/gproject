package com.android.setupwizardlib.p054b;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.C0132b;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0337f;
import android.support.v4.widget.ae;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;

public final class C0606a extends C0132b {
    public final TextView f3948a;
    public final Rect f3949e = new Rect();
    public final ae f3950f;

    public C0606a(TextView textView) {
        if (VERSION.SDK_INT <= 25) {
            this.f3950f = new C0607b(this, textView);
        } else {
            this.f3950f = null;
        }
        this.f3948a = textView;
    }

    public final void mo1019a(View view, int i) {
        if (this.f3950f != null) {
            this.f3950f.mo1019a(view, i);
        } else {
            super.mo1019a(view, i);
        }
    }

    public final void mo1020b(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f3950f != null) {
            this.f3950f.mo1020b(view, accessibilityEvent);
        } else {
            super.mo1020b(view, accessibilityEvent);
        }
    }

    public final boolean mo486c(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f3950f != null) {
            return this.f3950f.mo486c(view, accessibilityEvent);
        }
        return super.mo486c(view, accessibilityEvent);
    }

    public final void mo1021d(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f3950f != null) {
            this.f3950f.mo1021d(view, accessibilityEvent);
        } else {
            super.mo1021d(view, accessibilityEvent);
        }
    }

    public final void mo145a(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f3950f != null) {
            this.f3950f.mo145a(view, accessibilityEvent);
        } else {
            super.mo145a(view, accessibilityEvent);
        }
    }

    public final void mo67a(View view, C0333b c0333b) {
        if (this.f3950f != null) {
            this.f3950f.mo67a(view, c0333b);
        } else {
            super.mo67a(view, c0333b);
        }
    }

    public final boolean mo485a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.f3950f != null) {
            return this.f3950f.mo485a(viewGroup, view, accessibilityEvent);
        }
        return super.mo485a(viewGroup, view, accessibilityEvent);
    }

    public final C0337f mo456a(View view) {
        if (this.f3950f != null) {
            return this.f3950f.mo456a(view);
        }
        return super.mo456a(view);
    }

    public final boolean mo131a(View view, int i, Bundle bundle) {
        if (this.f3950f != null) {
            return this.f3950f.mo131a(view, i, bundle);
        }
        return super.mo131a(view, i, bundle);
    }

    final ClickableSpan m4223a(int i) {
        CharSequence text = this.f3948a.getText();
        if (text instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    final CharSequence m4224a(ClickableSpan clickableSpan) {
        CharSequence text = this.f3948a.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }
}
