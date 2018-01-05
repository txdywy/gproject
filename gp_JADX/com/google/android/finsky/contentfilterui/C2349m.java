package com.google.android.finsky.contentfilterui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vending.p057c.C0639b;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.ab.C0969a;
import com.google.android.finsky.ab.C0970b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1285f;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.bh;
import com.google.wireless.android.finsky.dfe.nano.bi;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

final class C2349m extends C0639b {
    public final /* synthetic */ ContentFiltersService f11534a;

    C2349m(ContentFiltersService contentFiltersService) {
        this.f11534a = contentFiltersService;
    }

    public final Bundle mo1051a(int[] iArr) {
        Context context = this.f11534a;
        if (C2744a.m14785a(this.f11534a, null, null, this.f11534a.f11493c.dc(), 519) == null) {
            return null;
        }
        FinskyLog.m21659a("Received content filters request from %s", C2744a.m14785a(this.f11534a, null, null, this.f11534a.f11493c.dc(), 519));
        Bundle bundle = new Bundle();
        bundle.putParcelable("content_filters_intent", PendingIntent.getActivity(this.f11534a, 0, new Intent(context, ContentFiltersActivity3.class), MemoryMappedFileBuffer.DEFAULT_SIZE));
        bundle.putInt("content_filters_request_code", 44);
        Account cY = this.f11534a.f11491a.cY();
        Object obj = (cY == null || !C2356u.m11979a(context, cY)) ? null : 1;
        if (TextUtils.isEmpty((CharSequence) C0954a.f5834d.m5760a()) && obj == null) {
            return bundle;
        }
        C1254c a = this.f11534a.f11492b.mo2015a();
        if (a == null) {
            return null;
        }
        ContentFilterSettingsResponse contentFilterSettingsResponse;
        ContentFilterSettingsResponse e;
        C2336a c2352p = new C2352p(a, this.f11534a);
        Object obj2 = !c2352p.m11934c() ? 1 : System.currentTimeMillis() > c2352p.f11510a.lastModified() + ((Long) C1285f.f7596N.m28964b()).longValue() ? 1 : null;
        C0970b[] a2;
        int i;
        bh a3;
        if (obj2 == null) {
            obj2 = (obj == null || c2352p.m11970e() != null) ? null : 1;
            if (obj2 == null) {
                contentFilterSettingsResponse = null;
                if (contentFilterSettingsResponse != null) {
                    e = c2352p.m11970e();
                } else {
                    e = contentFilterSettingsResponse;
                }
                if (e == null) {
                    return null;
                }
                if (!ContentFiltersService.m11912a(e.b, iArr)) {
                    return null;
                }
                if (TextUtils.isEmpty((CharSequence) C0954a.f5834d.m5760a())) {
                    return bundle;
                }
                a2 = C0969a.m5797a(C0954a.f5837g);
                for (bi biVar : e.b) {
                    a3 = C0969a.m5788a(biVar, a2);
                    if (a3 != null) {
                        for (int i2 : iArr) {
                            for (int i3 : biVar.c) {
                                if (i3 == i2) {
                                    bundle.putBundle(String.valueOf(i2), C0969a.m5786a(biVar, a3));
                                    break;
                                }
                            }
                        }
                    }
                }
                return bundle;
            }
        }
        obj2 = null;
        ContentFilterSettingsResponse d = c2352p.m11969d();
        if (!(obj2 == null || d == null)) {
            C0969a.m5795a(context, this.f11534a.f11494d, this.f11534a.f11492b, this.f11534a.f11491a, d.o, d, (C0970b[]) C0969a.m5792a(d).toArray());
        }
        contentFilterSettingsResponse = d;
        if (contentFilterSettingsResponse != null) {
            e = contentFilterSettingsResponse;
        } else {
            e = c2352p.m11970e();
        }
        if (e == null) {
            return null;
        }
        if (!ContentFiltersService.m11912a(e.b, iArr)) {
            return null;
        }
        if (TextUtils.isEmpty((CharSequence) C0954a.f5834d.m5760a())) {
            return bundle;
        }
        a2 = C0969a.m5797a(C0954a.f5837g);
        for (i = 0; i < r7; i++) {
            a3 = C0969a.m5788a(biVar, a2);
            if (a3 != null) {
                for (int i22 : iArr) {
                    while (r2 < r14) {
                        if (i3 == i22) {
                            bundle.putBundle(String.valueOf(i22), C0969a.m5786a(biVar, a3));
                            break;
                        }
                    }
                }
            }
        }
        return bundle;
    }
}
