package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.p011c.p012a.C0054l;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.stream.controllers.assist.security.SecurityUtils;
import com.squareup.leakcanary.C7582R;

public class MyAppsSecurityOnePha extends RelativeLayout implements C2625e {
    public ImageView f22986a;

    public MyAppsSecurityOnePha(Context context) {
        this(context, null);
    }

    public MyAppsSecurityOnePha(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyAppsSecurityOnePha(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        SecurityUtils.m20042a((ImageView) findViewById(C7582R.id.security_one_pha_icon), C0054l.m66a(getContext().getResources(), C7582R.drawable.ic_play_protect_alert_black_24dp, null), getResources().getColor(C7582R.color.myapps_warning_color));
        this.f22986a = (ImageView) findViewById(C7582R.id.security_one_pha_dismiss);
        SecurityUtils.m20042a(this.f22986a, C0054l.m66a(getContext().getResources(), C7582R.drawable.play_card_view_action_button_close, null), -7829368);
    }

    public void setDismissClickListener(OnClickListener onClickListener) {
        if (this.f22986a != null) {
            this.f22986a.setOnClickListener(onClickListener);
        }
    }

    public void setupLearnMore(OnClickListener onClickListener) {
        TextView textView = (TextView) findViewById(C7582R.id.security_one_pha_learn_more);
        if (textView != null) {
            textView.setText(getResources().getString(C7582R.string.myapps_security_learn_more).toUpperCase());
            textView.setTextColor(getResources().getColor(C7582R.color.play_apps_primary));
            textView.setOnClickListener(onClickListener);
        }
    }
}
