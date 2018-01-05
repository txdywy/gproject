package com.google.android.finsky.billing.iab;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.i;
import com.google.android.finsky.by.j;
import com.google.android.finsky.by.l;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dp.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.h;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.bj;
import com.google.wireless.android.a.a.a.a.bk;
import com.google.wireless.android.a.a.a.a.bl;
import com.google.wireless.android.a.a.a.a.bo;
import com.google.wireless.android.a.a.a.a.bz;
import com.google.wireless.android.finsky.dfe.nano.ew;
import com.google.wireless.android.finsky.dfe.nano.ex;
import com.google.wireless.android.finsky.dfe.nano.gd;
import com.google.wireless.android.finsky.dfe.nano.gf;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class com.google.android.finsky.billing.iab.e
{

    public static final int a;
    public static final AtomicInteger b;
    public final int c;
    public final long d;
    public final Context e;
    public final com.google.android.finsky.api.c f;
    public final com.google.android.finsky.ba.e g;
    public final com.google.android.finsky.d.w h;
    public com.google.android.finsky.api.h i;
    public com.google.android.finsky.ba.c j;
    public com.google.android.finsky.billing.iab.u k;
    public com.google.android.finsky.billing.iab.w l;
    public com.google.android.finsky.by.c m;
    public com.google.android.finsky.by.l n;
    public com.google.android.finsky.ce.a o;
    public com.google.android.finsky.billing.common.i p;
    public com.google.android.finsky.billing.iab.y q;
    public com.google.android.finsky.billing.a.h r;

    static {
        com.google.android.finsky.billing.iab.e.a = ((Integer)com.google.android.finsky.aa.b.cT.b()).intValue();
        com.google.android.finsky.billing.iab.e.b = new AtomicInteger(1);
    }

    e(Context p0, String p1, com.google.android.finsky.d.w p2) {
        if (p0 == 0)
            throw new IllegalArgumentException("context must not be null");
        if (TextUtils.isEmpty(p1))
            throw new IllegalArgumentException("account must not be null or empty");
        if (p2 == 0)
            throw new IllegalArgumentException("loggingContext must not be null");
        ((com.google.android.finsky.billing.iab.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.iab.a)).a(this);
        this.e = p0;
        this.f = this.i.a(p1);
        this.g = this.j.j(p1);
        this.h = p2;
        this.c = ((Integer)com.google.android.finsky.aa.b.cV.b()).intValue();
        this.d = ((Long)com.google.android.finsky.aa.b.cU.b()).longValue();
    }

    private static Pair a(List p0, String p1) {
        if (p0.size() <= com.google.android.finsky.billing.iab.e.a)
            v0 = Pair.create(p0, 0);
        else {
            if (!TextUtils.isEmpty(p1)) {
                v0 = new String(Base64.decode(p1, 0), com.google.android.finsky.utils.h.a);
                if (!v0.startsWith("CONT-TOKEN-"))
                    v0 = -1;
                else
                    v0 = Integer.parseInt(v0.substring(11));
                if (v0 < 0 || v0 >= p0.size())
                    v0 = 0;
            }
            else
                v0 = 0;
            if (com.google.android.finsky.billing.iab.e.a + v0 < p0.size()) {
                v2 = Base64.encodeToString(22 + "CONT-TOKEN-" + (com.google.android.finsky.billing.iab.e.a + v0).getBytes(com.google.android.finsky.utils.h.a), 0);
                v1 = com.google.android.finsky.billing.iab.e.a + v0;
            }
            else {
                v1 = p0.size();
                v2 = 0;
            }
            v0 = Pair.create(p0.subList(v0, v1), v2);
        }
        return v0;
    }

    private final com.google.android.finsky.billing.iab.x a(String p0, String p1) {
        v0 = new Semaphore(0);
        v1 = new x[1];
        v1[0] = com.google.android.finsky.billing.iab.x.a;
        this.f.a(p1, p0, new com.google.android.finsky.billing.iab.h(this, v1, p0, v0), new com.google.android.finsky.billing.iab.j(this, v1, p0, v0));
        try {
            if (!v0.tryAcquire(this.d, TimeUnit.MILLISECONDS)) {
                this.a(com.google.android.finsky.billing.iab.x.g, p0);
                v0 = com.google.android.finsky.billing.iab.x.g;
            }
            else
                v0 = v1[0];
        }
        catch (InterruptedException ex) {
            this.a(com.google.android.finsky.billing.iab.x.g, p0, ex, 0);
            v0 = com.google.android.finsky.billing.iab.x.g;
        }
        return v0;
    }

    static com.google.wireless.android.a.a.a.a.bz a(VolleyError p0) {
        return new com.google.wireless.android.a.a.a.a.bz().a(com.google.android.finsky.d.j.a(p0));
    }

    private final void a(int p0, String p1, String p2, List p3, List p4, List p5, Bundle p6, String p7) {
        v7 = new Semaphore(0);
        v11 = new com.google.wireless.android.finsky.dfe.nano.gf();
        v11.a = v11.a | 1;
        v11.b = p0;
        if (p1 == 0)
            throw new NullPointerException();
        v11.a = v11.a | 2;
        v11.c = p1;
        if (p2 == 0)
            throw new NullPointerException();
        v11.a = v11.a | 4;
        v11.d = p2;
        v11.a = v11.a | 8;
        v11.g = this.o.c();
        if (p4 == 0) {
            v4 = p3.toArray(new String[p3.size()]);
            Arrays.sort((String[])v4);
            v11.e = (String[])v4;
        }
        else {
            v8 = new gd[p4.size()];
            v6 = 0;
            while (v6 < p4.size()) {
                v4 = (String)p4.get(v6);
                v5 = (String)p3.get(v6);
                v9 = new com.google.wireless.android.finsky.dfe.nano.gd();
                if (v5 == 0)
                    throw new NullPointerException();
                v9.b = v9.b | 1;
                v9.c = v5;
                if (v4 == 0)
                    throw new NullPointerException();
                v9.b = v9.b | 2;
                v9.d = v4;
                v4 = (String)p5.get(v6);
                if (v4 == 0)
                    throw new NullPointerException();
                v9.b = v9.b | 4;
                v9.e = v4;
                v8[v6] = v9;
                v6 = v6 + 1;
            }
            v11.f = v8;
        }
        v15 = this.g.a(12609897);
        this.f.a(v11, new com.google.android.finsky.billing.iab.f(this, p6, v7, p0, p1, p2, v11), new com.google.android.finsky.billing.iab.g(this, p6, v15, p1, p7, v7));
        try {
            if (!v7.tryAcquire(this.d, TimeUnit.MILLISECONDS)) {
                p6.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
                if (v15 != 0)
                    this.a(p6, p1, p7);
            }
        }
        catch (InterruptedException ex) {
            p6.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
            if (v15 != 0)
                this.a(p6, p1, ex, 0, p7);
        }
    }

    private final void a(Bundle p0, int p1) {
        v0 = new com.google.wireless.android.a.a.a.a.bk();
        v0.b = new com.google.wireless.android.a.a.a.a.bl();
        v0.b.a(p1);
        this.h.a(new com.google.android.finsky.d.c(624).a(p0.getInt("RESPONSE_CODE")).a(v0).a, 0);
    }

    private final void a(Bundle p0, String p1, String p2) {
        this.a(p0, p1, 0, 0, p2);
    }

    private final void a(com.google.android.finsky.billing.iab.x p0) {
        this.h.a(new com.google.android.finsky.d.c(621).a(p0.l).a, 0);
    }

    private static void a(com.google.android.finsky.d.c p0, String p1) {
        if (p1 != 0) {
            if (p1.length() > 5)
                p1 = p1.substring(0, 5);
            if (p1 == 0)
                throw new NullPointerException();
            p0.a.a = p0.a.a | 1073741824;
            p0.a.aB = p1;
        }
    }

    private final void a(String p0, String p1, String p2, Bundle p3) {
  8:    v0 = this.m.a(this.f.b());
 14:    v2 = new ArrayList();
 19:    v3 = new ArrayList();
 24:    v4 = new ArrayList();
 33:    if (p1.equals("inapp")) {
 39:        v1 = com.google.android.finsky.billing.iab.e.a(v0.c(p0), p2);
 45:        v0 = (List)v1.first;
 49:        v1 = (String)v1.second;
 51:        v5 = v0.iterator();
 55:        while (v5.hasNext()) {
 65:            v0 = (com.google.android.finsky.by.i)v5.next();
 73:            v2.add(com.google.android.finsky.billing.iab.w.a(v0.k));
 78:            v3.add(v0.a);
 83:            v4.add(v0.b);
            }
        }
        else {
 93:        if (!p1.equals("subs")) {
147:            v1 = p2;
150:            p3.putStringArrayList("INAPP_PURCHASE_ITEM_LIST", v2);
155:            p3.putStringArrayList("INAPP_PURCHASE_DATA_LIST", v3);
160:            p3.putStringArrayList("INAPP_DATA_SIGNATURE_LIST", v4);
163:            if (v1 != 0)
167:                p3.putString("INAPP_CONTINUATION_TOKEN", v1);
170:            return;
            }
 99:        v1 = com.google.android.finsky.billing.iab.e.a(v0.d(p0), p2);
105:        v0 = (List)v1.first;
109:        v1 = (String)v1.second;
111:        v5 = v0.iterator();
115:        while (v5.hasNext()) {
125:            v0 = (com.google.android.finsky.by.j)v5.next();
133:            v2.add(com.google.android.finsky.billing.iab.w.a(v0.k));
138:            v3.add(v0.a);
143:            v4.add(v0.b);
            }
        }
 86:    goto 148;
147:    v1 = p2;
150:    p3.putStringArrayList("INAPP_PURCHASE_ITEM_LIST", v2);
155:    p3.putStringArrayList("INAPP_PURCHASE_DATA_LIST", v3);
160:    p3.putStringArrayList("INAPP_DATA_SIGNATURE_LIST", v4);
163:    if (v1 != 0)
167:        p3.putString("INAPP_CONTINUATION_TOKEN", v1);
    }

    static ew[] a(Bundle p0) {
        v2 = new ew[p0.size()];
        v3 = p0.keySet().iterator();
        v1 = 0;
        while (v3.hasNext()) {
            v0 = (String)v3.next();
            v4 = new com.google.wireless.android.finsky.dfe.nano.ew();
            if (v0 == 0)
                throw new NullPointerException();
            v4.b = v4.b | 1;
            v4.c = v0;
            v0 = p0.get(v0);
            if (v0 != 0) {
                if (v0 instanceof Boolean) {
                    v4.b = v4.b | 4;
                    v4.e = ((Boolean)v0).booleanValue();
                }
                else if (v0 instanceof Long)
                    v4.a(((Long)v0).longValue());
                else if (v0 instanceof Integer)
                    v4.a((long)((Integer)v0).intValue());
                else {
                    v0 = v0.toString();
                    if (v0 == 0)
                        throw new NullPointerException();
                    v4.b = v4.b | 2;
                    v4.d = v0;
                }
            }
            v2[v1] = v4;
            v1 = v1 + 1;
        }
        return v2;
    }

    final int a(int p0, String p1, Bundle p2) {
        v0 = this.a(p0);
        v1 = this.g.a(12609901);
        if (v0 != com.google.android.finsky.billing.iab.x.a) {
            if (v1 != 0)
                this.a(v0);
            v0 = v0.l;
        }
        else if (p2 != 0 && p0 < 7) {
            FinskyLog.c("Input Error: isBillingSupportedExtraParams was introduced in API version 7.", new Object[0]);
            if (v1 != 0)
                this.a(com.google.android.finsky.billing.iab.x.f);
            v0 = com.google.android.finsky.billing.iab.x.f.l;
        }
        else {
            v0 = this.a(p1, 0);
            if (v0 != com.google.android.finsky.billing.iab.x.a) {
                if (v1 != 0)
                    this.a(v0);
                v0 = v0.l;
            }
            else if (p2 != 0 && !p2.isEmpty() && p2.getBoolean("vr") && TextUtils.equals(p1, "subs")) {
                FinskyLog.c("Input Error: subscription is not supported in VR Mode.", new Object[0]);
                if (v1 != 0)
                    this.a(com.google.android.finsky.billing.iab.x.d);
                v0 = com.google.android.finsky.billing.iab.x.d.l;
            }
            else {
                if (v1 != 0)
                    this.a(v0);
                v0 = v0.l;
            }
        }
        return v0;
    }

    final Intent a(Bundle p0, PurchaseParams p1) {
        this.p.c(this.e, this.f.c());
        v0 = this.q.a(this.f.b(), p1);
        if (v0 == 0)
            p0.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
        else {
            if (!this.g.a(12617885)) {
                v2 = new Object[1];
                v2[0] = p1.b;
                v0.setData(Uri.parse(String.format("iabData:%s", v2)));
            }
            p0.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.a.l);
        }
        return v0;
    }

    final Bundle a(int p0, String p1, String p2, Bundle p3) {
        v7 = new Bundle();
        v9 = this.g.a(12609897);
        if (p3 == 0)
            v8 = 0;
        else
            v8 = p3.getString("libraryVersion");
        v0 = this.a(p0);
        if (v0 != com.google.android.finsky.billing.iab.x.a) {
            v7.putInt("RESPONSE_CODE", v0.l);
            if (v9 != 0)
                this.a(v7, p1, v8);
        }
        else {
            v0 = this.a(p2, 0);
            if (v0 != com.google.android.finsky.billing.iab.x.a) {
                v7.putInt("RESPONSE_CODE", v0.l);
                if (v9 != 0)
                    this.a(v7, p1, v8);
                return v7;
            }
            if (p3 == 0) {
                FinskyLog.c("Input Error: Non-null argument expected for skusBundle.", new Object[0]);
                v7.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
                if (v9 != 0)
                    this.a(v7, p1, v8);
                return v7;
            }
            v4 = p3.getStringArrayList("ITEM_ID_LIST");
            v5 = p3.getStringArrayList("DYNAMIC_PRICE_TOKENS_LIST");
            if (v4 == 0) {
                v1 = new Object[1];
                v1[0] = "ITEM_ID_LIST";
                FinskyLog.c("Input Error: skusBundle must contain an array associated with key %s.", v1);
                v7.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
                if (v9 != 0)
                    this.a(v7, p1, v8);
                return v7;
            }
            if ((v4.isEmpty()) || v5 != 0 && v5.isEmpty()) {
                v1 = new Object[2];
                v1[0] = "ITEM_ID_LIST";
                v1[1] = "DYNAMIC_PRICE_TOKENS_LIST";
                FinskyLog.c("Input Error: skusBundle array associated with key %s or key %s cannot be empty.", v1);
                v7.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
                if (v9 != 0)
                    this.a(v7, p1, v8);
                return v7;
            }
            if (v4.size() > this.c || v5 != 0 && v5.size() > this.c) {
                v1 = new Object[3];
                v1[0] = "ITEM_ID_LIST";
                v1[1] = "DYNAMIC_PRICE_TOKENS_LIST";
                v1[2] = Integer.valueOf(this.c);
                FinskyLog.c("Input Error: skusBundle array associated with key %s or key %s cannot contain more than %d items.", v1);
                v7.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
                if (v9 != 0)
                    this.a(v7, p1, v8);
                return v7;
            }
            v1 = 0;
            while (v1 < v4.size()) {
                if (TextUtils.isEmpty((CharSequence)v4.get(v1))) {
                    v2 = new Object[2];
                    v2[0] = "ITEM_ID_LIST";
                    v2[1] = Integer.valueOf(v1);
                    FinskyLog.c("Input Error: skusBundle array associated with key %s contains an empty/null sku at index %d.", v2);
                    v7.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
                    if (v9 != 0)
                        this.a(v7, p1, v8);
                    return v7;
                }
                v1 = v1 + 1;
            }
            this.a(p0, p1, p2, v4, v5, p3.getStringArrayList("DYNAMIC_TITLES_LIST"), v7, v8);
            if (v9 != 0 && v7.getInt("RESPONSE_CODE") != com.google.android.finsky.billing.iab.x.g.l)
                this.a(v7, p1, v8);
        }
        return v7;
    }

    final Bundle a(int p0, String p1, String p2, String p3, Bundle p4) {
        v0 = 0;
        v2 = new Bundle();
        v3 = this.g.a(12609899);
        v4 = this.a(p0);
        if (v4 != com.google.android.finsky.billing.iab.x.a) {
            v2.putInt("RESPONSE_CODE", v4.l);
            if (v3 != 0)
                this.a(v2, 1);
            v0 = v2;
        }
        else if (p4 != 0 && p0 < 7) {
            FinskyLog.c("Input Error: getPurchasesExtraParams was introduced in API version 7.", new Object[0]);
            v2.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
            if (v3 != 0)
                this.a(v2, 1);
            v0 = v2;
        }
        else {
            if (!this.g.a(12631855))
                v0 = 1;
            v0 = this.a(p2, v0);
            if (v0 != com.google.android.finsky.billing.iab.x.a) {
                v2.putInt("RESPONSE_CODE", v0.l);
                if (v3 != 0)
                    this.a(v2, 1);
                v0 = v2;
            }
            else {
                this.a(p1, p2, p3, v2);
                v2.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.a.l);
                if (v3 != 0)
                    this.a(v2, 1);
                v0 = v2;
            }
        }
        return v0;
    }

    final Bundle a(int p0, String p1, String p2, String p3, String p4, int p5) {
        v10 = new Bundle();
        v0 = this.a(p0);
        if (v0 != com.google.android.finsky.billing.iab.x.a) {
            v10.putInt("RESPONSE_CODE", v0.l);
            this.a(v10, 1, p1, 0);
            v0 = v10;
        }
        else {
            v0 = this.a(p3, 0);
            if (v0 != com.google.android.finsky.billing.iab.x.a) {
                v10.putInt("RESPONSE_CODE", v0.l);
                this.a(v10, 1, p1, 0);
                v0 = v10;
            }
            else if (TextUtils.isEmpty(p2)) {
                FinskyLog.c("Input Error: Non empty/null argument expected for sku.", new Object[0]);
                v10.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
                this.a(v10, 1, p1, 0);
                v0 = v10;
            }
            else if (this.a(p3, p2, p1)) {
                v10.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.h.l);
                this.a(v10, 1, p1, 0);
                v0 = v10;
            }
            else {
                v0 = this.l.a(this.e, p0, p1, 0, p2, p3, p4, this.g, Integer.valueOf(p5));
                if (v0 == 0) {
                    v10.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
                    this.a(v10, 1, p1, 0);
                    v0 = v10;
                }
                else {
                    v0 = this.a(v10, v0);
                    this.a(v10, 1, p1, 0);
                    if (v0 != 0)
                        this.a(v0, v10);
                    v0 = v10;
                }
            }
        }
        return v0;
    }

    final Bundle a(int p0, String p1, List p2, String p3, String p4, String p5, Integer p6) {
        v12 = new Bundle();
        v2 = this.a(p0);
        if (v2 != com.google.android.finsky.billing.iab.x.a) {
            v12.putInt("RESPONSE_CODE", v2.l);
            this.a(v12, 2, p1, 0);
            v2 = v12;
        }
        else if (p0 < 5) {
            FinskyLog.c("Input Error: getBuyIntentToReplaceSkus was introduced in API version 5.", new Object[0]);
            v12.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
            this.a(v12, 2, p1, 0);
            v2 = v12;
        }
        else {
            v2 = this.a(p4, 0);
            if (v2 != com.google.android.finsky.billing.iab.x.a) {
                v12.putInt("RESPONSE_CODE", v2.l);
                this.a(v12, 2, p1, 0);
                v2 = v12;
            }
            else if (TextUtils.isEmpty(p3)) {
                FinskyLog.c("Input Error: Non empty/null argument expected for newSku.", new Object[0]);
                v12.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
                this.a(v12, 2, p1, 0);
                v2 = v12;
            }
            else if (this.a(p4, p3, p1)) {
                v12.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.h.l);
                this.a(v12, 2, p1, 0);
                v2 = v12;
            }
            else {
                v2 = this.l.a(this.e, p0, p1, p2, p3, p4, p5, this.g, p6);
                if (v2 == 0) {
                    v12.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
                    this.a(v12, 1, p1, 0);
                    v2 = v12;
                }
                else {
                    v2 = this.a(v12, v2);
                    this.a(v12, 2, p1, 0);
                    if (v2 != 0)
                        this.a(v2, v12);
                    v2 = v12;
                }
            }
        }
        return v2;
    }

    final com.google.android.finsky.billing.iab.x a(int p0) {
  3:    if (p0 < 3 || p0 > 7) {
 10:        v3 = new Object[1];
 16:        v3[0] = Integer.valueOf(p0);
 18:        FinskyLog.c("Unsupported billing API version: %d", v3);
 21:        v0 = com.google.android.finsky.billing.iab.x.d;
        }
        else
 28:        v0 = com.google.android.finsky.billing.iab.x.a;
 25:    if (v0 != com.google.android.finsky.billing.iab.x.a)
 27:        return v0;
 35:    v3 = this.f.c();
 39:    if (v3 == 0) {
 68:        v0 = 0;
 69:        if (v0 == 0) {
 75:            FinskyLog.c("Billing unavailable for this package and user.", new Object[0]);
 78:            v0 = com.google.android.finsky.billing.iab.x.d;
            }
            else
112:            v0 = com.google.android.finsky.billing.iab.x.a;
 80:        return v0;
        }
 41:    v4 = com.google.android.finsky.billing.iab.v.a(v3);
 49:    if (v4.b()) goto 98;
 53:    v5 = this.k.a.a(v3);
 57:    if (v5 != 0) goto 81;
 61:    v1 = new Object[1];
 63:    v1[0] = v3;
 65:    FinskyLog.c("Unknown account %s", v1);
 68:    v0 = 0;
 69:    if (v0 == 0) {
 75:        FinskyLog.c("Billing unavailable for this package and user.", new Object[0]);
 78:        v0 = com.google.android.finsky.billing.iab.x.d;
        }
        else
112:        v0 = com.google.android.finsky.billing.iab.x.a;
 80:    return v0;
 83:    v0 = this.k.b.a(v5);
 87:    if (v0 != 0 && v0.o != 0)
 95:        com.google.android.finsky.billing.iab.v.a(v3, v0.o);
108:    if (p0 > ((Integer)v4.a()).intValue()) {
 68:        v0 = 0;
 69:        if (v0 == 0) {
 75:            FinskyLog.c("Billing unavailable for this package and user.", new Object[0]);
 78:            v0 = com.google.android.finsky.billing.iab.x.d;
            }
            else
112:            v0 = com.google.android.finsky.billing.iab.x.a;
 80:        return v0;
        }
110:    v0 = 1;
111:    goto 69;
    }

    final com.google.android.finsky.billing.iab.x a(String p0, boolean p1) {
        if (TextUtils.isEmpty(p0)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for type.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else {
            v0 = TextUtils.equals(p0, "subs");
            if (!TextUtils.equals(p0, "inapp") && v0 == 0) {
                v1 = new Object[1];
                v1[0] = p0;
                FinskyLog.c("Unknown item type specified %s", v1);
                v0 = com.google.android.finsky.billing.iab.x.d;
            }
            else if (v0 != 0 && p1 == 0 && com.google.android.finsky.as.a.b(this.e)) {
                FinskyLog.c("In-app subscriptions are not supported on wear devices.", new Object[0]);
                v0 = com.google.android.finsky.billing.iab.x.d;
            }
            else
                v0 = com.google.android.finsky.billing.iab.x.a;
        }
        return v0;
    }

    final void a(Intent p0, Bundle p1) {
        this.h.a(this.f.b()).a(p0);
        if (this.g.a(12641956))
            v0 = 0;
        else
            v0 = com.google.android.finsky.billing.iab.e.b.getAndAdd(1);
        p1.putParcelable("BUY_INTENT", PendingIntent.getActivity(this.e, v0, p0, 1073741824));
    }

    final void a(Bundle p0, int p1, String p2, String p3) {
        v0 = new com.google.wireless.android.a.a.a.a.bk();
        v0.a = new com.google.wireless.android.a.a.a.a.bj();
        v0.a.a(p1);
        v0 = new com.google.android.finsky.d.c(623).a(p0.getInt("RESPONSE_CODE")).a(v0);
        if (this.g.a(12640492))
            v0.c(p2);
        if (this.g.a(12640491))
            com.google.android.finsky.billing.iab.e.a(v0, p3);
        this.h.a(v0.a, 0);
    }

    final void a(Bundle p0, String p1, Throwable p2, com.google.wireless.android.a.a.a.a.bz p3, String p4) {
        v0 = new com.google.android.finsky.d.c(622).a(p0.getInt("RESPONSE_CODE")).a(p2).c(p1).a(p3);
        if (this.g.a(12640490))
            com.google.android.finsky.billing.iab.e.a(v0, p4);
        this.h.a(v0.a, 0);
    }

    final void a(com.google.android.finsky.billing.iab.x p0, String p1) {
        this.a(p0, p1, 0, 0);
    }

    final void a(com.google.android.finsky.billing.iab.x p0, String p1, Throwable p2, com.google.wireless.android.a.a.a.a.bz p3) {
        this.h.a(new com.google.android.finsky.d.c(625).a(p0.l).a(p2).c(p1).a(p3).a, 0);
    }

    final boolean a(String p0, String p1, String p2) {
        this.m.c();
        if (this.m.a(this.f.b()).a(com.google.android.finsky.billing.iab.w.a(p1, p0, p2)) != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    final int b(int p0, String p1, String p2, Bundle p3) {
        v0 = this.a(p0);
        if (v0 != com.google.android.finsky.billing.iab.x.a) {
            this.a(v0, p1);
            v0 = v0.l;
        }
        else if (p3 != 0 && p0 < 7) {
            FinskyLog.c("Input Error: consumePurchasesExtraParams was introduced in API version 7.", new Object[0]);
            this.a(com.google.android.finsky.billing.iab.x.f, p1);
            v0 = com.google.android.finsky.billing.iab.x.f.l;
        }
        else if (TextUtils.isEmpty(p2)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for purchaseToken.", new Object[0]);
            this.a(v0, p1);
            v0 = com.google.android.finsky.billing.iab.x.f.l;
        }
        else
            v0 = this.a(p1, p2).l;
        return v0;
    }

    final Bundle b(int p0, String p1, String p2, String p3, Bundle p4) {
        v8 = new Bundle();
        v9 = this.g.a(12609899);
        v0 = this.a(p0);
        if (v0 != com.google.android.finsky.billing.iab.x.a) {
            v8.putInt("RESPONSE_CODE", v0.l);
            if (v9 != 0)
                this.a(v8, 2);
            v0 = v8;
        }
        else if (p0 < 6) {
            FinskyLog.c("Input Error: getPurchaseHistory was introduced in API version 6.", new Object[0]);
            v8.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
            if (v9 != 0)
                this.a(v8, 2);
            v0 = v8;
        }
        else {
            v0 = this.a(p2, 0);
            if (v0 != com.google.android.finsky.billing.iab.x.a) {
                v8.putInt("RESPONSE_CODE", v0.l);
                if (v9 != 0)
                    this.a(v8, 2);
                v0 = v8;
            }
            else {
                v5 = 0;
                if (p4 != 0 && !p4.isEmpty()) {
                    v5 = new com.google.wireless.android.finsky.dfe.nano.ex();
                    v5.a = com.google.android.finsky.billing.iab.e.a(p4);
                }
                v10 = new Semaphore(0);
                this.f.a(p0, p1, p2, p3, v5, new com.google.android.finsky.billing.iab.k(v8, v10), new com.google.android.finsky.billing.iab.l(v8, v10));
                try {
                    if (!v10.tryAcquire(this.d, TimeUnit.MILLISECONDS))
                        v8.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
                }
                catch (InterruptedException ex) {
                    v8.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
                }
                if (v9 != 0)
                    this.a(v8, 2);
                v0 = v8;
            }
        }
        return v0;
    }

}
