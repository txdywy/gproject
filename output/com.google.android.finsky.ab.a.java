package com.google.android.finsky.ab;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.android.finsky.volley.e;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.be;
import com.google.wireless.android.finsky.dfe.nano.bg;
import com.google.wireless.android.finsky.dfe.nano.bh;
import com.google.wireless.android.finsky.dfe.nano.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public static class com.google.android.finsky.ab.a
{

    public static final Pattern a;
    public static final Pattern b;

    static {
        com.google.android.finsky.ab.a.a = Pattern.compile(Character.toString(58));
        com.google.android.finsky.ab.a.b = Pattern.compile(Character.toString(59));
    }

    public static int a(com.google.wireless.android.finsky.dfe.nano.bh p0) {
        if (p0.e())
            v0 = p0.c;
        else
            v0 = -1;
        return v0;
    }

    public static Bundle a(com.google.wireless.android.finsky.dfe.nano.bi p0, com.google.wireless.android.finsky.dfe.nano.bh p1) {
        v0 = new Bundle();
        v0.putInt("authority", p0.d);
        v0.putInt("filter_level", p1.c);
        v0.putString("label", p1.e);
        if (p1.d != 0 && p1.d.f != 0)
            v0.putString("icon", p1.d.f);
        return v0;
    }

    private static com.google.android.finsky.ab.b a(String p0) {
        v4 = com.google.android.finsky.ab.a.b.split(p0);
        if (v4.length >= 3) {
            v3 = com.google.android.finsky.ab.a.a.split(v4[0]);
            v5 = new int[v3.length];
            v0 = 0;
            while (v0 < v3.length) {
                try {
                    v5[v0] = Integer.parseInt(v3[v0]);
                }
                catch (NumberFormatException ex) {
                    v6 = new Object[1];
                    v6[0] = v4[v0];
                    FinskyLog.a(ex, "Could not parse number selection values from: %s", v6);
                    v0 = 0;
                    return v0;
                }
                v0 = v0 + 1;
            }
            v0 = new com.google.android.finsky.ab.b(v5, Integer.parseInt(v4[1]), Integer.parseInt(v4[2]));
            return v0;
        }
        v3 = new Object[1];
        v3[0] = p0;
        FinskyLog.d("Incorrect number of values, expected at least 3 in: %s", v3);
        v0 = 0;
        return v0;
        v3 = com.google.android.finsky.ab.a.a.split(v4[0]);
        v5 = new int[v3.length];
        v0 = 0;
        while (v0 < v3.length) {
            try {
                v5[v0] = Integer.parseInt(v3[v0]);
            }
            catch (NumberFormatException ex) {
                v6 = new Object[1];
                v6[0] = v4[v0];
                FinskyLog.a(ex, "Could not parse number selection values from: %s", v6);
                v0 = 0;
                return v0;
            }
            v0 = v0 + 1;
        }
        try {
        }
        catch (NumberFormatException ex) {
            v5 = new Object[1];
            v5[0] = v4[1];
            FinskyLog.a(ex, "Could not parse number selection values from: %s", v5);
            v0 = 0;
            return v0;
        }
        try {
        }
        catch (NumberFormatException ex) {
            v5 = new Object[1];
            v5[0] = v4[2];
            FinskyLog.a(ex, "Could not parse number selection values from: %s", v5);
            v0 = 0;
            return v0;
        }
        v0 = new com.google.android.finsky.ab.b(v5, Integer.parseInt(v4[1]), Integer.parseInt(v4[2]));
        return v0;
    }

    public static com.google.wireless.android.finsky.dfe.nano.bh a(com.google.wireless.android.finsky.dfe.nano.bi p0, b[] p1) {
  0:    v1 = 0;
  4:    v0 = 0;
  5:    if (p1 == 0) goto 52;
  8:    if (v0 >= p1.length) goto 52;
 20:    if (!com.google.android.finsky.ab.a.a(p0.c, p1[v0].a)) goto 49;
 28:    if (p0.d != p1[v0].b) goto 49;
 30:    if (v0 == -1)
 32:        v0 = 0;
        else
 54:        v0 = p1[v0];
 36:    v3 = 0;
 37:    if (v3 >= p0.e.length)
 48:        return v1;
 41:    if (v0 == 0)
 43:        v5 = p0.e[v3].g;
 61:    else if (p0.e[v3].e()) {
 67:        if (v0.c == p0.e[v3].c)
 69:            v5 = 1;
            else
 71:            v5 = 0;
        }
 75:    else if (v0.c == -1)
 77:        v5 = 1;
        else
 79:        v5 = 0;
 45:    if (v5 != 0) {
 47:        v1 = p0.e[v3];
 48:        return v1;
        }
 46:    goto 81;
 49:    v0 = v0 + 1;
 51:    goto 5;
 52:    v0 = -1;
 53:    goto 30;
 83:    v3 = v3 + 1;
 84:    goto 37;
    }

    public static String a(Context p0, int p1) {
        v0 = p0.getResources();
        switch (p1) {
            case -1:
                v0 = v0.getString(2131951938);
                break;
            case 0:
                v0 = v0.getString(2131951932);
                break;
            case 1:
                v0 = v0.getString(2131951935);
                break;
            case 2:
                v0 = v0.getString(2131951936);
                break;
            case 3:
                v0 = v0.getString(2131951933);
                break;
            case 4:
                v0 = v0.getString(2131951940);
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    private static String a(com.google.wireless.android.finsky.dfe.nano.bi p0, com.google.android.finsky.ab.b p1) {
        if (p1.b < 0) {
            v3 = new Object[1];
            v3[0] = p1;
            FinskyLog.d("Badly formatted ContentFilterSelection authorityId is negative or documentTypes is null. [ContentFilterSelection=%s]", v3);
            v0 = 0;
            return v0;
        }
        if (p1.a == 0) {
            v3 = new Object[1];
            v3[0] = p1;
            FinskyLog.d("Badly formatted ContentFilterSelection authorityId is negative or documentTypes is null. [ContentFilterSelection=%s]", v3);
            v0 = 0;
        }
        else {
            if ((!p0.e()) || p0.c == 0) {
                v3 = new Object[1];
                v3[0] = p0;
                FinskyLog.d("Badly formatted FilterRange authorityId is missing or documentType is null. [FilterRange=%s]", v3);
                v0 = 0;
                return v0;
            }
            if (p0.d == p1.b && com.google.android.finsky.ab.a.a(p0.c, p1.a)) {
                v0 = 0;
                while (v0 < p0.e.length) {
                    if (p0.e[v0].e()) {
                        if (p0.e[v0].b & 4)
                            v3 = 1;
                        else
                            v3 = 0;
                        if (v3 != 0) {
                            if (p1.c == p0.e[v0].c) {
                                v0 = p0.e[v0].f;
                                return v0;
                            }
                        }
                    }
                    v0 = v0 + 1;
                }
            }
            v0 = 0;
        }
        return v0;
    }

    public static String a(b[] p0) {
        v3 = new String[p0.length];
        v0 = 0;
        while (v0 < p0.length) {
            v5 = new StringBuilder();
            v2 = 0;
            while (v2 < p0[v0].a.length) {
                v5.append(p0[v0].a[v2]);
                if (v2 + 1 < p0[v0].a.length)
                    v5.append(58);
                v2 = v2 + 1;
            }
            v5.append(59);
            v5.append(p0[v0].b);
            v5.append(59);
            v5.append(p0[v0].c);
            v3[v0] = v5.toString();
            v0 = v0 + 1;
        }
        return com.google.android.finsky.utils.k.a(v3);
    }

    public static List a(ContentFilters$ContentFilterSettingsResponse p0) {
  3:    v5 = new ArrayList();
  9:    v4 = 0;
 10:    if (v4 >= p0.b.length)
 55:        return v5;
 17:    v0 = p0.b[v4].e.length - 1;
 22:    v2 = 0;
 23:    if (v2 >= p0.b[v4].e.length) goto 56;
 25:    v0 = p0.b[v4].e[v2];
 29:    if (v0.g == 0) goto 51;
 44:    v5.add(new com.google.android.finsky.ab.b(p0.b[v4].c, p0.b[v4].d, com.google.android.finsky.ab.a.a(v0)));
 49:    v4 = v4 + 1;
 50:    goto 10;
 53:    v2 = v2 + 1;
 54:    goto 23;
 56:    v0 = p0.b[v4].e[v0];
 57:    goto 31;
    }

    private static void a(Context p0, com.google.android.finsky.api.h p1, com.google.android.finsky.accounts.c p2, String p3) {
        v2 = p2.cX().iterator();
        while (v2.hasNext())
            p1.a(((Account)v2.next()).name).a((String)com.google.android.finsky.aa.a.d.a());
        v0 = new Intent("com.google.android.finsky.action.CONTENT_FILTERS_CHANGED");
        if (p3 != 0)
            v0.putExtra("consistency_token", p3);
        p0.sendBroadcast(v0);
    }

    public static void a(Context p0, com.google.android.finsky.api.h p1, com.google.android.finsky.accounts.c p2, boolean p3, com.google.wireless.android.finsky.dfe.nano.be p4, String p5) {
        if (p3 == 0)
            com.google.android.finsky.aa.a.d.c();
        else {
            v2 = new ArrayList();
            v0 = 0;
            while (v0 < p4.c.length) {
                v2.add(new com.google.android.finsky.ab.b(p4.c[v0].c, p4.c[v0].d, p4.c[v0].e));
                v0 = v0 + 1;
            }
            com.google.android.finsky.aa.a.g.a(com.google.android.finsky.ab.a.a((b[])v2.toArray(new b[p4.c.length])));
            com.google.android.finsky.aa.a.d.a(p4.d);
        }
        if (!TextUtils.isEmpty(p5))
            com.google.android.finsky.aa.a.aP.a(p5);
        else
            com.google.android.finsky.aa.a.aP.c();
        com.google.android.finsky.ab.a.a(p0, p1, p2, p5);
    }

    public static void a(Context p0, com.google.android.finsky.volley.e p1, com.google.android.finsky.api.h p2, com.google.android.finsky.accounts.c p3, boolean p4, ContentFilters$ContentFilterSettingsResponse p5, b[] p6) {
  2:    if (p4 != 0) goto 18;
  6:    com.google.android.finsky.aa.a.d.c();
 11:    p1.a(0, "content_filter_settings_changed");
 14:    com.google.android.finsky.ab.a.a(p0, p2, p3, 0);
 17:    return;
 18:    if (p6 == 0) {
 11:        p1.a(0, "content_filter_settings_changed");
 14:        com.google.android.finsky.ab.a.a(p0, p2, p3, 0);
 17:        return;
        }
 20:    if (p5 == 0) {
 11:        p1.a(0, "content_filter_settings_changed");
 14:        com.google.android.finsky.ab.a.a(p0, p2, p3, 0);
 17:        return;
        }
 28:    com.google.android.finsky.aa.a.g.a(com.google.android.finsky.ab.a.a(p6));
 37:    v5 = new StringBuilder();
 40:    v0 = 0;
 42:    if (v0 >= p5.b.length) goto 67;
 44:    v2 = 0;
 46:    if (v2 >= p6.length) goto 61;
 52:    v6 = com.google.android.finsky.ab.a.a(p5.b[v0], p6[v2]);
 56:    if (v6 == 0) goto 64;
 58:    v5.append(v6);
 61:    v0 = v0 + 1;
 63:    goto 41;
 64:    v2 = v2 + 1;
 66:    goto 45;
 71:    com.google.android.finsky.aa.a.d.a(v5.toString());
 74:    goto 9;
    }

    private static boolean a(int[] p0, int[] p1) {
        v1 = 0;
        v0 = 0;
        while (true) {
            if (v0 >= p1.length)
                return v1;
            v2 = 0;
            while (v2 < p0.length) {
                if (p1[v0] == p0[v2]) {
                    v1 = 1;
                    return v1;
                }
                v2 = v2 + 1;
            }
            v0 = v0 + 1;
        }
    }

    public static b[] a(com.google.android.finsky.aa.n p0) {
  5:    v0 = (String)p0.a();
  7:    if (v0 == 0) goto 48;
 13:    if (v0.length() <= 0) goto 48;
 15:    v3 = com.google.android.finsky.utils.k.a(v0);
 20:    v2 = new b[v3.length];
 22:    v0 = 0;
 24:    if (v0 >= v3.length) goto 46;
 28:    v1 = com.google.android.finsky.ab.a.a(v3[v0]);
 32:    if (v1 != 0) goto 41;
 34:    v0 = 0;
 35:    if (v0 == 0)
 37:        p0.c();
 40:    return v0;
 41:    v2[v0] = v1;
 43:    v0 = v0 + 1;
 45:    goto 23;
 46:    v0 = v2;
 47:    goto 35;
 48:    v0 = new b[0];
 50:    goto 35;
    }

}
