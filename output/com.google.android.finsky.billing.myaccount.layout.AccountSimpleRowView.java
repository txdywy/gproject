package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.caverock.androidsvg.SVGParseException;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.q;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.CircularImageView;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;

protected class AccountSimpleRowView extends AccountSeparatorRowView implements com.google.android.finsky.d.ad
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public com.google.android.finsky.d.ad b;
    public CircularImageView c;
    public LinearLayout d;
    public TextView e;
    public TextView f;

    AccountSimpleRowView(Context p0) {
        AccountSimpleRowView(p0, 0);
    }

    AccountSimpleRowView(Context p0, AttributeSet p1) {
        AccountSeparatorRowView(p0, p1);
        this.a = com.google.android.finsky.d.j.a(0);
    }

    protected final int a(boolean p0) {
        if (p0 != 0)
            v0 = this.d.getRight();
        else
            v0 = this.d.getLeft();
        return v0;
    }

    public final void a(com.google.android.finsky.billing.myaccount.layout.c p0, com.google.android.finsky.d.w p1) {
        if (p0.a == 0 && (p0.b == 0 || p0.e == 0 || p0.g == 0 || p0.i == 0 || p0.j == 0 || p0.k == -1 || p0.h == 0))
            throw new IllegalArgumentException("Missing required binding params.");
        if ((p0.c != 0 || p0.d != 0) && p0.f == 0)
            throw new IllegalArgumentException("Text color is required for subtitle.");
        if (p0.c != 0 && p0.d != 0)
            throw new IllegalArgumentException("Both subtitleId and subtitle are set");
        if (p0.a != 0 && p0.b != 0)
            throw new IllegalArgumentException("Both titleId and title are set");
        this.b = p0.j;
        this.a.b(p0.k);
        v0 = this.getResources();
        if (p0.b != 0)
            this.e.setText(p0.b);
        else
            this.e.setText(p0.a);
        if (p0.c != 0 || p0.d != 0) {
            if (p0.d != 0)
                this.f.setText(p0.d);
            else
                this.f.setText(p0.c);
            this.f.setTextColor(v0.getColor(p0.f));
            this.f.setVisibility(0);
        }
        else
            this.f.setVisibility(8);
        this.c.setBackgroundPaintColor(v0.getColor(p0.g));
        try {
            this.c.setImageDrawable(com.caverock.androidsvg.q.a(v0, p0.e, new com.caverock.androidsvg.as().b(v0.getColor(2131558892))));
        }
        catch (SVGParseException ex) {
            throw new RuntimeException(ex);
        }
        if (!p0.h.booleanValue())
            this.b.a(this);
        this.setOnClickListener(new com.google.android.finsky.billing.myaccount.layout.b(this, p1, p0));
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this, p0);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return this.b;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (CircularImageView)this.findViewById(2131755311);
        this.d = (LinearLayout)this.findViewById(2131755306);
        this.e = (TextView)this.findViewById(2131755114);
        this.f = (TextView)this.findViewById(2131755307);
    }

}
