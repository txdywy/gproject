package com.android.setupwizardlib.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
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
import android.view.View;
import android.widget.TextView.BufferType;
import com.android.setupwizardlib.p053a.C0601a;
import com.android.setupwizardlib.p053a.C0603c;
import com.android.setupwizardlib.p053a.C0604d;
import com.android.setupwizardlib.p054b.C0606a;

public class RichTextView extends bg implements C0603c {
    public C0606a f3983b;
    public C0603c f3984c;

    public RichTextView(Context context) {
        super(context);
        m4264a();
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4264a();
    }

    private final void m4264a() {
        this.f3983b = new C0606a(this);
        ai.m1829a((View) this, this.f3983b);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        CharSequence spannableString;
        Context context = getContext();
        if (charSequence instanceof Spanned) {
            spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        Log.w("RichTextView", "Cannot find resource: " + identifier);
                    }
                    C0604d.m4220a(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    annotation.getValue();
                    C0604d.m4220a(spannableString, annotation, new C0601a());
                }
            }
        } else {
            spannableString = charSequence;
        }
        super.setText(spannableString, bufferType);
        boolean z = spannableString instanceof Spanned ? ((ClickableSpan[]) ((Spanned) spannableString).getSpans(0, spannableString.length(), ClickableSpan.class)).length > 0 : false;
        if (z) {
            setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            setMovementMethod(null);
        }
        setFocusable(z);
    }

    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f3983b != null) {
            boolean a;
            C0606a c0606a = this.f3983b;
            if (c0606a.f3950f != null) {
                a = c0606a.f3950f.m2170a(motionEvent);
            } else {
                a = false;
            }
            if (a) {
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (VERSION.SDK_INT >= 17) {
            int[] drawableState = getDrawableState();
            for (Drawable drawable : getCompoundDrawablesRelative()) {
                if (drawable != null && drawable.setState(drawableState)) {
                    invalidateDrawable(drawable);
                }
            }
        }
    }

    public void setOnLinkClickListener(C0603c c0603c) {
        this.f3984c = c0603c;
    }

    public C0603c getOnLinkClickListener() {
        return this.f3984c;
    }

    public final boolean mo1032a(C0601a c0601a) {
        if (this.f3984c != null) {
            return this.f3984c.mo1032a(c0601a);
        }
        return false;
    }
}
