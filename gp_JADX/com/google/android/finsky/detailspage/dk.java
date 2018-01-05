package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.PlayTextView;
import com.squareup.leakcanary.C7582R;

public class dk extends LinearLayout {
    public PlayTextView f14027e;
    public PlayTextView f14028f;
    public View f14029g;
    public View f14030h;

    public dk(Context context) {
        this(context, null);
    }

    public dk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14027e = (PlayTextView) findViewById(C7582R.id.reward_subtitle);
        this.f14028f = (PlayTextView) findViewById(C7582R.id.share_text);
        this.f14029g = findViewById(C7582R.id.share_button);
        this.f14030h = findViewById(C7582R.id.see_full_terms_button);
    }

    public void mo3007a(C2441n c2441n, C1294w c1294w, String str, OnClickListener onClickListener, OnClickListener onClickListener2) {
        this.f14027e.setText(getResources().getString(C7582R.string.preregistration_rewards_subtitle, new Object[]{c2441n.f13162b}));
        this.f14028f.setText(str);
        this.f14029g.setOnClickListener(onClickListener);
        this.f14030h.setOnClickListener(onClickListener2);
    }
}
