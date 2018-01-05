package com.google.android.wallet.instrumentmanager.ui.p392c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6505l;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.common.p376a.C6563p;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.instrumentmanager.C6634c;
import com.google.android.wallet.instrumentmanager.C6641d;
import com.google.android.wallet.instrumentmanager.p386b.p387a.C6630a;
import com.google.android.wallet.instrumentmanager.ui.common.ImInfoMessageView;
import com.google.android.wallet.instrumentmanager.ui.p391b.C6657a;
import com.google.android.wallet.instrumentmanager.ui.p391b.C6663g;
import com.google.android.wallet.nfc.C6525b;
import com.google.android.wallet.ui.address.C6711b;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.bv;
import com.google.android.wallet.ui.common.ch;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.p405f.C6818a;
import com.google.protobuf.nano.i;
import java.util.ArrayList;
import java.util.List;

public final class C6667a extends au implements C6504m, C6663g, C6525b, bv {
    public a f32875a;
    public final C6506n f32876b = new C6506n(1665);
    public int[] f32877c;
    public int f32878d = 0;
    public RegionCodeView f32879e;
    public ArrayList f32880f = new ArrayList();
    public ImInfoMessageView f32881g;

    public final ArrayList aa() {
        return this.f32880f;
    }

    public final boolean mo5535a(g gVar) {
        if (gVar.b.b.equals(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).a.a)) {
            throw new IllegalArgumentException("Unknown FormFieldMessage fieldId: " + gVar.b.c);
        }
        int size = this.f32880f.size();
        for (int i = 0; i < size; i++) {
            if (((ai) ((C6749z) this.f32880f.get(i)).f33285e).mo5535a(gVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean mo5523a(String str, int i) {
        int size = this.f32880f.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ai) ((C6749z) this.f32880f.get(i2)).f33285e).mo5523a(str, i)) {
                return true;
            }
        }
        return false;
    }

    public final void mo5533W() {
        if (this.f32881g != null) {
            boolean z = this.aH;
            if (this.f32879e != null) {
                this.f32879e.setEnabled(z);
            }
            int size = this.f32880f.size();
            for (int i = 0; i < size; i++) {
                ((ch) ((C6749z) this.f32880f.get(i)).f33285e).mo5519b(z);
            }
            this.f32881g.setEnabled(z);
        }
    }

    public final boolean mo5534X() {
        int size = this.f32880f.size();
        for (int i = 0; i < size; i++) {
            if (!((ai) ((C6749z) this.f32880f.get(i)).f33285e).mo5534X()) {
                return false;
            }
        }
        return true;
    }

    public final void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        if (bundle != null) {
            this.f32878d = bundle.getInt("selectedRegionCode", 0);
            if (this.f32878d != 0) {
                this.f32875a = C6600l.m29936a(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).e, C6563p.m29793a(this.f32878d));
            }
        }
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C6641d.fragment_customer, viewGroup, false);
        this.f32881g = (ImInfoMessageView) inflate.findViewById(C6634c.customer_legal_message_text);
        this.f32881g.setParentUiNode(this);
        this.f32881g.setUrlClickListener(ap());
        if (((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).b == null && ((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).c == null) {
            m30144a(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).e == null ? null : ((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).e.a);
        }
        if (((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).b != null) {
            if (bundle != null) {
                this.f32877c = bundle.getIntArray("regionCodes");
            } else if (((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).b.b.length <= 0) {
                throw new IllegalArgumentException("LegalCountrySelector's allowed country codes cannot be empty");
            } else {
                this.f32877c = C6553f.m29739a(C6553f.m29740a(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).b.b));
            }
            this.f32879e = (RegionCodeView) inflate.findViewById(C6634c.legal_country_selector);
            this.f32879e.setLogContext(as());
            this.f32879e.setFormHeader(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).b.a);
            this.f32879e.setVisibility(0);
            this.f32879e.setRegionCodeSelectedListener(this);
            this.f32879e.setRegionCodes(this.f32877c);
            this.f32879e.m30671a(C6563p.m29792a(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).b.c));
        }
        if (((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).f.length > 1) {
            throw new IllegalArgumentException("Customer form with multiple tax info forms is not supported");
        }
        ai aiVar;
        if (((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).f.length == 1) {
            inflate.findViewById(C6634c.tax_info_fragment_holder).setVisibility(0);
            aiVar = (C6818a) j().a(C6634c.tax_info_fragment_holder);
            if (aiVar == null) {
                i iVar = ((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).f[0];
                int i = this.bc;
                LogContext as = as();
                aiVar = new C6818a();
                aiVar.f(au.m29850a(i, iVar, as));
                j().a().a(C6634c.tax_info_fragment_holder, aiVar).c();
            }
            this.f32880f.add(new C6749z(aiVar));
        }
        if (((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).c != null) {
            inflate.findViewById(C6634c.legal_address_entry_fragment_holder).setVisibility(0);
            aiVar = (C6711b) j().a(C6634c.legal_address_entry_fragment_holder);
            if (aiVar == null) {
                aiVar = ci.m30847a(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).c, this.bc, as());
                j().a().a(C6634c.legal_address_entry_fragment_holder, aiVar).c();
            }
            aiVar.m30383a((bv) this);
            this.f32880f.add(new C6749z(aiVar));
        }
        if (((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).d != null) {
            ai a;
            inflate.findViewById(C6634c.instrument_form_fragment_holder).setVisibility(0);
            au auVar = (au) j().a(C6634c.instrument_form_fragment_holder);
            if (auVar == null) {
                a = C6630a.m30007a(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).d, this.bc, null, as(), null);
                j().a().a(C6634c.instrument_form_fragment_holder, a).c();
                if (a instanceof C6657a) {
                    ((C6657a) a).f32856c = this;
                }
            } else {
                Object obj = auVar;
            }
            this.f32880f.add(new C6749z(a));
        }
        return inflate;
    }

    public final void mo5476b(Intent intent) {
        Fragment a = j().a(C6634c.instrument_form_fragment_holder);
        if (a instanceof C6525b) {
            ((C6525b) a).mo5476b(intent);
        }
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putIntArray("regionCodes", this.f32877c);
        bundle.putInt("selectedRegionCode", this.f32878d);
    }

    public final void m30157i(Bundle bundle) {
        super.i(bundle);
        mo5469a(6, Bundle.EMPTY);
    }

    public final void mo5568a(int i, int i2, boolean z) {
        if (this.f32878d != i) {
            this.f32878d = i;
            String a = C6563p.m29793a(i);
            if (!(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).b == null || i2 != this.f32879e.getId() || ((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).b.c.equals(a))) {
                Bundle bundle = new Bundle();
                bundle.putString("EventListener.EXTRA_FORM_ID", ((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).a.a);
                bundle.putInt("EventListener.EXTRA_FIELD_ID", 1);
                mo5469a(3, bundle);
            }
            m30144a(C6600l.m29936a(((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).e, a));
        }
    }

    public final C6506n getUiElement() {
        return this.f32876b;
    }

    public final List getChildren() {
        List arrayList = new ArrayList();
        if (this.f32879e != null) {
            arrayList.add(new C6505l(1668, this));
        }
        int size = this.f32880f.size();
        for (int i = 0; i < size; i++) {
            ai aiVar = (ai) ((C6749z) this.f32880f.get(i)).f33285e;
            if (aiVar instanceof C6504m) {
                arrayList.add((C6504m) aiVar);
            }
        }
        if (this.f32875a != null) {
            arrayList.add(this.f32881g);
        }
        return arrayList;
    }

    public final void mo5577a(boolean z, boolean z2, int i, long j) {
        int i2 = 0;
        if (z2) {
            this.f32881g.animate().setStartDelay(j);
            if (z) {
                ci.m30855a(this.f32881g, i);
            } else {
                ci.m30856a(this.f32881g, i, 0);
            }
            this.f32881g.animate().setStartDelay(0);
            return;
        }
        InfoMessageView infoMessageView = this.f32881g;
        if (!z) {
            i2 = 8;
        }
        infoMessageView.setVisibility(i2);
    }

    public final void mo5576a(int i) {
        this.f32881g.setTranslationY((float) i);
        this.f32881g.animate().translationY(0.0f).setStartDelay(150).start();
        this.f32881g.animate().setStartDelay(0);
    }

    public final boolean ae() {
        return (this.f32881g.f32901c || this.f32881g.f32902d) ? false : true;
    }

    public final void af() {
        this.f32881g.m30180a(true);
    }

    public final String ag() {
        return this.f32881g.getExpandLabel();
    }

    protected final h mo5521Z() {
        ao();
        return ((com.google.a.a.a.a.b.a.a.a.a.a) this.aD).a;
    }

    private final void m30144a(a aVar) {
        this.f32875a = aVar;
        this.f32881g.setInfoMessage(aVar == null ? null : aVar.c);
        mo5469a(6, Bundle.EMPTY);
    }
}
