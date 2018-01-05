package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ad.C1136a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.inlinedetails.C3254j;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2476e;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.C4693y;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.br;

public final class ej {
    public static final Uri f6712a = Uri.parse("http://market.android.com/details");
    public final Activity f6713b;
    public final C1461c f6714c;
    public final C0988c f6715d;
    public final C2162a f6716e;
    public final C3646a f6717f;
    public final C4693y f6718g;
    public final C1136a f6719h;

    public ej(Activity activity, C1461c c1461c, C0988c c0988c, C2162a c2162a, C3646a c3646a, C4693y c4693y, C1136a c1136a) {
        this.f6713b = activity;
        this.f6714c = c1461c;
        this.f6715d = c0988c;
        this.f6716e = c2162a;
        this.f6717f = c3646a;
        this.f6718g = c4693y;
        this.f6719h = c1136a;
    }

    public final C3254j m6521a(Intent intent, boolean z, C2495w c2495w) {
        Object obj;
        C2476e a;
        String str;
        boolean z2;
        int i;
        boolean z3;
        Intent intent2;
        Uri data = intent.getData();
        String queryParameter = data.getQueryParameter("url");
        String a2 = C2744a.m14784a(this.f6713b);
        boolean booleanExtra = intent.getBooleanExtra("overlay", false);
        String stringExtra = intent.getStringExtra("callerId");
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        if (m6516a(booleanExtra, stringExtra, a2)) {
            i2 = 3;
            z4 = m6518b(booleanExtra, stringExtra, a2);
            obj = null;
        } else if (m6517b(data)) {
            i2 = 2;
            z4 = m6519c(data);
            obj = null;
        } else if (m6514a(12635356)) {
            i3 = 2;
            r13 = 1;
        } else {
            i3 = 1;
            r13 = 1;
        }
        if (z) {
            a = new C2476e(7).m13262a(data.toString()).m13266d(a2).m13267e(a2).m13261a(i2, z4);
        } else {
            a = null;
        }
        if (m6514a(12639141)) {
            str = (a2 != null ? a2 : "") + '|' + data.getQueryParameter("id");
            C4693y c4693y = this.f6718g;
            if (str != null) {
                long a3 = C4678i.m21812a();
                Long l = (Long) c4693y.f24081b.put(str, Long.valueOf(a3));
                z2 = l != null && a3 > l.longValue() && a3 - l.longValue() < C4693y.f24080a.longValue();
            } else {
                z2 = false;
            }
            Object[] objArr = new Object[]{str, Boolean.valueOf(z2)};
        } else {
            str = null;
            z2 = false;
        }
        Intent a4;
        if (TextUtils.isEmpty(queryParameter)) {
            FinskyLog.m21667d("Launch URL without continue URL", new Object[0]);
            if (a != null) {
                br brVar = a.f13346a;
                brVar.a |= 512;
                brVar.k = booleanExtra;
            }
            if (m6518b(booleanExtra, stringExtra, a2)) {
                i = i3;
                a4 = m6513a(data, true, a2, false);
                z3 = true;
                intent2 = a4;
            } else if (m6519c(data)) {
                i = i3;
                a4 = m6513a(data, false, a2, false);
                z3 = true;
                intent2 = a4;
            } else if (i3 == 2) {
                if (a2 == null) {
                    a2 = C1542f.m8971a(this.f6713b);
                }
                i = i3;
                a4 = m6513a(data, false, a2, true);
                z3 = true;
                intent2 = a4;
            } else {
                intent.setData(data.buildUpon().scheme("http").authority("market.android.com").path("details").build());
                z3 = false;
                intent2 = this.f6716e.mo2685a(this.f6713b, intent);
                i = i3;
            }
        } else {
            CharSequence queryParameter2 = data.getQueryParameter("id");
            if (TextUtils.isEmpty(queryParameter2)) {
                FinskyLog.m21667d("Launch URL without package name", new Object[0]);
                return new C3254j(false, z2, str, m6520a());
            }
            int i4;
            boolean z5;
            C2476e b;
            br brVar2;
            br brVar3;
            Object queryParameter3;
            Object queryParameter4;
            Builder buildUpon;
            Object queryParameter5 = data.getQueryParameter("min_version");
            int i5 = -1;
            if (!TextUtils.isEmpty(queryParameter5)) {
                try {
                    i5 = Integer.parseInt(queryParameter5);
                } catch (NumberFormatException e) {
                }
            }
            C3647b a5 = this.f6717f.m17243a((String) queryParameter2);
            if (a5 == null || a5.f18028c == null) {
                i4 = -1;
            } else {
                i4 = a5.f18028c.f11419d;
            }
            boolean z6 = i4 >= 0 && i4 >= i5;
            PackageManager packageManager = this.f6713b.getPackageManager();
            Intent intent3 = new Intent("android.intent.action.VIEW").setData(Uri.parse(queryParameter)).setPackage(queryParameter2);
            C1552e dj = this.f6714c.dj();
            if (dj.mo2294a(12644660)) {
                intent3.addFlags(268435456);
                if (intent.hasCategory("android.intent.category.BROWSABLE")) {
                    intent3.addCategory("android.intent.category.BROWSABLE");
                }
            }
            if (dj.mo2294a(12644763)) {
                if (!this.f6719h.m6874a(queryParameter2, (long) i4)) {
                    z5 = false;
                    if (a != null) {
                        b = a.m13264b(queryParameter2);
                        brVar2 = b.f13346a;
                        brVar2.a |= 8;
                        brVar2.e = i5;
                        brVar3 = b.f13346a;
                        brVar3.a |= 16;
                        brVar3.f = z6;
                        brVar3 = b.f13346a;
                        brVar3.a |= 32;
                        brVar3.g = z5;
                    }
                    if (!z6 && z5) {
                        z3 = false;
                        if (!(a5 == null || a5.f18029d == null)) {
                            this.f6717f.f18022b.mo2671b((String) queryParameter2, null);
                        }
                        i = 0;
                        intent2 = intent3;
                    } else if (m6519c(data)) {
                        queryParameter3 = data.getQueryParameter("referrer");
                        queryParameter4 = data.getQueryParameter("pcampaignid");
                        buildUpon = f6712a.buildUpon();
                        buildUpon.appendQueryParameter("id", queryParameter2);
                        buildUpon.appendQueryParameter("url", queryParameter);
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            buildUpon.appendQueryParameter("referrer", queryParameter3);
                        }
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            buildUpon.appendQueryParameter("pcampaignid", queryParameter4);
                        }
                        intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(buildUpon.build());
                        z3 = false;
                        intent2 = this.f6716e.mo2685a(this.f6713b, intent2);
                        i = i3 != 2 ? 1 : i3;
                    } else {
                        i = i3;
                        a4 = m6513a(data, false, a2, false);
                        z3 = true;
                        intent2 = a4;
                    }
                }
            }
            z5 = this.f6716e.mo2704a(packageManager, intent3);
            if (z6 && !z5 && intent3.hasCategory("android.intent.category.BROWSABLE")) {
                Intent intent4 = new Intent(intent3);
                intent4.removeCategory("android.intent.category.BROWSABLE");
                if (this.f6716e.mo2704a(packageManager, intent4)) {
                    FinskyLog.m21659a("URL does not support category BROWSABLE", new Object[0]);
                }
            }
            if (a != null) {
                b = a.m13264b(queryParameter2);
                brVar2 = b.f13346a;
                brVar2.a |= 8;
                brVar2.e = i5;
                brVar3 = b.f13346a;
                brVar3.a |= 16;
                brVar3.f = z6;
                brVar3 = b.f13346a;
                brVar3.a |= 32;
                brVar3.g = z5;
            }
            if (!z6) {
            }
            if (m6519c(data)) {
                queryParameter3 = data.getQueryParameter("referrer");
                queryParameter4 = data.getQueryParameter("pcampaignid");
                buildUpon = f6712a.buildUpon();
                buildUpon.appendQueryParameter("id", queryParameter2);
                buildUpon.appendQueryParameter("url", queryParameter);
                if (TextUtils.isEmpty(queryParameter3)) {
                    buildUpon.appendQueryParameter("referrer", queryParameter3);
                }
                if (TextUtils.isEmpty(queryParameter4)) {
                    buildUpon.appendQueryParameter("pcampaignid", queryParameter4);
                }
                intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(buildUpon.build());
                z3 = false;
                intent2 = this.f6716e.mo2685a(this.f6713b, intent2);
                if (i3 != 2) {
                }
            } else {
                i = i3;
                a4 = m6513a(data, false, a2, false);
                z3 = true;
                intent2 = a4;
            }
        }
        C3254j c3254j = new C3254j(z3, z2, str, intent2);
        if (!(a == null || z2)) {
            if (obj != null) {
                br brVar4 = a.f13346a;
                brVar4.o = i;
                brVar4.a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            c2495w.m13369a(a);
        }
        return c3254j;
    }

    private static boolean m6517b(Uri uri) {
        if (uri == null) {
            return false;
        }
        CharSequence queryParameter = uri.getQueryParameter("inline");
        CharSequence queryParameter2 = uri.getQueryParameter("enifd");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
            return false;
        }
        return true;
    }

    private final boolean m6519c(Uri uri) {
        if (m6514a(12605436)) {
            return m6517b(uri);
        }
        return false;
    }

    public final Intent m6520a() {
        if (VERSION.SDK_INT < 21 || !C1503a.m8830a(this.f6713b)) {
            return this.f6713b.getPackageManager().getLaunchIntentForPackage(this.f6713b.getPackageName());
        }
        return this.f6713b.getPackageManager().getLeanbackLaunchIntentForPackage(this.f6713b.getPackageName());
    }

    private static boolean m6516a(boolean z, String str, String str2) {
        if (z && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && str2.equals(str)) {
            return true;
        }
        return false;
    }

    private final boolean m6518b(boolean z, String str, String str2) {
        if (m6514a(12634613) && !m6514a(12613372)) {
            return false;
        }
        if (this.f6715d.cY() == null) {
            return false;
        }
        if (!m6516a(z, str, str2)) {
            return false;
        }
        Object obj = -1;
        switch (str2.hashCode()) {
            case -2075712516:
                if (str2.equals("com.google.android.youtube")) {
                    obj = 16;
                    break;
                }
                break;
            case -928396735:
                if (str2.equals("com.test.overlay")) {
                    obj = 7;
                    break;
                }
                break;
            case -649684660:
                if (str2.equals("flipboard.app")) {
                    obj = 2;
                    break;
                }
                break;
            case -583737491:
                if (str2.equals("com.pinterest")) {
                    obj = 6;
                    break;
                }
                break;
            case -143313792:
                if (str2.equals("ru.yandex.test.promolib")) {
                    obj = 14;
                    break;
                }
                break;
            case 10619783:
                if (str2.equals("com.twitter.android")) {
                    obj = 8;
                    break;
                }
                break;
            case 19650874:
                if (str2.equals("ru.yandex.yandexmaps")) {
                    obj = 10;
                    break;
                }
                break;
            case 19680841:
                if (str2.equals("ru.yandex.yandexnavi")) {
                    obj = 15;
                    break;
                }
                break;
            case 304833084:
                if (str2.equals("com.google.android.apps.youtube.vr")) {
                    obj = 22;
                    break;
                }
                break;
            case 419128298:
                if (str2.equals("com.facebook.wakizashi")) {
                    int i = 1;
                    break;
                }
                break;
            case 621411164:
                if (str2.equals("net.daum.android.daum")) {
                    obj = 4;
                    break;
                }
                break;
            case 636981927:
                if (str2.equals("ru.yandex.metro")) {
                    obj = 12;
                    break;
                }
                break;
            case 647779725:
                if (str2.equals("ru.yandex.searchplugin")) {
                    obj = 13;
                    break;
                }
                break;
            case 714499313:
                if (str2.equals("com.facebook.katana")) {
                    obj = null;
                    break;
                }
                break;
            case 886484461:
                if (str2.equals("com.google.android.apps.youtube.kids")) {
                    obj = 18;
                    break;
                }
                break;
            case 1153658444:
                if (str2.equals("com.linkedin.android")) {
                    obj = 5;
                    break;
                }
                break;
            case 1249065348:
                if (str2.equals("com.kakao.talk")) {
                    obj = 3;
                    break;
                }
                break;
            case 1252744364:
                if (str2.equals("com.google.android.apps.youtube.creator")) {
                    obj = 21;
                    break;
                }
                break;
            case 1386399663:
                if (str2.equals("com.google.android.apps.youtube.gaming")) {
                    obj = 19;
                    break;
                }
                break;
            case 1387611572:
                if (str2.equals("com.google.android.youtube.tv")) {
                    obj = 17;
                    break;
                }
                break;
            case 1663191933:
                if (str2.equals("ru.yandex.yandexbus")) {
                    obj = 11;
                    break;
                }
                break;
            case 1712832578:
                if (str2.equals("com.google.android.apps.youtube.mango")) {
                    obj = 23;
                    break;
                }
                break;
            case 1713433253:
                if (str2.equals("com.google.android.apps.youtube.music")) {
                    obj = 20;
                    break;
                }
                break;
            case 1835489205:
                if (str2.equals("ru.yandex.weatherplugin")) {
                    obj = 9;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
            case 1:
                return m6514a(12612651);
            case 2:
                return m6514a(12612654);
            case 3:
                return m6514a(12620763);
            case 4:
                return m6514a(12633604);
            case 5:
                return m6514a(12612667);
            case 6:
                return m6514a(12612653);
            case 7:
                return m6514a(12623078);
            case 8:
                return m6514a(12612652);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return m6514a(12630390);
            case 14:
                return m6514a(12630391);
            case 15:
                return m6514a(12632679);
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return m6514a(12623401);
            default:
                if (m6514a(12612650) && C4672c.m21804a(C4680k.m21818a((String) C0955b.aj.m28964b()), (Object) str2)) {
                    return true;
                }
                return false;
        }
    }

    public static boolean m6515a(Uri uri) {
        return (uri == null || TextUtils.isEmpty(uri.getQueryParameter("url")) || TextUtils.isEmpty(uri.getQueryParameter("id"))) ? false : true;
    }

    private final Intent m6513a(Uri uri, boolean z, String str, boolean z2) {
        if (!m6514a(12633159)) {
            return InlineAppDetailsDialog.m6106a(uri, z, str, z2);
        }
        Intent a = InlineAppDetailsDialog.m6106a(uri, z, str, z2);
        a.setClass(C1473m.f7980a.f7981b, InlineAppDetailsDummyDialog.class);
        return a;
    }

    private final boolean m6514a(long j) {
        return this.f6714c.dj().mo2294a(j);
    }
}
