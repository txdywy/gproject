package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.common.C1799o;
import com.google.android.finsky.billing.common.PurchaseError;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.is;
import com.google.android.finsky.cv.p177a.it;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.aa;
import com.google.android.gms.ads.p272d.C4911a;
import com.google.android.gms.ads.p272d.C4912b;
import com.google.android.gms.common.C5107g;
import com.google.android.gms.instantapps.C5260a;
import com.google.wireless.android.finsky.b.s;
import com.google.wireless.android.finsky.b.t;
import com.google.wireless.android.finsky.b.v;
import com.google.wireless.android.finsky.b.w;
import com.google.wireless.android.finsky.dfe.nano.al;
import com.google.wireless.android.finsky.dfe.nano.ew;
import com.google.wireless.android.finsky.dfe.nano.ez;
import java.util.List;
import org.json.JSONObject;

public final class C1867w {
    public final C3646a f9550a;
    public final C2206c f9551b;
    public final C2320a f9552c;
    public final C0986a f9553d;

    public C1867w(C3646a c3646a, C2206c c2206c, C2320a c2320a, C0986a c0986a) {
        this.f9550a = c3646a;
        this.f9551b = c2206c;
        this.f9552c = c2320a;
        this.f9553d = c0986a;
    }

    public static String m9987a(String str, String str2, String str3) {
        return new StringBuilder(((String.valueOf(str2).length() + 2) + String.valueOf(str3).length()) + String.valueOf(str).length()).append(str2).append(":").append(str3).append(":").append(str).toString();
    }

