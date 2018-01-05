package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.caverock.androidsvg.SVGParseException;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.q;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.myaccount.s;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.providers.d;
import com.google.wireless.android.a.a.a.a.ce;

protected class AccountPaymentMethodsActionRowView extends AccountSeparatorRowView implements com.google.android.finsky.d.ad
{

    public com.google.android.finsky.ba.c a;
    public final com.google.wireless.android.a.a.a.a.ce b;
    public com.google.android.finsky.d.ad c;
    public ImageView d;
    public TextView e;
    public boolean f;

    AccountPaymentMethodsActionRowView(Context p0) {
        AccountPaymentMethodsActionRowView(p0, 0);
    }

    AccountPaymentMethodsActionRowView(Context p0, AttributeSet p1) {
        AccountSeparatorRowView(p0, p1);
        this.b = com.google.android.finsky.d.j.a(0);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
    }

    protected final int a(boolean p0) {
        if (this.f != 0)
            v0 = super.a(p0);
        else if (p0 != 0)
            v0 = this.e.getRight();
        else
            v0 = this.e.getLeft();
        return v0;
    }

    public final void a(int p0, int p1, View$OnClickListener p2, boolean p3, int p4, com.google.android.finsky.d.ad p5) {
        v0 = 1;
        this.f = p3;
        if (this.a.dj().a(12622358)) {
            this.setShouldDrawSeparator(1);
            v0 = this.getResources().getColor(2131558985);
        }
        else {
            if (p3 != 0)
                v0 = 0;
            this.setShouldDrawSeparator(v0);
            v0 = this.getResources().getColor(2131558406);
        }
        this.e.setText(p0);
        this.e.setTextColor(v0);
        try {
            this.d.setImageDrawable(com.caverock.androidsvg.q.a(this.getResources(), p1, new com.caverock.androidsvg.as().b(v0)));
        }
        catch (SVGParseException ex) {
            throw new RuntimeException(ex);
        }
        this.setOnClickListener(p2);
        this.b.b(p4);
        this.c = p5;
        this.c.a(this);
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this, p0);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return this.c;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.b;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ImageView)this.findViewById(2131755305);
        this.e = (TextView)this.findViewById(2131755114);
    }

}
