package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.h;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class PlayCategoryCircleItemView extends ForegroundLinearLayout implements OnClickListener, ad, ae {
    public TextView f18701a;
    public FifeImageView f18702b;
    public int f18703c;
    public int f18704d;
    public int f18705e;
    public String f18706f;
    public int f18707g;
    public ip f18708h;
    public C3748a f18709i;
    public DfeToc f18710j;
    public ad f18711k;
    public C2495w f18712l;
    public ce f18713m;

    public PlayCategoryCircleItemView(Context context) {
        this(context, null);
    }

    public PlayCategoryCircleItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayCategoryCircleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18701a = (TextView) findViewById(C7582R.id.li_title);
        this.f18702b = (FifeImageView) findViewById(C7582R.id.li_icon);
        setOnClickListener(this);
    }

    public void onClick(View view) {
        this.f18709i.mo3643a(this.f18708h, this.f18706f, this.f18707g, this.f18710j, (ad) this, 0, this.f18712l);
    }

    public int getIconWidth() {
        return this.f18702b == null ? 0 : this.f18702b.getLayoutParams().width;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f18704d == 0) {
            this.f18704d = getMeasuredWidth();
        }
        setMeasuredDimension(getMeasuredWidth() + this.f18705e, getMeasuredHeight());
    }

    public final void Z_() {
        this.f18706f = null;
        this.f18708h = null;
        this.f18709i = null;
        this.f18710j = null;
        this.f18711k = null;
        this.f18702b.a();
        this.f18713m = null;
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
        if (this.f18713m == null) {
            this.f18713m = C2482j.m13283a(101);
        }
        return this.f18713m;
    }

    public ad getParentNode() {
        return this.f18711k;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
