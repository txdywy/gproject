package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.p011c.p012a.C0054l;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.stream.controllers.assist.security.SecurityUtils;
import com.squareup.leakcanary.C7582R;

public class MyAppsSecurityInfo extends RelativeLayout implements C2625e {
    public ImageView f22984a;
    public ImageView f22985b;

    public MyAppsSecurityInfo(Context context) {
        this(context, null);
    }

    public MyAppsSecurityInfo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyAppsSecurityInfo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22984a = (ImageView) findViewById(C7582R.id.security_info_refresh);
        this.f22985b = (ImageView) findViewById(C7582R.id.security_info_icon);
        C0054l a = C0054l.m66a(getContext().getResources(), C7582R.drawable.ic_play_protect_check_black_24dp, null);
        C0054l a2 = C0054l.m66a(getContext().getResources(), C7582R.drawable.ic_refresh_white_24dp, null);
        int a3 = C1608h.m9243a(getContext(), 3);
        SecurityUtils.m20042a(this.f22985b, a, a3);
        SecurityUtils.m20042a(this.f22984a, a2, a3);
    }

    public void setupIconListener(OnClickListener onClickListener) {
        this.f22985b.setOnClickListener(onClickListener);
    }

    public void setupOnRefreshListener(OnClickListener onClickListener) {
        this.f22984a.setOnClickListener(onClickListener);
    }
}
