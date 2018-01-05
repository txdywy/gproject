package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.util.AttributeSet;
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

public class AccountPaymentMethodsCreatableInstrumentRowView extends AccountSeparatorRowView implements ad {
    public C1461c f10337a;
    public C1612l f10338b;
    public final ce f10339c;
    public ad f10340d;
    public FifeImageView f10341e;
    public TextView f10342f;
    public boolean f10343g;

    public AccountPaymentMethodsCreatableInstrumentRowView(Context context) {
        this(context, null);
    }

    public AccountPaymentMethodsCreatableInstrumentRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10339c = C2482j.m13283a(0);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1760a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10341e = (FifeImageView) findViewById(C7582R.id.image_icon);
        this.f10342f = (TextView) findViewById(C7582R.id.title);
    }

    protected final int mo2587a(boolean z) {
        if (this.f10343g) {
            return super.mo2587a(z);
        }
        return z ? this.f10342f.getRight() : this.f10342f.getLeft();
    }

    public ce getPlayStoreUiElement() {
        return this.f10339c;
    }

    public ad getParentNode() {
        return this.f10340d;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
