package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.myaccount.s;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;

protected class AccountPaymentMethodsExistingInstrumentRowView extends AccountSeparatorRowView implements com.google.android.finsky.d.ad
{

    public com.google.android.finsky.ba.c a;
    public com.google.android.finsky.bg.l b;
    public final com.google.wireless.android.a.a.a.a.ce c;
    public com.google.android.finsky.d.ad d;
    public FifeImageView e;
    public LinearLayout f;
    public TextView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public boolean k;

    AccountPaymentMethodsExistingInstrumentRowView(Context p0) {
        AccountPaymentMethodsExistingInstrumentRowView(p0, 0);
    }

    AccountPaymentMethodsExistingInstrumentRowView(Context p0, AttributeSet p1) {
        AccountSeparatorRowView(p0, p1);
        this.c = com.google.android.finsky.d.j.a(818);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
    }

    protected final int a(boolean p0) {
        if (this.k != 0)
            v0 = super.a(p0);
        else if (p0 != 0)
            v0 = this.f.getRight();
        else
            v0 = this.f.getLeft();
        return v0;
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this, p0);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return this.d;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.c;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = (FifeImageView)this.findViewById(2131755305);
        this.f = (LinearLayout)this.findViewById(2131755306);
        this.g = (TextView)this.findViewById(2131755114);
        this.h = (TextView)this.findViewById(2131755307);
        this.i = (TextView)this.findViewById(2131755308);
        this.j = (TextView)this.findViewById(2131755309);
    }

}
