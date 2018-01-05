package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.p011c.p012a.C0054l;
import android.support.v4.p013b.p014a.C0259a;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.squareup.leakcanary.C7582R;

public class MyAppsAssistCardAutoUpdate extends RelativeLayout implements C2625e {
    public ImageView f22975a;
    public PlayActionButtonV2 f22976b;

    public MyAppsAssistCardAutoUpdate(Context context) {
        this(context, null);
    }

    public MyAppsAssistCardAutoUpdate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyAppsAssistCardAutoUpdate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22976b = (PlayActionButtonV2) findViewById(C7582R.id.enable);
        this.f22976b.setDrawAsLabel(true);
        this.f22975a = (ImageView) findViewById(C7582R.id.close);
        Drawable a = C0054l.m66a(getContext().getResources(), C7582R.drawable.play_card_view_action_button_close, null);
        if (a != null) {
            a = C0259a.m1526e(a).mutate();
            C0259a.m1514a(a, Color.argb(51, 0, 0, 0));
            this.f22975a.setImageDrawable(a);
        }
    }

    public void setDismissButtonOnClickListener(OnClickListener onClickListener) {
        if (this.f22975a != null) {
            this.f22975a.setOnClickListener(onClickListener);
        }
    }

    public void setEnableButtonOnClickListener(OnClickListener onClickListener) {
        if (this.f22976b != null) {
            this.f22976b.m6000a(3, (int) C7582R.string.myapps_auto_update_assist_enable_button, onClickListener);
        }
    }
}
