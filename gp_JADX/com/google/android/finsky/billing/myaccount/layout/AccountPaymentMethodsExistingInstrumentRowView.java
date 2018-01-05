package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.billing.myaccount.C1356s;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class AccountPaymentMethodsExistingInstrumentRowView extends AccountSeparatorRowView implements ad {
    public C1461c f10344a;
    public C1612l f10345b;
    public final ce f10346c;
    public ad f10347d;
    public FifeImageView f10348e;
    public LinearLayout f10349f;
    public TextView f10350g;
    public TextView f10351h;
    public TextView f10352i;
    public TextView f10353j;
    public boolean f10354k;

    public AccountPaymentMethodsExistingInstrumentRowView(Context context) {
        this(context, null);
    }

    public AccountPaymentMethodsExistingInstrumentRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10346c = C2482j.m13283a(818);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1761a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10348e = (FifeImageView) findViewById(C7582R.id.image_icon);
        this.f10349f = (LinearLayout) findViewById(C7582R.id.title_container);
        this.f10350g = (TextView) findViewById(C7582R.id.title);
        this.f10351h = (TextView) findViewById(C7582R.id.subtitle);
        this.f10352i = (TextView) findViewById(C7582R.id.byline);
        this.f10353j = (TextView) findViewById(C7582R.id.edit_button);
    }

    protected final int mo2587a(boolean z) {
        if (this.f10354k) {
            return super.mo2587a(z);
        }
        return z ? this.f10349f.getRight() : this.f10349f.getLeft();
    }

    public ce getPlayStoreUiElement() {
        return this.f10346c;
    }

    public ad getParentNode() {
        return this.f10347d;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
