package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.support.v4.os.a;
import android.text.TextUtils;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.PurchaseError;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.o;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.bn.h;
import com.google.android.finsky.by.c;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.is;
import com.google.android.finsky.cv.a.it;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.l.a;
import com.google.android.finsky.l.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.aa;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.d.b;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.g;
import com.google.android.gms.instantapps.a;
import com.google.android.gms.instantapps.f;
import com.google.wireless.android.finsky.b.s;
import com.google.wireless.android.finsky.b.t;
import com.google.wireless.android.finsky.b.v;
import com.google.wireless.android.finsky.b.w;
import com.google.wireless.android.finsky.dfe.nano.al;
import com.google.wireless.android.finsky.dfe.nano.ez;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class com.google.android.finsky.billing.iab.w
{

    public final com.google.android.finsky.l.a a;
    public final com.google.android.finsky.by.c b;
    public final com.google.android.finsky.cn.a c;
    public final com.google.android.finsky.accounts.a d;

    w(com.google.android.finsky.l.a p0, com.google.android.finsky.by.c p1, com.google.android.finsky.cn.a p2, com.google.android.finsky.accounts.a p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public static Intent a(Context p0, PurchaseParams p1, Bundle p2, com.google.android.finsky.billing.iab.x p3, com.google.android.finsky.d.w p4, com.google.android.finsky.ba.e p5) {
        v12 = new Intent();
        v4 = 0;
        v2 = 0;
        if (p2 != 0) {
            v4 = p2.getString("inapp_signed_purchase_data");
            v2 = p2.getString("inapp_purchase_data_signature");
            if (v4 != 0 && v2 != 0) {
                v12.putExtra("INAPP_PURCHASE_DATA", v4);
                v12.putExtra("INAPP_DATA_SIGNATURE", v2);
            }
            v10 = (com.google.wireless.android.finsky.dfe.nano.al)ParcelableProto.a(p2, "ExtraPurchaseData.purchaseTotalPrice");
            v2 = p2.getBoolean("ExtraPurchaseData.iapGmpReportingDone", 0);
        }
        else
            v10 = 0;
        v12.putExtra("RESPONSE_CODE", p3.l);
        if (v2 != 0)
            return v12;
        if (TextUtils.isEmpty(v4))
            return v12;
        if (v10 != 0) {
            if (!p5.a(12604266))
                return v12;
            if (p1.a.c != 11)
                return v12;
            v2 = new JSONObject(v4);
            com.google.android.gms.ads.d.a.a(p0, new com.google.android.gms.ads.d.b(v2.getString("packageName"), v2.getString("productId"), "", v10.b, v10.b, v10.c, 1));
            com.google.android.finsky.billing.iab.w.a(0, p4, p5);
            return v12;
        }
        return v12;
        if (!p5.a(12604266))
            return v12;
        if (p1.a.c != 11)
            return v12;
        try {
            v2 = new JSONObject(v4);
        }
        catch (JSONException ex) {
            v5 = new Object[1];
            v5[0] = FinskyLog.a(v4);
            FinskyLog.e("Invalid purchaseDataJson: %s", v5);
            com.google.android.finsky.billing.iab.w.a(ex, p4, p5);
            return v12;
        }
        try {
            com.google.android.gms.ads.d.a.a(p0, new com.google.android.gms.ads.d.b(v2.getString("packageName"), v2.getString("productId"), "", v10.b, v10.b, v10.c, 1));
        }
        catch (GooglePlayServicesNotAvailableException ex) {
            v4 = new Object[1];
            v4[0] = ex.getMessage();
            FinskyLog.d("Unable to report IAP, GooglePlayServicesNotAvailableException: %s", v4);
            com.google.android.finsky.billing.iab.w.a(ex, p4, p5);
            return v12;
        }
        com.google.android.finsky.billing.iab.w.a(0, p4, p5);
        return v12;
    }

    public static Bundle a(com.google.android.finsky.billing.iab.x p0) {
        v0 = new Bundle();
        v0.putInt("RESPONSE_CODE", p0.l);
        return v0;
    }

    public static Bundle a(com.google.android.finsky.cv.a.is p0) {
        if (p0 == 0)
            v0 = 0;
        else {
            v0 = new Bundle();
            v1 = 0;
            while (v1 < p0.a.length) {
                if (p0.a[v1].d())
                    v0.putString(p0.a[v1].d, p0.a[v1].bq_());
                else if (p0.a[v1].f())
                    v0.putBoolean(p0.a[v1].d, p0.a[v1].e());
                else if (p0.a[v1].h())
                    v0.putLong(p0.a[v1].d, p0.a[v1].g());
                else {
                    v7 = new Object[1];
                    v7[0] = p0.a[v1].d;
                    FinskyLog.c("No known value type for key: %s", v7);
                }
                v1 = v1 + 1;
            }
        }
        return v0;
    }

    public static Bundle a(w[] p0, com.google.android.finsky.cv.a.ax p1) {
  0:    v0 = 0;
  3:    if (p0 == 0)
  5:        return v0;
  7:    v5 = 0;
  8:    if (v5 >= p0.length)
  5:        return v0;
 12:    if (p0[v5] == 0) goto 176;
 16:    if (p0[v5].g == 0) goto 176;
 21:    v4 = 0;
 22:    if (v4 >= p0[v5].g.length) goto 176;
 26:    if (p0[v5].g[v4] == 0) goto 98;
 38:    if (!TextUtils.equals(p0[v5].g[v4].c.b, p1.b)) goto 98;
 42:    if (p0[v5].g[v4].k == 0) goto 98;
 52:    if (!com.google.android.finsky.dfemodel.q.a(p0[v5].g[v4].c.c)) goto 98;
 60:    if (p0[v5].g[v4].k.a & 2)
 62:        v1 = 1;
        else
 94:        v1 = 0;
 63:    if (v1 != 0) {
 69:        if (p0[v5].g[v4].k.a & 1)
 71:            v1 = 1;
            else
 96:            v1 = 0;
 72:        if (v1 != 0) {
 76:            v0 = new Bundle();
 83:            v0.putString("inapp_signed_purchase_data", p0[v5].g[v4].k.b);
 90:            v0.putString("inapp_purchase_data_signature", p0[v5].g[v4].k.c);
 93:            return v0;
            }
        }
 73:    goto 171;
 98:    if (p0[v5].g[v4] != 0 && TextUtils.equals(p0[v5].g[v4].c.b, p1.b) && p0[v5].g[v4].j != 0 && com.google.android.finsky.dfemodel.q.b(p0[v5].g[v4].c.c)) {
132:        if (p0[v5].g[v4].j.a & 32)
134:            v1 = 1;
            else
167:            v1 = 0;
135:        if (v1 != 0) {
141:            if (p0[v5].g[v4].j.a & 16)
143:                v1 = 1;
                else
169:                v1 = 0;
144:            if (v1 != 0) {
148:                v0 = new Bundle();
155:                v0.putString("inapp_signed_purchase_data", p0[v5].g[v4].j.f);
162:                v0.putString("inapp_purchase_data_signature", p0[v5].g[v4].j.g);
165:                return v0;
                }
            }
        }
173:    v4 = v4 + 1;
174:    goto 22;
178:    v5 = v5 + 1;
179:    goto 8;
    }

    public static com.google.android.finsky.billing.iab.x a(String p0, Context p1, int p2, com.google.android.finsky.ba.e p3) {
        if (TextUtils.isEmpty(p0)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for packageName.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else {
            if (p3 != 0 && p3.a(12627302) && !android.support.v4.os.a.b())
                v2 = com.google.android.gms.instantapps.a.b(p1).a(p2);
            else
                v2 = p1.getPackageManager().getPackagesForUid(p2);
            if (v2 != 0) {
                v0 = 0;
                while (v0 < v2.length) {
                    if (p0.equals(v2[v0])) {
                        v0 = com.google.android.finsky.billing.iab.x.a;
                        return v0;
                    }
                    v0 = v0 + 1;
                }
            }
            v2 = new Object[2];
            v2[0] = p0;
            v2[1] = Integer.valueOf(p2);
            FinskyLog.c("Package name %s does not match UID %d", v2);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        return v0;
    }

    public static com.google.android.finsky.billing.iab.x a(boolean p0, PurchaseError p1) {
  2:    if (p0 != 0) {
  4:        v0 = com.google.android.finsky.billing.iab.x.a;
  6:        return v0;
        }
  7:    if (p1 == 0) {
 74:        v0 = com.google.android.finsky.billing.iab.x.b;
 76:        return v0;
        }
 12:    if (p1.a == 3) {
 16:        switch (p1.b) {
                case 0:
 46:                v0 = com.google.android.finsky.billing.iab.x.g;
 77:                break;
                case 1:
 53:                FinskyLog.c("Unexpected INSTALL_OK response.", new Object[0]);
 56:                v0 = com.google.android.finsky.billing.iab.x.a;
 77:                break;
                case 3:
 43:                v0 = com.google.android.finsky.billing.iab.x.h;
 77:                break;
                case 4:
 40:                v0 = com.google.android.finsky.billing.iab.x.e;
 77:                break;
                case 12:
 37:                v0 = com.google.android.finsky.billing.iab.x.f;
 77:                break;
                case 24:
 43:                v0 = com.google.android.finsky.billing.iab.x.h;
 77:                break;
                case 27:
 37:                v0 = com.google.android.finsky.billing.iab.x.f;
 77:                break;
                default:
 21:                v1 = new Object[1];
 29:                v1[0] = Integer.valueOf(p1.b);
 31:                FinskyLog.c("Unexpected PurchasePermissionResponse: %d", v1);
 34:                v0 = com.google.android.finsky.billing.iab.x.g;
 77:                break;
            }
        }
 61:    if (p1.a == 1) {
 63:        v0 = com.google.android.finsky.billing.iab.x.h;
 65:        return v0;
        }
 69:    if (p1.a != 2) goto 34;
 71:    v0 = com.google.android.finsky.billing.iab.x.c;
 73:    return v0;
    }

    private static String a(PackageInfo p0) {
        return com.google.android.finsky.utils.aa.a(p0.signatures[0].toByteArray());
    }

    public static String a(String p0) {
        v0 = p0.lastIndexOf(58);
        if (v0 > 0 && v0 < p0.length())
            v0 = p0.substring(v0 + 1, p0.length());
        else
            v0 = 0;
        return v0;
    }

    public static String a(String p0, String p1, String p2) {
        return (String.valueOf(p1).length() + 2 + String.valueOf(p2).length() + String.valueOf(p0).length()) + p1 + ":" + p2 + ":" + p0;
    }

    private static void a(Throwable p0, com.google.android.finsky.d.w p1, com.google.android.finsky.ba.e p2) {
        if (p2.a(12604323)) {
            v0 = new com.google.android.finsky.d.c(1105);
            v0.a(p0);
            p1.a(v0);
        }
    }

    static boolean a(Context p0, String p1, com.google.android.finsky.ba.e p2) {
        v0 = 0;
        if (p2.a(12644091)) {
            v1 = com.google.android.gms.common.g.a(p0);
            if (v1 != 0 && v1.a(p1))
                v0 = 1;
        }
        return v0;
    }

    private static PackageInfo b(Context p0, String p1, com.google.android.finsky.ba.e p2) {
        v0 = 0;
        try {
            if (p2.a(12627302) && !android.support.v4.os.a.b())
                v0 = com.google.android.gms.instantapps.a.b(p0).a(p1);
            else
                v0 = p0.getPackageManager().getPackageInfo(p1, 64);
            return v0;
        }
        catch (PackageManager$NameNotFoundException ex) {
            v2 = new Object[1];
            v2[0] = p1;
            FinskyLog.c("Cannot find package: %s", v2);
            return v0;
        }
        catch (RuntimeException ex) {
            v3 = new Object[1];
            v3[0] = p1;
            FinskyLog.a(ex, "Cannot find package: %s", v3);
            return v0;
        }
    }

    public final PurchaseParams a(Context p0, int p1, String p2, List p3, String p4, String p5, String p6, com.google.android.finsky.ba.e p7, Integer p8) {
        return this.a(p0, p1, p2, p3, p4, p5, p6, 0, 0, p7, p8, 1, 1, 0);
    }

    public final PurchaseParams a(Context p0, int p1, String p2, List p3, String p4, String p5, String p6, ew[] p7, boolean p8, com.google.android.finsky.ba.e p9, Integer p10, boolean p11, int p12, String p13) {
        if (p2 == 0 || p13 == 0 || !p9.a(12643094) || !com.google.android.finsky.billing.iab.w.a(p0, p2, p9))
            p13 = p2;
        v5 = PurchaseParams.b();
        v2 = com.google.android.finsky.billing.iab.w.b(p0, p2, p9);
        if (v2 != 0) {
            v5.b(com.google.android.finsky.billing.iab.w.a(v2)).a(v2.versionCode);
            v2 = 0;
            if (p3 != 0 && !p3.isEmpty()) {
                v4 = new String[p3.size()];
                v3 = 0;
                while (v3 < v4.length) {
                    v4[v3] = com.google.android.finsky.billing.iab.w.a((String)p3.get(v3), p5, p13);
                    v3 = v3 + 1;
                }
                v2 = v4;
            }
            v4 = com.google.android.finsky.billing.iab.w.a(p4, p5, p13);
            if (p9.a(12625916)) {
                v3 = this.c.a(p2);
                if (v3 != 0) {
                    v5.c(p0.getPackageManager().getInstallerPackageName(p2));
                    v5.a(v3.n);
                    v5.b(v3.g);
                }
                if (p10 != 0 && p9.a(12627302)) {
                    if (android.support.v4.os.a.b())
                        v3 = p0.getPackageManager().isInstantApp(p2);
                    else
                        v3 = com.google.android.gms.instantapps.a.b(p0).b(p2);
                    v5.b();
                    v5.k.a = v5.k.a | 512;
                    v5.k.m = v3;
                }
            }
            v3 = 0;
            if ("inapp".equals(p5)) {
                if (p11 != 0)
                    v3 = 11;
                else
                    v3 = 66;
            }
            else if ("subs".equals(p5)) {
                if (p11 != 0)
                    v3 = 15;
                else
                    v3 = 67;
            }
            v6 = new com.google.android.finsky.cv.a.ax();
            v6.d = 3;
            v6.c = v3;
            v6.b = v4;
            v5.a = v6;
            v5.b = v4;
            v5.d = 1;
            v5.b();
            v5.k.a = v5.k.a | 1;
            v5.k.b = p1;
            v3 = v5.a(p2);
            v3.b();
            if (!TextUtils.isEmpty(p6)) {
                if (p6 == 0)
                    throw new NullPointerException();
                v3.k.a = v3.k.a | 16;
                v3.k.f = p6;
            }
            v3.b();
            if (v2 != 0)
                v3.k.g = v2;
            v3.b();
            if (p7 != 0)
                v3.k.h = p7;
            v2 = v3.b(p12);
            v2.o = p8;
            v2 = v2.a();
            return v2;
        }
        if (p12 != 3) {
            v2 = 0;
            return v2;
            v5.b(com.google.android.finsky.billing.iab.w.a(v2)).a(v2.versionCode);
        }
        v2 = 0;
        if (p3 != 0 && !p3.isEmpty()) {
            v4 = new String[p3.size()];
            v3 = 0;
            while (v3 < v4.length) {
                v4[v3] = com.google.android.finsky.billing.iab.w.a((String)p3.get(v3), p5, p13);
                v3 = v3 + 1;
            }
            v2 = v4;
        }
        v4 = com.google.android.finsky.billing.iab.w.a(p4, p5, p13);
        if (p9.a(12625916)) {
            v3 = this.c.a(p2);
            if (v3 != 0) {
                v5.c(p0.getPackageManager().getInstallerPackageName(p2));
                v5.a(v3.n);
                v5.b(v3.g);
            }
            if (p10 != 0 && p9.a(12627302)) {
                if (android.support.v4.os.a.b())
                    v3 = p0.getPackageManager().isInstantApp(p2);
                else
                    v3 = com.google.android.gms.instantapps.a.b(p0).b(p2);
                v5.b();
                v5.k.a = v5.k.a | 512;
                v5.k.m = v3;
            }
        }
        v3 = 0;
        if ("inapp".equals(p5)) {
            if (p11 != 0)
                v3 = 11;
            else
                v3 = 66;
        }
        else if ("subs".equals(p5)) {
            if (p11 != 0)
                v3 = 15;
            else
                v3 = 67;
        }
        v6 = new com.google.android.finsky.cv.a.ax();
        v6.d = 3;
        v6.c = v3;
        v6.b = v4;
        v5.a = v6;
        v5.b = v4;
        v5.d = 1;
        v5.b();
        v5.k.a = v5.k.a | 1;
        v5.k.b = p1;
        v3 = v5.a(p2);
        v3.b();
        if (!TextUtils.isEmpty(p6)) {
            if (p6 == 0)
                throw new NullPointerException();
            v3.k.a = v3.k.a | 16;
            v3.k.f = p6;
        }
        v3.b();
        if (v2 != 0)
            v3.k.g = v2;
        v3.b();
        if (p7 != 0)
            v3.k.h = p7;
        v2 = v3.b(p12);
        v2.o = p8;
        v2 = v2.a();
        return v2;
    }

    public final PurchaseParams a(Context p0, com.google.android.finsky.cv.a.ax p1, String p2, com.google.android.finsky.ba.e p3) {
        v0 = com.google.android.finsky.dfemodel.q.a(p1.b);
        v1 = com.google.android.finsky.billing.iab.w.b(p0, v0, p3);
        v2 = PurchaseParams.b();
        if (!TextUtils.isEmpty(v0) && p3.a(12625916)) {
            v3 = this.c.a(v0);
            if (v3 != 0) {
                v2.c(p0.getPackageManager().getInstallerPackageName(v0));
                v2.a(v3.n);
                v2.b(v3.g);
            }
        }
        if (v1 != 0) {
            v2.a(v1.versionCode);
            v2.b(com.google.android.finsky.billing.iab.w.a(v1));
        }
        v2.a = p1;
        v2.b = p1.b;
        v2.d = 1;
        v0 = v2.a(v0).b(2);
        v0.j = p2;
        return v0.a();
    }

    public final void a(Activity p0, String p1) {
        if (this.c.a(p1) != 0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            v0 = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
            v0.setPackage(p1);
            p0.sendBroadcast(v0);
        }
    }

    public final Account b(String p0) {
  8:    this.a.b.c();
 13:    v2 = this.a.a(p0);
 17:    if (v2 == 0) {
132:        v0 = this.d.e();
136:        if (v0 != 0) {
140:            v2 = new Object[2];
142:            v2[0] = p0;
150:            v2[1] = FinskyLog.a(v0.name);
152:            FinskyLog.a("%s: Account from first account - %s", v2);
            }
            else {
158:            v2 = new Object[1];
160:            v2[0] = p0;
162:            FinskyLog.c("%s: No account found.", v2);
165:            v0 = 0;
            }
155:        return v0;
        }
 21:    if (v2.c == 0) {
132:        v0 = this.d.e();
136:        if (v0 != 0) {
140:            v2 = new Object[2];
142:            v2[0] = p0;
150:            v2[1] = FinskyLog.a(v0.name);
152:            FinskyLog.a("%s: Account from first account - %s", v2);
            }
            else {
158:            v2 = new Object[1];
160:            v2[0] = p0;
162:            FinskyLog.c("%s: No account found.", v2);
165:            v0 = 0;
            }
155:        return v0;
        }
 25:    this.b.c();
 34:    v3 = this.b.a(p0, v2.c.b);
 42:    if (v3.size() <= 0) goto 128;
 46:    if (v2.d == 0) goto 96;
 52:    v5 = v3.iterator();
 60:    if (!v5.hasNext()) goto 96;
 66:    v0 = (Account)v5.next();
 74:    if (!TextUtils.equals(v0.name, v2.d.i)) goto 56;
 78:    v5 = new Object[2];
 82:    v5[0] = v2.a;
 88:    v5[1] = FinskyLog.a(v2.d.i);
 90:    FinskyLog.a("%s: Account determined from installer data - %s", v5);
 93:    if (v0 == 0) {
132:        v0 = this.d.e();
136:        if (v0 != 0) {
140:            v2 = new Object[2];
142:            v2[0] = p0;
150:            v2[1] = FinskyLog.a(v0.name);
152:            FinskyLog.a("%s: Account from first account - %s", v2);
            }
            else {
158:            v2 = new Object[1];
160:            v2[0] = p0;
162:            FinskyLog.c("%s: No account found.", v2);
165:            v0 = 0;
            }
155:        return v0;
        }
 95:    return v0;
 98:    v5 = new Object[2];
102:    v5[0] = v2.a;
116:    v5[1] = FinskyLog.a(((Account)v3.get(0)).name);
118:    FinskyLog.a("%s: Account determined from library ownership - %s", v5);
125:    v0 = (Account)v3.get(0);
127:    goto 93;
128:    v0 = 0;
129:    goto 93;
    }

}
