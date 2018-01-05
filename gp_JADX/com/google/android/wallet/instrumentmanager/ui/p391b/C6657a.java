package com.google.android.wallet.instrumentmanager.ui.p391b;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.view.ai;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.a.a.a.a.a.b.d;
import com.google.a.a.a.a.b.a.a.c.b.a.ac;
import com.google.a.a.a.a.b.a.a.c.b.a.x;
import com.google.a.a.a.a.b.a.a.c.b.a.y;
import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.b.a.an;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6505l;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.clientlog.C6547k;
import com.google.android.wallet.common.p376a.C6563p;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.instrumentmanager.C6629a;
import com.google.android.wallet.instrumentmanager.C6632b;
import com.google.android.wallet.instrumentmanager.C6634c;
import com.google.android.wallet.instrumentmanager.C6641d;
import com.google.android.wallet.instrumentmanager.C6642e;
import com.google.android.wallet.instrumentmanager.ui.common.ImInfoMessageView;
import com.google.android.wallet.nfc.C6525b;
import com.google.android.wallet.nfc.C6646c;
import com.google.android.wallet.nfc.C6690a;
import com.google.android.wallet.nfc.C6692e;
import com.google.android.wallet.nfc.C6693f;
import com.google.android.wallet.nfc.C6695h;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.address.C6651s;
import com.google.android.wallet.ui.address.C6654r;
import com.google.android.wallet.ui.address.C6655w;
import com.google.android.wallet.ui.address.C6711b;
import com.google.android.wallet.ui.address.C6713c;
import com.google.android.wallet.ui.card.C6751r;
import com.google.android.wallet.ui.card.CardImagesView;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.C6795u;
import com.google.android.wallet.ui.common.DateEditText;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.bv;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.cp;
import com.google.android.wallet.ui.common.ct;
import com.google.android.wallet.ui.common.p402c.C6739a;
import com.google.android.wallet.ui.creditcard.C6656e;
import com.google.android.wallet.ui.creditcard.CreditCardNumberEditText;
import com.google.android.wallet.ui.p401c.C6734c;
import java.util.ArrayList;
import java.util.List;

public final class C6657a extends au implements OnClickListener, OnFocusChangeListener, OnItemClickListener, C6504m, C6525b, C6646c, C6654r, C6651s, C6655w, bv, C6656e {
    public int f32854a = 0;
    public TextWatcher aA;
    public TextWatcher aB;
    public final ArrayList aC = new ArrayList();
    public int af = 0;
    public int ag = 0;
    public C6692e ah;
    public boolean ai = true;
    public boolean aj;
    public Drawable ak;
    public RelativeLayout al;
    public CardImagesView am;
    public CreditCardNumberEditText an;
    public TextView ao;
    public View ap;
    public DateEditText aq;
    public FormEditText ar;
    public ImageView as;
    public View at;
    public View au;
    public ImageView av;
    public View[] aw;
    public ImInfoMessageView ax;
    public C6711b ay;
    public View az;
    public Intent f32855b;
    public C6663g f32856c;
    public a f32857d;
    public final C6506n f32858e = new C6506n(1650);
    public int f32859f = 0;
    public CreditCardEntryAction f32860g;
    public ArrayList f32861h;
    public boolean f32862i = true;

    public final boolean mo5524a(long[] jArr) {
        boolean z;
        boolean a = super.mo5524a(jArr);
        if (this.f32860g.f32508d || TextUtils.isEmpty(this.an.getError())) {
            z = false;
        } else {
            this.f32860g.f32508d = true;
            z = true;
        }
        if (!(this.f32860g.f32513i || TextUtils.isEmpty(this.aq.getError()))) {
            this.f32860g.f32513i = true;
            z = true;
        }
        if (z) {
            ah();
        }
        if (!a) {
            m30115a(5, false);
        }
        return a;
    }

    public final ArrayList aa() {
        return this.aC;
    }

