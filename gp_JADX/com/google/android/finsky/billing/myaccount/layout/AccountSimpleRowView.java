package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.frameworkviews.CircularImageView;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class AccountSimpleRowView extends AccountSeparatorRowView implements ad {
    public final ce f10356a;
    public ad f10357b;
    public CircularImageView f10358c;
    public LinearLayout f10359d;
    public TextView f10360e;
    public TextView f10361f;

    public AccountSimpleRowView(Context context) {
        this(context, null);
    }

    public AccountSimpleRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10356a = C2482j.m13283a(0);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10358c = (CircularImageView) findViewById(C7582R.id.sub_page_icon);
        this.f10359d = (LinearLayout) findViewById(C7582R.id.title_container);
        this.f10360e = (TextView) findViewById(C7582R.id.title);
        this.f10361f = (TextView) findViewById(C7582R.id.subtitle);
    }

    public final void m10688a(C2014c c2014c, C2495w c2495w) {
        if ((c2014c.f10408a == 0 && c2014c.f10409b == null) || c2014c.f10412e == 0 || c2014c.f10414g == 0 || c2014c.f10416i == null || c2014c.f10417j == null || c2014c.f10418k == -1 || c2014c.f10415h == null) {
            throw new IllegalArgumentException("Missing required binding params.");
        } else if (!(c2014c.f10410c == 0 && c2014c.f10411d == null) && c2014c.f10413f == 0) {
            throw new IllegalArgumentException("Text color is required for subtitle.");
        } else if (c2014c.f10410c != 0 && c2014c.f10411d != null) {
            throw new IllegalArgumentException("Both subtitleId and subtitle are set");
        } else if (c2014c.f10408a == 0 || c2014c.f10409b == null) {
            this.f10357b = c2014c.f10417j;
            this.f10356a.b(c2014c.f10418k);
            Resources resources = getResources();
            if (c2014c.f10409b != null) {
                this.f10360e.setText(c2014c.f10409b);
            } else {
                this.f10360e.setText(c2014c.f10408a);
            }
            if (c2014c.f10410c == 0 && c2014c.f10411d == null) {
                this.f10361f.setVisibility(8);
            } else {
                if (c2014c.f10411d != null) {
                    this.f10361f.setText(c2014c.f10411d);
                } else {
                    this.f10361f.setText(c2014c.f10410c);
                }
                this.f10361f.setTextColor(resources.getColor(c2014c.f10413f));
                this.f10361f.setVisibility(0);
            }
            this.f10358c.setBackgroundPaintColor(resources.getColor(c2014c.f10414g));
            try {
                this.f10358c.setImageDrawable(C0722q.m4782a(resources, c2014c.f10412e, new as().m4593b(resources.getColor(C7582R.color.white))));
                if (!c2014c.f10415h.booleanValue()) {
                    this.f10357b.mo1219a(this);
                }
                setOnClickListener(new C2013b(this, c2495w, c2014c));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Both titleId and title are set");
        }
    }

    protected final int mo2587a(boolean z) {
        return z ? this.f10359d.getRight() : this.f10359d.getLeft();
    }

    public ce getPlayStoreUiElement() {
        return this.f10356a;
    }

    public ad getParentNode() {
        return this.f10357b;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
