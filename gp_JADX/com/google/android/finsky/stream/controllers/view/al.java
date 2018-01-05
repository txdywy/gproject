package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.h;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public abstract class al extends ForegroundLinearLayout implements OnClickListener, ad, ae {
    public C1612l f23044a;
    public C1600a f23045b;
    public TextView f23046c;
    public FifeImageView f23047d;
    public int f23048e;
    public int f23049f;
    public int f23050g;
    public String f23051h;
    public int f23052i;
    public ip f23053j;
    public C3748a f23054k;
    public DfeToc f23055l;
    public ad f23056m;
    public C2495w f23057w;
    public ce f23058x;

    public al(Context context) {
        this(context, null);
    }

    protected abstract int getPlayStoreUiElementType();

    public al(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public al(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1958a(this);
        super.onFinishInflate();
        this.f23046c = (TextView) findViewById(C7582R.id.li_title);
        this.f23047d = (FifeImageView) findViewById(C7582R.id.li_icon);
        setOnClickListener(this);
    }

    public void onClick(View view) {
        this.f23054k.mo3643a(this.f23053j, this.f23051h, this.f23052i, this.f23055l, (ad) this, 0, this.f23057w);
    }

    public int getIconWidth() {
        return this.f23047d == null ? 0 : this.f23047d.getLayoutParams().width;
    }

    public void mo4247a(Document document, C3748a c3748a, DfeToc dfeToc, C1294w c1294w, ad adVar, C2495w c2495w) {
        bd a = C1600a.m9198a(document);
        am amVar = new am();
        amVar.f23093a = document.f14885a.f12100g;
        amVar.f23094b = document.f14885a.f12099f;
        amVar.f23096d = a;
        amVar.f23095c = document.f14885a.f12087D;
        ip ipVar = document.m14657l().f12324d;
        this.f23051h = amVar.f23093a;
        this.f23052i = amVar.f23094b;
        this.f23053j = ipVar;
        this.f23054k = c3748a;
        this.f23055l = dfeToc;
        this.f23048e = C1608h.m9243a(getContext(), amVar.f23094b);
        if (!(this.f23047d == null || amVar.f23096d == null)) {
            this.f23044a.m9288a(this.f23047d, amVar.f23096d.f11860f, amVar.f23096d.f11863i);
        }
        this.f23046c.setText(amVar.f23093a);
        setContentDescription(amVar.f23093a);
        C2482j.m13285a(getPlayStoreUiElement(), amVar.f23095c);
        this.f23056m = adVar;
        this.f23057w = c2495w;
        getParentNode().mo1219a(this);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f23049f == 0) {
            this.f23049f = getMeasuredWidth();
        }
        setMeasuredDimension(getMeasuredWidth() + this.f23050g, getMeasuredHeight());
    }

    public void setAdditionalWidth(int i) {
        this.f23050g = i;
    }

    public final void Z_() {
        this.f23051h = null;
        this.f23053j = null;
        this.f23054k = null;
        this.f23055l = null;
        this.f23056m = null;
        this.f23047d.a();
        this.f23058x = null;
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
        if (this.f23058x == null) {
            this.f23058x = C2482j.m13283a(getPlayStoreUiElementType());
        }
        return this.f23058x;
    }

    public ad getParentNode() {
        return this.f23056m;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
