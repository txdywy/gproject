package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ad.a;
import com.google.android.finsky.as.a;
import com.google.android.finsky.b.f;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.d.e;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dh.a;
import com.google.android.finsky.inlinedetails.j;
import com.google.android.finsky.l.a;
import com.google.android.finsky.l.b;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.c;
import com.google.android.finsky.utils.i;
import com.google.android.finsky.utils.k;
import com.google.android.finsky.utils.y;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.br;
import java.util.HashMap;

public final class com.google.android.finsky.activities.ej
{

    public static final Uri a;
    public final Activity b;
    public final com.google.android.finsky.ba.c c;
    public final com.google.android.finsky.accounts.c d;
    public final com.google.android.finsky.br.a e;
    public final com.google.android.finsky.l.a f;
    public final com.google.android.finsky.utils.y g;
    public final com.google.android.finsky.ad.a h;

    static {
        com.google.android.finsky.activities.ej.a = Uri.parse("http://market.android.com/details");
    }

    ej(Activity p0, com.google.android.finsky.ba.c p1, com.google.android.finsky.accounts.c p2, com.google.android.finsky.br.a p3, com.google.android.finsky.l.a p4, com.google.android.finsky.utils.y p5, com.google.android.finsky.ad.a p6) {
        this.b = p0;
        this.c = p1;
        this.d = p2;
        this.e = p3;
        this.f = p4;
        this.g = p5;
        this.h = p6;
    }

    private final Intent a(Uri p0, boolean p1, String p2, boolean p3) {
        if (this.a(12633159)) {
            v0 = InlineAppDetailsDialog.a(p0, p1, p2, p3);
            v0.setClass(com.google.android.finsky.m.a.b, InlineAppDetailsDummyDialog);
        }
        else
            v0 = InlineAppDetailsDialog.a(p0, p1, p2, p3);
        return v0;
    }

    private final boolean a(long p0) {
        return this.c.dj().a(p0);
    }

    public static boolean a(Uri p0) {
        if (p0 != 0 && !TextUtils.isEmpty(p0.getQueryParameter("url")) && !TextUtils.isEmpty(p0.getQueryParameter("id")))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private static boolean a(boolean p0, String p1, String p2) {
        v0 = 0;
        if (p0 != 0 && !TextUtils.isEmpty(p2) && !TextUtils.isEmpty(p1) && p2.equals(p1))
            v0 = 1;
        return v0;
    }

    private static boolean b(Uri p0) {
        v0 = 0;
        if (p0 != 0 && !TextUtils.isEmpty(p0.getQueryParameter("inline")) && !TextUtils.isEmpty(p0.getQueryParameter("enifd")))
            v0 = 1;
        return v0;
    }

    private final boolean b(boolean p0, String p1, String p2) {
        if (this.a(12634613) && !this.a(12613372)) {
            v0 = 0;
            return v0;
        }
        if (this.d.cY() == 0) {
            v0 = 0;
            return v0;
        }
        if (!com.google.android.finsky.activities.ej.a(p0, p1, p2)) {
            v0 = 0;
            return v0;
        }
        v0 = -1;
        switch (p2.hashCode()) {
            case -2075712516:
                if (p2.equals("com.google.android.youtube"))
                    v0 = 16;
                break;
            case -928396735:
                if (p2.equals("com.test.overlay"))
                    v0 = 7;
                break;
            case -649684660:
                if (p2.equals("flipboard.app"))
                    v0 = 2;
                break;
            case -583737491:
                if (p2.equals("com.pinterest"))
                    v0 = 6;
                break;
            case -143313792:
                if (p2.equals("ru.yandex.test.promolib"))
                    v0 = 14;
                break;
            case 10619783:
                if (p2.equals("com.twitter.android"))
                    v0 = 8;
                break;
            case 19650874:
                if (p2.equals("ru.yandex.yandexmaps"))
                    v0 = 10;
                break;
            case 19680841:
                if (p2.equals("ru.yandex.yandexnavi"))
                    v0 = 15;
                break;
            case 304833084:
                if (p2.equals("com.google.android.apps.youtube.vr"))
                    v0 = 22;
                break;
            case 419128298:
                if (p2.equals("com.facebook.wakizashi"))
                    v0 = 1;
                break;
            case 621411164:
                if (p2.equals("net.daum.android.daum"))
                    v0 = 4;
                break;
            case 636981927:
                if (p2.equals("ru.yandex.metro"))
                    v0 = 12;
                break;
            case 647779725:
                if (p2.equals("ru.yandex.searchplugin"))
                    v0 = 13;
                break;
            case 714499313:
                if (p2.equals("com.facebook.katana"))
                    v0 = 0;
                break;
            case 886484461:
                if (p2.equals("com.google.android.apps.youtube.kids"))
                    v0 = 18;
                break;
            case 1153658444:
                if (p2.equals("com.linkedin.android"))
                    v0 = 5;
                break;
            case 1249065348:
                if (p2.equals("com.kakao.talk"))
                    v0 = 3;
                break;
            case 1252744364:
                if (p2.equals("com.google.android.apps.youtube.creator"))
                    v0 = 21;
                break;
            case 1386399663:
                if (p2.equals("com.google.android.apps.youtube.gaming"))
                    v0 = 19;
                break;
            case 1387611572:
                if (p2.equals("com.google.android.youtube.tv"))
                    v0 = 17;
                break;
            case 1663191933:
                if (p2.equals("ru.yandex.yandexbus"))
                    v0 = 11;
                break;
            case 1712832578:
                if (p2.equals("com.google.android.apps.youtube.mango"))
                    v0 = 23;
                break;
            case 1713433253:
                if (p2.equals("com.google.android.apps.youtube.music"))
                    v0 = 20;
                break;
            case 1835489205:
                if (p2.equals("ru.yandex.weatherplugin"))
                    v0 = 9;
                break;
            default:
                break;
        }
        switch (v0) {
            case 0:
                v0 = this.a(12612651);
                break;
            case 1:
                v0 = this.a(12612651);
                break;
            case 2:
                v0 = this.a(12612654);
                break;
            case 3:
                v0 = this.a(12620763);
                break;
            case 4:
                v0 = this.a(12633604);
                break;
            case 5:
                v0 = this.a(12612667);
                break;
            case 6:
                v0 = this.a(12612653);
                break;
            case 7:
                v0 = this.a(12623078);
                break;
            case 8:
                v0 = this.a(12612652);
                break;
            case 9:
                v0 = this.a(12630390);
                break;
            case 10:
                v0 = this.a(12630390);
                break;
            case 11:
                v0 = this.a(12630390);
                break;
            case 12:
                v0 = this.a(12630390);
                break;
            case 13:
                v0 = this.a(12630390);
                break;
            case 14:
                v0 = this.a(12630391);
                break;
            case 15:
                v0 = this.a(12632679);
                break;
            case 16:
                v0 = this.a(12623401);
                break;
            case 17:
                v0 = this.a(12623401);
                break;
            case 18:
                v0 = this.a(12623401);
                break;
            case 19:
                v0 = this.a(12623401);
                break;
            case 20:
                v0 = this.a(12623401);
                break;
            case 21:
                v0 = this.a(12623401);
                break;
            case 22:
                v0 = this.a(12623401);
                break;
            case 23:
                v0 = this.a(12623401);
                break;
            default:
                if (this.a(12612650) && com.google.android.finsky.utils.c.a(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.aj.b()), p2))
                    v0 = 1;
                else
                    v0 = 0;
                break;
        }
    }