    public static String m9986a(String str) {
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf <= 0 || lastIndexOf >= str.length()) {
            return null;
        }
        return str.substring(lastIndexOf + 1, str.length());
    }

    public final Account m9995b(String str) {
        Account account;
        this.f9550a.f18022b.m11209c();
        C3647b a = this.f9550a.m17243a(str);
        if (!(a == null || a.f18028c == null)) {
            this.f9551b.mo2820c();
            List<Account> a2 = this.f9551b.mo2813a(str, a.f18028c.f11417b);
            if (a2.size() > 0) {
                if (a.f18029d != null) {
                    String str2 = a.f18029d.f10815i;
                    for (Account account2 : a2) {
                        if (TextUtils.equals(account2.name, str2)) {
                            FinskyLog.m21659a("%s: Account determined from installer data - %s", a.f18026a, FinskyLog.m21655a(str2));
                            break;
                        }
                    }
                }
                FinskyLog.m21659a("%s: Account determined from library ownership - %s", a.f18026a, FinskyLog.m21655a(((Account) a2.get(0)).name));
                account2 = (Account) a2.get(0);
            } else {
                account2 = null;
            }
            if (account2 != null) {
                return account2;
            }
        }
        account2 = this.f9553d.mo1189e();
        if (account2 != null) {
            FinskyLog.m21659a("%s: Account from first account - %s", str, FinskyLog.m21655a(account2.name));
            return account2;
        }
        FinskyLog.m21665c("%s: No account found.", str);
        return null;
    }

    public static C1868x m9983a(String str, Context context, int i, C1552e c1552e) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for packageName.", new Object[0]);
            return C1868x.RESULT_DEVELOPER_ERROR;
        }
        String[] packagesForUid;
        if (c1552e == null || !c1552e.mo2294a(12627302) || C0327a.m1722b()) {
            packagesForUid = context.getPackageManager().getPackagesForUid(i);
        } else {
            packagesForUid = C5260a.m24087b(context).mo4693a(i);
        }
        if (packagesForUid != null) {
            for (Object equals : packagesForUid) {
                if (str.equals(equals)) {
                    return C1868x.RESULT_OK;
                }
            }
        }
        FinskyLog.m21665c("Package name %s does not match UID %d", str, Integer.valueOf(i));
        return C1868x.RESULT_DEVELOPER_ERROR;
    }

    public final PurchaseParams m9991a(Context context, int i, String str, List list, String str2, String str3, String str4, C1552e c1552e, Integer num) {
        return m9992a(context, i, str, list, str2, str3, str4, null, false, c1552e, num, true, 1, null);
    }

    public final PurchaseParams m9992a(Context context, int i, String str, List list, String str2, String str3, String str4, ew[] ewVarArr, boolean z, C1552e c1552e, Integer num, boolean z2, int i2, String str5) {
        int i3;
        if (str == null || str5 == null || !c1552e.mo2294a(12643094) || !C1867w.m9989a(context, str, c1552e)) {
            str5 = str;
        }
        C1799o b = PurchaseParams.m9747b();
        PackageInfo b2 = C1867w.m9990b(context, str, c1552e);
        if (b2 != null) {
            b.m9794b(C1867w.m9985a(b2)).m9787a(b2.versionCode);
        } else if (i2 != 3) {
            return null;
        }
        String[] strArr = null;
        if (!(list == null || list.isEmpty())) {
            String[] strArr2 = new String[list.size()];
            for (i3 = 0; i3 < strArr2.length; i3++) {
                strArr2[i3] = C1867w.m9987a((String) list.get(i3), str3, str5);
            }
            strArr = strArr2;
        }
        String a = C1867w.m9987a(str2, str3, str5);
        if (c1552e.mo2294a(12625916)) {
            C2322b a2 = this.f9552c.mo2854a(str);
            if (a2 != null) {
                b.m9797c(context.getPackageManager().getInstallerPackageName(str));
                b.m9792a(a2.f11429n);
                b.m9795b(a2.f11422g);
            }
            if (num != null && c1552e.mo2294a(12627302)) {
                boolean isInstantApp;
                if (C0327a.m1722b()) {
                    isInstantApp = context.getPackageManager().isInstantApp(str);
                } else {
                    isInstantApp = C5260a.m24087b(context).mo4694b(str);
                }
                b.m9796b();
                ez ezVar = b.f9340k;
                ezVar.a |= 512;
                ezVar.m = isInstantApp;
            }
        }
        i3 = 0;
        if ("inapp".equals(str3)) {
            i3 = z2 ? 11 : 66;
        } else if ("subs".equals(str3)) {
            i3 = z2 ? 15 : 67;
        }
        ax axVar = new ax();
        axVar.f11835d = 3;
        axVar.f11834c = i3;
        axVar.f11833b = a;
        b.f9330a = axVar;
        b.f9331b = a;
        b.f9333d = 1;
        b.m9796b();
        ez ezVar2 = b.f9340k;
        ezVar2.a |= 1;
        ezVar2.b = i;
        C1799o a3 = b.m9791a(str);
        a3.m9796b();
        if (!TextUtils.isEmpty(str4)) {
            ez ezVar3 = a3.f9340k;
            if (str4 == null) {
                throw new NullPointerException();
            }
            ezVar3.a |= 16;
            ezVar3.f = str4;
        }
        a3.m9796b();
        if (strArr != null) {
            a3.f9340k.g = strArr;
        }
        a3.m9796b();
        if (ewVarArr != null) {
            a3.f9340k.h = ewVarArr;
        }
        C1799o b3 = a3.m9793b(i2);
        b3.f9344o = z;
        return b3.m9786a();
    }

    public final PurchaseParams m9993a(Context context, ax axVar, String str, C1552e c1552e) {
        String a = C2726q.m14749a(axVar.f11833b);
        PackageInfo b = C1867w.m9990b(context, a, c1552e);
        C1799o b2 = PurchaseParams.m9747b();
        if (!TextUtils.isEmpty(a) && c1552e.mo2294a(12625916)) {
            C2322b a2 = this.f9552c.mo2854a(a);
            if (a2 != null) {
                b2.m9797c(context.getPackageManager().getInstallerPackageName(a));
                b2.m9792a(a2.f11429n);
                b2.m9795b(a2.f11422g);
            }
        }
        if (b != null) {
            b2.m9787a(b.versionCode);
            b2.m9794b(C1867w.m9985a(b));
        }
        b2.f9330a = axVar;
        b2.f9331b = axVar.f11833b;
        b2.f9333d = 1;
        C1799o b3 = b2.m9791a(a).m9793b(2);
        b3.f9339j = str;
        return b3.m9786a();
    }

    public static Bundle m9982a(w[] wVarArr, ax axVar) {
        if (wVarArr == null) {
            return null;
        }
        for (w wVar : wVarArr) {
            if (!(wVar == null || wVar.g == null)) {
                for (t tVar : wVar.g) {
                    Object obj;
                    Bundle bundle;
                    if (tVar != null && TextUtils.equals(tVar.c.f11833b, axVar.f11833b) && tVar.k != null && C2726q.m14750a(tVar.c.f11834c)) {
                        s sVar = tVar.k;
                        if (((sVar.a & 2) != 0 ? 1 : null) == null) {
                            continue;
                        } else {
                            if ((sVar.a & 1) != 0) {
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                bundle = new Bundle();
                                bundle.putString("inapp_signed_purchase_data", sVar.b);
                                bundle.putString("inapp_purchase_data_signature", sVar.c);
                                return bundle;
                            }
                        }
                    } else if (tVar != null && TextUtils.equals(tVar.c.f11833b, axVar.f11833b) && tVar.j != null && C2726q.m14753b(tVar.c.f11834c)) {
                        v vVar = tVar.j;
                        if (((vVar.a & 32) != 0 ? 1 : null) == null) {
                            continue;
                        } else {
                            if ((vVar.a & 16) != 0) {
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                bundle = new Bundle();
                                bundle.putString("inapp_signed_purchase_data", vVar.f);
                                bundle.putString("inapp_purchase_data_signature", vVar.g);
                                return bundle;
                            }
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    @Deprecated
    public static Bundle m9981a(is isVar) {
        if (isVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (it itVar : isVar.f12704a) {
            String str = itVar.f12708d;
            if (itVar.m12820d()) {
                bundle.putString(str, itVar.bq_());
            } else if (itVar.m12822f()) {
                bundle.putBoolean(str, itVar.m12821e());
            } else if (itVar.m12824h()) {
                bundle.putLong(str, itVar.m12823g());
            } else {
                FinskyLog.m21665c("No known value type for key: %s", str);
            }
        }
        return bundle;
    }

    public static C1868x m9984a(boolean z, PurchaseError purchaseError) {
        if (z) {
            return C1868x.RESULT_OK;
        }
        if (purchaseError == null) {
            return C1868x.RESULT_USER_CANCELED;
        }
        if (purchaseError.f9281a == 3) {
            switch (purchaseError.f9282b) {
                case 0:
                    return C1868x.RESULT_ERROR;
                case 1:
                    FinskyLog.m21665c("Unexpected INSTALL_OK response.", new Object[0]);
                    return C1868x.RESULT_OK;
                case 3:
                case 24:
                    return C1868x.RESULT_ITEM_ALREADY_OWNED;
                case 4:
                    return C1868x.RESULT_ITEM_UNAVAILABLE;
                case 12:
                case 27:
                    return C1868x.RESULT_DEVELOPER_ERROR;
                default:
                    FinskyLog.m21665c("Unexpected PurchasePermissionResponse: %d", Integer.valueOf(purchaseError.f9282b));
                    break;
            }
        } else if (purchaseError.f9281a == 1) {
            return C1868x.RESULT_ITEM_ALREADY_OWNED;
        } else {
            if (purchaseError.f9281a == 2) {
                return C1868x.RESULT_SERVICE_UNAVAILABLE;
            }
        }
        return C1868x.RESULT_ERROR;
    }

    public static Intent m9979a(Context context, PurchaseParams purchaseParams, Bundle bundle, C1868x c1868x, C2495w c2495w, C1552e c1552e) {
        al alVar;
        Intent intent = new Intent();
        String str = null;
        boolean z = false;
        if (bundle != null) {
            str = bundle.getString("inapp_signed_purchase_data");
            String string = bundle.getString("inapp_purchase_data_signature");
            if (!(str == null || string == null)) {
                intent.putExtra("INAPP_PURCHASE_DATA", str);
                intent.putExtra("INAPP_DATA_SIGNATURE", string);
            }
            alVar = (al) ParcelableProto.m21673a(bundle, "ExtraPurchaseData.purchaseTotalPrice");
            z = bundle.getBoolean("ExtraPurchaseData.iapGmpReportingDone", false);
        } else {
            alVar = null;
        }
        intent.putExtra("RESPONSE_CODE", c1868x.f9566l);
        if (!(z || TextUtils.isEmpty(str) || alVar == null || !c1552e.mo2294a(12604266) || purchaseParams.f9285a.f11834c != 11)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    C4911a.m22928a(context, new C4912b(jSONObject.getString("packageName"), jSONObject.getString("productId"), "", alVar.b, alVar.b, alVar.c, 1));
                    C1867w.m9988a(null, c2495w, c1552e);
                } catch (Throwable e) {
                    FinskyLog.m21667d("Unable to report IAP, GooglePlayServicesNotAvailableException: %s", e.getMessage());
                    C1867w.m9988a(e, c2495w, c1552e);
                }
            } catch (Throwable e2) {
                FinskyLog.m21669e("Invalid purchaseDataJson: %s", FinskyLog.m21655a(str));
                C1867w.m9988a(e2, c2495w, c1552e);
            }
        }
        return intent;
    }

    public static Bundle m9980a(C1868x c1868x) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c1868x.f9566l);
        return bundle;
    }

    @Deprecated
    private static void m9988a(Throwable th, C2495w c2495w, C1552e c1552e) {
        if (c1552e.mo2294a(12604323)) {
            C2474c c2474c = new C2474c(1105);
            c2474c.m13238a(th);
            c2495w.m13367a(c2474c);
        }
    }

    private static PackageInfo m9990b(Context context, String str, C1552e c1552e) {
        try {
            if (!c1552e.mo2294a(12627302) || C0327a.m1722b()) {
                return context.getPackageManager().getPackageInfo(str, 64);
            }
            return C5260a.m24087b(context).mo4692a(str);
        } catch (NameNotFoundException e) {
            FinskyLog.m21665c("Cannot find package: %s", str);
            return null;
        } catch (Throwable e2) {
            FinskyLog.m21660a(e2, "Cannot find package: %s", str);
            return null;
        }
    }

    private static String m9985a(PackageInfo packageInfo) {
        return aa.m21683a(packageInfo.signatures[0].toByteArray());
    }

    static boolean m9989a(Context context, String str, C1552e c1552e) {
        if (!c1552e.mo2294a(12644091)) {
            return false;
        }
        C5107g a = C5107g.m23705a(context);
        if (a == null || !a.m23710a(str)) {
            return false;
        }
        return true;
    }

    public final void m9994a(Activity activity, String str) {
        if ((this.f9552c.mo2854a(str) != null ? 1 : null) != null) {
            Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
            intent.setPackage(str);
            activity.sendBroadcast(intent);
        }
    }
}
