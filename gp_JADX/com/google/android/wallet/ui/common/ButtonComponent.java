package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.widget.bg;
import android.support.v7.b.a.b;
import android.support.v7.widget.ad;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView.BufferType;
import com.google.a.a.a.a.b.a.a.f.g;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.C6540d;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6509a;
import com.google.android.wallet.p366b.C6510b;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p366b.C6515e;
import com.google.android.wallet.p383e.C6617a;
import com.squareup.haha.perflib.HprofParser;

public class ButtonComponent extends ad implements OnClickListener, C6510b, C6511g, C6752d, Runnable {
    public g f33293d;
    public LogContext f33294e;
    public C6540d f33295f = new C6540d(this);
    public OnClickListener f33296g;
    public C6526e f33297h;
    public final C6509a f33298i = new C6509a();
    public boolean f33299j;
    public long f33300k = -1;
    public boolean f33301l;
    public boolean f33302m;
    public boolean f33303n = true;
    public boolean f33304o = true;
    public int f33305p;
    public boolean f33306q;

    public ButtonComponent(Context context) {
        super(context);
        m30571a(null);
    }

    public ButtonComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30571a(attributeSet);
    }

    public ButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30571a(attributeSet);
    }

    private final void m30571a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{C6617a.uicFormButtonTextCapitalized});
        this.f33299j = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.f33305p = getVisibility();
        super.setOnClickListener(this);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.f33299j && !TextUtils.isEmpty(charSequence)) {
            charSequence = charSequence.toString().toUpperCase(getResources().getConfiguration().locale);
        }
        super.setText(charSequence, bufferType);
    }

    public void setEnabled(boolean z) {
        if (this.f33300k != -1) {
            this.f33302m = z;
            return;
        }
        this.f33303n = z;
        boolean z2 = this.f33303n && this.f33304o;
        m30575b(z2);
    }

    private final void m30572a(boolean z) {
        this.f33304o = z;
        if (this.f33300k == -1 && z != isEnabled()) {
            boolean z2 = this.f33303n && this.f33304o;
            m30575b(z2);
        }
    }

    private final void m30575b(boolean z) {
        if (isEnabled() != z) {
            m30577d(z);
        }
        super.setEnabled(z);
    }

    public void setVisibility(int i) {
        this.f33305p = i;
        super.setVisibility(this.f33306q ? 8 : this.f33305p);
    }

    private final void m30576c(boolean z) {
        this.f33306q = z;
        super.setVisibility(this.f33306q ? 8 : this.f33305p);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            int i;
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
            g gVar = (g) ParcelableProto.m29887a(bundle, "buttonSpec");
            if (this.f33293d == null) {
                this.f33293d = gVar;
            }
            g gVar2 = this.f33293d;
            boolean z = gVar == gVar2 ? true : (gVar == null || gVar2 == null) ? false : gVar.g.equals(gVar2.g) && gVar.e.equals(gVar2.e) && gVar.f.equals(gVar2.f) && gVar.h == gVar2.h && gVar.b == gVar2.b && gVar.c == gVar2.c;
            if (z) {
                this.f33300k = bundle.getLong("timeWhenRefreshStartedMs");
                this.f33302m = bundle.getBoolean("requestedEnabledState");
                setText(bundle.getCharSequence("text"));
            } else {
                setText(this.f33293d.e);
            }
            m30574b();
            this.f33303n = bundle.getBoolean("enabledByView", true);
            this.f33304o = bundle.getBoolean("enabledByDependencyGraph", true);
            this.f33305p = bundle.getInt("requestedVisibility", 0);
            this.f33306q = bundle.getBoolean("hiddenByDependencyGraph", false);
            if (this.f33300k != -1) {
                m30575b(false);
                run();
            } else {
                z = this.f33303n && this.f33304o;
                m30575b(z);
            }
            this.f33295f.m29714a(bundle.getBundle("impressionLoggerState"));
            if (this.f33306q) {
                i = 8;
            } else {
                i = this.f33305p;
            }
            super.setVisibility(i);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("buttonSpec", ParcelableProto.m29885a(this.f33293d));
        bundle.putLong("timeWhenRefreshStartedMs", this.f33300k);
        bundle.putBoolean("requestedEnabledState", this.f33302m);
        bundle.putCharSequence("text", getText());
        bundle.putBoolean("enabledByView", this.f33303n);
        bundle.putBoolean("enabledByDependencyGraph", this.f33304o);
        bundle.putInt("requestedVisibility", this.f33305p);
        bundle.putBoolean("hiddenByDependencyGraph", this.f33306q);
        bundle.putBundle("impressionLoggerState", this.f33295f.m29715b());
        return bundle;
    }

    protected void onAttachedToWindow() {
        this.f33301l = true;
        super.onAttachedToWindow();
        this.f33295f.m29713a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33301l = false;
        removeCallbacks(this);
    }

    public void setUiSpecification(g gVar) {
        if (TextUtils.isEmpty(gVar.e) && gVar.d == null) {
            throw new IllegalArgumentException("Button spec without initial text or icon received.");
        }
        if (gVar.h > 0) {
            if (TextUtils.isEmpty(gVar.f)) {
                throw new IllegalArgumentException("Re-send timer w/o a refresh message received.");
            } else if (gVar.h < 1000) {
                throw new IllegalArgumentException("Re-send timer less then 1 second which is the minimum displayable unit.");
            }
        }
        if (!(this.f33293d == null || this.f33293d.d == null)) {
            m30570a(null);
        }
        this.f33293d = gVar;
        if (this.f33301l) {
            removeCallbacks(this);
            this.f33300k = -1;
        }
        setText(this.f33293d.e);
        m30574b();
        m30572a(this.f33293d.c);
        this.f33295f.f32633c = gVar.b;
    }

    public g getUiSpec() {
        return this.f33293d;
    }

    public void setLogContext(LogContext logContext) {
        this.f33294e = logContext;
        this.f33295f.f32632b = logContext;
    }

    private final boolean m30573a() {
        if (this.f33300k == -1) {
            return false;
        }
        this.f33300k = -1;
        setEnabled(this.f33302m);
        removeCallbacks(this);
        if (TextUtils.isEmpty(this.f33293d.g)) {
            setText(this.f33293d.e);
        } else {
            setText(this.f33293d.g);
        }
        return true;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f33296g = onClickListener;
    }

    public OnClickListener getOnClickListener() {
        return this.f33296g;
    }

    public void setBaseButtonComponentOnClickListener(C6526e c6526e) {
        this.f33297h = c6526e;
    }

    public C6526e getBaseButtonComponentOnClickListener() {
        return this.f33297h;
    }

    public boolean hasOnClickListeners() {
        return super.hasOnClickListeners() && !(this.f33296g == null && this.f33297h == null);
    }

    public void onClick(View view) {
        C6537a.m29700b(this.f33294e, this.f33293d.b);
        C6509a c6509a = this.f33298i;
        c6509a.f32567b = false;
        int size = c6509a.f32568c.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            C6515e c6515e = (C6515e) c6509a.f32568c.get(i);
            if (c6509a.f32566a.mo5461b(c6515e)) {
                if (c6509a.f32567b || c6515e.f32578a.h) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c6509a.f32567b = z2;
                z2 = true;
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        if (!z || !this.f33298i.f32567b) {
            if (this.f33293d.h > 0) {
                m30575b(false);
                this.f33300k = SystemClock.elapsedRealtime();
                this.f33302m = true;
                long a = m30569a((long) this.f33293d.h);
                setText(String.format(getResources().getConfiguration().locale, this.f33293d.f, new Object[]{Long.valueOf(a / 1000)}));
                postDelayed(this, Math.min(a, 1000));
            } else if (TextUtils.isEmpty(this.f33293d.g)) {
                setText(this.f33293d.e);
            } else {
                setText(this.f33293d.g);
            }
            if (this.f33296g != null) {
                this.f33296g.onClick(view);
            }
            if (this.f33297h != null) {
                this.f33297h.mo5471a(view, this.f33293d.i);
            }
        }
    }

    public void run() {
        if (this.f33293d.h <= 0) {
            throw new IllegalStateException("Timer based text changes not needed!");
        }
        long a = m30569a((this.f33300k + ((long) this.f33293d.h)) - SystemClock.elapsedRealtime());
        if (a > 0) {
            setText(String.format(getResources().getConfiguration().locale, this.f33293d.f, new Object[]{Long.valueOf(a / 1000)}));
            postDelayed(this, Math.min(a, 1000));
            return;
        }
        m30573a();
    }

    private final void m30574b() {
        if (this.f33293d != null && this.f33293d.d != null && C6600l.m29953a(this.f33293d.d.c)) {
            m30570a(b.b(getContext(), ci.m30839a(getContext(), this.f33293d.d.c, -1)));
            m30577d(isEnabled());
        }
    }

    private final void m30577d(boolean z) {
        if (this.f33293d != null && this.f33293d.d != null) {
            Drawable[] b = bg.a.b(this);
            if (b[0] != null) {
                b[0].setAlpha(z ? HprofParser.ROOT_UNKNOWN : 77);
            }
            bg.a(this, b[0], b[1], b[2], b[3]);
        }
    }

    private final void m30570a(Drawable drawable) {
        Drawable[] b = bg.a.b(this);
        bg.a(this, drawable, b[1], b[2], b[3]);
    }

    private static long m30569a(long j) {
        return ((500 + j) / 1000) * 1000;
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        switch (lVar.c) {
            case 1:
                m30576c(false);
                return;
            case 2:
                m30573a();
                return;
            case 7:
                m30572a(false);
                return;
            case 11:
                m30576c(true);
                return;
            case 16:
                m30572a(true);
                return;
            default:
                throw new IllegalArgumentException("Unsupported resulting action type: " + lVar.c);
        }
    }

    public void setDelegateForDependencyGraph(Object obj) {
        throw new IllegalStateException("The ButtonComponent's delegate should not be modified.");
    }

    public C6508h getTriggerComponentDelegate() {
        return this.f33298i;
    }

    public C6511g getResultingActionComponentDelegate() {
        return null;
    }
}