    public final boolean mo5535a(g gVar) {
        if (!gVar.b.b.equals(((y) this.aD).a.a)) {
            return this.ay.mo5535a(gVar);
        }
        switch (gVar.b.c) {
            case 1:
                this.an.mo5578a(gVar.c, true);
                if (!this.f32860g.f32508d) {
                    this.f32860g.f32508d = true;
                    ah();
                    break;
                }
                break;
            case 2:
                this.ar.mo5578a(gVar.c, true);
                break;
            case 3:
            case 4:
                this.aq.mo5578a(gVar.c, true);
                if (!this.f32860g.f32513i) {
                    this.f32860g.f32513i = true;
                    ah();
                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown FormFieldMessage fieldId: " + gVar.b.c);
        }
        m30115a(5, false);
        return true;
    }

    public final boolean mo5523a(String str, int i) {
        return this.ay.mo5523a(str, i);
    }

    public final void mo5533W() {
        if (this.an != null) {
            boolean z = this.aH;
            this.an.setEnabled(z);
            this.aq.setEnabled(z);
            this.ar.setEnabled(z);
            this.at.setEnabled(z);
            this.ay.mo5519b(z);
            this.as.setEnabled(z);
            this.ax.setEnabled(z);
            if (this.au != null) {
                this.au.setEnabled(z);
            }
            if (this.av != null) {
                this.av.setEnabled(z);
            }
        }
    }

    public final boolean mo5534X() {
        if (this.ay == null) {
            return false;
        }
        C6713c.m30415o();
        switch (this.f32854a) {
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    public final void mo5477b(Bundle bundle) {
        int length;
        int[] iArr;
        int i;
        int i2 = 0;
        super.mo5477b(bundle);
        if (bundle != null) {
            this.f32859f = bundle.getInt("selectedRegionCode", 0);
            if (this.f32859f != 0) {
                this.f32857d = C6600l.m29936a(((y) this.aD).h, C6563p.m29793a(this.f32859f));
            }
        }
        for (int i3 : ((y) this.aD).n) {
            int i32;
            if (i32 == 6 || i32 == 1) {
                this.f32855b = new com.google.android.gms.ocr.a(h()).a().a(ar()).b();
                if (this.f32855b == null) {
                    i32 = 0;
                }
                this.af = i32;
                if (NfcAdapter.getDefaultAdapter(h()) != null) {
                    iArr = ((y) this.aD).o;
                    length = iArr.length;
                    while (i2 < length) {
                        i = iArr[i2];
                        if (i != 1 || i == 2) {
                            this.ag = i;
                            break;
                        }
                        i2++;
                    }
                }
                this.ah = al() ? new C6693f(h(), this) : new C6695h();
                if (bundle != null) {
                    this.f32860g = (CreditCardEntryAction) bundle.getParcelable("creditCardEntryAction");
                    this.f32861h = ParcelableProto.m29891b(bundle, "creditCardInputResults");
                }
                if (this.f32860g == null) {
                    this.f32860g = new CreditCardEntryAction();
                    this.f32860g.f32505a = ai();
                    this.f32860g.f32521q = al();
                    this.f32860g.f32522r = this.ah.mo5603c();
                    this.f32860g.f32528x = this.af;
                    this.f32860g.f32529y = this.ag;
                }
                if (this.f32861h == null) {
                    this.f32861h = new ArrayList(2);
                }
            }
        }
        if (NfcAdapter.getDefaultAdapter(h()) != null) {
            iArr = ((y) this.aD).o;
            length = iArr.length;
            while (i2 < length) {
                i = iArr[i2];
                if (i != 1) {
                }
                this.ag = i;
                break;
            }
        }
        if (al()) {
        }
        this.ah = al() ? new C6693f(h(), this) : new C6695h();
        if (bundle != null) {
            this.f32860g = (CreditCardEntryAction) bundle.getParcelable("creditCardEntryAction");
            this.f32861h = ParcelableProto.m29891b(bundle, "creditCardInputResults");
        }
        if (this.f32860g == null) {
            this.f32860g = new CreditCardEntryAction();
            this.f32860g.f32505a = ai();
            this.f32860g.f32521q = al();
            this.f32860g.f32522r = this.ah.mo5603c();
            this.f32860g.f32528x = this.af;
            this.f32860g.f32529y = this.ag;
        }
        if (this.f32861h == null) {
            this.f32861h = new ArrayList(2);
        }
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CreditCardNumberEditText creditCardNumberEditText;
        int i;
        long j = 0;
        View inflate = layoutInflater.inflate(C6641d.fragment_add_credit_card, viewGroup, false);
        this.al = (RelativeLayout) inflate.findViewById(C6634c.credit_card_root);
        if (!TextUtils.isEmpty(((y) this.aD).a.d)) {
            TextView textView = (TextView) this.al.findViewById(C6634c.add_credit_card_title);
            textView.setText(((y) this.aD).a.d);
            textView.setVisibility(0);
        }
        int length = ((y) this.aD).b.length;
        ad[] adVarArr = new ad[length];
        for (int i2 = 0; i2 < length; i2++) {
            adVarArr[i2] = ((y) this.aD).b[i2].c;
        }
        this.am = (CardImagesView) inflate.findViewById(C6634c.credit_card_images);
        this.am.m30485a(adVarArr, ad.a(), false);
        this.ao = (TextView) inflate.findViewById(C6634c.card_number_concealed);
        this.an = (CreditCardNumberEditText) inflate.findViewById(C6634c.card_number);
        this.an.setLogContext(as());
        FormEditText formEditText = this.an;
        long Y = mo5520Y();
        if (Y != 0) {
            Y = C6547k.m29719a(Y, 1);
        } else {
            Y = 0;
        }
        formEditText.setUiReference(Y);
        this.ap = inflate.findViewById(C6634c.exp_date_and_cvc);
        this.aq = (DateEditText) inflate.findViewById(C6634c.exp_date);
        this.aq.setLogContext(as());
        this.ar = (FormEditText) inflate.findViewById(C6634c.cvc);
        this.ar.setFilters(new InputFilter[]{new LengthFilter(4)});
        this.ar.setLogContext(as());
        formEditText = this.ar;
        Y = mo5520Y();
        if (Y != 0) {
            Y = C6547k.m29719a(Y, 2);
        } else {
            Y = 0;
        }
        formEditText.setUiReference(Y);
        this.aC.add(new C6749z(0, this.an));
        this.aC.add(new C6749z(0, this.aq));
        this.as = (ImageView) inflate.findViewById(C6634c.cvc_hint);
        this.as.setOnClickListener(this);
        if (this.ag == 1) {
            this.av = (ImageView) inflate.findViewById(C6634c.nfc_icon);
            this.av.setOnClickListener(this);
            this.av.setVisibility(0);
        } else if (this.ag == 2) {
            creditCardNumberEditText = this.an;
            if (creditCardNumberEditText.f33721r == null) {
                creditCardNumberEditText.f33721r = new C6795u(C6617a.uicNfcDrawable, creditCardNumberEditText.getResources().getString(C6625i.wallet_uic_nfc_popup_title), 2);
                creditCardNumberEditText.m30935a(creditCardNumberEditText.f33721r);
            }
            this.an.setOnItemClickListener(this);
        }
        if (this.af == 1) {
            this.au = inflate.findViewById(C6634c.ocr_icon);
            this.au.setOnClickListener(this);
            this.au.setVisibility(0);
        } else if (this.af == 6) {
            creditCardNumberEditText = this.an;
            if (creditCardNumberEditText.f33720q == null) {
                creditCardNumberEditText.f33720q = new C6795u(C6617a.uicCameraDrawable, creditCardNumberEditText.getResources().getString(C6625i.wallet_uic_ocr_button), 1);
                creditCardNumberEditText.m30935a(creditCardNumberEditText.f33720q);
            }
            this.an.setOnItemClickListener(this);
        }
        this.at = inflate.findViewById(C6634c.expand_icon);
        this.at.setOnClickListener(this);
        this.ax = (ImInfoMessageView) inflate.findViewById(C6634c.add_card_legal_message_text);
        this.ax.setParentUiNode(this);
        this.ax.setUrlClickListener(ap());
        C6739a c6751r = new C6751r(this.ar, this.an);
        this.ar.mo5622a(c6751r);
        this.aC.add(new C6749z(0, this.ar));
        al alVar = new al();
        long Y2 = mo5520Y();
        if (Y2 != 0) {
            j = C6547k.m29719a(Y2, 7);
        }
        alVar.d = j;
        alVar.f = false;
        alVar.h = a(C6642e.wallet_uic_exp_date, new Object[]{"/"});
        alVar.a(new an());
        alVar.g().a = 2;
        alVar.g().b = new d();
        alVar.g().b.b = ((y) this.aD).i;
        alVar.g().b.a = ((y) this.aD).j;
        alVar.g().c = new d();
        alVar.g().c.b = ((y) this.aD).k;
        alVar.g().c.a = ((y) this.aD).l;
        cp.m30904a(alVar, this.aq, null);
        this.ar.m30508a(c6751r, this.ar, true);
        this.an.m30508a(this.an, this.an, false);
        this.ar.mo5583a(new C6658b(this));
        this.an.setOnCardNumberChangedListener(this);
        this.an.setAllowedCardTypes(((y) this.aD).b);
        this.an.setInvalidBins(((y) this.aD).e);
        this.an.setNoMatchPanMessage(((y) this.aD).c);
        this.an.setInvalidPanMessage(((y) this.aD).d);
        this.az = inflate.findViewById(C6634c.address_fragment_holder);
        this.ay = (C6711b) j().a(C6634c.address_fragment_holder);
        if (this.ay == null) {
            this.ay = ci.m30847a(((y) this.aD).f, this.bc, as());
            j().a().a(C6634c.address_fragment_holder, this.ay).c();
        }
        this.aC.add(new C6749z(this.ay));
        this.ay.m30383a((bv) this);
        this.ay.f33096g.f33113F = this;
        this.ay.f33096g.f33112E = this;
        this.ay.m30382a((C6651s) this);
        this.aw = new View[]{this.al, this.am, this.an, this.ao, this.at, this.au, this.av, this.ap, this.az, this.ax};
        if (bundle != null) {
            i = bundle.getInt("viewState", 3);
        } else {
            i = 1;
        }
        m30115a(i, false);
        this.aA = new C6659c(this);
        this.aB = new C6660d(this);
        return inflate;
    }

    public final void mo5537u() {
        super.mo5537u();
        this.ah.mo5600a();
        boolean c = this.ah.mo5603c();
        if (!(this.ah.mo5604d() || this.ai || !c)) {
            m30104b("tagNfcInfoDialog");
            ak();
        }
        this.an.mo5627c();
        if (this.f32860g.f32522r != c) {
            this.f32860g.f32522r = c;
            ah();
        }
    }

    public final void mo5559v() {
        super.mo5559v();
        this.ah.mo5602b();
        this.ai = this.ah.mo5603c();
    }

    private final void m30106e(boolean z) {
        if (z) {
            Runnable c6661e;
            m30102a(150);
            int a = ci.m30840a(this.am);
            int a2 = ci.m30840a(this.an);
            int a3 = ci.m30840a(this.ap);
            this.am.m30484a();
            ci.m30856a(this.an, 0, -a);
            if (this.au != null && this.au.getVisibility() == 0) {
                ci.m30856a(this.au, 0, -a);
            }
            if (this.av != null && this.av.getVisibility() == 0) {
                ci.m30856a(this.av, 0, -a);
            }
            ci.m30855a(this.ao, a);
            ci.m30855a(this.at, a);
            LayoutParams layoutParams = (LayoutParams) this.ap.getLayoutParams();
            ci.m30865a(layoutParams, ci.m30835a(3), ai.a.k(this.ap));
            layoutParams.addRule(ci.m30835a(10));
            ci.m30856a(this.ap, a + a2, 0);
            ((LayoutParams) this.az.getLayoutParams()).addRule(ci.m30835a(3), this.am.getId());
            int i = a2 + a3;
            View findViewById = this.az.findViewById(C6634c.address_field_recipient);
            if (findViewById instanceof FormEditText) {
                FormEditText formEditText = (FormEditText) findViewById;
                a = formEditText.getThreshold();
                formEditText.setThreshold(Integer.MAX_VALUE);
                c6661e = new C6661e(formEditText, a);
            } else {
                c6661e = null;
            }
            ci.m30859a(this.az, i, c6661e);
            ci.m30855a(this.ax, i);
            if (this.f32856c != null) {
                this.f32856c.mo5577a(true, true, i, 150);
            }
            m30102a(0);
            return;
        }
        this.az.setVisibility(0);
        this.ax.setVisibility(0);
        if (this.f32856c != null) {
            this.f32856c.mo5577a(true, false, 0, 0);
        }
        this.at.setVisibility(0);
        this.an.setVisibility(8);
        if (this.au != null) {
            this.au.setVisibility(8);
        }
        if (this.av != null) {
            this.av.setVisibility(8);
        }
        this.ao.setVisibility(0);
        this.am.m30484a();
        this.ap.setVisibility(8);
    }

    private final void m30107f(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.an.getLayoutParams();
        layoutParams.leftMargin = i().getDimensionPixelSize(C6632b.wallet_im_credit_card_number_collapsed_start_margin);
        layoutParams.addRule(ci.m30835a(3), C6634c.add_credit_card_title);
        this.an.setLayoutParams(layoutParams);
        if (this.au != null) {
            layoutParams = (LayoutParams) this.au.getLayoutParams();
            layoutParams.addRule(ci.m30835a(3), C6634c.add_credit_card_title);
            this.au.setLayoutParams(layoutParams);
        }
        if (this.av != null) {
            layoutParams = (LayoutParams) this.av.getLayoutParams();
            layoutParams.addRule(ci.m30835a(3), C6634c.add_credit_card_title);
            this.av.setLayoutParams(layoutParams);
        }
        if (z) {
            m30102a(150);
            ci.m30856a(this.ao, 0, 0);
            ci.m30856a(this.at, 0, 0);
            ci.m30855a(this.an, 0);
            if (this.au != null) {
                ci.m30855a(this.au, 0);
            }
            if (this.av != null) {
                ci.m30855a(this.av, 0);
            }
        } else {
            this.ao.setVisibility(8);
            this.at.setVisibility(8);
            this.an.setVisibility(0);
            this.an.setTranslationY(0.0f);
            this.an.setAlpha(1.0f);
            if (this.au != null) {
                this.au.setVisibility(0);
                this.au.setTranslationY(0.0f);
                this.au.setAlpha(1.0f);
            }
            if (this.av != null) {
                this.av.setVisibility(0);
                this.av.setTranslationY(0.0f);
                this.av.setAlpha(1.0f);
            }
        }
        layoutParams = (LayoutParams) this.ap.getLayoutParams();
        ci.m30865a(layoutParams, ci.m30835a(10), ai.a.k(this.ap));
        layoutParams.addRule(ci.m30835a(3), this.an.getId());
        int i = -ci.m30840a(this.ao);
        if (z) {
            ci.m30855a(this.ap, i);
        } else {
            this.ap.setVisibility(0);
            this.ap.setTranslationY(0.0f);
            this.ap.setAlpha(1.0f);
        }
        ((LayoutParams) this.az.getLayoutParams()).addRule(ci.m30835a(3), this.ap.getId());
        if (z) {
            this.az.setTranslationY((float) i);
            this.az.animate().translationY(0.0f).start();
            this.ax.setTranslationY((float) i);
            this.ax.animate().translationY(0.0f).start();
            if (this.f32856c != null) {
                this.f32856c.mo5576a(i);
            }
            m30102a(0);
        }
    }

    private final void m30102a(long j) {
        int length = this.aw.length;
        for (int i = 0; i < length; i++) {
            if (this.aw[i] != null) {
                this.aw[i].animate().setStartDelay(j);
            }
        }
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putInt("viewState", this.f32854a);
        bundle.putInt("selectedRegionCode", this.f32859f);
        bundle.putParcelable("creditCardEntryAction", this.f32860g);
        bundle.putParcelableArrayList("creditCardInputResults", ParcelableProto.m29889a(this.f32861h));
    }

    public final void onClick(View view) {
        if (view.getId() == C6634c.expand_icon) {
            m30115a(5, true);
        } else if (view.getId() == C6634c.ocr_icon) {
            am();
        } else if (view.getId() == C6634c.nfc_icon) {
            an();
        } else if (view.getId() == C6634c.cvc_hint && this.B.a("tagCvcInfoDialog") == null) {
            C6666i.m30142a(this.bc).a(this.B, "tagCvcInfoDialog");
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = ((C6795u) this.an.getAdapter().getItem(i)).f33701c;
        if (i2 == 1) {
            am();
        } else if (i2 == 2) {
            an();
        } else {
            throw new IllegalArgumentException("Unknown DropDownItem event type: " + i2);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            m30115a(3, true);
        }
    }

    public final void m30112a(int i, int i2, Intent intent) {
        if (i != 500) {
            super.a(i, i2, intent);
            return;
        }
        mo5519b(true);
        CreditCardOcrResult a = CreditCardOcrResult.a(intent);
        if (intent != null) {
            this.f32860g.f32510f = intent.getBooleanExtra("com.google.android.gms.ocr.EXP_DATE_RECOGNITION_ENABLED", false);
            this.f32860g.f32515k = intent.getBooleanExtra("com.google.android.gms.ocr.NAME_RECOGNITION_ENABLED", false);
        }
        m30103a(C6600l.m29934a(a, i2), -1);
    }

    public final void m30125i(Bundle bundle) {
        super.i(bundle);
        mo5469a(6, Bundle.EMPTY);
        this.an.addTextChangedListener(this.aA);
        this.aq.addTextChangedListener(this.aB);
    }

    final void m30115a(int i, boolean z) {
        if (i > this.f32854a) {
            if (this.f32854a == 0) {
                switch (i) {
                    case 1:
                        if (this.au != null) {
                            this.au.setVisibility(0);
                        }
                        if (this.av != null) {
                            this.av.setVisibility(0);
                        }
                        this.ap.setVisibility(4);
                        this.an.mo5583a(new C6662f(this));
                        if (this.f32856c != null) {
                            this.f32856c.mo5577a(false, false, 0, 0);
                            break;
                        }
                        break;
                    case 2:
                        if (this.au != null) {
                            this.au.setVisibility(0);
                        }
                        if (this.av != null) {
                            this.av.setVisibility(0);
                        }
                        this.ar.setOnFocusChangeListener(this);
                        this.as.setVisibility(8);
                        if (this.f32856c != null) {
                            this.f32856c.mo5577a(false, false, 0, 0);
                            break;
                        }
                        break;
                    case 3:
                        if (this.au != null) {
                            this.au.setVisibility(0);
                        }
                        if (this.av != null) {
                            this.av.setVisibility(0);
                        }
                        if (this.f32856c != null) {
                            this.f32856c.mo5577a(false, false, 0, 0);
                            break;
                        }
                        break;
                    case 4:
                        m30106e(false);
                        break;
                    case 5:
                        this.az.setVisibility(0);
                        this.ax.setVisibility(0);
                        m30107f(false);
                        if (this.f32856c != null) {
                            this.f32856c.mo5577a(true, false, 0, 0);
                            break;
                        }
                        break;
                }
            } else if (this.f32854a == 1 && (i == 3 || i == 2)) {
                if (i == 2) {
                    this.as.setVisibility(8);
                    this.ar.setOnFocusChangeListener(this);
                }
                if (z) {
                    ci.m30855a(this.ap, -this.an.getHeight());
                } else {
                    this.ap.setVisibility(0);
                }
            } else if (this.f32854a == 4) {
                if (i == 5) {
                    m30107f(z);
                }
            } else if (i == 4) {
                this.ao.setText(this.an.getConcealedCardNumber());
                m30106e(true);
            } else if (this.f32854a == 2 && i == 3 && this.as.getVisibility() != 0) {
                ci.m30855a(this.as, 0);
            }
            this.f32854a = i;
            aw();
            mo5469a(1, Bundle.EMPTY);
        }
    }

    private final boolean ai() {
        return this.af != 0;
    }

    private final void m30104b(String str) {
        Fragment a = this.B.a(str);
        if (a != null) {
            this.B.a().a(a).c();
        }
    }

    public final void mo5476b(Intent intent) {
        if (al() && !this.ah.mo5604d()) {
            C6734c c6734c = (C6734c) this.B.a("tagNfcInfoDialog");
            mo5519b(false);
            if (c6734c != null) {
                c6734c.m30479Z();
            } else {
                m30104b("tagNfcErrorDialog");
                if (!(this.av == null || this.f32854a == 4)) {
                    this.aj = true;
                    TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6629a.uicNfcInProgressDrawable, C6629a.uicNfcDrawable});
                    Drawable drawable = obtainStyledAttributes.getDrawable(0);
                    this.ak = obtainStyledAttributes.getDrawable(1);
                    obtainStyledAttributes.recycle();
                    this.av.setImageDrawable(drawable);
                }
            }
            this.ah.mo5601a(intent);
        }
    }

    private final void ak() {
        Fragment a = C6734c.m30477a(this.bc, this.ah.mo5603c());
        a.a(this, 0);
        a.a(this.B, "tagNfcInfoDialog");
    }

    private final boolean al() {
        return this.ag != 0;
    }

    public final void mo5551a(int i, C6690a c6690a, long j) {
        m30104b("tagNfcInfoDialog");
        mo5519b(true);
        if (this.aj) {
            this.aj = false;
            this.av.setImageDrawable(this.ak);
        }
        ac a = C6600l.m29935a(c6690a, i);
        this.f32860g.f32527w = ci.m30888e(i);
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
                m30105c(c(C6642e.wallet_uic_nfc_unsupported_error_message));
                break;
            case 5:
                m30105c(c(C6642e.wallet_uic_nfc_transceive_error_message));
                break;
            case 6:
                m30105c(c(C6642e.wallet_uic_nfc_timeout_error_message));
                break;
            case 7:
                m30105c(c(C6642e.wallet_uic_nfc_rate_limit_error_message));
                break;
            default:
                throw new IllegalStateException("Unknown NFC result code: " + i);
        }
        m30103a(a, j);
    }

    public final void ab() {
        if (this.f32860g.f32516l != 1) {
            this.f32860g.f32516l = 1;
            ah();
        }
    }

    public final void ac() {
        if (!this.f32860g.f32518n) {
            this.f32860g.f32518n = true;
            ah();
        }
    }

    private final void m30105c(String str) {
        if (this.B.a("tagNfcErrorDialog") == null) {
            ct ctVar = new ct();
            ctVar.f33659b = c(C6642e.wallet_uic_nfc_error_title);
            ctVar.f33660c = str;
            ctVar.f33666i = this.bc;
            ctVar.f33663f = c(17039370);
            ctVar.m30918a().a(this.B, "tagNfcErrorDialog");
        }
    }

    private final void m30103a(ac acVar, long j) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = 1;
        this.f32861h.add(acVar);
        switch (acVar.b) {
            case 1:
                i = 2;
                i2 = 2;
                break;
            case 2:
                i = 3;
                i2 = 3;
                break;
            default:
                i = 0;
                i2 = 1;
                break;
        }
        if (TextUtils.isEmpty(acVar.d)) {
            z = false;
        } else {
            z = true;
        }
        if (acVar.e <= 0 || acVar.e > 12) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (TextUtils.isEmpty(acVar.g)) {
            z3 = false;
        } else {
            z3 = true;
        }
        int i4 = -1;
        if (z) {
            if (this.ao.getVisibility() == 0) {
                m30115a(5, false);
            }
            this.f32860g.f32506b = i2;
            if (this.f32854a == 1) {
                i4 = 2;
            }
            if (z2) {
                i4 = 3;
            }
            m30115a(i4, false);
            this.an.requestFocus();
            this.an.removeTextChangedListener(this.aA);
            this.an.mo5626a(acVar.d, i);
            this.an.addTextChangedListener(this.aA);
            if (z2) {
                this.f32860g.f32511g = i2;
                this.aq.removeTextChangedListener(this.aB);
                this.aq.requestFocus();
                this.aq.m30601a(Integer.toString(acVar.e), Integer.toString(acVar.f % 100), i);
                this.aq.addTextChangedListener(this.aB);
            }
            if (z3) {
                this.f32860g.f32516l = i2;
                this.ay.m30382a(null);
                this.ay.m30388b(acVar.g, i);
                this.ay.m30382a((C6651s) this);
            }
        }
        CreditCardEntryAction creditCardEntryAction;
        if (i2 == 2) {
            creditCardEntryAction = this.f32860g;
            if (this.f32860g.f32523s >= 0) {
                i3 = this.f32860g.f32523s + 1;
            }
            creditCardEntryAction.f32523s = i3;
            this.f32860g.f32524t = acVar.c;
            this.f32860g.f32507c = z;
            this.f32860g.f32512h = z2;
            this.f32860g.f32517m = z3;
        } else if (i2 == 3) {
            creditCardEntryAction = this.f32860g;
            if (this.f32860g.f32525u >= 0) {
                i3 = this.f32860g.f32525u + 1;
            }
            creditCardEntryAction.f32525u = i3;
            this.f32860g.f32526v = acVar.c;
            this.f32860g.f32509e = z;
            this.f32860g.f32514j = z2;
            this.f32860g.f32519o = z3;
            if (j >= 0) {
                this.f32860g.f32520p = j;
            }
        } else {
            throw new IllegalArgumentException("Unknown entry type: " + i2);
        }
        ah();
    }

