package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.myaccount.s;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.gb;
import com.google.android.finsky.cv.a.ke;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.w;

protected class SubscriptionRowView extends com.google.android.finsky.billing.myaccount.layout.a
{

    public com.google.android.finsky.bg.l p;
    public com.google.android.finsky.accounts.c q;
    public boolean r;
    public boolean s;
    public boolean t;
    public TextView u;
    public TextView v;
    public TextView w;
    public FifeImageView x;
    public LoggingActionButton y;
    public LoggingActionButton z;

    SubscriptionRowView(Context p0) {
        SubscriptionRowView(p0, 0);
    }

    SubscriptionRowView(Context p0, AttributeSet p1) {
        com.google.android.finsky.billing.myaccount.layout.a(p0, p1, 2642);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
    }

    private final boolean a(LoggingActionButton p0, com.google.android.finsky.cv.a.ke p1, Document p2, com.google.android.finsky.billing.myaccount.layout.p p3, com.google.android.finsky.billing.myaccount.layout.q p4, com.google.android.finsky.billing.myaccount.layout.o p5, com.google.android.finsky.billing.myaccount.layout.n p6, DfeToc p7, com.google.android.finsky.navigationmanager.a p8, com.google.android.finsky.d.w p9) {
        switch (p1.c) {
            case 1:
                if (!com.google.android.finsky.navigationmanager.e.a(p2))
                    v1 = 0;
                else {
                    p0.a(p1.d, new com.google.android.finsky.billing.myaccount.layout.g(this, p8, p2, new com.google.android.finsky.d.o(2644, this), p9), 2644, this);
                    v1 = 1;
                }
                break;
            case 2:
                p0.a(p1.d, new com.google.android.finsky.billing.myaccount.layout.j(this, p9, p2, p4), 2646, this);
                v1 = 1;
                break;
            case 3:
                p0.a(p1.d, new com.google.android.finsky.billing.myaccount.layout.h(this, p9, p2, p3, p1), 2643, this);
                v1 = 1;
                break;
            case 4:
                p0.a(p1.d, new com.google.android.finsky.billing.myaccount.layout.l(this, p9, p2, p8, p1, p7), 2645, this);
                v1 = 1;
                break;
            case 5:
                p0.a(p1.d, new com.google.android.finsky.billing.myaccount.layout.i(this, p9, p2, p3, p1), 2647, this);
                v1 = 1;
                break;
            case 6:
                p0.a(p1.d, new com.google.android.finsky.billing.myaccount.layout.k(this, p9, p2, p5, p1), 2648, this);
                v1 = 1;
                break;
            case 7:
                p0.a(p1.d, new com.google.android.finsky.billing.myaccount.layout.m(this, p6, p2, p1), 2649, this);
                v1 = 1;
                break;
            default:
                FinskyLog.e(32 + "Unknown action type: " + p1.c, new Object[0]);
                v1 = 0;
                break;
        }
        return v1;
    }

    public final void a(Document p0, com.google.android.play.image.w p1, boolean p2, DfeToc p3, com.google.android.finsky.billing.myaccount.layout.p p4, com.google.android.finsky.billing.myaccount.layout.q p5, com.google.android.finsky.billing.myaccount.layout.o p6, com.google.android.finsky.billing.myaccount.layout.n p7, com.google.android.finsky.navigationmanager.a p8, com.google.android.finsky.d.ad p9, com.google.android.finsky.d.w p10) {
        v8 = p0.bw();
        super.a(p0, v8.d, p1, p2, p8, p9, p10);
        if (!TextUtils.isEmpty(v8.f)) {
            this.u.setText(v8.f);
            this.u.setVisibility(0);
        }
        else
            this.u.setVisibility(4);
        if (!TextUtils.isEmpty(v8.c)) {
            this.w.setText(Html.fromHtml(v8.c));
            this.w.setTextColor(this.getResources().getColor(2131558549));
            this.w.setVisibility(0);
        }
        else if (!TextUtils.isEmpty(v8.b)) {
            this.w.setText(Html.fromHtml(v8.b));
            this.w.setTextColor(this.getResources().getColor(2131558988));
            this.w.setVisibility(0);
        }
        else
            this.w.setVisibility(4);
        if (!TextUtils.isEmpty(v8.g)) {
            this.v.setText(Html.fromHtml(v8.g));
            this.v.setVisibility(0);
        }
        else
            this.v.setVisibility(4);
        if (v8.h != 0) {
            this.t = 1;
            if (p2 != 0)
                v0 = 0;
            else
                v0 = 8;
            this.x.setVisibility(v0);
            this.p.a(this.x, v8.h.f, v8.h.i);
        }
        else
            this.x.setVisibility(8);
        this.r = 0;
        this.y.setVisibility(8);
        this.s = 0;
        this.z.setVisibility(8);
        v11 = 0;
        while (true) {
            if (v11 >= v8.l.length) {
                if (this.r != 0 && p2 != 0) {
                    this.y.setVisibility(0);
                    this.a(this.y);
                }
                if (this.s != 0 && p2 != 0) {
                    this.z.setVisibility(0);
                    this.a(this.z);
                }
                this.a();
                return;
            }
            v2 = v8.l[v11];
            if (this.r == 0) {
                v8 = p3;
                this.r = this.a(this.y, v2, p0, p4, p5, p6, p7, v8, p8, p10);
            }
            else {
                if (this.s != 0) {
                    if (this.r != 0 && p2 != 0) {
                        this.y.setVisibility(0);
                        this.a(this.y);
                    }
                    if (this.s != 0 && p2 != 0) {
                        this.z.setVisibility(0);
                        this.a(this.z);
                    }
                    this.a();
                    return;
                }
                v8 = p3;
                this.s = this.a(this.z, v2, p0, p4, p5, p6, p7, v8, p8, p10);
            }
            v11 = v11 + 1;
        }
    }

    public void onAnimationEnd(Animation p0) {
        if (p0 == this.d) {
            if (this.r != 0) {
                SubscriptionRowView.a(this.y);
                this.a(this.y);
            }
            if (this.s != 0) {
                SubscriptionRowView.a(this.z);
                this.a(this.z);
            }
            if (this.t != 0)
                SubscriptionRowView.a(this.x);
        }
    }

    public void onAnimationStart(Animation p0) {
        if (p0 == this.e) {
            this.y.setVisibility(8);
            this.z.setVisibility(8);
            this.x.setVisibility(8);
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.u = (TextView)this.findViewById(2131755851);
        this.v = (TextView)this.findViewById(2131756068);
        this.w = (TextView)this.findViewById(2131756758);
        this.x = (FifeImageView)this.findViewById(2131756759);
        this.y = (LoggingActionButton)this.findViewById(2131755777);
        this.z = (LoggingActionButton)this.findViewById(2131755776);
    }

}
