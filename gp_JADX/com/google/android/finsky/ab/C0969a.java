package com.google.android.finsky.ab;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.C4774e;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.be;
import com.google.wireless.android.finsky.dfe.nano.bg;
import com.google.wireless.android.finsky.dfe.nano.bh;
import com.google.wireless.android.finsky.dfe.nano.bi;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class C0969a {
    public static final Pattern f5936a = Pattern.compile(Character.toString(':'));
    public static final Pattern f5937b = Pattern.compile(Character.toString(';'));

    public static void m5795a(Context context, C4774e c4774e, C1287h c1287h, C0988c c0988c, boolean z, ContentFilterSettingsResponse contentFilterSettingsResponse, C0970b[] c0970bArr) {
        if (!z) {
            C0954a.f5834d.m5765c();
        } else if (!(c0970bArr == null || contentFilterSettingsResponse == null)) {
            C0954a.f5837g.m5763a(C0969a.m5791a(c0970bArr));
            C0957n c0957n = C0954a.f5834d;
            bi[] biVarArr = contentFilterSettingsResponse.b;
            StringBuilder stringBuilder = new StringBuilder();
            for (bi a : biVarArr) {
                for (C0970b a2 : c0970bArr) {
                    String a3 = C0969a.m5790a(a, a2);
                    if (a3 != null) {
                        stringBuilder.append(a3);
                        break;
                    }
                }
            }
            c0957n.m5763a(stringBuilder.toString());
        }
        c4774e.mo4380a(null, "content_filter_settings_changed");
        C0969a.m5793a(context, c1287h, c0988c, null);
    }

    public static void m5794a(Context context, C1287h c1287h, C0988c c0988c, boolean z, be beVar, String str) {
        if (z) {
            bg[] bgVarArr = beVar.c;
            List arrayList = new ArrayList();
            for (bg bgVar : bgVarArr) {
                arrayList.add(new C0970b(bgVar.c, bgVar.d, bgVar.e));
            }
            C0954a.f5837g.m5763a(C0969a.m5791a((C0970b[]) arrayList.toArray(new C0970b[bgVarArr.length])));
            C0954a.f5834d.m5763a(beVar.d);
        } else {
            C0954a.f5834d.m5765c();
        }
        if (TextUtils.isEmpty(str)) {
            C0954a.aP.m5765c();
        } else {
            C0954a.aP.m5763a((Object) str);
        }
        C0969a.m5793a(context, c1287h, c0988c, str);
    }

    private static void m5793a(Context context, C1287h c1287h, C0988c c0988c, String str) {
        String str2 = (String) C0954a.f5834d.m5760a();
        for (Account account : c0988c.cX()) {
            c1287h.mo2016a(account.name).mo1618a(str2);
        }
        Intent intent = new Intent("com.google.android.finsky.action.CONTENT_FILTERS_CHANGED");
        if (str != null) {
            intent.putExtra("consistency_token", str);
        }
        context.sendBroadcast(intent);
    }

    public static C0970b[] m5797a(C0957n c0957n) {
        C0970b[] c0970bArr;
        String str = (String) c0957n.m5760a();
        if (str == null || str.length() <= 0) {
            c0970bArr = new C0970b[0];
        } else {
            String[] a = C4680k.m21818a(str);
            C0970b[] c0970bArr2 = new C0970b[a.length];
            for (int i = 0; i < a.length; i++) {
                C0970b a2 = C0969a.m5787a(a[i]);
                if (a2 == null) {
                    c0970bArr = null;
                    break;
                }
                c0970bArr2[i] = a2;
            }
            c0970bArr = c0970bArr2;
        }
        if (c0970bArr == null) {
            c0957n.m5765c();
        }
        return c0970bArr;
    }

    public static bh m5788a(bi biVar, C0970b[] c0970bArr) {
        int i = 0;
        while (c0970bArr != null && i < c0970bArr.length) {
            if (C0969a.m5796a(biVar.c, c0970bArr[i].f5938a) && biVar.d == c0970bArr[i].f5939b) {
                break;
            }
            i++;
        }
        i = -1;
        C0970b c0970b = i == -1 ? null : c0970bArr[i];
        for (bh bhVar : biVar.e) {
            boolean z = c0970b == null ? bhVar.g : bhVar.e() ? c0970b.f5940c == bhVar.c : c0970b.f5940c == -1;
            if (z) {
                return bhVar;
            }
        }
        return null;
    }

    public static Bundle m5786a(bi biVar, bh bhVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("authority", biVar.d);
        bundle.putInt("filter_level", bhVar.c);
        bundle.putString("label", bhVar.e);
        if (!(bhVar.d == null || bhVar.d.f11860f == null)) {
            bundle.putString("icon", bhVar.d.f11860f);
        }
        return bundle;
    }

    public static String m5791a(C0970b[] c0970bArr) {
        String[] strArr = new String[c0970bArr.length];
        for (int i = 0; i < c0970bArr.length; i++) {
            C0970b c0970b = c0970bArr[i];
            StringBuilder stringBuilder = new StringBuilder();
            for (int i2 = 0; i2 < c0970b.f5938a.length; i2++) {
                stringBuilder.append(c0970b.f5938a[i2]);
                if (i2 + 1 < c0970b.f5938a.length) {
                    stringBuilder.append(':');
                }
            }
            stringBuilder.append(';');
            stringBuilder.append(c0970b.f5939b);
            stringBuilder.append(';');
            stringBuilder.append(c0970b.f5940c);
            strArr[i] = stringBuilder.toString();
        }
        return C4680k.m21817a(strArr);
    }

    public static List m5792a(ContentFilterSettingsResponse contentFilterSettingsResponse) {
        List arrayList = new ArrayList();
        for (bi biVar : contentFilterSettingsResponse.b) {
            bh[] bhVarArr = biVar.e;
            bh bhVar = bhVarArr[bhVarArr.length - 1];
            for (bh bhVar2 : bhVarArr) {
                if (bhVar2.g) {
                    break;
                }
            }
            bh bhVar22 = bhVar;
            arrayList.add(new C0970b(biVar.c, biVar.d, C0969a.m5785a(bhVar22)));
        }
        return arrayList;
    }

    public static int m5785a(bh bhVar) {
        if (bhVar.e()) {
            return bhVar.c;
        }
        return -1;
    }

    private static C0970b m5787a(String str) {
        int i = 0;
        String[] split = f5937b.split(str);
        if (split.length < 3) {
            FinskyLog.m21667d("Incorrect number of values, expected at least 3 in: %s", str);
            return null;
        }
        String[] split2 = f5936a.split(split[i]);
        int[] iArr = new int[split2.length];
        int i2 = i;
        while (i2 < split2.length) {
            try {
                iArr[i2] = Integer.parseInt(split2[i2]);
                i2++;
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "Could not parse number selection values from: %s", split[i2]);
                return null;
            }
        }
        try {
            try {
                return new C0970b(iArr, Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            } catch (Throwable e2) {
                FinskyLog.m21660a(e2, "Could not parse number selection values from: %s", split[2]);
                return null;
            }
        } catch (Throwable e22) {
            FinskyLog.m21660a(e22, "Could not parse number selection values from: %s", split[1]);
            return null;
        }
    }

    private static String m5790a(bi biVar, C0970b c0970b) {
        if (c0970b.f5939b < 0 || c0970b.f5938a == null) {
            FinskyLog.m21667d("Badly formatted ContentFilterSelection authorityId is negative or documentTypes is null. [ContentFilterSelection=%s]", c0970b);
            return null;
        } else if (!biVar.e() || biVar.c == null) {
            FinskyLog.m21667d("Badly formatted FilterRange authorityId is missing or documentType is null. [FilterRange=%s]", biVar);
            return null;
        } else {
            if (biVar.d == c0970b.f5939b && C0969a.m5796a(biVar.c, c0970b.f5938a)) {
                for (bh bhVar : biVar.e) {
                    if (bhVar.e()) {
                        if (((bhVar.b & 4) != 0 ? 1 : 0) != 0 && c0970b.f5940c == bhVar.c) {
                            return bhVar.f;
                        }
                    }
                }
            }
            return null;
        }
    }

    private static boolean m5796a(int[] iArr, int[] iArr2) {
        for (int i : iArr2) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String m5789a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case -1:
                return resources.getString(C7582R.string.content_filter_no_rating);
            case 0:
                return resources.getString(C7582R.string.content_filter_everyone);
            case 1:
                return resources.getString(C7582R.string.content_filter_low_maturity);
            case 2:
                return resources.getString(C7582R.string.content_filter_medium_maturity);
            case 3:
                return resources.getString(C7582R.string.content_filter_high_maturity);
            case 4:
                return resources.getString(C7582R.string.content_filter_show_all_apps);
            default:
                return null;
        }
    }
}
