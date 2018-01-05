package com.google.android.instantapps.common.p221d.p222a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.clearcut.p281b.C5013a;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.phenotype.C5315c;
import com.google.android.gms.phenotype.C5317e;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.play.p179a.p352a.C6201l;
import com.google.android.play.p179a.p352a.ad;
import com.google.d.a.b.a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.a.a.a.a.h;
import java.util.ArrayList;
import java.util.Collections;

public final class C5733x {
    public final SharedPreferences f29010a;
    public final C5710a f29011b;
    public final String f29012c;
    public ad f29013d;

    C5733x(Context context, C5710a c5710a, String str) {
        this.f29010a = context.getSharedPreferences("InstantAppsExperimentManager.activeExperiments", 0);
        this.f29011b = c5710a;
        this.f29012c = str;
        Object string = this.f29010a.getString("activeExperiments", null);
        if (string == null || TextUtils.isEmpty(string)) {
            m27035a(new ad());
            return;
        }
        try {
            try {
                m27035a(ad.m28541a(Base64.decode(string, 0)));
            } catch (InvalidProtocolBufferNanoException e) {
                c5710a.mo5136a(1813);
                this.f29010a.edit().remove("activeExperiments").apply();
                m27035a(new ad());
            }
        } catch (IllegalArgumentException e2) {
            c5710a.mo5136a(1814);
            this.f29010a.edit().remove("activeExperiments").apply();
            m27035a(new ad());
        }
    }

    public final boolean m27037a(C5058o c5058o, C5315c c5315c) {
        C5317e c5317e = (C5317e) c5315c.mo4775c(c5058o, this.f29012c).mo4487a();
        if (!c5317e.mo4505b().m23271a()) {
            this.f29011b.mo5136a(1812);
            return false;
        } else if (c5317e.mo4790a() == null) {
            this.f29011b.mo5136a(1808);
            return false;
        } else if (!m27035a(C5733x.m27034a(c5317e.mo4790a()))) {
            return false;
        } else {
            this.f29010a.edit().putString("activeExperiments", Base64.encodeToString(C0757i.m4909a(m27036a()), 0)).apply();
            this.f29011b.mo5136a(1809);
            return true;
        }
    }

    public final synchronized ad m27036a() {
        try {
        } catch (Throwable e) {
            throw new RuntimeException("Could not convert ActiveExperiments to bytes and back.", e);
        }
        return ad.m28541a(C0757i.m4909a(this.f29013d));
    }

    private final synchronized boolean m27035a(ad adVar) {
        boolean z;
        if (adVar.equals(this.f29013d)) {
            z = false;
        } else {
            this.f29013d = adVar;
            z = true;
        }
        return z;
    }

    private static ad m27034a(ExperimentTokens experimentTokens) {
        C0757i c0757i = null;
        int i = 0;
        if (experimentTokens != null) {
            int i2;
            int i3;
            int i4;
            C0757i hVar = new h();
            int[] iArr = experimentTokens == null ? null : experimentTokens.f28300h;
            if (!(C5013a.m23193a(iArr) && C5013a.m23193a(null))) {
                C0757i aVar = new a();
                aVar.c = new int[(C5013a.m23194b(null) + C5013a.m23194b(iArr))];
                if (iArr != null) {
                    int length = iArr.length;
                    i2 = 0;
                    i3 = 0;
                    while (i2 < length) {
                        i4 = i3 + 1;
                        aVar.c[i3] = iArr[i2];
                        i2++;
                        i3 = i4;
                    }
                }
                hVar.a = C0757i.m4909a(aVar);
            }
            if (experimentTokens != null) {
                i2 = (((Math.max(1, C5013a.m23192a(experimentTokens.f28301i)) + C5013a.m23192a(experimentTokens.f28296d)) + C5013a.m23192a(experimentTokens.f28297e)) + C5013a.m23192a(experimentTokens.f28298f)) + C5013a.m23192a(experimentTokens.f28299g);
            } else {
                i2 = 0;
            }
            Object arrayList = new ArrayList(i2);
            if (experimentTokens != null) {
                if (!(experimentTokens.f28295c == null || experimentTokens.f28295c.length == 0)) {
                    arrayList.add(experimentTokens.f28295c);
                }
                if (experimentTokens.f28301i != null) {
                    for (Object obj : experimentTokens.f28301i) {
                        if (!(obj == null || obj.length == 0)) {
                            arrayList.add(obj);
                        }
                    }
                }
                hVar.d = false;
                if (experimentTokens.f28297e != null) {
                    Collections.addAll(arrayList, experimentTokens.f28297e);
                }
                if (experimentTokens.f28298f != null) {
                    Collections.addAll(arrayList, experimentTokens.f28298f);
                }
                if (experimentTokens.f28299g != null) {
                    Collections.addAll(arrayList, experimentTokens.f28299g);
                }
            }
            hVar.c = new byte[arrayList.size()][];
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            i3 = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                i4 = i3 + 1;
                hVar.c[i3] = (byte[]) obj2;
                i3 = i4;
            }
            c0757i = hVar;
        }
        byte[] a = C0757i.m4909a(c0757i);
        ad adVar = new ad();
        try {
            C0757i a2 = C6201l.m28640a(a);
            if (a2.m4915n() != 0) {
                adVar.f30752g = a2;
            }
        } catch (InvalidProtocolBufferNanoException e) {
            Log.wtf("ExperimentManager", "Could not translate ExperimentIds, proto definitions should be the same");
        }
        return adVar;
    }
}
