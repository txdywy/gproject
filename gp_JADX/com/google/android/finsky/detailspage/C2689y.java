package com.google.android.finsky.detailspage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.C2448u;
import com.google.android.finsky.cv.p177a.C2449v;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.ci;
import com.google.android.finsky.cv.p177a.ct;
import com.google.android.finsky.cv.p177a.cu;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class C2689y extends ck implements ad, ac {
    public ce f14817d;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.bylines_module;
    }

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null && z) {
            int i = document.f14885a.f12098e;
            List arrayList = new ArrayList();
            Object obj;
            switch (i) {
                case 1:
                    C2441n N = document.m14625N();
                    if (!TextUtils.isEmpty(N.f13169i)) {
                        arrayList.add(C2689y.m14535a(C7582R.string.link_website, C7582R.drawable.ic_developer_website, 114, 1, document, N.f13169i));
                    }
                    if (!TextUtils.isEmpty(N.f13168h)) {
                        arrayList.add(C2689y.m14535a(C7582R.string.link_email, C7582R.drawable.ic_developer_email, 115, 0, document, N.f13168h));
                    }
                    C2440m c2440m = document.f14885a.f12115v;
                    if (c2440m != null) {
                        obj = c2440m.f13140u;
                    } else {
                        obj = null;
                    }
                    if (!TextUtils.isEmpty(obj)) {
                        arrayList.add(C2689y.m14535a(C7582R.string.privacy_policy, C7582R.drawable.ic_developer_privacy, 116, 1, document, obj));
                    }
                    if (!document.ae()) {
                        arrayList.add(C2689y.m14535a(C7582R.string.permission_details, C7582R.drawable.ic_developer_permission, 130, 2, document, null));
                        break;
                    }
                    break;
                case 3:
                    C2448u P = document.m14627P();
                    if (!(P == null || P.f13208e == null)) {
                        C2449v c2449v = P.f13208e;
                        if (c2449v.f13211b.length > 0) {
                            for (Object obj2 : c2449v.f13211b) {
                                if (!TextUtils.isEmpty(obj2)) {
                                    arrayList.add(C2689y.m14535a(C7582R.string.link_website, C7582R.drawable.ic_developer_website, 117, 1, document, obj2));
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(c2449v.f13213d)) {
                            arrayList.add(C2689y.m14535a(C7582R.string.link_youtube, C7582R.drawable.ic_developer_youtube, 118, 1, document, c2449v.f13213d));
                        }
                        if (!TextUtils.isEmpty(c2449v.f13212c)) {
                            arrayList.add(C2689y.m14535a(C7582R.string.link_googleplus, C7582R.drawable.ic_developer_googleplus, 119, 1, document, c2449v.f13212c));
                            break;
                        }
                    }
                    break;
                case 8:
                    ci ciVar = document.m14624M() ? document.f14885a.f12112s.f12061n : null;
                    if (!(ciVar == null || TextUtils.isEmpty(ciVar.f12041b))) {
                        arrayList.add(C2689y.m14535a(C7582R.string.link_website, C7582R.drawable.ic_developer_website, 114, 1, document, ciVar.f12041b));
                        break;
                    }
                case 30:
                    ct ctVar = document.m14624M() ? document.f14885a.f12112s.f12060m : null;
                    if (!(ctVar == null || ctVar.f12078b == null)) {
                        cu cuVar = ctVar.f12078b;
                        if (cuVar.f12080a.length > 0) {
                            for (eu euVar : cuVar.f12080a) {
                                if (!TextUtils.isEmpty(euVar.f12323c)) {
                                    arrayList.add(C2689y.m14535a(C7582R.string.link_website, C7582R.drawable.ic_developer_website, 117, 1, document, euVar.f12323c));
                                }
                            }
                        }
                        if (!(cuVar.f12081b == null || TextUtils.isEmpty(cuVar.f12081b.f12323c))) {
                            arrayList.add(C2689y.m14535a(C7582R.string.link_email, C7582R.drawable.ic_developer_googleplus, 119, 1, document, cuVar.f12081b.f12323c));
                        }
                        if (!(cuVar.f12082c == null || TextUtils.isEmpty(cuVar.f12082c.f12323c))) {
                            arrayList.add(C2689y.m14535a(C7582R.string.link_email, C7582R.drawable.ic_developer_youtube, 118, 1, document, cuVar.f12082c.f12323c));
                            break;
                        }
                    }
            }
            if (!arrayList.isEmpty()) {
                String str;
                this.b = new C2690z();
                C2690z c2690z = (C2690z) this.b;
                int i2 = -1;
                switch (document.f14885a.f12098e) {
                    case 1:
                        i2 = C7582R.string.details_developer_links;
                        break;
                    case 3:
                        i2 = C7582R.string.details_artist_links;
                        break;
                    case 30:
                        i2 = C7582R.string.details_artist_links;
                        break;
                }
                if (i2 < 0) {
                    str = null;
                } else {
                    str = this.t.getString(i2).toUpperCase();
                }
                c2690z.f14818a = str;
                c2690z = (C2690z) this.b;
                ac ao = document.f14885a.f12098e == 1 ? document.an() ? document.ao() : null : null;
                c2690z.f14819b = ao;
                ((C2690z) this.b).f14820c = arrayList;
            }
        }
    }

    public final void mo2976b(View view, int i) {
        BylinesModuleLayout bylinesModuleLayout = (BylinesModuleLayout) view;
        if (!bylinesModuleLayout.f13942d) {
            CharSequence charSequence = ((C2690z) this.b).f14818a;
            ac acVar = ((C2690z) this.b).f14819b;
            List list = ((C2690z) this.b).f14820c;
            bylinesModuleLayout.f13940b.removeAllViews();
            if (list.isEmpty()) {
                bylinesModuleLayout.setVisibility(8);
            } else {
                int size = list.size();
                int integer = bylinesModuleLayout.getResources().getInteger(C7582R.integer.details_extra_primary_items_per_row);
                int i2 = ((size + integer) - 1) / integer;
                for (int i3 = 0; i3 < i2; i3++) {
                    ViewGroup viewGroup = (ViewGroup) bylinesModuleLayout.f13939a.inflate(C7582R.layout.bylines_module_row, bylinesModuleLayout.f13940b, false);
                    for (int i4 = 0; i4 < integer; i4++) {
                        int i5 = (integer * i3) + i4;
                        BylinesModuleCellLayout bylinesModuleCellLayout = (BylinesModuleCellLayout) bylinesModuleLayout.f13939a.inflate(C7582R.layout.bylines_module_cell, viewGroup, false);
                        if (i5 >= size) {
                            bylinesModuleCellLayout.setVisibility(4);
                        } else {
                            ab abVar = (ab) list.get(i5);
                            OnClickListener aaVar = new aa(this, abVar);
                            if (abVar.f14219c < 0) {
                                bylinesModuleCellLayout.f13937a.setVisibility(4);
                            } else {
                                bylinesModuleCellLayout.f13937a.setVisibility(0);
                                bylinesModuleCellLayout.f13937a.setImageResource(abVar.f14219c);
                            }
                            if (abVar.f14218b > 0) {
                                bylinesModuleCellLayout.f13938b.setText(abVar.f14218b);
                            } else {
                                bylinesModuleCellLayout.f13938b.setText(abVar.f14217a);
                            }
                            bylinesModuleCellLayout.setOnClickListener(aaVar);
                            bylinesModuleCellLayout.setContentDescription(bylinesModuleCellLayout.f13938b.getText());
                        }
                        viewGroup.addView(bylinesModuleCellLayout);
                    }
                    bylinesModuleLayout.f13940b.addView(viewGroup);
                }
                if (TextUtils.isEmpty(charSequence)) {
                    bylinesModuleLayout.f13941c.setVisibility(8);
                } else {
                    bylinesModuleLayout.f13941c.setVisibility(0);
                    bylinesModuleLayout.f13941c.setText(charSequence);
                    if (acVar != null) {
                        C1473m.f7980a.ch().m13622a(acVar, bylinesModuleLayout.f13941c);
                    }
                }
                bylinesModuleLayout.f13942d = true;
            }
            getParentNode().mo1219a(this);
        }
    }

    private static ab m14535a(int i, int i2, int i3, int i4, Document document, String str) {
        return new ab(i, i2, i3, document, str, i4);
    }

    public final void mo3110a(ab abVar) {
        Intent intent = null;
        try {
            Document document = abVar.f14222f;
            String str = abVar.f14223g;
            switch (abVar.f14220d) {
                case 0:
                    intent = C1473m.f7980a.bn().mo2710b(Uri.fromParts("mailto", str, null));
                    intent.putExtra("android.intent.extra.SUBJECT", document.f14885a.f12100g);
                    break;
                case 1:
                    intent = C1473m.f7980a.bn().mo2689a(Uri.parse(str));
                    break;
                case 2:
                    intent = C1473m.f7980a.bo().mo2748a(C1473m.f7980a.f7981b, C1473m.f7980a.cZ(), document.f14885a.f12096c, document, true, this.J);
                    break;
            }
            this.t.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            int i;
            C1037e c1037e = this.A.bm;
            String str2 = "";
            Context context = this.t;
            switch (abVar.f14220d) {
                case 0:
                    i = C7582R.string.no_email_app;
                    break;
                case 1:
                    i = C7582R.string.no_web_app;
                    break;
                default:
                    i = -1;
                    break;
            }
            c1037e.mo1238a(str2, context.getString(i), this.J);
        }
        if (abVar.f14221e != -1) {
            this.J.m13379b(new C2475d(this.I).m13256a(abVar.f14221e));
        }
    }

    public ce getPlayStoreUiElement() {
        if (this.f14817d == null) {
            this.f14817d = C2482j.m13283a(1874);
        }
        return this.f14817d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
