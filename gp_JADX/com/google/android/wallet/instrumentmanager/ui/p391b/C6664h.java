package com.google.android.wallet.instrumentmanager.ui.p391b;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.a.a.a.a.a.b.d;
import com.google.a.a.a.a.b.a.a.c.b.a.aa;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.b.a.an;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.C6547k;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.instrumentmanager.C6634c;
import com.google.android.wallet.instrumentmanager.C6641d;
import com.google.android.wallet.instrumentmanager.C6642e;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.ui.card.C6751r;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.DateEditText;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.cp;
import com.google.android.wallet.ui.common.p402c.C6739a;
import java.util.ArrayList;
import java.util.List;

public final class C6664h extends au implements OnClickListener, C6504m {
    public final C6506n f32869a = new C6506n(1651);
    public final ArrayList f32870b = new ArrayList();
    public TextView f32871c;
    public DateEditText f32872d;
    public FormEditText f32873e;
    public View f32874f;

    public final ArrayList aa() {
        return this.f32870b;
    }

    public final boolean mo5535a(g gVar) {
        if (!gVar.b.b.equals(((aa) this.aD).b) && !gVar.b.b.equals(((aa) this.aD).a.a)) {
            return false;
        }
        switch (gVar.b.c) {
            case 1:
                this.f32873e.mo5578a(gVar.c, true);
                break;
            case 2:
            case 3:
                this.f32872d.mo5578a(gVar.c, true);
                break;
            default:
                throw new IllegalArgumentException("Unknown FormFieldMessage fieldId: " + gVar.b.c);
        }
        return true;
    }

    protected final void mo5533W() {
        if (this.f32872d != null) {
            boolean z = this.aH;
            this.f32872d.setEnabled(z);
            this.f32873e.setEnabled(z);
            this.f32874f.setEnabled(z);
        }
    }

    public final boolean mo5534X() {
        return true;
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long j = 0;
        View inflate = layoutInflater.inflate(C6641d.fragment_credit_card_update, viewGroup, false);
        this.f32871c = (TextView) inflate.findViewById(C6634c.credit_card_label);
        this.f32871c.setText(((aa) this.aD).d);
        ((ImageWithCaptionView) inflate.findViewById(C6634c.card_logo)).m30638a(((aa) this.aD).c, C6600l.m29933a(h().getApplicationContext()), ((Boolean) C6489e.f32495a.a()).booleanValue(), as());
        this.f32872d = (DateEditText) inflate.findViewById(C6634c.exp_date);
        this.f32872d.setLogContext(as());
        this.f32873e = (FormEditText) inflate.findViewById(C6634c.cvc);
        this.f32873e.setLogContext(as());
        FormEditText formEditText = this.f32873e;
        long Y = mo5520Y();
        if (Y != 0) {
            Y = C6547k.m29719a(Y, 1);
        } else {
            Y = 0;
        }
        formEditText.setUiReference(Y);
        this.f32870b.add(new C6749z(0, this.f32872d));
        this.f32873e.setFilters(new InputFilter[]{new LengthFilter(((aa) this.aD).e)});
        this.f32874f = inflate.findViewById(C6634c.cvc_hint);
        this.f32874f.setOnClickListener(this);
        C6739a c6751r = new C6751r(this.f32873e, ((aa) this.aD).e);
        this.f32873e.mo5622a(c6751r);
        this.f32870b.add(new C6749z(0, this.f32873e));
        al alVar = new al();
        long Y2 = mo5520Y();
        if (Y2 != 0) {
            j = C6547k.m29719a(Y2, 5);
        }
        alVar.d = j;
        alVar.f = false;
        alVar.h = a(C6642e.wallet_uic_exp_date, new Object[]{"/"});
        alVar.a(new an());
        alVar.g().a = 2;
        alVar.g().b = new d();
        alVar.g().b.b = ((aa) this.aD).i;
        alVar.g().b.a = ((aa) this.aD).j;
        alVar.g().c = new d();
        alVar.g().c.b = ((aa) this.aD).k;
        alVar.g().c.a = ((aa) this.aD).l;
        cp.m30904a(alVar, this.f32872d, null);
        this.f32873e.m30508a(c6751r, this.f32873e, true);
        return inflate;
    }

    public final void onClick(View view) {
        if (view == this.f32874f && this.B.a("CvcInfoDialog") == null) {
            C6666i.m30142a(this.bc).a(this.B, "CvcInfoDialog");
        }
    }

    public final C6506n getUiElement() {
        return this.f32869a;
    }

    public final List getChildren() {
        return null;
    }

    protected final h mo5521Z() {
        ao();
        return ((aa) this.aD).a;
    }
}
