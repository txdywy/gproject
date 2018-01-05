package com.google.android.finsky.setup;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.cr.C2364b;
import com.google.android.finsky.cr.C2365a;
import com.google.android.finsky.cr.C2366c;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.setup.p243c.C4140b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ao {
    public final C0986a f20787a;
    public final C2366c f20788b;
    public final Map f20789c;
    public boolean f20790d;

    public ao(Context context, C0986a c0986a) {
        this(new C2365a(context.getDir("FinskySetup", 0), "package-"), c0986a);
    }

    private ao(C2364b c2364b, C0986a c0986a) {
        this.f20789c = new HashMap();
        this.f20790d = false;
        this.f20788b = new C2366c(c2364b);
        this.f20787a = c0986a;
    }

    public final int m19229a(String str) {
        PackageSetupStatus packageSetupStatus = (PackageSetupStatus) this.f20789c.get(str);
        if (packageSetupStatus != null) {
            return packageSetupStatus.f20546a.f20888b;
        }
        return 0;
    }

    public final PackageSetupStatus m19232b(String str) {
        return (PackageSetupStatus) this.f20789c.get(str);
    }

    public final List m19231a() {
        return new ArrayList(this.f20789c.values());
    }

    final PackageSetupStatus m19230a(Map map) {
        Throwable e;
        String str = (String) map.get("packageName");
        String str2 = (String) map.get("attempts");
        String str3 = (String) map.get("versionCode");
        String str4 = (String) map.get("accountName");
        String str5 = (String) map.get("title");
        String str6 = (String) map.get("priority");
        String str7 = (String) map.get("deliveryToken");
        String str8 = (String) map.get("visible");
        String str9 = (String) map.get("appIconUrl");
        String str10 = (String) map.get("isVpa");
        String str11 = (String) map.get("networkType");
        String str12 = (String) map.get("state");
        String str13 = (String) map.get("installDetails");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str8) || TextUtils.isEmpty(str9)) {
            FinskyLog.m21665c("Missing data for package %s", str);
            return null;
        }
        try {
            es esVar;
            if (TextUtils.isEmpty(str13)) {
                esVar = null;
            } else {
                esVar = es.m12537a(Base64.decode(str13, 0));
            }
            PackageSetupStatus packageSetupStatus = new PackageSetupStatus(str4, str, Integer.valueOf(str3).intValue(), str5, Integer.valueOf(str6).intValue(), str7, Boolean.valueOf(str8).booleanValue(), str9, Boolean.valueOf(str10).booleanValue(), str11 != null ? Integer.valueOf(str11).intValue() : 1, esVar);
            packageSetupStatus.m19067a(Integer.valueOf(str2).intValue());
            if (!TextUtils.isEmpty(str12)) {
                int intValue = Integer.valueOf(str12).intValue();
                C4140b c4140b = packageSetupStatus.f20546a;
                c4140b.f20900n = intValue;
                c4140b.f20887a |= eq.FLAG_MOVED;
            }
            Object obj = !TextUtils.isEmpty(str4) ? 1 : null;
            if (!packageSetupStatus.f20546a.f20897k && obj == null) {
                FinskyLog.m21665c("Missing account name for package %s", str);
                return null;
            } else if (obj == null || this.f20787a.mo1183b(str4) != null) {
                return packageSetupStatus;
            } else {
                FinskyLog.m21665c("Unknown account %s", FinskyLog.m21655a(str4));
                return null;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            FinskyLog.m21660a(e, "Bad data for package %s (%s, %s, %s, %s, %s, %s, %s, %s, %s)", str, str2, str3, FinskyLog.m21655a(str4), str5, str6, str8, str10, str11, str13);
            return null;
        } catch (InvalidProtocolBufferNanoException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Bad data for package %s (%s, %s, %s, %s, %s, %s, %s, %s, %s)", str, str2, str3, FinskyLog.m21655a(str4), str5, str6, str8, str10, str11, str13);
            return null;
        }
    }

    public final void m19233c(String str) {
        String encode = Uri.encode(str);
        PackageSetupStatus packageSetupStatus = (PackageSetupStatus) this.f20789c.get(str);
        if (packageSetupStatus == null) {
            this.f20788b.mo2869a(encode);
            return;
        }
        Map hashMap = new HashMap();
        hashMap.put("attempts", Integer.toString(packageSetupStatus.f20546a.f20888b));
        hashMap.put("packageName", packageSetupStatus.m19066a());
        hashMap.put("versionCode", Integer.toString(packageSetupStatus.f20546a.f20890d));
        hashMap.put("accountName", packageSetupStatus.m19068b());
        hashMap.put("title", packageSetupStatus.m19069c());
        hashMap.put("priority", Integer.toString(packageSetupStatus.f20546a.f20893g));
        if (!TextUtils.isEmpty(packageSetupStatus.m19070d())) {
            hashMap.put("deliveryToken", packageSetupStatus.m19070d());
        }
        hashMap.put("visible", Boolean.toString(packageSetupStatus.f20546a.f20895i));
        hashMap.put("appIconUrl", packageSetupStatus.m19071e());
        hashMap.put("isVpa", Boolean.toString(packageSetupStatus.f20546a.f20897k));
        hashMap.put("networkType", Integer.toString(packageSetupStatus.f20546a.f20898l));
        hashMap.put("state", Integer.toString(packageSetupStatus.f20546a.f20900n));
        if (packageSetupStatus.f20546a.f20899m != null) {
            hashMap.put("installDetails", Base64.encodeToString(C0757i.m4909a(packageSetupStatus.f20546a.f20899m), 0));
        }
        this.f20788b.mo2870a(encode, hashMap);
    }
}
