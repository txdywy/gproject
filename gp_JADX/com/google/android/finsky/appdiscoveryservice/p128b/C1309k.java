package com.google.android.finsky.appdiscoveryservice.p128b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.android.vending.p055a.C0625a;
import com.google.android.finsky.appdiscoveryservice.C1327i;
import com.google.android.finsky.appdiscoveryservice.C1337s;
import com.google.android.finsky.appdiscoveryservice.p127a.C1303a;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C1309k extends C1308f {
    public final C1337s f7771D;
    public String f7772E;
    public int f7773F;
    public C1303a f7774G;
    public final C1314e f7775d;
    public final C1327i f7776e;
    public final C3600b f7777h;

    public C1309k(Context context, C1316h c1316h, int i, int i2, int i3, String str, String str2, int i4, C0625a c0625a, C3600b c3600b, C1337s c1337s, C1327i c1327i, C1314e c1314e, C1303a c1303a) {
        super(context, c1316h, i, i2, i3, str, c0625a);
        this.f7772E = str2;
        this.f7773F = i4;
        this.f7777h = c3600b;
        this.f7771D = c1337s;
        this.f7776e = c1327i;
        this.f7775d = c1314e;
        this.f7774G = c1303a;
    }

    protected void mo1682a(Context context, String str) {
        long b = C4678i.m21813b();
        this.f7775d.m7791a(this.f7766v, this.f7767w, this.f7772E, this.f7773F, str, true, this.f7768x, m7775g());
        int i = this.f7768x;
        int i2 = 0;
        if (i > 0) {
            int i3 = 0;
            for (Bundle a : m7778b(context, str)) {
                m7769a(a);
                i2 = i3 + 1;
                if (i2 == i) {
                    break;
                }
                i3 = i2;
            }
            i2 = i3;
        }
        m7774f();
        this.f7775d.m7792a(str, C4678i.m21813b() - b, i2);
    }

    protected final List m7778b(Context context, String str) {
        List arrayList = new ArrayList();
        List<InstantAppInfo> a = m7776a(str, this.f7777h.m17194a());
        if (a == null || a.isEmpty()) {
            FinskyLog.m21662b("No instant apps", new Object[0]);
            return arrayList;
        }
        int min = Math.min(this.f7768x, a.size());
        FinskyLog.m21662b("Found %d instant apps", Integer.valueOf(min));
        for (InstantAppInfo instantAppInfo : a) {
            if (instantAppInfo.f17909a != null) {
                Bundle a2 = this.f7776e.mo1689a(context, instantAppInfo, null, this.f7772E, this.f7773F, this.f7766v, this.f7767w, null, this.f7775d.f7801a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    protected void mo1683b() {
    }

    private final List m7776a(String str, List list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        InstantAppInfo a;
        List arrayList = new ArrayList();
        for (InstantAppInfo a2 : list) {
            if (this.f7776e.mo1690a(a2)) {
                arrayList.add(a2);
            }
        }
        if (TextUtils.isEmpty(str)) {
            a2 = this.f7774G.m7760a(arrayList);
            if (a2 != null) {
                return Collections.singletonList(a2);
            }
            a2 = this.f7774G.m7761b(arrayList);
            if (a2 != null) {
                return Collections.singletonList(a2);
            }
            return Collections.emptyList();
        }
        SparseArray sparseArray = new SparseArray();
        Map hashMap = new HashMap();
        Comparator c1319l = new C1319l(hashMap);
        for (int i = 0; i < arrayList.size(); i++) {
            a2 = (InstantAppInfo) arrayList.get(i);
            String charSequence = a2.m17187a(this.f7777h).toString();
            hashMap.put(a2.m17188a(), charSequence);
            int a3 = this.f7771D.mo1691a(str, charSequence);
            if (a3 >= 0) {
                if (sparseArray.indexOfKey(a3) < 0) {
                    sparseArray.put(a3, new ArrayList());
                }
                ((List) sparseArray.get(a3)).add(a2);
            }
        }
        list = new ArrayList();
        for (a3 = sparseArray.size() - 1; a3 >= 0; a3--) {
            List list2 = (List) sparseArray.get(sparseArray.keyAt(a3));
            Collections.sort(list2, c1319l);
            list.addAll(list2);
        }
        return list;
    }
}
