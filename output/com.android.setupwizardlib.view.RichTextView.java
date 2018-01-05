package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.support.v4.view.ai;
import android.support.v4.widget.ae;
import android.support.v7.widget.bg;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView$BufferType;
import com.android.setupwizardlib.a.a;
import com.android.setupwizardlib.a.c;
import com.android.setupwizardlib.a.d;
import com.android.setupwizardlib.b.a;

public class RichTextView extends android.support.v7.widget.bg implements com.android.setupwizardlib.a.c
{

    public com.android.setupwizardlib.b.a b;
    public com.android.setupwizardlib.a.c c;

    RichTextView(Context p0) {
        android.support.v7.widget.bg(p0);
        this.a();
    }

    RichTextView(Context p0, AttributeSet p1) {
        android.support.v7.widget.bg(p0, p1);
        this.a();
    }

    private final void a() {
        this.b = new com.android.setupwizardlib.b.a(this);
        android.support.v4.view.ai.a(this, this.b);
    }

    public final boolean a(com.android.setupwizardlib.a.a p0) {
        if (this.c != 0)
            v0 = this.c.a(p0);
        else
            v0 = 0;
        return v0;
    }

    protected boolean dispatchHoverEvent(MotionEvent p0) {
        if (this.b != 0) {
            if (this.b.f != 0)
                v0 = this.b.f.a(p0);
            else
                v0 = 0;
            if (v0 != 0) {
                v0 = 1;
                return v0;
            }
        }
        v0 = super.dispatchHoverEvent(p0);
        return v0;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (Build$VERSION.SDK_INT >= 17) {
            v2 = this.getCompoundDrawablesRelative();
            v0 = 0;
            while (v0 < v2.length) {
                if (v2[v0] != 0) {
                    if (v2[v0].setState(this.getDrawableState()))
                        this.invalidateDrawable(v2[v0]);
                }
                v0 = v0 + 1;
            }
        }
    }

    public com.android.setupwizardlib.a.c getOnLinkClickListener() {
        return this.c;
    }

    public void setOnLinkClickListener(com.android.setupwizardlib.a.c p0) {
        this.c = p0;
    }

    public void setText(CharSequence p0, TextView$BufferType p1) {
        v4 = this.getContext();
        if (!(p0 instanceof Spanned)) {
            v1 = p0;
            super.setText(v1, p1);
            if (v1 instanceof Spanned) {
                if (((ClickableSpan[])((Spanned)v1).getSpans(0, v1.length(), ClickableSpan)).length > 0)
                    v0 = 1;
                else
                    v0 = 0;
            }
            else
                v0 = 0;
            if (v0 != 0)
                this.setMovementMethod(LinkMovementMethod.getInstance());
            else
                this.setMovementMethod(0);
            this.setFocusable(v0);
            return;
        }
        v1 = new SpannableString(p0);
        v0 = (Annotation[])v1.getSpans(0, v1.length(), Annotation);
        v3 = 0;
        while (v3 < v0.length) {
            v7 = v0[v3].getKey();
            if ("textAppearance".equals(v7)) {
                v7 = v4.getResources().getIdentifier(v0[v3].getValue(), "style", v4.getPackageName());
                if (v7 == 0)
                    Log.w("RichTextView", 33 + "Cannot find resource: " + v7);
                com.android.setupwizardlib.a.d.a(v1, v0[v3], new TextAppearanceSpan(v4, v7));
            }
            else if ("link".equals(v7)) {
                v0[v3].getValue();
                com.android.setupwizardlib.a.d.a(v1, v0[v3], new com.android.setupwizardlib.a.a());
            }
            v3 = v3 + 1;
        }
        super.setText(v1, p1);
        if (v1 instanceof Spanned) {
            if (((ClickableSpan[])((Spanned)v1).getSpans(0, v1.length(), ClickableSpan)).length > 0)
                v0 = 1;
            else
                v0 = 0;
        }
        else
            v0 = 0;
        if (v0 != 0)
            this.setMovementMethod(LinkMovementMethod.getInstance());
        else
            this.setMovementMethod(0);
        this.setFocusable(v0);
    }

}
