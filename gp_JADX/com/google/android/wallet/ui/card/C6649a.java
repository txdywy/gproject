package com.google.android.wallet.ui.card;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.c.b.a.ac;
import com.google.a.a.a.a.b.a.a.c.b.a.p;
import com.google.a.a.a.a.b.a.a.c.b.a.u;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.c;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.ocr.a;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6496d;
import com.google.android.wallet.analytics.C6499g;
import com.google.android.wallet.analytics.C6505l;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.clientlog.C6547k;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.nfc.C6525b;
import com.google.android.wallet.nfc.C6646c;
import com.google.android.wallet.nfc.C6690a;
import com.google.android.wallet.nfc.C6692e;
import com.google.android.wallet.nfc.C6693f;
import com.google.android.wallet.nfc.C6695h;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6513c;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.address.C6651s;
import com.google.android.wallet.ui.address.C6711b;
import com.google.android.wallet.ui.address.C6712a;
import com.google.android.wallet.ui.common.C6522i;
import com.google.android.wallet.ui.common.C6668c;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.C6795u;
import com.google.android.wallet.ui.common.DateEditText;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.FormHeaderView;
import com.google.android.wallet.ui.common.MaterialFieldLayout;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.ct;
import com.google.android.wallet.ui.expander.C6521h;
import com.google.android.wallet.ui.expander.C6811c;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import com.google.android.wallet.ui.p401c.C6734c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C6649a extends au implements OnClickListener, OnItemClickListener, C6499g, C6525b, C6646c, C6647i, C6648q {
    public final C6506n f32836a = new C6506n(1654);
    public CreditCardEntryAction aA;
    public ArrayList aB;
    public TextWatcher aC;
    public ImageView af;
    public CardLogoGridView ag;
    public C6652j ah;
    public SummaryExpanderWrapper ai;
    public C6749z aj;
    public final ArrayList ak = new ArrayList();
    public boolean al;
    public u am;
    public final C6811c an = new C6811c();
    public boolean ao;
    public boolean ap;
    public int aq = 1;
    public Intent ar;
    public int as = 0;
    public int at = 0;
    public C6692e au;
    public boolean av = true;
    public boolean aw;
    public Drawable ax;
    public C6494b ay;
    public C6496d az;
    public final ArrayList f32837b = new ArrayList();
    public RelativeLayout f32838c;
    public CardImagesView f32839d;
    public CardNumberEditText f32840e;
    public TextView f32841f;
    public View f32842g;
    public View f32843h;
    public LinearLayout f32844i;

    public final void mo5477b(Bundle bundle) {
        int length;
        int[] iArr;
        int i;
        int i2 = 0;
        super.mo5477b(bundle);
        for (int i3 : ((p) this.aD).g) {
            int i32;
            if (i32 == 6 || i32 == 1 || i32 == 3 || i32 == 7) {
                this.ar = new a(h()).a().a(ar()).b();
                if (this.ar == null) {
                    i32 = 0;
                }
                this.as = i32;
                if (NfcAdapter.getDefaultAdapter(h()) != null) {
                    iArr = ((p) this.aD).h;
                    length = iArr.length;
                    while (i2 < length) {
                        i = iArr[i2];
                        if (i != 1 || i == 2) {
                            this.at = i;
                            break;
                        }
                        i2++;
                    }
                }
                this.au = ay() ? new C6693f(h(), this) : new C6695h();
                if (((p) this.aD).a.f.length > 1) {
                    throw new IllegalArgumentException("Form header should contain at most a single component group.");
                } else if (((p) this.aD).a.f.length != 1) {
                    throw new IllegalArgumentException("Component groups are not supported.");
                } else {
                    if (bundle != null) {
                        this.aA = (CreditCardEntryAction) bundle.getParcelable("creditCardEntryAction");
                        this.aB = ParcelableProto.m29891b(bundle, "creditCardInputResults");
                        this.ap = bundle.getBoolean("hasAppliedCreditCardInputResult");
                    }
                    if (this.aA == null) {
                        this.aA = new CreditCardEntryAction();
                        this.aA.f32505a = ax();
                        this.aA.f32521q = ay();
                        this.aA.f32522r = this.au.mo5603c();
                        this.aA.f32528x = this.as;
                        this.aA.f32529y = this.at;
                        ah();
                    }
                    if (this.aB == null) {
                        this.aB = new ArrayList(2);
                    }
                }
            }
        }
        if (NfcAdapter.getDefaultAdapter(h()) != null) {
            iArr = ((p) this.aD).h;
            length = iArr.length;
            while (i2 < length) {
                i = iArr[i2];
                if (i != 1) {
                }
                this.at = i;
                break;
            }
        }
        if (ay()) {
        }
        this.au = ay() ? new C6693f(h(), this) : new C6695h();
        if (((p) this.aD).a.f.length > 1) {
            throw new IllegalArgumentException("Form header should contain at most a single component group.");
        } else if (((p) this.aD).a.f.length != 1) {
            if (bundle != null) {
                this.aA = (CreditCardEntryAction) bundle.getParcelable("creditCardEntryAction");
                this.aB = ParcelableProto.m29891b(bundle, "creditCardInputResults");
                this.ap = bundle.getBoolean("hasAppliedCreditCardInputResult");
            }
            if (this.aA == null) {
                this.aA = new CreditCardEntryAction();
                this.aA.f32505a = ax();
                this.aA.f32521q = ay();
                this.aA.f32522r = this.au.mo5603c();
                this.aA.f32528x = this.as;
                this.aA.f32529y = this.at;
                ah();
            }
            if (this.aB == null) {
                this.aB = new ArrayList(2);
            }
        } else {
            throw new IllegalArgumentException("Component groups are not supported.");
        }
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ad[] adVarArr;
        ad[] adVarArr2;
        CardNumberEditText cardNumberEditText;
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.internalUicCardFragmentRootLayout, C6617a.internalUicCardFragmentCollapsibleStateEnabled, C6617a.internalUicCardFragmentInlineCardImagesEnabled, C6617a.internalUicCardFragmentLeftSideCardImageEnabled, C6617a.internalUicCardFragmentMaterialFieldLayoutEnabled});
        int resourceId = obtainStyledAttributes.getResourceId(0, C6623g.fragment_card);
        this.ao = obtainStyledAttributes.getBoolean(1, false);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        boolean z3 = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        this.f32838c = (RelativeLayout) layoutInflater.inflate(resourceId, viewGroup, false);
        ((FormHeaderView) this.f32838c.findViewById(C6622f.header)).m30620a(((p) this.aD).a, layoutInflater, ap(), this, this.f32837b);
        boolean z4 = ((p) this.aD).f == 2 || ((p) this.aD).f == 3;
        this.f32839d = (CardImagesView) this.f32838c.findViewById(C6622f.card_images);
        if (z && (this.as == 1 || this.at == 1)) {
            this.f32839d = (CardImagesView) this.f32838c.findViewById(C6622f.card_images_above);
        }
        this.f32839d.setVisibility(0);
        if (((p) this.aD).e >= 0) {
            adVarArr = (ad[]) Arrays.copyOfRange(((p) this.aD).d, ((p) this.aD).e, ((p) this.aD).d.length);
            adVarArr2 = (ad[]) Arrays.copyOfRange(((p) this.aD).d, 0, ((p) this.aD).e);
        } else {
            ad[] adVarArr3 = ((p) this.aD).d;
            adVarArr = ad.a();
            adVarArr2 = adVarArr3;
        }
        this.f32839d.m30485a(adVarArr2, adVarArr, z4);
        this.f32840e = (CardNumberEditText) this.f32838c.findViewById(C6622f.card_number);
        this.f32840e.setLogContext(as());
        FormEditText formEditText = this.f32840e;
        long Y = mo5520Y();
        if (Y != 0) {
            Y = C6547k.m29719a(Y, 1);
        } else {
            Y = 0;
        }
        formEditText.setUiReference(Y);
        this.f32840e.m30508a(this.f32840e, this.f32840e, false);
        this.f32840e.setAllowedPanCategories(((p) this.aD).j);
        this.f32840e.setExcludedPanCategories(((p) this.aD).m);
        this.f32840e.setNoMatchPanMessage(((p) this.aD).k);
        this.f32840e.setInvalidPanMessage(((p) this.aD).l);
        this.f32840e.setOnPanCategoryChangedListener(this);
        C6516f.m29562a(this.f32840e, ((p) this.aD).i, this.aI, this.aJ);
        this.aj = new C6749z(((p) this.aD).i, this.f32838c.findViewById(C6622f.card_number));
        this.ak.add(this.aj);
        if (this.ao) {
            this.f32841f = (TextView) this.f32838c.findViewById(C6622f.card_number_concealed);
            this.f32841f.setPadding(this.f32840e.getPaddingLeft(), this.f32840e.getPaddingTop(), this.f32840e.getPaddingRight(), this.f32840e.getPaddingBottom());
            if (VERSION.SDK_INT >= 18 && VERSION.SDK_INT < 21) {
                this.f32841f.addOnLayoutChangeListener(new C6736b(this));
            }
            this.f32842g = this.f32838c.findViewById(C6622f.expand_icon);
            this.f32842g.setOnClickListener(this);
        }
        if (this.at == 1) {
            this.af = (ImageView) this.f32838c.findViewById(C6622f.nfc_icon);
            this.af.setOnClickListener(this);
            this.af.setVisibility(0);
        } else if (this.at == 2) {
            cardNumberEditText = this.f32840e;
            if (cardNumberEditText.f33259s == null) {
                cardNumberEditText.f33259s = new C6795u(C6617a.uicNfcDrawable, cardNumberEditText.getResources().getString(C6625i.wallet_uic_nfc_popup_title), 2);
                cardNumberEditText.m30534a(cardNumberEditText.f33259s);
            }
            this.f32840e.setOnItemClickListener(this);
        }
        switch (this.as) {
            case 1:
                this.f32843h = this.f32838c.findViewById(C6622f.ocr_icon);
                this.f32843h.setOnClickListener(this);
                this.f32843h.setVisibility(0);
                break;
            case 6:
                cardNumberEditText = this.f32840e;
                if (cardNumberEditText.f33258r == null) {
                    cardNumberEditText.f33258r = new C6795u(C6617a.uicCameraDrawable, cardNumberEditText.getResources().getString(C6625i.wallet_uic_ocr_button), 1);
                    cardNumberEditText.m30534a(cardNumberEditText.f33258r);
                }
                this.f32840e.setOnItemClickListener(this);
                break;
            case 7:
                if (z3) {
                    MaterialFieldLayout materialFieldLayout = (MaterialFieldLayout) this.f32838c.findViewById(C6622f.card_number_layout);
                    RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(C6623g.view_ocr_and_error, materialFieldLayout, false);
                    int i = C6622f.error_text;
                    if (materialFieldLayout.f33437j != null) {
                        materialFieldLayout.removeView(materialFieldLayout.f33437j);
                    } else if (materialFieldLayout.f33438k != null) {
                        materialFieldLayout.removeView(materialFieldLayout.f33438k);
                    }
                    materialFieldLayout.f33437j = relativeLayout;
                    materialFieldLayout.f33438k = (TextView) relativeLayout.findViewById(i);
                    materialFieldLayout.m30666a();
                    materialFieldLayout.m30667a(materialFieldLayout.f33437j, -1, new LayoutParams(materialFieldLayout.getLayoutParams()), true);
                    this.f32844i = (LinearLayout) relativeLayout.findViewById(C6622f.below_card_number_ocr_button);
                } else {
                    this.f32844i = (LinearLayout) this.f32838c.findViewById(C6622f.below_card_number_ocr_button);
                    this.f32844i.setVisibility(0);
                }
                this.f32844i.setOnClickListener(this);
                break;
        }
        if (((p) this.aD).f == 3) {
            this.ag = (CardLogoGridView) this.f32838c.findViewById(C6622f.card_logo_grid_view);
            this.ag.setLogos(adVarArr2);
            this.ag.setVisibility(0);
        }
        if (z2 && z4) {
            ak();
        }
        this.ah = (C6652j) j().a(C6622f.card_sub_form_fragment_holder);
        if (this.ah == null) {
            this.ah = ab();
            j().a().a(C6622f.card_sub_form_fragment_holder, this.ah).c();
        }
        this.ah.ap = this;
        this.ah.aq = this;
        C6652j c6652j = this.ah;
        C6513c c6513c = this.aI;
        C6512i c6512i = this.aJ;
        c6652j.aI = c6513c;
        c6652j.aJ = c6512i;
        this.ak.add(new C6749z(this.ah));
        this.aC = new C6737c(this);
        return this.f32838c;
    }

    public final void mo5469a(int i, Bundle bundle) {
        if ((i == 4 || i == 12) && C6749z.m30565g(this.ak) && !this.ap && ((p) this.aD).b != null && ((p) this.aD).b.e.length > 0) {
            this.ap = true;
            m30051a(((p) this.aD).b.e[0], -1);
        }
        super.mo5469a(i, bundle);
    }

    public C6652j ab() {
        p pVar = (p) this.aD;
        int i = this.bc;
        LogContext as = as();
        Fragment c6652j = new C6652j();
        c6652j.f(au.m29850a(i, pVar, as));
        return c6652j;
    }

    public final void mo5537u() {
        super.mo5537u();
        this.au.mo5600a();
        boolean c = this.au.mo5603c();
        if (!(this.au.mo5604d() || this.av || !c)) {
            m30053c("tagNfcInfoDialog");
            aw();
        }
        this.f32840e.mo5627c();
        if (this.aA.f32522r != c) {
            this.aA.f32522r = c;
            ah();
        }
    }

    public final void mo5559v() {
        super.mo5559v();
        this.au.mo5602b();
        this.av = this.au.mo5603c();
    }

    public final void m30071i(Bundle bundle) {
        super.i(bundle);
        if (bundle != null) {
            m30050a(bundle.getInt("viewState", 1), false);
        }
        this.f32840e.addTextChangedListener(this.aC);
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putInt("viewState", this.aq);
        bundle.putParcelable("creditCardEntryAction", this.aA);
        bundle.putParcelableArrayList("creditCardInputResults", ParcelableProto.m29889a(this.aB));
        bundle.putBoolean("hasAppliedCreditCardInputResult", this.ap);
    }

    public void onClick(View view) {
        if (view == this.f32842g) {
            m30050a(3, true);
        } else if (view == this.f32843h || view == this.f32844i) {
            am();
        } else if (view == this.af) {
            an();
        }
    }

    public final void m30058a(int i, int i2, Intent intent) {
        if (i != 500) {
            super.a(i, i2, intent);
            return;
        }
        mo5519b(true);
        CreditCardOcrResult a = CreditCardOcrResult.a(intent);
        if (intent != null) {
            this.aA.f32510f = intent.getBooleanExtra("com.google.android.gms.ocr.EXP_DATE_RECOGNITION_ENABLED", false);
            this.aA.f32515k = intent.getBooleanExtra("com.google.android.gms.ocr.NAME_RECOGNITION_ENABLED", false);
        }
        m30051a(C6600l.m29934a(a, i2), -1);
    }

    protected final void mo5533W() {
        if (this.f32840e != null) {
            boolean z = this.aH;
            this.f32840e.setEnabled(z);
            if (this.f32843h != null) {
                this.f32843h.setEnabled(z);
            }
            if (this.f32844i != null) {
                this.f32844i.setEnabled(z);
            }
            if (this.af != null) {
                this.af.setEnabled(z);
            }
            if (this.ai != null) {
                this.ai.setEnabled(z);
            }
            this.ah.mo5519b(z);
        }
    }

    public final boolean mo5534X() {
        if (this.f32840e == null) {
            return false;
        }
        return this.ah.mo5534X();
    }

    public C6506n getUiElement() {
        return this.f32836a;
    }

    public List getChildren() {
        if (this.f32840e == null) {
            return null;
        }
        List arrayList = new ArrayList(this.f32837b);
        if (ax()) {
            arrayList.add(new C6505l(1652, this));
        }
        if (ay()) {
            arrayList.add(new C6505l(1655, this));
        }
        ab abVar = this.B;
        if (!(abVar == null || ((C6734c) abVar.a("tagNfcInfoDialog")) == null)) {
            arrayList.add(new C6505l(1656, this));
        }
        arrayList.addAll(this.ah.getChildren());
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5524a(long[] r8) {
        /*
        r7 = this;
        r0 = 0;
        r1 = 1;
        r3 = super.mo5524a(r8);
        r2 = r7.aA;
        r2 = r2.f32508d;
        if (r2 != 0) goto L_0x005d;
    L_0x000c:
        r2 = r7.f32840e;
        r2 = r2.getError();
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x005d;
    L_0x0018:
        r2 = r7.aA;
        r2.f32508d = r1;
        r2 = r1;
    L_0x001d:
        if (r2 != 0) goto L_0x0054;
    L_0x001f:
        r2 = r7.ah;
        r4 = r7.aA;
        r5 = 3;
        r5 = r2.m30092b(r5);
        r6 = r4.f32513i;
        if (r6 != 0) goto L_0x003b;
    L_0x002c:
        if (r5 == 0) goto L_0x003b;
    L_0x002e:
        r5 = com.google.android.wallet.ui.common.cp.m30909b(r5);
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 != 0) goto L_0x003b;
    L_0x0038:
        r4.f32513i = r1;
        r0 = r1;
    L_0x003b:
        r2 = r2.m30092b(r1);
        r5 = r4.f32518n;
        if (r5 != 0) goto L_0x0052;
    L_0x0043:
        if (r2 == 0) goto L_0x0052;
    L_0x0045:
        r2 = com.google.android.wallet.ui.common.cp.m30909b(r2);
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x0052;
    L_0x004f:
        r4.f32518n = r1;
        r0 = r1;
    L_0x0052:
        if (r0 == 0) goto L_0x0057;
    L_0x0054:
        r7.ah();
    L_0x0057:
        if (r3 != 0) goto L_0x005c;
    L_0x0059:
        r7.ai();
    L_0x005c:
        return r3;
    L_0x005d:
        r2 = r0;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.card.a.a(long[]):boolean");
    }

    public final ArrayList aa() {
        return this.ak;
    }

    public final boolean mo5535a(g gVar) {
        if (!gVar.b.b.equals(((p) this.aD).a.a)) {
            boolean a = this.ah.mo5535a(gVar);
            if (!a) {
                return a;
            }
            ai();
            return a;
        } else if (gVar.b.c == 1) {
            this.f32840e.mo5578a(gVar.c, true);
            if (!this.aA.f32508d) {
                this.aA.f32508d = true;
                ah();
            }
            ai();
            return true;
        } else {
            throw new IllegalArgumentException("Unknown FormFieldMessage fieldId: " + gVar.b.c);
        }
    }

    public final void mo5552a(u uVar) {
        int i;
        int i2;
        boolean z;
        C6522i c6522i;
        int size;
        int i3;
        View view;
        C6811c expandable;
        int size2;
        c cVar;
        Object obj;
        SummaryExpanderWrapper summaryExpanderWrapper;
        c[] cVarArr;
        int length;
        SummaryExpanderWrapper summaryExpanderWrapper2;
        Object obj2;
        SummaryExpanderWrapper summaryExpanderWrapper3;
        int i4;
        int i5;
        Object obj3;
        Object obj4;
        RelativeLayout.LayoutParams layoutParams;
        SummaryExpanderWrapper summaryExpanderWrapper4;
        int i6;
        ArrayList arrayList;
        int i7;
        if (this.ai == null) {
            if (this.am != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (uVar != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((i2 ^ i) != 0) {
                z = true;
                this.am = uVar;
                this.ah.ao = uVar;
                c6522i = this.ah;
                size = c6522i.f32847c.size();
                for (i3 = 0; i3 < size; i3++) {
                    view = (View) c6522i.f32847c.get(i3);
                    if (view.getParent() == c6522i.f32845a) {
                        view.setVisibility(8);
                        ((ViewGroup) view.getParent()).removeView(view);
                        c6522i.f32845a.addView(view);
                        C6749z.m30555a((List) c6522i.an.get(i3), 0);
                    } else {
                        ci.m30877b(view, z);
                    }
                }
                i3 = c6522i.f32846b.size();
                for (i = 0; i < i3; i++) {
                    c6522i.f32845a.removeView((SummaryExpanderWrapper) c6522i.f32846b.get(i));
                }
                c6522i.f32846b.clear();
                if (c6522i.ah && c6522i.ak != null) {
                    c6522i.ak.mo5585b(c6522i);
                    c6522i.ak = null;
                }
                if (c6522i.getExpandable() != null) {
                    expandable = c6522i.getExpandable();
                    size2 = expandable.f33766b.size();
                    for (i = 0; i < size2; i++) {
                        ((C6811c) expandable.f33766b.get(i)).m31016b(null);
                    }
                    expandable.f33766b.clear();
                }
                if (this.ai != null) {
                    this.ai.getExpandable().m31015b();
                    this.ai.m30966a(this.aj);
                    if (uVar == null) {
                        this.ai.getExpandable().m31018c();
                    }
                    if (uVar != null) {
                        cVar = ((p) this.aD).a.f[0];
                    } else {
                        cVar = uVar.k[0];
                    }
                    this.ai.m30965a(cVar.n, cVar.g);
                }
                if (uVar != null) {
                    this.f32839d.setCardIcon(null);
                    if (this.ag != null) {
                        ci.m30862a(this.ag, z);
                    }
                } else {
                    this.f32839d.setCardIcon(((p) this.aD).d[uVar.i]);
                    if (this.ag != null) {
                        ci.m30877b(this.ag, z);
                    }
                    obj = this.ah;
                    summaryExpanderWrapper = this.ai;
                    cVarArr = obj.ao.k;
                    length = cVarArr.length;
                    summaryExpanderWrapper2 = null;
                    if (summaryExpanderWrapper != null) {
                        i = 0;
                    } else if (cVarArr[0].l != 0) {
                        summaryExpanderWrapper.getExpandable().m31018c();
                        i = 1;
                    } else {
                        summaryExpanderWrapper2 = summaryExpanderWrapper;
                        i = 0;
                    }
                    obj.ag.m30744b();
                    size = -1;
                    obj2 = null;
                    i3 = 0;
                    summaryExpanderWrapper3 = summaryExpanderWrapper2;
                    i4 = i;
                    while (i3 < obj.ao.j.length) {
                        i5 = obj.ao.j[i3];
                        obj3 = (i4 < length || i3 < cVarArr[i4].k - 1 || i3 > cVarArr[i4].l - 1) ? null : 1;
                        obj4 = (obj3 != null || ((p) obj.aD).c[i5].d.length <= 0 || ((p) obj.aD).c[i5].d[0].d() == null) ? null : 1;
                        if (obj3 != null || obj4 != null) {
                            view = (ViewGroup) obj.f32847c.get(i5);
                            layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                            if (size != -1) {
                                layoutParams.addRule(ci.m30835a(10));
                                layoutParams.addRule(ci.m30835a(3), 0);
                            } else {
                                layoutParams.addRule(ci.m30835a(10), 0);
                                layoutParams.addRule(ci.m30835a(3), size);
                            }
                            size = view.getId();
                            if (obj2 == null) {
                                ci.m30862a(view, z);
                                if (!((List) obj.f32852h.get(i5)).isEmpty()) {
                                    obj2 = 1;
                                }
                            }
                            if (obj4 == null) {
                                C6521h c6521h = (C6712a) ((C6750p) ((ArrayList) obj.an.get(i5)).get(0)).e;
                                c6521h.f33101c.setHint(cVarArr[i4].g);
                                obj.getExpandable().m31013a(c6521h);
                                obj3 = obj2;
                                size2 = size;
                                summaryExpanderWrapper4 = summaryExpanderWrapper3;
                                i6 = i4 + 1;
                            } else {
                                if (obj.getExpandable() != null) {
                                    arrayList = (ArrayList) obj.an.get(i5);
                                    i5 = arrayList.size();
                                    for (i7 = 0; i7 < i5; i7++) {
                                        if (((C6750p) arrayList.get(i7)).e instanceof C6712a) {
                                            obj.getExpandable().m31013a((C6712a) ((C6750p) arrayList.get(i7)).e);
                                        }
                                    }
                                }
                                obj3 = obj2;
                                size2 = size;
                                summaryExpanderWrapper4 = summaryExpanderWrapper3;
                                i6 = i4;
                            }
                        } else if (i3 == cVarArr[i4].k - 1) {
                            throw new IllegalStateException("Field groups are not supported for CardSubformFragment.");
                        } else {
                            obj.m30088a(summaryExpanderWrapper3, i5);
                            if (i3 == cVarArr[i4].l - 1) {
                                summaryExpanderWrapper3.getExpandable().m31018c();
                                obj3 = obj2;
                                size2 = size;
                                summaryExpanderWrapper4 = null;
                                i6 = i4 + 1;
                            }
                            obj3 = obj2;
                            size2 = size;
                            summaryExpanderWrapper4 = summaryExpanderWrapper3;
                            i6 = i4;
                        }
                        i3++;
                        i4 = i6;
                        summaryExpanderWrapper3 = summaryExpanderWrapper4;
                        size = size2;
                        obj2 = obj3;
                    }
                    if (obj.getExpandable() != null) {
                        obj.getExpandable().m31020d();
                    }
                    if (obj.ah && obj.ao.j.length > 0) {
                        i2 = obj.ao.j[0];
                        if (obj.ai.get(i2) != null && VERSION.SDK_INT >= 14) {
                            obj.ak = (C6668c) obj.ai.get(i2);
                            obj.ak.mo5583a(obj);
                        }
                    }
                }
                mo5469a(1, Bundle.EMPTY);
                if (uVar != null) {
                    mo5469a(20, Bundle.EMPTY);
                }
                if (this.az != null) {
                    this.az.mo5478b(this);
                }
            }
        }
        z = false;
        this.am = uVar;
        this.ah.ao = uVar;
        c6522i = this.ah;
        size = c6522i.f32847c.size();
        for (i3 = 0; i3 < size; i3++) {
            view = (View) c6522i.f32847c.get(i3);
            if (view.getParent() == c6522i.f32845a) {
                ci.m30877b(view, z);
            } else {
                view.setVisibility(8);
                ((ViewGroup) view.getParent()).removeView(view);
                c6522i.f32845a.addView(view);
                C6749z.m30555a((List) c6522i.an.get(i3), 0);
            }
        }
        i3 = c6522i.f32846b.size();
        for (i = 0; i < i3; i++) {
            c6522i.f32845a.removeView((SummaryExpanderWrapper) c6522i.f32846b.get(i));
        }
        c6522i.f32846b.clear();
        c6522i.ak.mo5585b(c6522i);
        c6522i.ak = null;
        if (c6522i.getExpandable() != null) {
            expandable = c6522i.getExpandable();
            size2 = expandable.f33766b.size();
            for (i = 0; i < size2; i++) {
                ((C6811c) expandable.f33766b.get(i)).m31016b(null);
            }
            expandable.f33766b.clear();
        }
        if (this.ai != null) {
            this.ai.getExpandable().m31015b();
            this.ai.m30966a(this.aj);
            if (uVar == null) {
                this.ai.getExpandable().m31018c();
            }
            if (uVar != null) {
                cVar = uVar.k[0];
            } else {
                cVar = ((p) this.aD).a.f[0];
            }
            this.ai.m30965a(cVar.n, cVar.g);
        }
        if (uVar != null) {
            this.f32839d.setCardIcon(((p) this.aD).d[uVar.i]);
            if (this.ag != null) {
                ci.m30877b(this.ag, z);
            }
            obj = this.ah;
            summaryExpanderWrapper = this.ai;
            cVarArr = obj.ao.k;
            length = cVarArr.length;
            summaryExpanderWrapper2 = null;
            if (summaryExpanderWrapper != null) {
                i = 0;
            } else if (cVarArr[0].l != 0) {
                summaryExpanderWrapper2 = summaryExpanderWrapper;
                i = 0;
            } else {
                summaryExpanderWrapper.getExpandable().m31018c();
                i = 1;
            }
            obj.ag.m30744b();
            size = -1;
            obj2 = null;
            i3 = 0;
            summaryExpanderWrapper3 = summaryExpanderWrapper2;
            i4 = i;
            while (i3 < obj.ao.j.length) {
                i5 = obj.ao.j[i3];
                if (i4 < length) {
                }
                if (obj3 != null) {
                }
                if (obj3 != null) {
                }
                view = (ViewGroup) obj.f32847c.get(i5);
                layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                if (size != -1) {
                    layoutParams.addRule(ci.m30835a(10), 0);
                    layoutParams.addRule(ci.m30835a(3), size);
                } else {
                    layoutParams.addRule(ci.m30835a(10));
                    layoutParams.addRule(ci.m30835a(3), 0);
                }
                size = view.getId();
                if (obj2 == null) {
                    ci.m30862a(view, z);
                    if (((List) obj.f32852h.get(i5)).isEmpty()) {
                        obj2 = 1;
                    }
                }
                if (obj4 == null) {
                    if (obj.getExpandable() != null) {
                        arrayList = (ArrayList) obj.an.get(i5);
                        i5 = arrayList.size();
                        for (i7 = 0; i7 < i5; i7++) {
                            if (((C6750p) arrayList.get(i7)).e instanceof C6712a) {
                                obj.getExpandable().m31013a((C6712a) ((C6750p) arrayList.get(i7)).e);
                            }
                        }
                    }
                    obj3 = obj2;
                    size2 = size;
                    summaryExpanderWrapper4 = summaryExpanderWrapper3;
                    i6 = i4;
                    i3++;
                    i4 = i6;
                    summaryExpanderWrapper3 = summaryExpanderWrapper4;
                    size = size2;
                    obj2 = obj3;
                } else {
                    C6521h c6521h2 = (C6712a) ((C6750p) ((ArrayList) obj.an.get(i5)).get(0)).e;
                    c6521h2.f33101c.setHint(cVarArr[i4].g);
                    obj.getExpandable().m31013a(c6521h2);
                    obj3 = obj2;
                    size2 = size;
                    summaryExpanderWrapper4 = summaryExpanderWrapper3;
                    i6 = i4 + 1;
                    i3++;
                    i4 = i6;
                    summaryExpanderWrapper3 = summaryExpanderWrapper4;
                    size = size2;
                    obj2 = obj3;
                }
            }
            if (obj.getExpandable() != null) {
                obj.getExpandable().m31020d();
            }
            i2 = obj.ao.j[0];
            obj.ak = (C6668c) obj.ai.get(i2);
            obj.ak.mo5583a(obj);
        } else {
            this.f32839d.setCardIcon(null);
            if (this.ag != null) {
                ci.m30862a(this.ag, z);
            }
        }
        mo5469a(1, Bundle.EMPTY);
        if (uVar != null) {
            mo5469a(20, Bundle.EMPTY);
        }
        if (this.az != null) {
            this.az.mo5478b(this);
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = ((C6795u) this.f32840e.getAdapter().getItem(i)).f33701c;
        if (i2 == 1) {
            am();
        } else if (i2 == 2) {
            an();
        } else {
            throw new IllegalArgumentException("Unknown DropDownItem event type: " + i2);
        }
    }

    public final void mo5551a(int i, C6690a c6690a, long j) {
        m30053c("tagNfcInfoDialog");
        mo5519b(true);
        if (this.aw) {
            this.aw = false;
            this.af.setImageDrawable(this.ax);
        }
        ac a = C6600l.m29935a(c6690a, i);
        this.aA.f32527w = ci.m30888e(i);
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
                m30052b(c(C6625i.wallet_uic_nfc_unsupported_error_message));
                break;
            case 5:
                m30052b(c(C6625i.wallet_uic_nfc_transceive_error_message));
                break;
            case 6:
                m30052b(c(C6625i.wallet_uic_nfc_timeout_error_message));
                break;
            case 7:
                m30052b(c(C6625i.wallet_uic_nfc_rate_limit_error_message));
                break;
            default:
                throw new IllegalStateException("Unknown NFC result code: " + i);
        }
        m30051a(a, j);
    }

    public final void mo5476b(Intent intent) {
        if (ay() && !this.au.mo5604d()) {
            C6734c c6734c = (C6734c) this.B.a("tagNfcInfoDialog");
            mo5519b(false);
            if (c6734c != null) {
                c6734c.m30479Z();
            } else {
                m30053c("tagNfcErrorDialog");
                if (!(this.af == null || this.aq == 2)) {
                    this.aw = true;
                    TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.uicNfcInProgressDrawable, C6617a.uicNfcDrawable});
                    Drawable drawable = obtainStyledAttributes.getDrawable(0);
                    this.ax = obtainStyledAttributes.getDrawable(1);
                    obtainStyledAttributes.recycle();
                    this.af.setImageDrawable(drawable);
                }
            }
            this.au.mo5601a(intent);
        }
    }

    private final void m30052b(String str) {
        if (this.B.a("tagNfcErrorDialog") == null) {
            ct ctVar = new ct();
            ctVar.f33659b = c(C6625i.wallet_uic_nfc_error_title);
            ctVar.f33660c = str;
            ctVar.f33666i = this.bc;
            ctVar.f33663f = c(17039370);
            ctVar.m30918a().a(this.B, "tagNfcErrorDialog");
        }
    }

    public final void ac() {
        if (this.aq == 1) {
            m30050a(2, true);
        }
    }

    public final void mo5550a(int i) {
        this.aA.f32511g = i;
    }

    public final void cN_() {
        if (this.aA.f32511g != 1) {
            this.aA.f32511g = 1;
            ah();
        }
    }

    public final void mo5554b() {
        if (!this.aA.f32513i) {
            this.aA.f32513i = true;
            ah();
        }
    }

    public final void mo5555b(int i) {
        this.aA.f32516l = i;
    }

    public final void mo5556c() {
        if (this.aA.f32516l != 1) {
            this.aA.f32516l = 1;
            ah();
        }
    }

    public final void cO_() {
        if (!this.aA.f32518n) {
            this.aA.f32518n = true;
            ah();
        }
    }

    public C6811c getExpandable() {
        return this.an;
    }

    private final void ai() {
        if (this.aq == 2) {
            m30050a(3, false);
        }
    }

    private final void m30050a(int i, boolean z) {
        if (i != this.aq) {
            if (i < this.aq) {
                throw new IllegalArgumentException("Cannot transition to an earlier state");
            }
            if (this.aq == 1 && i == 2) {
                if (this.am == null || this.am.j.length == 0) {
                    throw new IllegalStateException("State transitions should not be triggered when no subforms are visible.");
                }
                int i2;
                if (this.al || !z) {
                    i2 = 0;
                } else {
                    i2 = ci.m30840a(this.f32841f);
                }
                ((RelativeLayout.LayoutParams) this.f32840e.getLayoutParams()).addRule(ci.m30835a(3), C6622f.header);
                if (z) {
                    ci.m30876b(this.f32840e, i2, 0);
                    if (this.f32843h != null && this.f32843h.getVisibility() == 0) {
                        ci.m30856a(this.f32843h, i2, 0);
                    }
                    if (this.af != null && this.af.getVisibility() == 0) {
                        ci.m30856a(this.af, i2, 0);
                    }
                    if (this.f32844i != null && this.f32844i.getVisibility() == 0) {
                        ci.m30856a(this.f32844i, i2, 0);
                    }
                } else {
                    this.f32840e.setVisibility(4);
                    if (this.f32843h != null) {
                        this.f32843h.setVisibility(8);
                    }
                    if (this.af != null) {
                        this.af.setVisibility(8);
                    }
                    if (this.f32844i != null) {
                        this.f32844i.setVisibility(8);
                    }
                }
                this.f32841f.setText(this.f32840e.getConcealedCardNumber());
                ((RelativeLayout.LayoutParams) this.f32841f.getLayoutParams()).addRule(ci.m30835a(3), C6622f.header);
                if (z) {
                    ci.m30855a(this.f32841f, i2);
                    ci.m30855a(this.f32842g, i2);
                } else {
                    this.f32841f.setVisibility(0);
                    this.f32842g.setVisibility(0);
                }
                if (z) {
                    this.f32839d.setTranslationY((float) i2);
                    this.f32839d.animate().translationY(0.0f).start();
                }
                this.ah.m30090a(z, i2, ci.m30840a(this.f32840e), al());
            } else if (this.aq == 2 && i == 3) {
                if (this.am == null || this.am.j.length == 0) {
                    throw new IllegalStateException("State transitions should not be triggered when no subforms are visible.");
                }
                ak();
                if (z) {
                    ci.m30876b(this.f32841f, 0, 0);
                    ci.m30876b(this.f32842g, 0, 0);
                    ci.m30855a(this.f32840e, 0);
                    if (this.f32843h != null) {
                        ci.m30855a(this.f32843h, 0);
                    }
                    if (this.af != null) {
                        ci.m30855a(this.af, 0);
                    }
                    if (this.f32844i != null) {
                        ci.m30855a(this.f32844i, 0);
                    }
                } else {
                    this.f32841f.setVisibility(4);
                    this.f32842g.setVisibility(4);
                    this.f32840e.setVisibility(0);
                    if (this.f32843h != null) {
                        this.f32843h.setVisibility(0);
                    }
                    if (this.af != null) {
                        this.af.setVisibility(0);
                    }
                    if (this.f32844i != null) {
                        this.f32844i.setVisibility(0);
                    }
                }
                this.ah.m30089a(z, ci.m30840a(this.f32840e), al());
            } else if (this.aq != 1 || i != 3) {
                throw new IllegalArgumentException("Unimplemented state transition: " + this.aq + " to " + i);
            } else if (z) {
                throw new IllegalArgumentException("Cannot animate transition from STATE_INITIAL to STATE_EXPANDED");
            } else if (!this.al) {
                ak();
            }
            this.aq = i;
        }
    }

    private final void ak() {
        this.f32839d.m30484a();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f32840e.getLayoutParams();
        layoutParams.addRule(ci.m30835a(3), C6622f.header);
        layoutParams.leftMargin = ((RelativeLayout.LayoutParams) this.f32841f.getLayoutParams()).leftMargin;
        this.f32840e.setLayoutParams(layoutParams);
        this.al = true;
    }

    private final int al() {
        if (this.f32844i == null) {
            return 0;
        }
        return ci.m30840a(this.f32844i);
    }

    private final void m30051a(ac acVar, long j) {
        int i;
        int i2;
        boolean z;
        int i3;
        this.aB.add(acVar);
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
        boolean z2 = !TextUtils.isEmpty(acVar.d);
        boolean z3 = acVar.e > 0 && acVar.e <= 12;
        if (TextUtils.isEmpty(acVar.g)) {
            z = false;
        } else {
            z = true;
        }
        if (z2) {
            if (this.ao && this.f32841f.getVisibility() == 0) {
                m30050a(3, false);
            }
            this.aA.f32506b = i2;
            this.f32840e.removeTextChangedListener(this.aC);
            this.f32840e.requestFocus();
            this.f32840e.mo5626a(acVar.d, i);
            this.f32840e.addTextChangedListener(this.aC);
            if (this.f32840e.mo5581e()) {
                int i4;
                int i5;
                View b;
                if (z3) {
                    C6652j c6652j = this.ah;
                    i4 = acVar.e;
                    i5 = acVar.f;
                    b = c6652j.m30092b(3);
                    if (b instanceof DateEditText) {
                        DateEditText dateEditText = (DateEditText) b;
                        if (c6652j.aq != null) {
                            c6652j.aq.mo5550a(i2);
                        }
                        dateEditText.removeTextChangedListener(c6652j.ar);
                        dateEditText.requestFocus();
                        dateEditText.m30601a(Integer.toString(i4), Integer.toString(i5 % 100), i);
                        dateEditText.addTextChangedListener(c6652j.ar);
                    }
                }
                if (z) {
                    C6651s c6651s = this.ah;
                    CharSequence charSequence = acVar.g;
                    b = c6651s.m30092b(1);
                    if (b instanceof FormEditText) {
                        FormEditText formEditText = (FormEditText) b;
                        if (c6651s.aq != null) {
                            c6651s.aq.mo5555b(i2);
                        }
                        formEditText.removeTextChangedListener(c6651s.as);
                        formEditText.requestFocus();
                        formEditText.mo5626a(charSequence, i);
                        formEditText.addTextChangedListener(c6651s.as);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (c6651s.ao != null) {
                        for (int i32 : c6651s.ao.j) {
                            ArrayList arrayList2 = (ArrayList) c6651s.an.get(i32);
                            int size = arrayList2.size();
                            for (i4 = 0; i4 < size; i4++) {
                                C6750p c6750p = (C6750p) arrayList2.get(i4);
                                if (c6750p.f33286a == 4) {
                                    arrayList.add((C6711b) c6651s.f32849e.get(c6750p.f33287b));
                                }
                            }
                        }
                    }
                    i4 = arrayList.size();
                    for (int i6 = 0; i6 < i4; i6++) {
                        if (c6651s.aq != null) {
                            c6651s.aq.mo5555b(i2);
                        }
                        C6711b c6711b = (C6711b) arrayList.get(i6);
                        c6711b.m30382a(null);
                        c6711b.m30388b(charSequence, i);
                        c6711b.m30382a(c6651s);
                    }
                }
            }
        }
        CreditCardEntryAction creditCardEntryAction;
        if (i2 == 2) {
            creditCardEntryAction = this.aA;
            if (this.aA.f32523s < 0) {
                i32 = 1;
            } else {
                i32 = this.aA.f32523s + 1;
            }
            creditCardEntryAction.f32523s = i32;
            this.aA.f32524t = acVar.c;
            this.aA.f32507c = z2;
            this.aA.f32512h = z3;
            this.aA.f32517m = z;
        } else if (i2 == 3) {
            creditCardEntryAction = this.aA;
            if (this.aA.f32525u < 0) {
                i32 = 1;
            } else {
                i32 = this.aA.f32525u + 1;
            }
            creditCardEntryAction.f32525u = i32;
            this.aA.f32526v = acVar.c;
            this.aA.f32509e = z2;
            this.aA.f32514j = z3;
            this.aA.f32519o = z;
            if (j >= 0) {
                this.aA.f32520p = j;
            }
        } else {
            throw new IllegalArgumentException("Unknown entry type: " + i2);
        }
        ah();
    }

    private final void am() {
        startActivityForResult(this.ar, 500);
        mo5519b(false);
        if (this.ay != null) {
            this.ay.mo5561a(this, 1652);
        }
        if (this.az != null) {
            this.az.mo5478b(new C6505l(1653, null));
        }
    }

    private final void an() {
        if (this.B.a("tagNfcInfoDialog") == null) {
            aw();
            if (this.ay != null) {
                this.ay.mo5561a(this, 1655);
            }
            if (this.az != null) {
                this.az.mo5478b(this);
            }
        }
    }

    private final void aw() {
        Fragment a = C6734c.m30477a(this.bc, this.au.mo5603c());
        a.a(this, 0);
        a.a(this.B, "tagNfcInfoDialog");
    }

    private final void m30053c(String str) {
        Fragment a = this.B.a(str);
        if (a != null) {
            this.B.a().a(a).c();
        }
    }

    protected final h mo5521Z() {
        ao();
        return ((p) this.aD).a;
    }

    private final boolean ax() {
        return this.as != 0;
    }

    private final boolean ay() {
        return this.at != 0;
    }

    final void ah() {
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 770);
        bundle.putParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA", this.aA);
        mo5469a(7, bundle);
    }
}
