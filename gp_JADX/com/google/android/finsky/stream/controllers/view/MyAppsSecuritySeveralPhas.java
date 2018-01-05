package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.p011c.p012a.C0054l;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.stream.controllers.assist.security.SecurityUtils;
import com.squareup.leakcanary.C7582R;

public class MyAppsSecuritySeveralPhas extends RelativeLayout implements C2625e {
    public MyAppsSecuritySeveralPhas(Context context) {
        this(context, null);
    }

    public MyAppsSecuritySeveralPhas(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyAppsSecuritySeveralPhas(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        SecurityUtils.m20042a((ImageView) findViewById(C7582R.id.security_several_phas_icon), C0054l.m66a(getContext().getResources(), C7582R.drawable.ic_play_protect_alert_black_24dp, null), getResources().getColor(C7582R.color.myapps_warning_color));
    }
}
