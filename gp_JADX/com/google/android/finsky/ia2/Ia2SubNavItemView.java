package com.google.android.finsky.ia2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class Ia2SubNavItemView extends ForegroundLinearLayout implements OnClickListener, ae {
    public TextView f16556a;
    public FifeImageView f16557b;
    public int f16558c;
    public C3223k f16559d;
    public int f16560e;

    public Ia2SubNavItemView(Context context) {
        this(context, null);
    }

    public Ia2SubNavItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Ia2SubNavItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16556a = (TextView) findViewById(C7582R.id.li_title);
        this.f16557b = (FifeImageView) findViewById(C7582R.id.li_icon);
        setOnClickListener(this);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(this.f16560e, MemoryMappedFileBuffer.DEFAULT_SIZE), i2);
    }

    public void onClick(View view) {
        if (this.f16559d != null) {
            this.f16559d.mo3378a(this.f16558c);
        }
    }

    public final void Z_() {
        this.f16559d = null;
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

    public int getContentWidth() {
        if (this.f16557b.getMeasuredWidth() > this.f16556a.getMeasuredWidth()) {
            return this.f16557b.getMeasuredWidth();
        }
        return this.f16556a.getMeasuredWidth();
    }

    public void setItemWidth(int i) {
        this.f16560e = i;
    }
}
