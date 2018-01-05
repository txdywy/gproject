package com.google.android.finsky.stream.base.p143a.p144a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.h;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public abstract class C4245a extends ForegroundLinearLayout implements OnClickListener, ad, ae {
    public C1612l f21469a;
    public TextView f21470b;
    public FifeImageView f21471c;
    public int f21472d;
    public int f21473e;
    public int f21474f;
    public int f21475g;
    public ad f21476h;
    public ce f21477i;
    public C4247c f21478j;

    public C4245a(Context context) {
        this(context, null);
    }

    public abstract int getPlayStoreUiElementType();

    public C4245a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4245a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onFinishInflate() {
        ((C1416f) C3947d.m18649a(C1416f.class)).mo1912a(this);
        super.onFinishInflate();
        this.f21470b = (TextView) findViewById(C7582R.id.li_title);
        this.f21471c = (FifeImageView) findViewById(C7582R.id.li_icon);
        setOnClickListener(this);
    }

    public void onClick(View view) {
        this.f21478j.mo4224a(this.f21475g, this);
    }

    public void mo4225a(C4246b c4246b, int i, ad adVar, C4247c c4247c) {
        this.f21472d = C1608h.m9243a(getContext(), c4246b.f21480b);
        if (!(this.f21471c == null || c4246b.f21482d == null)) {
            this.f21469a.m9288a(this.f21471c, c4246b.f21482d.f11860f, c4246b.f21482d.f11863i);
        }
        this.f21470b.setText(c4246b.f21479a);
        setContentDescription(c4246b.f21479a);
        C2482j.m13285a(getPlayStoreUiElement(), c4246b.f21481c);
        this.f21476h = adVar;
        this.f21478j = c4247c;
        this.f21475g = i;
        getParentNode().mo1219a(this);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f21473e == 0) {
            this.f21473e = getMeasuredWidth();
        }
        setMeasuredDimension(getMeasuredWidth() + this.f21474f, getMeasuredHeight());
    }

    public void setAdditionalWidth(int i) {
        this.f21474f = i;
    }

    public int getOriginalWidth() {
        return this.f21473e;
    }

    public void Z_() {
        this.f21478j = null;
        this.f21476h = null;
        if (this.f21471c != null) {
            this.f21471c.a();
        }
        this.f21477i = null;
        this.f21473e = 0;
        this.f21474f = 0;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().clear();
        return dispatchPopulateAccessibilityEvent;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h.a(accessibilityNodeInfo, Button.class.getName());
    }

    public ce getPlayStoreUiElement() {
        if (this.f21477i == null) {
            this.f21477i = C2482j.m13283a(getPlayStoreUiElementType());
        }
        return this.f21477i;
    }

    public ad getParentNode() {
        return this.f21476h;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