    public final void mo5569a(x xVar) {
        this.am.setCardIcon(xVar != null ? xVar.c : null);
        int i = xVar != null ? xVar.d : 4;
        this.ar.setFilters(new InputFilter[]{new LengthFilter(i)});
        if (!TextUtils.isEmpty(this.ar.getText())) {
            this.ar.cQ_();
        }
    }

    public final void cR_() {
    }

    public final void mo5568a(int i, int i2, boolean z) {
        if (this.f32859f != i) {
            this.f32859f = i;
            this.f32857d = C6600l.m29936a(((y) this.aD).h, C6563p.m29793a(i));
            this.ax.setInfoMessage(this.f32857d == null ? null : this.f32857d.c);
            mo5469a(6, Bundle.EMPTY);
        }
    }

    public final void mo5567a(float f) {
        this.ax.setTranslationY(this.az.getTranslationY() + f);
    }

    public final C6506n getUiElement() {
        return this.f32858e;
    }

    public final List getChildren() {
        List arrayList = new ArrayList();
        if (ai()) {
            arrayList.add(new C6505l(1652, this));
        }
        if (al()) {
            arrayList.add(new C6505l(1655, this));
        }
        ab abVar = this.B;
        if (!(abVar == null || ((C6734c) abVar.a("tagNfcInfoDialog")) == null)) {
            arrayList.add(new C6505l(1656, this));
        }
        if (this.f32857d != null) {
            arrayList.add(this.ax);
        }
        return arrayList;
    }

    protected final h mo5521Z() {
        ao();
        return ((y) this.aD).a;
    }

    public final boolean ae() {
        return (this.ax.f32901c || this.ax.f32902d) ? false : true;
    }

    public final void af() {
        this.ax.m30180a(true);
    }

    public final String ag() {
        return this.ax.getExpandLabel();
    }

    private final void am() {
        startActivityForResult(this.f32855b, 500);
        mo5519b(false);
        C6567a.m29805a((C6504m) this, -1, 1652);
        C6567a.m29804a(new C6505l(1653, null), -1);
    }

    private final void an() {
        if (this.B.a("tagNfcInfoDialog") == null) {
            ak();
            C6567a.m29805a((C6504m) this, -1, 1655);
            C6567a.m29804a((C6504m) this, -1);
        }
    }

    final void ah() {
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 770);
        bundle.putParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA", this.f32860g);
        mo5469a(7, bundle);
    }

    public final void mo5570a(boolean z) {
        this.f32862i = z;
        aw();
    }

    private final void aw() {
        int i;
        if (this.f32854a < 4 || !this.f32862i) {
            i = -1;
        } else {
            i = C6634c.address_field_recipient;
        }
        this.ar.setNextFocusForwardId(i);
    }
}
