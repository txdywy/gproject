package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.billing.myaccount.C1356s;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.ho;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4683n;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;

public class OrderHistoryRowView extends C2012a {
    public C4683n f10377p;
    public boolean f10378q;
    public boolean f10379r;
    public TextView f10380s;
    public TextView f10381t;
    public TextView f10382u;
    public TextView f10383v;
    public PlayActionButtonV2 f10384w;
    public PlayActionButtonV2 f10385x;
    public ad f10386y;

    public OrderHistoryRowView(Context context) {
        this(context, null);
    }

    public OrderHistoryRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2602);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1762a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10380s = (TextView) findViewById(C7582R.id.date);
        this.f10381t = (TextView) findViewById(C7582R.id.price);
        this.f10382u = (TextView) findViewById(C7582R.id.status);
        this.f10383v = (TextView) findViewById(C7582R.id.purchase_details);
        this.f10384w = (PlayActionButtonV2) findViewById(C7582R.id.open_button);
        this.f10385x = (PlayActionButtonV2) findViewById(C7582R.id.refund_button);
    }

    public void onAnimationStart(Animation animation) {
        if (animation == this.e) {
            this.f10383v.setVisibility(8);
            this.f10384w.setVisibility(8);
            this.f10385x.setVisibility(8);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (animation == this.d) {
            if (this.f10378q) {
                C2012a.m10693a(this.f10383v);
            }
            if (this.f10379r) {
                C2012a.m10693a(this.f10384w);
            }
            if (m10698c()) {
                C2012a.m10693a(this.f10385x);
                mo1219a(this.f10386y);
            }
        }
    }

    public final void m10699a(Document document, C1294w c1294w, boolean z, C2002e c2002e, C3748a c3748a, C3026a c3026a, ad adVar, C2495w c2495w) {
        ho hoVar;
        super.m10696a(document, document.f14885a.f12100g, c1294w, z, c3748a, adVar, c2495w);
        if (document.f14885a.f12115v == null || document.f14885a.f12115v.f13144y == null) {
            hoVar = null;
        } else {
            hoVar = document.f14885a.f12115v.f13144y;
        }
        if (((hoVar.f12588a & 1) != 0 ? 1 : null) != null) {
            this.f10380s.setText(this.f10377p.m21826a(hoVar.f12589b));
            this.f10380s.setVisibility(0);
        } else {
            this.f10380s.setVisibility(4);
        }
        bl blVar = hoVar.f12593f;
        if (blVar == null || !blVar.aL_()) {
            this.f10380s.setVisibility(4);
        } else {
            this.f10381t.setText(hoVar.f12593f.f11917g);
            this.f10381t.setVisibility(0);
        }
        if (((hoVar.f12588a & 8) != 0 ? 1 : null) != null) {
            this.f10382u.setText(hoVar.f12594g);
            this.f10382u.setVisibility(0);
        } else {
            this.f10382u.setVisibility(4);
        }
        this.f10378q = (hoVar.f12588a & 4) != 0;
        if (this.f10378q) {
            this.f10383v.setText(Html.fromHtml(hoVar.f12591d));
            this.f10383v.setMovementMethod(LinkMovementMethod.getInstance());
            this.f10383v.setVisibility(z ? 0 : 8);
        } else {
            this.f10383v.setVisibility(8);
        }
        this.f10379r = C3760e.m17904a(document);
        if (this.f10379r) {
            String str;
            if (document.aQ()) {
                str = document.aP().f12393b;
            } else {
                str = getResources().getString(C7582R.string.view);
            }
            this.f10384w.mo2588a(10, str, (OnClickListener) this);
            this.f10384w.setVisibility(z ? 0 : 8);
        } else {
            this.f10384w.setVisibility(8);
        }
        this.f10386y = null;
        if (document.f14885a.f12098e == 1 && c3026a.f15829q) {
            this.f10386y = new C2473o(2603, document.f14885a.f12087D, this);
            this.f10385x.m6000a(10, (int) C7582R.string.refund, new C2015d(this, c2495w, c2002e, document, c3026a));
        }
        if (m10698c() && z) {
            this.f10385x.setVisibility(0);
            mo1219a(this.f10386y);
        } else {
            this.f10385x.setVisibility(8);
        }
        m10694a();
    }

    public void onClick(View view) {
        int i;
        if (this.f.aQ()) {
            i = 5550;
        } else {
            i = 2605;
        }
        this.i.mo3654a(this.f, new C2473o(i, this), getThumbnailCover(), this.j);
    }

    private final boolean m10698c() {
        return this.f10386y != null;
    }
}
