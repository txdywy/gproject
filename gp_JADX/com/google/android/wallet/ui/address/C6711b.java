package com.google.android.wallet.ui.address;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.f.a;
import com.google.a.a.a.a.b.a.a.f.c;
import com.google.a.a.a.a.b.a.a.f.f;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.b.a.am;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.common.p376a.C6563p;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.CheckboxView;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.ax;
import com.google.android.wallet.ui.common.bm;
import com.google.android.wallet.ui.common.bp;
import com.google.android.wallet.ui.common.bq;
import com.google.android.wallet.ui.common.bv;
import com.google.android.wallet.ui.common.ci;
import com.google.p440g.p441a.p442a.C7147b;
import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public class C6711b extends C6710t implements bp, bq {
    public C6713c f33096g = new C6713c();
    public final C6506n f33097h = new C6506n(1667);
    public int f33098i;

    public static C6711b m30377b(a aVar, int i, LogContext logContext) {
        Fragment c6711b = new C6711b();
        c6711b.f(C6711b.m30375a(i, aVar, logContext));
        return c6711b;
    }

    public static Bundle m30375a(int i, a aVar, LogContext logContext) {
        Bundle a = au.m29850a(i, aVar, logContext);
        a.putBoolean("allowFetchInitialCountryData", false);
        return a;
    }

    public void mo5477b(Bundle bundle) {
        c cVar;
        int i;
        boolean z;
        super.mo5477b(bundle);
        this.f33096g.f33138h = this.q.getBoolean("allowFetchInitialCountryData");
        this.f33096g.f33109B = as();
        this.f33096g.f33115H = this;
        this.f33096g.f33117J = this;
        C6713c c6713c = this.f33096g;
        a aVar = (a) this.aD;
        Account aq = aq();
        LayoutInflater layoutInflater = this.be;
        Activity h = h();
        C7178b at = at();
        ContextThemeWrapper contextThemeWrapper = this.bd;
        boolean z2 = this.aH;
        int i2 = this.G;
        ax bmVar = new bm();
        c6713c.f33128U = aVar;
        c6713c.aa = aq;
        c6713c.f33135e = layoutInflater;
        c6713c.ac = h;
        c6713c.ab = at;
        c6713c.f33136f = contextThemeWrapper;
        c6713c.f33137g = z2;
        c6713c.f33139i = i2;
        c6713c.f33140j = bmVar;
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.internalUicAddressRootLayout});
        this.f33098i = obtainStyledAttributes.getResourceId(0, ak());
        obtainStyledAttributes.recycle();
        c6713c = this.f33096g;
        Bundle a = C6711b.m30376a(bundle);
        obtainStyledAttributes = c6713c.f33136f.obtainStyledAttributes(new int[]{C6617a.internalUicValidateFieldsWhenNotVisible});
        c6713c.f33108A = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        aVar = c6713c.f33128U;
        if (aVar == null) {
            cVar = null;
        } else {
            i = aVar.k;
            if (i < 0 || i >= aVar.h.length) {
                cVar = aVar.f;
            } else {
                cVar = aVar.h[i].c;
            }
        }
        c6713c.f33120M = cVar;
        if (a == null) {
            try {
                c6713c.f33154x = new JSONObject(c6713c.f33128U.g);
                if (C6563p.m29793a(C6553f.m29730a(c6713c.f33154x)).equals(c6713c.f33120M.d.f34899a) || c6713c.f33138h) {
                    c6713c.m30433a(c6713c.f33120M.d, 5);
                    c6713c.f33121N = C6553f.m29739a(C6553f.m29740a(c6713c.f33128U.q));
                    if (c6713c.f33121N.length <= 0) {
                        throw new IllegalArgumentException("Array length of allowedCountryCodes must be > 0");
                    } else if (TextUtils.isEmpty(c6713c.f33128U.u)) {
                        throw new IllegalArgumentException("Recipient field hint must be specified!");
                    } else {
                        z = c6713c.f33128U.y == 2 || c6713c.f33128U.y == 3 || c6713c.f33128U.y == 4;
                        c6713c.f33156z = z;
                    }
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "JSON provided for country %s but initial value has country %s", new Object[]{r0, c6713c.f33120M.d.f34899a}));
                }
            } catch (Throwable e) {
                throw new RuntimeException("Could not construct JSONObject from mFormProto.initialCountryI18NDataJson", e);
            }
        }
        c6713c.f33121N = a.getIntArray("regionCodes");
        c6713c.f33156z = a.getBoolean("isReadOnlyMode");
        c6713c.f33125R = new ArrayList(c6713c.f33128U.h.length);
        for (f fVar : c6713c.f33128U.h) {
            c6713c.f33125R.add(fVar.c.d);
        }
        z = c6713c.f33128U.y == 3 || c6713c.f33128U.y == 4;
        c6713c.f33119L = z;
        C6516f.m29562a(this.f33096g, this.f33096g.m30424a(1), this.aI, this.aJ);
    }

    private static Bundle m30376a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getBundle("addressFormHandler");
    }

    @TargetApi(11)
    protected View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f33098i, viewGroup, false);
        C6713c c6713c = this.f33096g;
        Bundle a = C6711b.m30376a(bundle);
        ContextThemeWrapper contextThemeWrapper = this.bd;
        c6713c.f33135e = layoutInflater;
        c6713c.f33143m = (LinearLayout) inflate.findViewById(C6622f.container);
        if (!TextUtils.isEmpty(c6713c.f33128U.e)) {
            TextView textView = (TextView) c6713c.f33143m.findViewById(C6622f.address_title);
            textView.setText(c6713c.f33128U.e);
            textView.setVisibility(0);
        }
        c6713c.f33146p = (CheckboxView) c6713c.f33143m.findViewById(C6622f.hide_address_checkbox);
        if (!TextUtils.isEmpty(c6713c.f33128U.p)) {
            al alVar = new al();
            alVar.h = c6713c.f33128U.p;
            am amVar = new am();
            alVar.a = -1;
            alVar.a = 2;
            alVar.s = amVar;
            alVar.e().a = 1;
            alVar.e().c = 1;
            c6713c.f33146p.setCheckboxUiField(alVar);
            c6713c.f33146p.setVisibility(0);
            c6713c.f33146p.setOnCheckedChangeListener(c6713c);
        }
        if (C6591c.m29906a(c6713c.f33128U.v, 2)) {
            c6713c.f33144n = (TextView) layoutInflater.inflate(C6623g.view_form_non_editable_text, c6713c.f33143m, false);
        } else {
            FormEditText formEditText = (FormEditText) layoutInflater.inflate(C6623g.view_form_edit_text, c6713c.f33143m, false);
            formEditText.setLogContext(c6713c.f33109B);
            formEditText.setUiReference(c6713c.m30424a(2));
            formEditText.m30513b(c6713c.f33131X);
            c6713c.f33144n = formEditText;
            c6713c.f33144n.setHint(c6713c.m30425a('N'));
            c6713c.m30432a((FormEditText) c6713c.f33144n, 2);
            c6713c.f33144n.setInputType(8289);
            if (c6713c.f33128U.z) {
                c6713c.f33144n.setOnFocusChangeListener(c6713c);
            }
            ((FormEditText) c6713c.f33144n).setShouldValidateWhenNotVisible(!C6591c.m29906a(c6713c.f33128U.w, 2));
            ((FormEditText) c6713c.f33144n).m30513b(c6713c.f33130W);
        }
        c6713c.f33144n.setTag(Character.valueOf('N'));
        c6713c.f33144n.setId(C6622f.address_field_recipient);
        c6713c.f33143m.addView(c6713c.f33144n, c6713c.f33143m.indexOfChild(c6713c.f33146p) + 1);
        c6713c.f33147q = (RegionCodeView) c6713c.f33143m.findViewById(C6622f.region_code_view);
        c6713c.f33147q.setLogContext(c6713c.f33109B);
        c6713c.f33147q.setUiReference(c6713c.m30424a(1));
        c6713c.f33145o = (DynamicAddressFieldsLayout) c6713c.f33143m.findViewById(C6622f.dynamic_address_fields_layout);
        if (c6713c.f33128U.t) {
            if (C6591c.m29906a(c6713c.f33128U.v, 8)) {
                c6713c.f33148r = (TextView) layoutInflater.inflate(C6623g.view_form_non_editable_text, c6713c.f33143m, false);
            } else {
                formEditText = (FormEditText) layoutInflater.inflate(C6623g.view_form_edit_text, c6713c.f33143m, false);
                formEditText.setLogContext(c6713c.f33109B);
                formEditText.setUiReference(c6713c.m30424a(8));
                formEditText.m30513b(c6713c.f33131X);
                c6713c.f33148r = formEditText;
                c6713c.f33148r.setHint(C6625i.wallet_uic_phone_number);
                c6713c.m30432a((FormEditText) c6713c.f33148r, 8);
                c6713c.f33148r.setInputType(3);
                if (c6713c.f33128U.z) {
                    c6713c.f33148r.setOnFocusChangeListener(c6713c);
                }
                ((FormEditText) c6713c.f33148r).setShouldValidateWhenNotVisible(!C6591c.m29906a(c6713c.f33128U.w, 8));
            }
            c6713c.f33148r.setId(C6622f.address_field_phone_number);
            if (VERSION.SDK_INT >= 17) {
                c6713c.f33148r.setTextDirection(3);
            }
            c6713c.f33148r.setLayerType(2, null);
            c6713c.f33143m.addView(c6713c.f33148r, c6713c.f33143m.indexOfChild(c6713c.f33145o) + 1);
            if (a == null && TextUtils.isEmpty(c6713c.f33148r.getText())) {
                if (TextUtils.isEmpty(c6713c.f33120M.e)) {
                    ci.m30868a(c6713c.ac, c6713c.f33148r);
                } else {
                    c6713c.m30434a(c6713c.f33120M.e, 5);
                }
                if (c6713c.f33148r instanceof FormEditText) {
                    c6713c.f33120M.e = ((FormEditText) c6713c.f33148r).getValue();
                } else {
                    c6713c.f33120M.e = c6713c.f33148r.getText().toString();
                }
            }
        }
        c6713c.f33145o.setOnHeightOffsetChangedListener(c6713c);
        c6713c.f33149s = c6713c.f33143m.findViewById(C6622f.address_read_only_container);
        c6713c.f33150t = (TextView) c6713c.f33143m.findViewById(C6622f.address_read_only_text);
        c6713c.f33151u = (ImageButton) c6713c.f33143m.findViewById(C6622f.edit_address_icon);
        if (c6713c.f33156z) {
            c6713c.f33150t.setText(c6713c.m30426a(c6713c.f33120M));
            if (c6713c.f33119L) {
                int i;
                if (c6713c.f33128U.y == 4) {
                    i = C6617a.uicClearDrawable;
                } else {
                    i = C6617a.uicEditDrawable;
                }
                TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(new int[]{i, C6617a.internalUicEditAndClearableIconColor});
                Drawable e = android.support.v4.b.a.a.e(obtainStyledAttributes.getDrawable(0).mutate());
                android.support.v4.b.a.a.a(e, obtainStyledAttributes.getColorStateList(1));
                obtainStyledAttributes.recycle();
                c6713c.f33151u.setImageDrawable(e);
                c6713c.f33151u.setVisibility(0);
                c6713c.f33151u.setOnClickListener(c6713c);
                c6713c.f33150t.setOnClickListener(c6713c);
            }
        }
        this.f33096g.f33114G = this;
        return inflate;
    }

    public void mo5616d(Bundle bundle) {
        super.d(bundle);
        C6713c c6713c = this.f33096g;
        Bundle a = C6711b.m30376a(bundle);
        if (a != null) {
            if (a.containsKey("pendingAddress")) {
                c6713c.m30433a((C7147b) ParcelableProto.m29887a(a, "pendingAddress"), a.getInt("pendingAddressEntryMethod", 0));
            }
            if (c6713c.f33153w == 0) {
                c6713c.f33153w = a.getInt("selectedCountry");
            }
            if (a.containsKey("countryData")) {
                try {
                    c6713c.f33154x = new JSONObject(a.getString("countryData"));
                    int a2 = C6553f.m29730a(c6713c.f33154x);
                    if (!(a2 == 0 || a2 == 858 || a2 == c6713c.f33153w)) {
                        int i = c6713c.f33153w;
                        c6713c.f33153w = a2;
                        c6713c.m30436a(c6713c.f33154x);
                        c6713c.f33153w = i;
                    }
                } catch (Throwable e) {
                    throw new RuntimeException("Could not construct JSONObject from KEY_COUNTRY_DATA json string", e);
                }
            }
            if (a.containsKey("languageCode")) {
                c6713c.f33155y = a.getString("languageCode");
            }
            if (a.containsKey("adminAreaData")) {
                try {
                    c6713c.f33122O = new JSONObject(a.getString("adminAreaData"));
                } catch (Throwable e2) {
                    throw new RuntimeException("Could not construct JSONObject from KEY_ADMIN_AREA_DATA json string", e2);
                }
            }
        }
        c6713c.m30451m();
        c6713c.m30439b(c6713c.f33137g);
        c6713c.f33147q.setRegionCodes(c6713c.f33121N);
        c6713c.f33147q.setRegionCodeSelectedListener(new C6721k(c6713c));
        c6713c.m30427a();
        if (c6713c.f33146p.getVisibility() == 0) {
            c6713c.onCheckedChanged(null, c6713c.f33146p.isChecked());
        }
        if (!(c6713c.f33111D == null || c6713c.f33153w == 0)) {
            c6713c.f33111D.mo5568a(c6713c.f33153w, c6713c.f33139i, false);
        }
        C6516f.m29562a(this.f33096g, ((a) this.aD).c, this.aI, this.aJ);
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        C6713c c6713c = this.f33096g;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("selectedCountry", c6713c.f33153w);
        bundle2.putIntArray("regionCodes", c6713c.f33121N);
        if (c6713c.f33126S != null) {
            bundle2.putParcelable("pendingAddress", ParcelableProto.m29885a(c6713c.f33126S));
            bundle2.putInt("pendingAddressEntryMethod", c6713c.f33127T);
        }
        if (c6713c.f33154x != null) {
            bundle2.putString("countryData", c6713c.f33154x.toString());
        }
        bundle2.putString("languageCode", c6713c.f33155y);
        if (c6713c.f33122O != null) {
            bundle2.putString("adminAreaData", c6713c.f33122O.toString());
        }
        bundle2.putBoolean("isReadOnlyMode", c6713c.f33156z);
        bundle.putBundle("addressFormHandler", bundle2);
    }

    public final void m30390d() {
        super.d();
        C6713c c6713c = this.f33096g;
        c6713c.f33118K = 0;
        c6713c.m30439b(c6713c.f33137g);
    }

    public final void m30381a() {
        super.a();
        C6713c c6713c = this.f33096g;
        c6713c.f33111D = null;
        c6713c.m30450l();
        c6713c.m30443e().a(new C6724n());
    }

    public final c al() {
        C6713c c6713c = this.f33096g;
        c cVar = new c();
        cVar.a = c6713c.f33128U.a != null ? c6713c.f33128U.a.a : c6713c.f33128U.b;
        cVar.c = c6713c.f33128U.a != null ? c6713c.f33128U.a.c : c6713c.f33128U.d;
        cVar.b = c6713c.f33128U.a != null ? c6713c.f33128U.a.b : c6713c.f33128U.c;
        if (c6713c.m30453p()) {
            cVar.f = true;
            return cVar;
        }
        cVar.d = C6713c.m30408a(c6713c.m30442d());
        Object i = c6713c.m30447i();
        if (!TextUtils.isEmpty(i)) {
            cVar.d.f34902d = i;
        }
        if (!(c6713c.f33148r == null || TextUtils.isEmpty(c6713c.f33148r.getText()))) {
            cVar.e = c6713c.f33148r.getText().toString();
        }
        cVar.g = c6713c.f33120M.g;
        return cVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5535a(com.google.a.a.a.a.b.a.c.g r6) {
        /*
        r5 = this;
        r2 = 1;
        r1 = 0;
        r3 = r5.f33096g;
        r0 = r3.f33128U;
        r0 = r0.a;
        if (r0 == 0) goto L_0x001c;
    L_0x000a:
        r0 = r3.f33128U;
        r0 = r0.a;
        r0 = r0.a;
    L_0x0010:
        r4 = r6.b;
        r4 = r4.b;
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x0021;
    L_0x001a:
        r0 = r1;
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = r3.f33128U;
        r0 = r0.b;
        goto L_0x0010;
    L_0x0021:
        r0 = r3.f33128U;
        r0 = r0.y;
        r4 = 2;
        if (r0 != r4) goto L_0x0030;
    L_0x0028:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "FormFieldMessage should not be received for read-only address form";
        r0.<init>(r1);
        throw r0;
    L_0x0030:
        r0 = r3.f33156z;
        if (r0 == 0) goto L_0x0039;
    L_0x0034:
        r3.f33156z = r1;
        r3.m30451m();
    L_0x0039:
        r0 = r3.f33143m;
        r1 = r6.b;
        r1 = r1.c;
        r1 = com.google.android.wallet.common.p376a.C6553f.m29729a(r1);
        r1 = r0.findViewById(r1);
        if (r1 == 0) goto L_0x005a;
    L_0x0049:
        r0 = r1.getVisibility();
        if (r0 == 0) goto L_0x009c;
    L_0x004f:
        r0 = r1 instanceof com.google.android.wallet.ui.common.FormEditText;
        if (r0 == 0) goto L_0x008f;
    L_0x0053:
        r0 = r1;
        r0 = (com.google.android.wallet.ui.common.FormEditText) r0;
        r0 = r0.f33226K;
    L_0x0058:
        if (r0 != 0) goto L_0x009c;
    L_0x005a:
        r0 = new java.lang.IllegalArgumentException;
        r2 = r6.b;
        r2 = r2.c;
        r1 = java.lang.String.valueOf(r1);
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 63;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "FormFieldMessage received for invalid field: ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r3 = " view: ";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x008f:
        r0 = r1 instanceof com.google.android.wallet.ui.common.FormSpinner;
        if (r0 == 0) goto L_0x0099;
    L_0x0093:
        r0 = r1;
        r0 = (com.google.android.wallet.ui.common.FormSpinner) r0;
        r0 = r0.f33400y;
        goto L_0x0058;
    L_0x0099:
        r0 = r3.f33108A;
        goto L_0x0058;
    L_0x009c:
        r0 = r1 instanceof com.google.android.wallet.ui.common.FormEditText;
        if (r0 == 0) goto L_0x00b8;
    L_0x00a0:
        r0 = r1;
        r0 = (com.google.android.wallet.ui.common.FormEditText) r0;
        r4 = r6.c;
        r0.mo5578a(r4, r2);
        r0 = r3.f33144n;
        if (r1 != r0) goto L_0x00b5;
    L_0x00ac:
        r0 = r3.f33110C;
        if (r0 == 0) goto L_0x00b5;
    L_0x00b0:
        r0 = r3.f33110C;
        r0.ac();
    L_0x00b5:
        r0 = r2;
        goto L_0x001b;
    L_0x00b8:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.b;
        r1 = r1.c;
        r2 = 61;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "FormFieldMessage received for non-EditText field: ";
        r2 = r3.append(r2);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.address.b.a(com.google.a.a.a.a.b.a.c.g):boolean");
    }

    public final boolean mo5523a(String str, int i) {
        C6713c c6713c = this.f33096g;
        if (!str.equals(c6713c.f33128U.a != null ? c6713c.f33128U.a.a : c6713c.f33128U.b)) {
            return false;
        }
        if (i == 1000) {
            String str2 = null;
            if (c6713c.f33154x != null) {
                str2 = C6553f.m29751e(c6713c.f33154x, c6713c.f33155y);
            }
            c6713c.m30429a(c6713c.f33153w, c6713c.f33155y, str2, c6713c.m30452n());
            return true;
        }
        throw new IllegalArgumentException("Unrecognized errorType: " + i);
    }

    protected final boolean mo5608a(long[] jArr, boolean z) {
        C6713c c6713c = this.f33096g;
        if (this.J) {
            return true;
        }
        if (c6713c.m30440b()) {
            return false;
        }
        if (c6713c.f33143m == null) {
            return false;
        }
        if (c6713c.m30453p()) {
            return true;
        }
        if (c6713c.f33153w == 0) {
            return false;
        }
        boolean a = C6749z.m30559a(c6713c.m30446h(), jArr, z);
        if (!(c6713c.f33144n == null || c6713c.f33110C == null || TextUtils.isEmpty(c6713c.f33144n.getError()))) {
            c6713c.f33110C.ac();
        }
        if (!a && c6713c.f33128U.y == 2) {
            throw new IllegalArgumentException("Read-only address form has invalid value.");
        } else if (!z || a || !c6713c.f33156z) {
            return a;
        } else {
            c6713c.f33156z = false;
            c6713c.m30451m();
            return a;
        }
    }

    public final ArrayList aa() {
        return this.f33096g.m30446h();
    }

    public final void m30383a(bv bvVar) {
        this.f33096g.f33111D = bvVar;
    }

    public final void m30382a(C6651s c6651s) {
        this.f33096g.f33110C = c6651s;
    }

    protected void mo5533W() {
        if (this.f33096g != null) {
            this.f33096g.m30439b(this.aH);
        }
    }

    public final boolean mo5534X() {
        return C6713c.m30415o();
    }

    public final String mo5522a(String str) {
        String str2 = "";
        if (!mo5608a(null, false) || this.f33096g.m30453p()) {
            return str2;
        }
        return this.f33096g.m30426a(al());
    }

    protected boolean ac() {
        return this.f33096g.m30445g();
    }

    public C6506n getUiElement() {
        return this.f33097h;
    }

    public List getChildren() {
        return null;
    }

    protected int ak() {
        return C6623g.fragment_address_entry;
    }

    public final void am() {
    }

    public final void an() {
    }

    public void ah() {
    }

    public final void m30388b(String str, int i) {
        C6713c c6713c = this.f33096g;
        if (c6713c.f33144n == null) {
            return;
        }
        if (c6713c.f33144n instanceof FormEditText) {
            ((FormEditText) c6713c.f33144n).mo5626a((CharSequence) str, i);
        } else {
            c6713c.f33144n.setText(str);
        }
    }
}
