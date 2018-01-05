package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.em;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class PreregIapRewardModuleLayout extends dk {
    public TextView f14031a;
    public FifeImageView f14032b;

    public PreregIapRewardModuleLayout(Context context) {
        this(context, null);
    }

    public PreregIapRewardModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14031a = (TextView) findViewById(C7582R.id.reward_description);
        this.f14032b = (FifeImageView) findViewById(C7582R.id.reward_badge);
    }

    public final void mo3007a(C2441n c2441n, C1294w c1294w, String str, OnClickListener onClickListener, OnClickListener onClickListener2) {
        super.mo3007a(c2441n, c1294w, str, onClickListener, onClickListener2);
        em emVar = c2441n.f13158G.f12545b;
        if (emVar.f12295e != null) {
            this.f14032b.setVisibility(0);
            this.f14032b.a(emVar.f12295e.f11860f, emVar.f12295e.f11863i, c1294w);
        } else {
            this.f14032b.setVisibility(8);
        }
        this.f14031a.setText(emVar.f12292b);
    }
}
