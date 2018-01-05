package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.myaccount.C1356s;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class AccountPaymentMethodsActionRowView extends AccountSeparatorRowView implements ad {
    public C1461c f10331a;
    public final ce f10332b;
    public ad f10333c;
    public ImageView f10334d;
    public TextView f10335e;
    public boolean f10336f;

    public AccountPaymentMethodsActionRowView(Context context) {
        this(context, null);
    }

    public AccountPaymentMethodsActionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10332b = C2482j.m13283a(0);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1759a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10334d = (ImageView) findViewById(C7582R.id.image_icon);
        this.f10335e = (TextView) findViewById(C7582R.id.title);
    }

    public final void m10681a(int i, int i2, OnClickListener onClickListener, boolean z, int i3, ad adVar) {
        int color;
        boolean z2 = true;
        int color2 = getResources().getColor(C7582R.color.account_action_fg);
        this.f10336f = z;
        if (this.f10331a.dj().mo2294a(12622358)) {
            setShouldDrawSeparator(true);
            color = getResources().getColor(C7582R.color.play_primary_text);
        } else {
            if (z) {
                z2 = false;
            }
            setShouldDrawSeparator(z2);
            color = color2;
        }
        this.f10335e.setText(i);
        this.f10335e.setTextColor(color);
        try {
            this.f10334d.setImageDrawable(C0722q.m4782a(getResources(), i2, new as().m4593b(color)));
            setOnClickListener(onClickListener);
            this.f10332b.b(i3);
            this.f10333c = adVar;
            this.f10333c.mo1219a(this);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected final int mo2587a(boolean z) {
        if (this.f10336f) {
            return super.mo2587a(z);
        }
        return z ? this.f10335e.getRight() : this.f10335e.getLeft();
    }

    public ce getPlayStoreUiElement() {
        return this.f10332b;
    }

    public ad getParentNode() {
        return this.f10333c;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
