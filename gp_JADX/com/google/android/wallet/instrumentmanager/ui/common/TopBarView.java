package com.google.android.wallet.instrumentmanager.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.instrumentmanager.C6629a;
import com.google.android.wallet.instrumentmanager.C6634c;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.ui.common.ImageWithCaptionView;

public class TopBarView extends LinearLayout {
    public ImageWithCaptionView f32918a;
    public TextView f32919b;
    public boolean f32920c;

    public TopBarView(Context context) {
        super(context);
        m30184a(context);
    }

    public TopBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30184a(context);
    }

    public TopBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30184a(context);
    }

    @TargetApi(21)
    public TopBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m30184a(context);
    }

    private final void m30184a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6629a.imHideTitleIcon});
        this.f32920c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32919b = (TextView) findViewById(C6634c.title);
        this.f32918a = (ImageWithCaptionView) findViewById(C6634c.title_icon);
    }

    public final void m30185a(CharSequence charSequence, ad adVar) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f32919b.setVisibility(8);
        } else {
            this.f32919b.setText(charSequence);
            this.f32919b.setVisibility(0);
        }
        if (this.f32920c || adVar == null) {
            this.f32918a.setVisibility(8);
            return;
        }
        this.f32918a.setVisibility(0);
        this.f32918a.setFadeIn(true);
        this.f32918a.m30637a(adVar, C6600l.m29933a(getContext().getApplicationContext()), ((Boolean) C6489e.f32495a.a()).booleanValue());
    }

    public CharSequence getTitle() {
        return this.f32919b.getText();
    }
}
