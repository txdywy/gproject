package com.google.android.finsky.stream.controllers.jpkrquicklinks.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
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

public class JpkrQuickLinksBannerItem extends ForegroundLinearLayout implements OnClickListener, ad, ae {
    public C1612l f22527a;
    public TextView f22528b;
    public FifeImageView f22529c;
    public int f22530d;
    public ad f22531e;
    public ce f22532f;
    public C4433a f22533g;

    public JpkrQuickLinksBannerItem(Context context) {
        this(context, null);
    }

    public JpkrQuickLinksBannerItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((C1434c) C3947d.m18649a(C1434c.class)).mo1936a(this);
        super.onFinishInflate();
        this.f22528b = (TextView) findViewById(C7582R.id.li_title);
        this.f22529c = (FifeImageView) findViewById(C7582R.id.li_icon);
        setOnClickListener(this);
    }

    public void onClick(View view) {
        this.f22533g.mo4207a(this.f22530d, this);
    }

    public final void Z_() {
        this.f22529c.a();
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
        if (this.f22532f == null) {
            this.f22532f = C2482j.m13283a(101);
        }
        return this.f22532f;
    }

    public ad getParentNode() {
        return this.f22531e;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
