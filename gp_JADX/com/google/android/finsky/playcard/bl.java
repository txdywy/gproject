package com.google.android.finsky.playcard;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.actionbuttons.C1013j;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.gp;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2455b;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.google.android.play.layout.g;
import com.squareup.leakcanary.C7582R;

final class bl implements OnClickListener {
    public final /* synthetic */ Context f19662a;
    public final /* synthetic */ ImageView f19663b;
    public final /* synthetic */ C2495w f19664c;
    public final /* synthetic */ ad f19665d;
    public final /* synthetic */ Document f19666e;
    public final /* synthetic */ int f19667f;
    public final /* synthetic */ C3748a f19668g;
    public final /* synthetic */ d f19669h;
    public final /* synthetic */ C3907h f19670i;
    public final /* synthetic */ ab f19671j;
    public final /* synthetic */ ao f19672k;

    bl(ao aoVar, Context context, ImageView imageView, C2495w c2495w, ad adVar, Document document, int i, C3748a c3748a, d dVar, C3907h c3907h, ab abVar) {
        this.f19672k = aoVar;
        this.f19662a = context;
        this.f19663b = imageView;
        this.f19664c = c2495w;
        this.f19665d = adVar;
        this.f19666e = document;
        this.f19667f = i;
        this.f19668g = c3748a;
        this.f19669h = dVar;
        this.f19670i = c3907h;
        this.f19671j = abVar;
    }

    public final void onClick(View view) {
        Object obj;
        int i;
        Object obj2;
        gp[] gpVarArr;
        g gVar = new g(this.f19662a, this.f19663b);
        Resources resources = this.f19662a.getResources();
        C2495w a = this.f19664c.m13368a(new C2475d(this.f19665d).m13256a(238));
        C1254c a2 = this.f19672k.f19609x.mo2015a();
        boolean ae = this.f19666e.ae();
        Object obj3 = !this.f19672k.f19610y.m15403a(this.f19666e, a2) ? 1 : null;
        if (ae || obj3 != null) {
            obj = null;
        } else {
            obj = 1;
        }
        Account b = a2.mo1620b();
        ao aoVar = this.f19672k;
        Context context = this.f19662a;
        Document document = this.f19666e;
        int i2 = this.f19667f;
        C3748a c3748a = this.f19668g;
        ad adVar = this.f19665d;
        View view2 = this.f19669h;
        C3907h c3907h = this.f19670i;
        aoVar.f19602q.m13154a(aoVar.f19593h.cY(), aoVar.f19596k.dn(), 2, document, aoVar.f19598m);
        int i3 = 0;
        if (aoVar.f19598m.m13146b()) {
            for (i = 0; i < aoVar.f19598m.f13244e; i++) {
                C2454a a3 = aoVar.f19598m.m13141a(i);
                if (C1013j.m5984a(a3)) {
                    aoVar.f19602q.m13159b(a3, aoVar.f19598m.f13242c, aoVar.f19584H);
                    gVar.a(0, aoVar.f19584H.m13160a(context), true, new bt(aoVar, context, document, view2, c3748a, C1013j.m5982a(a3, aoVar.f19598m.f13242c, c3748a, null, adVar, context, a), c3907h, i2));
                    i3++;
                } else {
                    FinskyLog.m21665c("Can't make click listener for action %d", Integer.valueOf(a3.f13230a));
                }
            }
        }
        if (obj != null && r3 == 0 && aoVar.f19598m.m13147c()) {
            C2455b c2455b = aoVar.f19598m;
            C2458e c2458e = aoVar.f19584H;
            c2458e.m13161a();
            switch (c2455b.f13243d) {
                case 1:
                    c2458e.f13271a = C7582R.string.installing;
                    break;
                case 2:
                    c2458e.f13271a = C7582R.string.disabled_list_state;
                    break;
                case 3:
                    c2458e.f13271a = C7582R.string.preordered_list_state;
                    break;
                case 9:
                    c2458e.f13271a = C7582R.string.updating;
                    break;
                case 12:
                    c2458e.f13271a = C7582R.string.waiting_for_wifi_list_state;
                    break;
                case 15:
                    c2458e.f13271a = C7582R.string.early_access;
                    break;
                default:
                    FinskyLog.m21669e("Expected to have an available action with status %d", Integer.valueOf(c2455b.f13243d));
                    break;
            }
            gVar.a(0, aoVar.f19584H.m13160a(context), false, null);
        }
        if (!this.f19666e.aZ() || this.f19666e.bd() == null) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (ae) {
            int i4;
            boolean a4 = this.f19672k.f19578B.m18640a(this.f19666e.f14885a.f12096c, b);
            if (a4) {
                i = C7582R.string.preregistration_remove;
                i4 = 296;
            } else {
                i = C7582R.string.preregistration_add;
                i4 = 295;
            }
            gVar.a(0, resources.getString(i), true, new bm(this, a, i4, a2, a4));
            gVar.a(0, resources.getString(C7582R.string.share), true, new bn(this, a));
        }
        if (obj3 != null) {
            int i5;
            boolean a5 = this.f19672k.f19610y.m15402a(this.f19666e, b);
            if (a5) {
                i = C7582R.string.wishlist_remove;
                i5 = 205;
            } else {
                i = C7582R.string.wishlist_add;
                i5 = 204;
            }
            gVar.a(0, resources.getString(i), true, new bo(this, a5, i5, a2, a));
        }
        if (this.f19671j != null && this.f19666e.be()) {
            CharSequence charSequence = this.f19666e.bf().f12044c;
            if (TextUtils.isEmpty(charSequence)) {
                FinskyLog.m21669e("Empty dismissal text received from the server for doc %s", this.f19666e.f14885a.f12096c);
            } else {
                gVar.a(0, charSequence, true, new cb(this.f19669h, this.f19666e, a2, this.f19671j, this.f19665d, a));
            }
        }
        if (obj2 != null) {
            gVar.a(0, this.f19666e.bd().f13085b, true, new bp(this, resources, a));
        }
        if (((Boolean) C0955b.f5892i.m28964b()).booleanValue() && this.f19666e.m14613B()) {
            gVar.a(0, resources.getString(C7582R.string.debug_info), true, new bq(this, resources));
        }
        C2440m c2440m = this.f19666e.f14885a.f12115v;
        if (c2440m != null) {
            gpVarArr = c2440m.f13141v;
        } else {
            gpVarArr = null;
        }
        if (gpVarArr != null && gpVarArr.length > 0) {
            for (gp gpVar : gpVarArr) {
                gVar.a(0, gpVar.f12473c, true, new br(this, gpVar, a));
            }
        }
        if (!ao.m18507a(this.f19669h)) {
            this.f19663b.setImageResource(C7582R.drawable.play_overflow_menu_open);
            gVar.e = new bs(this);
        }
        gVar.a();
    }
}
