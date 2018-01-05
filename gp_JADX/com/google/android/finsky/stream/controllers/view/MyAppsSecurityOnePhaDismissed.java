package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.p011c.p012a.C0054l;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.stream.controllers.assist.security.SecurityUtils;
import com.squareup.leakcanary.C7582R;

public class MyAppsSecurityOnePhaDismissed extends LinearLayout implements C2625e {
    public ImageView f22987a;

    public MyAppsSecurityOnePhaDismissed(Context context) {
        this(context, null);
    }

    public MyAppsSecurityOnePhaDismissed(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyAppsSecurityOnePhaDismissed(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22987a = (ImageView) findViewById(C7582R.id.security_one_pha_dismissed_refresh);
        ImageView imageView = (ImageView) findViewById(C7582R.id.security_one_pha_dismissed_icon);
        C0054l a = C0054l.m66a(getContext().getResources(), C7582R.drawable.ic_play_protect_alert_black_24dp, null);
        C0054l a2 = C0054l.m66a(getContext().getResources(), C7582R.drawable.ic_refresh_white_24dp, null);
        int a3 = C1608h.m9243a(getContext(), 3);
        SecurityUtils.m20042a(imageView, a, getResources().getColor(C7582R.color.myapps_warning_color));
        SecurityUtils.m20042a(this.f22987a, a2, a3);
    }

    public void setupOnRefreshListener(OnClickListener onClickListener) {
        this.f22987a.setOnClickListener(onClickListener);
    }
}