    private final boolean c(Uri p0) {
        if (!this.a(12605436))
            v0 = 0;
        else
            v0 = com.google.android.finsky.activities.ej.b(p0);
        return v0;
    }

    public final Intent a() {
        if (Build$VERSION.SDK_INT >= 21 && com.google.android.finsky.as.a.a(this.b))
            v0 = this.b.getPackageManager().getLeanbackLaunchIntentForPackage(this.b.getPackageName());
        else
            v0 = this.b.getPackageManager().getLaunchIntentForPackage(this.b.getPackageName());
        return v0;
    }

    public final com.google.android.finsky.inlinedetails.j a(Intent p0, boolean p1, com.google.android.finsky.d.w p2) {
        v14 = p0.getData();
        v15 = v14.getQueryParameter("url");
        v6 = com.google.android.finsky.dh.a.a(this.b);
        v8 = p0.getBooleanExtra("overlay", 0);
        v9 = p0.getStringExtra("callerId");
        v7 = 0;
        v5 = 0;
        v11 = 0;
        if (com.google.android.finsky.activities.ej.a(v8, v9, v6)) {
            v7 = 3;
            v5 = this.b(v8, v9, v6);
            v13 = 0;
        }
        else if (com.google.android.finsky.activities.ej.b(v14)) {
            v7 = 2;
            v5 = this.c(v14);
            v13 = 0;
        }
        else if (this.a(12635356)) {
            v11 = 2;
            v13 = 1;
        }
        else {
            v11 = 1;
            v13 = 1;
        }
        if (p1 != 0)
            v5 = new com.google.android.finsky.d.e(7).a(v14.toString()).d(v6).e(v6).a(v7, v5);
        else
            v5 = 0;
        if (this.a(12639141)) {
            if (v6 != 0)
                v4 = v6;
            else
                v4 = "";
            v7 = v4 + 124 + v14.getQueryParameter("id");
            if (v7 != 0) {
                v16 = com.google.android.finsky.utils.i.a();
                v4 = (Long)this.g.b.put(v7, Long.valueOf(v16));
                if (v4 != 0 && v16 > v4.longValue() && v16 - v4.longValue() < com.google.android.finsky.utils.y.a.longValue())
                    v4 = 1;
                else
                    v4 = 0;
            }
            else
                v4 = 0;
            v10 = new Object[2];
            v10[0] = v7;
            v10[1] = Boolean.valueOf(v4);
        }
        else {
            v7 = 0;
            v4 = 0;
        }
        if (TextUtils.isEmpty(v15)) {
            FinskyLog.d("Launch URL without continue URL", new Object[0]);
            if (v5 != 0) {
                v5.a.a = v5.a.a | 512;
                v5.a.k = v8;
            }
            if (this.b(v8, v9, v6)) {
                v9 = v11;
                v22 = this.a(v14, 1, v6, 0);
                v6 = 1;
                v8 = v22;
            }
            else if (this.c(v14)) {
                v9 = v11;
                v22 = this.a(v14, 0, v6, 0);
                v6 = 1;
                v8 = v22;
            }
            else if (v11 == 2) {
                if (v6 == 0)
                    v6 = com.google.android.finsky.b.f.a(this.b);
                v9 = v11;
                v22 = this.a(v14, 0, v6, 1);
                v6 = 1;
                v8 = v22;
            }
            else {
                p0.setData(v14.buildUpon().scheme("http").authority("market.android.com").path("details").build());
                v6 = 0;
                v8 = this.e.a(this.b, p0);
                v9 = v11;
            }
        }
        else {
            v16 = v14.getQueryParameter("id");
            if (TextUtils.isEmpty(v16)) {
                FinskyLog.d("Launch URL without package name", new Object[0]);
                v4 = new com.google.android.finsky.inlinedetails.j(0, v4, v7, this.a());
                return v4;
            }
            v9 = v14.getQueryParameter("min_version");
            v8 = -1;
            if (!TextUtils.isEmpty(v9)) {
                try {
                    v8 = Integer.parseInt(v9);
                }
                catch (NumberFormatException ex) {
                }
            }
            v17 = this.f.a(v16);
            if (v17 != 0 && v17.c != 0)
                v12 = v17.c.d;
            else
                v12 = -1;
            if (v12 >= 0 && v12 >= v8)
                v9 = 1;
            else
                v9 = 0;
            v18 = this.b.getPackageManager();
            v10 = new Intent("android.intent.action.VIEW").setData(Uri.parse(v15)).setPackage(v16);
            v19 = this.c.dj();
            if (v19.a(12644660)) {
                v10.addFlags(268435456);
                if (p0.hasCategory("android.intent.category.BROWSABLE"))
                    v10.addCategory("android.intent.category.BROWSABLE");
            }
            if (v19.a(12644763) && !this.h.a(v16, (long)v12))
                v12 = 0;
            else {
                v12 = this.e.a(v18, v10);
                if (v9 != 0 && v12 == 0 && v10.hasCategory("android.intent.category.BROWSABLE")) {
                    v19 = new Intent;
                    v19.<init>(v10);
                    v19.removeCategory("android.intent.category.BROWSABLE");
                    if (this.e.a(v18, v19))
                        FinskyLog.a("URL does not support category BROWSABLE", new Object[0]);
                }
            }
            if (v5 != 0) {
                v18 = v5.b(v16);
                v18.a.a = v18.a.a | 8;
                v18.a.e = v8;
                v18.a.a = v18.a.a | 16;
                v18.a.f = v9;
                v18.a.a = v18.a.a | 32;
                v18.a.g = v12;
            }
            if (v9 != 0 && v12 != 0) {
                v6 = 0;
                if (v17 != 0 && v17.d != 0)
                    this.f.b.b(v16, 0);
                v9 = 0;
                v8 = v10;
            }
            else if (this.c(v14)) {
                v9 = v11;
                v22 = this.a(v14, 0, v6, 0);
                v6 = 1;
                v8 = v22;
            }
            else {
                v6 = v14.getQueryParameter("referrer");
                v8 = v14.getQueryParameter("pcampaignid");
                v9 = com.google.android.finsky.activities.ej.a.buildUpon();
                v9.appendQueryParameter("id", v16);
                v9.appendQueryParameter("url", v15);
                if (!TextUtils.isEmpty(v6))
                    v9.appendQueryParameter("referrer", v6);
                if (!TextUtils.isEmpty(v8))
                    v9.appendQueryParameter("pcampaignid", v8);
                v8 = new Intent("android.intent.action.VIEW");
                v8.setData(v9.build());
                v6 = 0;
                v8 = this.e.a(this.b, v8);
                if (v11 == 2)
                    v9 = 1;
                else
                    v9 = v11;
            }
        }
        if (v5 != 0 && v4 == 0) {
            if (v13 != 0) {
                v5.a.o = v9;
                v5.a.a = v5.a.a | 4096;
            }
            p2.a(v5);
        }
        v4 = new com.google.android.finsky.inlinedetails.j(v6, v4, v7, v8);
        return v4;
    }

}
