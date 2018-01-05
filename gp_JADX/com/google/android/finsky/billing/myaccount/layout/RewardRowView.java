package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.ga;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;

public class RewardRowView extends C2012a {
    public boolean f10387p;
    public boolean f10388q;
    public boolean f10389r;
    public TextView f10390s;
    public TextView f10391t;
    public TextView f10392u;
    public PlayActionButtonV2 f10393v;

    public RewardRowView(Context context) {
        this(context, null);
    }

    public RewardRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2662);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10390s = (TextView) findViewById(C7582R.id.expiration_description);
        this.f10391t = (TextView) findViewById(C7582R.id.reward_description);
        this.f10392u = (TextView) findViewById(C7582R.id.remaining_description);
        this.f10393v = (PlayActionButtonV2) findViewById(C7582R.id.redeem_button);
    }

    public void onAnimationStart(Animation animation) {
        if (animation == this.e) {
            this.f10391t.setVisibility(8);
            this.f10392u.setVisibility(8);
            this.f10393v.setVisibility(8);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (animation == this.d) {
            if (this.f10387p) {
                C2012a.m10693a(this.f10391t);
            }
            if (this.f10388q) {
                C2012a.m10693a(this.f10392u);
            }
            if (this.f10389r) {
                C2012a.m10693a(this.f10393v);
            }
        }
    }

    public final void m10700a(Document document, C1294w c1294w, boolean z, DfeToc dfeToc, C3748a c3748a, ad adVar, C2495w c2495w) {
        super.m10696a(document, document.f14885a.f12100g, c1294w, z, c3748a, adVar, c2495w);
        ga aH = document.aH();
        if (((aH.f12400a & 2) != 0 ? 1 : null) != null) {
            this.f10390s.setText(aH.f12402c);
            this.f10390s.setVisibility(0);
        } else {
            this.f10390s.setVisibility(8);
        }
        this.f10387p = (document.f14885a.f12095b & 512) != 0;
        if (this.f10387p) {
            this.f10391t.setText(document.f14885a.f12105l);
            this.f10391t.setMovementMethod(LinkMovementMethod.getInstance());
            this.f10391t.setVisibility(z ? 0 : 8);
        } else {
            this.f10391t.setVisibility(8);
        }
        this.f10388q = (aH.f12400a & 8) != 0;
        if (this.f10388q) {
            this.f10392u.setText(aH.f12406g);
            this.f10392u.setMovementMethod(LinkMovementMethod.getInstance());
            this.f10392u.setVisibility(z ? 0 : 8);
        } else {
            this.f10392u.setVisibility(8);
        }
        this.f10389r = (aH.f12400a & 4) != 0;
        if (this.f10389r) {
            this.f10393v.mo2588a(10, aH.f12403d, new C2016f(this, c2495w, aH, c3748a, dfeToc, document));
            this.f10393v.setVisibility(z ? 0 : 8);
        } else {
            this.f10393v.setVisibility(8);
        }
        m10694a();
    }
}
