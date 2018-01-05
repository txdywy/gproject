package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.billing.myaccount.C1356s;
import com.google.android.finsky.cv.p177a.gb;
import com.google.android.finsky.cv.p177a.ke;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class SubscriptionRowView extends C2012a {
    public C1612l f10394p;
    public C0988c f10395q;
    public boolean f10396r;
    public boolean f10397s;
    public boolean f10398t;
    public TextView f10399u;
    public TextView f10400v;
    public TextView f10401w;
    public FifeImageView f10402x;
    public LoggingActionButton f10403y;
    public LoggingActionButton f10404z;

    public SubscriptionRowView(Context context) {
        this(context, null);
    }

    public SubscriptionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2642);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1763a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10399u = (TextView) findViewById(C7582R.id.price);
        this.f10400v = (TextView) findViewById(C7582R.id.status);
        this.f10401w = (TextView) findViewById(C7582R.id.subscription_details);
        this.f10402x = (FifeImageView) findViewById(C7582R.id.title_byline_icon);
        this.f10403y = (LoggingActionButton) findViewById(C7582R.id.primary_button);
        this.f10404z = (LoggingActionButton) findViewById(C7582R.id.secondary_button);
    }

    public void onAnimationStart(Animation animation) {
        if (animation == this.e) {
            this.f10403y.setVisibility(8);
            this.f10404z.setVisibility(8);
            this.f10402x.setVisibility(8);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (animation == this.d) {
            if (this.f10396r) {
                C2012a.m10693a(this.f10403y);
                mo1219a(this.f10403y);
            }
            if (this.f10397s) {
                C2012a.m10693a(this.f10404z);
                mo1219a(this.f10404z);
            }
            if (this.f10398t) {
                C2012a.m10693a(this.f10402x);
            }
        }
    }

    public final void m10702a(Document document, C1294w c1294w, boolean z, DfeToc dfeToc, C2005p c2005p, C2006q c2006q, C2004o c2004o, C2003n c2003n, C3748a c3748a, ad adVar, C2495w c2495w) {
        gb bw = document.bw();
        super.m10696a(document, bw.f12410d, c1294w, z, c3748a, adVar, c2495w);
        if (TextUtils.isEmpty(bw.f12412f)) {
            this.f10399u.setVisibility(4);
        } else {
            this.f10399u.setText(bw.f12412f);
            this.f10399u.setVisibility(0);
        }
        if (!TextUtils.isEmpty(bw.f12409c)) {
            this.f10401w.setText(Html.fromHtml(bw.f12409c));
            this.f10401w.setTextColor(getResources().getColor(C7582R.color.instrument_error_text));
            this.f10401w.setVisibility(0);
        } else if (TextUtils.isEmpty(bw.f12408b)) {
            this.f10401w.setVisibility(4);
        } else {
            this.f10401w.setText(Html.fromHtml(bw.f12408b));
            this.f10401w.setTextColor(getResources().getColor(C7582R.color.play_secondary_text));
            this.f10401w.setVisibility(0);
        }
        if (TextUtils.isEmpty(bw.f12413g)) {
            this.f10400v.setVisibility(4);
        } else {
            this.f10400v.setText(Html.fromHtml(bw.f12413g));
            this.f10400v.setVisibility(0);
        }
        if (bw.f12414h != null) {
            this.f10398t = true;
            this.f10402x.setVisibility(z ? 0 : 8);
            this.f10394p.m9288a(this.f10402x, bw.f12414h.f11860f, bw.f12414h.f11863i);
        } else {
            this.f10402x.setVisibility(8);
        }
        this.f10396r = false;
        this.f10403y.setVisibility(8);
        this.f10397s = false;
        this.f10404z.setVisibility(8);
        for (ke keVar : bw.f12418l) {
            if (this.f10396r) {
                if (this.f10397s) {
                    break;
                }
                this.f10397s = m10701a(this.f10404z, keVar, document, c2005p, c2006q, c2004o, c2003n, dfeToc, c3748a, c2495w);
            } else {
                this.f10396r = m10701a(this.f10403y, keVar, document, c2005p, c2006q, c2004o, c2003n, dfeToc, c3748a, c2495w);
            }
        }
        if (this.f10396r && z) {
            this.f10403y.setVisibility(0);
            mo1219a(this.f10403y);
        }
        if (this.f10397s && z) {
            this.f10404z.setVisibility(0);
            mo1219a(this.f10404z);
        }
        m10694a();
    }

    private final boolean m10701a(LoggingActionButton loggingActionButton, ke keVar, Document document, C2005p c2005p, C2006q c2006q, C2004o c2004o, C2003n c2003n, DfeToc dfeToc, C3748a c3748a, C2495w c2495w) {
        String str = keVar.f12864d;
        switch (keVar.f12863c) {
            case 1:
                if (!C3760e.m17904a(document)) {
                    return false;
                }
                loggingActionButton.m10692a(str, new C2017g(this, c3748a, document, new C2473o(2644, this), c2495w), 2644, this);
                return true;
            case 2:
                loggingActionButton.m10692a(str, new C2020j(this, c2495w, document, c2006q), 2646, this);
                return true;
            case 3:
                loggingActionButton.m10692a(str, new C2018h(this, c2495w, document, c2005p, keVar), 2643, this);
                return true;
            case 4:
                loggingActionButton.m10692a(str, new C2022l(this, c2495w, document, c3748a, keVar, dfeToc), 2645, this);
                return true;
            case 5:
                loggingActionButton.m10692a(str, new C2019i(this, c2495w, document, c2005p, keVar), 2647, this);
                return true;
            case 6:
                loggingActionButton.m10692a(str, new C2021k(this, c2495w, document, c2004o, keVar), 2648, this);
                return true;
            case 7:
                loggingActionButton.m10692a(str, new C2023m(this, c2003n, document, keVar), 2649, this);
                return true;
            default:
                FinskyLog.m21669e("Unknown action type: " + keVar.f12863c, new Object[0]);
                return false;
        }
    }
}
