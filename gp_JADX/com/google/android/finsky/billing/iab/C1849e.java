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
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2230i;
import com.google.android.finsky.by.C2232j;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4677h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bj;
import com.google.wireless.android.a.a.a.a.bk;
import com.google.wireless.android.a.a.a.a.bl;
import com.google.wireless.android.a.a.a.a.bz;
import com.google.wireless.android.finsky.dfe.nano.ew;
import com.google.wireless.android.finsky.dfe.nano.ex;
import com.google.wireless.android.finsky.dfe.nano.gd;
import com.google.wireless.android.finsky.dfe.nano.gf;
import com.google.wireless.android.finsky.dfe.nano.gp;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class C1849e {
    public static final int f9496a = ((Integer) C0955b.cT.m28964b()).intValue();
    public static final AtomicInteger f9497b = new AtomicInteger(1);
    public final int f9498c;
    public final long f9499d;
    public final Context f9500e;
    public final C1254c f9501f;
    public final C1552e f9502g;
    public final C2495w f9503h;
    public C1287h f9504i;
    public C1461c f9505j;
    public C1865u f9506k;
    public C1867w f9507l;
    public C2206c f9508m;
    public C2199l f9509n;
    public C2266a f9510o;
    public C1793i f9511p;
    public C1869y f9512q;
    public C1655h f9513r;

    C1849e(Context context, String str, C2495w c2495w) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("account must not be null or empty");
        } else if (c2495w == null) {
            throw new IllegalArgumentException("loggingContext must not be null");
        } else {
            ((C1354a) C3947d.m18649a(C1354a.class)).mo1742a(this);
            this.f9500e = context;
            this.f9501f = this.f9504i.mo2016a(str);
            this.f9502g = this.f9505j.mo2249j(str);
            this.f9503h = c2495w;
            this.f9498c = ((Integer) C0955b.cV.m28964b()).intValue();
            this.f9499d = ((Long) C0955b.cU.m28964b()).longValue();
        }
    }

    final int m9935a(int i, String str, Bundle bundle) {
        C1868x a = m9941a(i);
        boolean a2 = this.f9502g.mo2294a(12609901);
        if (a != C1868x.RESULT_OK) {
            if (a2) {
                m9931a(a);
            }
            return a.f9566l;
        } else if (bundle == null || i >= 7) {
            a = m9942a(str, false);
            if (a != C1868x.RESULT_OK) {
                if (a2) {
                    m9931a(a);
                }
                return a.f9566l;
            } else if (bundle == null || bundle.isEmpty() || !bundle.getBoolean("vr") || !TextUtils.equals(str, "subs")) {
                if (a2) {
                    m9931a(a);
                }
                return a.f9566l;
            } else {
                FinskyLog.m21665c("Input Error: subscription is not supported in VR Mode.", new Object[0]);
                if (a2) {
                    m9931a(C1868x.RESULT_BILLING_UNAVAILABLE);
                }
                return C1868x.RESULT_BILLING_UNAVAILABLE.f9566l;
            }
        } else {
            FinskyLog.m21665c("Input Error: isBillingSupportedExtraParams was introduced in API version 7.", new Object[0]);
            if (a2) {
                m9931a(C1868x.RESULT_DEVELOPER_ERROR);
            }
            return C1868x.RESULT_DEVELOPER_ERROR.f9566l;
        }
    }

    private final void m9931a(C1868x c1868x) {
        this.f9503h.m13371a(new C2474c(621).m13210a(c1868x.f9566l).f13342a, null);
    }

    final Bundle m9937a(int i, String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        boolean a = this.f9502g.mo2294a(12609897);
        String string = bundle == null ? null : bundle.getString("libraryVersion");
        C1868x a2 = m9941a(i);
        if (a2 != C1868x.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a2.f9566l);
            if (a) {
                m9930a(bundle2, str, string);
            }
        } else {
            a2 = m9942a(str2, false);
            if (a2 != C1868x.RESULT_OK) {
                bundle2.putInt("RESPONSE_CODE", a2.f9566l);
                if (a) {
                    m9930a(bundle2, str, string);
                }
            } else if (bundle == null) {
                FinskyLog.m21665c("Input Error: Non-null argument expected for skusBundle.", new Object[0]);
                bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
                if (a) {
                    m9930a(bundle2, str, string);
                }
            } else {
                List stringArrayList = bundle.getStringArrayList("ITEM_ID_LIST");
                List stringArrayList2 = bundle.getStringArrayList("DYNAMIC_PRICE_TOKENS_LIST");
                List stringArrayList3 = bundle.getStringArrayList("DYNAMIC_TITLES_LIST");
                if (stringArrayList == null) {
                    FinskyLog.m21665c("Input Error: skusBundle must contain an array associated with key %s.", "ITEM_ID_LIST");
                    bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
                    if (a) {
                        m9930a(bundle2, str, string);
                    }
                } else if (stringArrayList.isEmpty() || (stringArrayList2 != null && stringArrayList2.isEmpty())) {
                    FinskyLog.m21665c("Input Error: skusBundle array associated with key %s or key %s cannot be empty.", "ITEM_ID_LIST", "DYNAMIC_PRICE_TOKENS_LIST");
                    bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
                    if (a) {
                        m9930a(bundle2, str, string);
                    }
                } else if (stringArrayList.size() > this.f9498c || (stringArrayList2 != null && stringArrayList2.size() > this.f9498c)) {
                    FinskyLog.m21665c("Input Error: skusBundle array associated with key %s or key %s cannot contain more than %d items.", "ITEM_ID_LIST", "DYNAMIC_PRICE_TOKENS_LIST", Integer.valueOf(this.f9498c));
                    bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
                    if (a) {
                        m9930a(bundle2, str, string);
                    }
                } else {
                    int i2 = 0;
                    while (i2 < stringArrayList.size()) {
                        if (TextUtils.isEmpty((CharSequence) stringArrayList.get(i2))) {
                            FinskyLog.m21665c("Input Error: skusBundle array associated with key %s contains an empty/null sku at index %d.", "ITEM_ID_LIST", Integer.valueOf(i2));
                            bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
                            if (a) {
                                m9930a(bundle2, str, string);
                            }
                        } else {
                            i2++;
                        }
                    }
                    m9928a(i, str, str2, stringArrayList, stringArrayList2, stringArrayList3, bundle2, string);
                    if (a && bundle2.getInt("RESPONSE_CODE") != C1868x.RESULT_ERROR.f9566l) {
                        m9930a(bundle2, str, string);
                    }
                }
            }
        }
        return bundle2;
    }

    private final void m9930a(Bundle bundle, String str, String str2) {
        m9945a(bundle, str, null, null, str2);
    }

    final void m9945a(Bundle bundle, String str, Throwable th, bz bzVar, String str2) {
        C2474c a = new C2474c(622).m13210a(bundle.getInt("RESPONSE_CODE")).m13238a(th).m13247c(str).m13224a(bzVar);
        if (this.f9502g.mo2294a(12640490)) {
            C1849e.m9932a(a, str2);
        }
        this.f9503h.m13371a(a.f13342a, null);
    }

    private static void m9932a(C2474c c2474c, String str) {
        if (str != null) {
            if (str.length() > 5) {
                str = str.substring(0, 5);
            }
            bo boVar = c2474c.f13342a;
            if (str == null) {
                throw new NullPointerException();
            }
            boVar.f31701a |= MemoryMappedFileBuffer.DEFAULT_SIZE;
            boVar.aB = str;
        }
    }

    final Bundle m9939a(int i, String str, String str2, String str3, String str4, int i2) {
        Bundle bundle = new Bundle();
        C1868x a = m9941a(i);
        if (a != C1868x.RESULT_OK) {
            bundle.putInt("RESPONSE_CODE", a.f9566l);
            m9944a(bundle, 1, str, null);
            return bundle;
        }
        a = m9942a(str3, false);
        if (a != C1868x.RESULT_OK) {
            bundle.putInt("RESPONSE_CODE", a.f9566l);
            m9944a(bundle, 1, str, null);
            return bundle;
        } else if (TextUtils.isEmpty(str2)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for sku.", new Object[0]);
            bundle.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
            m9944a(bundle, 1, str, null);
            return bundle;
        } else if (m9948a(str3, str2, str)) {
            bundle.putInt("RESPONSE_CODE", C1868x.RESULT_ITEM_ALREADY_OWNED.f9566l);
            m9944a(bundle, 1, str, null);
            return bundle;
        } else {
            PurchaseParams a2 = this.f9507l.m9991a(this.f9500e, i, str, null, str2, str3, str4, this.f9502g, Integer.valueOf(i2));
            if (a2 == null) {
                bundle.putInt("RESPONSE_CODE", C1868x.RESULT_ERROR.f9566l);
                m9944a(bundle, 1, str, null);
                return bundle;
            }
            Intent a3 = m9936a(bundle, a2);
            m9944a(bundle, 1, str, null);
            if (a3 != null) {
                m9943a(a3, bundle);
            }
            return bundle;
        }
    }

    final void m9944a(Bundle bundle, int i, String str, String str2) {
        bk bkVar = new bk();
        bkVar.a = new bj();
        bkVar.a.a(i);
        C2474c a = new C2474c(623).m13210a(bundle.getInt("RESPONSE_CODE")).m13223a(bkVar);
        if (this.f9502g.mo2294a(12640492)) {
            a.m13247c(str);
        }
        if (this.f9502g.mo2294a(12640491)) {
            C1849e.m9932a(a, str2);
        }
        this.f9503h.m13371a(a.f13342a, null);
    }

    final Bundle m9938a(int i, String str, String str2, String str3, Bundle bundle) {
        boolean z = false;
        Bundle bundle2 = new Bundle();
        boolean a = this.f9502g.mo2294a(12609899);
        C1868x a2 = m9941a(i);
        if (a2 != C1868x.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a2.f9566l);
            if (a) {
                m9929a(bundle2, 1);
            }
            return bundle2;
        } else if (bundle == null || i >= 7) {
            if (!this.f9502g.mo2294a(12631855)) {
                z = true;
            }
            C1868x a3 = m9942a(str2, z);
            if (a3 != C1868x.RESULT_OK) {
                bundle2.putInt("RESPONSE_CODE", a3.f9566l);
                if (a) {
                    m9929a(bundle2, 1);
                }
                return bundle2;
            }
            m9933a(str, str2, str3, bundle2);
            bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_OK.f9566l);
            if (a) {
                m9929a(bundle2, 1);
            }
            return bundle2;
        } else {
            FinskyLog.m21665c("Input Error: getPurchasesExtraParams was introduced in API version 7.", new Object[0]);
            bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
            if (a) {
                m9929a(bundle2, 1);
            }
            return bundle2;
        }
    }

    private final void m9929a(Bundle bundle, int i) {
        bk bkVar = new bk();
        bkVar.b = new bl();
        bkVar.b.a(i);
        this.f9503h.m13371a(new C2474c(624).m13210a(bundle.getInt("RESPONSE_CODE")).m13223a(bkVar).f13342a, null);
    }

    final int m9949b(int i, String str, String str2, Bundle bundle) {
        C1868x a = m9941a(i);
        if (a != C1868x.RESULT_OK) {
            m9946a(a, str);
            return a.f9566l;
        } else if (bundle != null && i < 7) {
            FinskyLog.m21665c("Input Error: consumePurchasesExtraParams was introduced in API version 7.", new Object[0]);
            m9946a(C1868x.RESULT_DEVELOPER_ERROR, str);
            return C1868x.RESULT_DEVELOPER_ERROR.f9566l;
        } else if (!TextUtils.isEmpty(str2)) {
            return m9926a(str, str2).f9566l;
        } else {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for purchaseToken.", new Object[0]);
            m9946a(a, str);
            return C1868x.RESULT_DEVELOPER_ERROR.f9566l;
        }
    }

    final void m9946a(C1868x c1868x, String str) {
        m9947a(c1868x, str, null, null);
    }

    final void m9947a(C1868x c1868x, String str, Throwable th, bz bzVar) {
        this.f9503h.m13371a(new C2474c(625).m13210a(c1868x.f9566l).m13238a(th).m13247c(str).m13224a(bzVar).f13342a, null);
    }

    final Bundle m9940a(int i, String str, List list, String str2, String str3, String str4, Integer num) {
        Bundle bundle = new Bundle();
        C1868x a = m9941a(i);
        if (a != C1868x.RESULT_OK) {
            bundle.putInt("RESPONSE_CODE", a.f9566l);
            m9944a(bundle, 2, str, null);
            return bundle;
        } else if (i < 5) {
            FinskyLog.m21665c("Input Error: getBuyIntentToReplaceSkus was introduced in API version 5.", new Object[0]);
            bundle.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
            m9944a(bundle, 2, str, null);
            return bundle;
        } else {
            a = m9942a(str3, false);
            if (a != C1868x.RESULT_OK) {
                bundle.putInt("RESPONSE_CODE", a.f9566l);
                m9944a(bundle, 2, str, null);
                return bundle;
            } else if (TextUtils.isEmpty(str2)) {
                FinskyLog.m21665c("Input Error: Non empty/null argument expected for newSku.", new Object[0]);
                bundle.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
                m9944a(bundle, 2, str, null);
                return bundle;
            } else if (m9948a(str3, str2, str)) {
                bundle.putInt("RESPONSE_CODE", C1868x.RESULT_ITEM_ALREADY_OWNED.f9566l);
                m9944a(bundle, 2, str, null);
                return bundle;
            } else {
                PurchaseParams a2 = this.f9507l.m9991a(this.f9500e, i, str, list, str2, str3, str4, this.f9502g, num);
                if (a2 == null) {
                    bundle.putInt("RESPONSE_CODE", C1868x.RESULT_ERROR.f9566l);
                    m9944a(bundle, 1, str, null);
                    return bundle;
                }
                Intent a3 = m9936a(bundle, a2);
                m9944a(bundle, 2, str, null);
                if (a3 != null) {
                    m9943a(a3, bundle);
                }
                return bundle;
            }
        }
    }

    final Bundle m9950b(int i, String str, String str2, String str3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        boolean a = this.f9502g.mo2294a(12609899);
        C1868x a2 = m9941a(i);
        if (a2 != C1868x.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a2.f9566l);
            if (a) {
                m9929a(bundle2, 2);
            }
            return bundle2;
        } else if (i < 6) {
            FinskyLog.m21665c("Input Error: getPurchaseHistory was introduced in API version 6.", new Object[0]);
            bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
            if (a) {
                m9929a(bundle2, 2);
            }
            return bundle2;
        } else {
            a2 = m9942a(str2, false);
            if (a2 != C1868x.RESULT_OK) {
                bundle2.putInt("RESPONSE_CODE", a2.f9566l);
                if (a) {
                    m9929a(bundle2, 2);
                }
                return bundle2;
            }
            ex exVar = null;
            if (!(bundle == null || bundle.isEmpty())) {
                exVar = new ex();
                exVar.a = C1849e.m9934a(bundle);
            }
            Semaphore semaphore = new Semaphore(0);
            this.f9501f.mo1552a(i, str, str2, str3, exVar, new C1855k(bundle2, semaphore), new C1856l(bundle2, semaphore));
            try {
                if (!semaphore.tryAcquire(this.f9499d, TimeUnit.MILLISECONDS)) {
                    bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_ERROR.f9566l);
                }
            } catch (InterruptedException e) {
                bundle2.putInt("RESPONSE_CODE", C1868x.RESULT_ERROR.f9566l);
            }
            if (a) {
                m9929a(bundle2, 2);
            }
            return bundle2;
        }
    }

    final C1868x m9942a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for type.", new Object[0]);
            return C1868x.RESULT_DEVELOPER_ERROR;
        }
        boolean equals = TextUtils.equals(str, "subs");
        if (!TextUtils.equals(str, "inapp") && !equals) {
            FinskyLog.m21665c("Unknown item type specified %s", str);
            return C1868x.RESULT_BILLING_UNAVAILABLE;
        } else if (!equals || z || !C1503a.m8831b(this.f9500e)) {
            return C1868x.RESULT_OK;
        } else {
            FinskyLog.m21665c("In-app subscriptions are not supported on wear devices.", new Object[0]);
            return C1868x.RESULT_BILLING_UNAVAILABLE;
        }
    }

    final C1868x m9941a(int i) {
        C1868x c1868x;
        if (i < 3 || i > 7) {
            FinskyLog.m21665c("Unsupported billing API version: %d", Integer.valueOf(i));
            c1868x = C1868x.RESULT_BILLING_UNAVAILABLE;
        } else {
            c1868x = C1868x.RESULT_OK;
        }
        if (c1868x != C1868x.RESULT_OK) {
            return c1868x;
        }
        int i2;
        C1865u c1865u = this.f9506k;
        String c = this.f9501f.mo1636c();
        if (c != null) {
            C0957n a = C1866v.m9977a(c);
            if (!a.m5764b()) {
                C1254c a2 = c1865u.f9548a.mo2016a(c);
                if (a2 == null) {
                    FinskyLog.m21665c("Unknown account %s", c);
                } else {
                    gp a3 = c1865u.f9549b.m15105a(a2);
                    if (!(a3 == null || a3.f31772o == null)) {
                        C1866v.m9978a(c, a3.f31772o);
                    }
                }
            }
            if (i <= ((Integer) a.m5760a()).intValue()) {
                i2 = 1;
                if (i2 == 0) {
                    return C1868x.RESULT_OK;
                }
                FinskyLog.m21665c("Billing unavailable for this package and user.", new Object[0]);
                return C1868x.RESULT_BILLING_UNAVAILABLE;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            return C1868x.RESULT_OK;
        }
        FinskyLog.m21665c("Billing unavailable for this package and user.", new Object[0]);
        return C1868x.RESULT_BILLING_UNAVAILABLE;
    }

    private final void m9928a(int i, String str, String str2, List list, List list2, List list3, Bundle bundle, String str3) {
        Semaphore semaphore = new Semaphore(0);
        gf gfVar = new gf();
        gfVar.a |= 1;
        gfVar.b = i;
        if (str == null) {
            throw new NullPointerException();
        }
        gfVar.a |= 2;
        gfVar.c = str;
        if (str2 == null) {
            throw new NullPointerException();
        }
        gfVar.a |= 4;
        gfVar.d = str2;
        boolean c = this.f9510o.m11721c();
        gfVar.a |= 8;
        gfVar.g = c;
        if (list2 == null) {
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            Arrays.sort(strArr);
            gfVar.e = strArr;
        } else {
            gd[] gdVarArr = new gd[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                String str4 = (String) list2.get(i2);
                String str5 = (String) list.get(i2);
                gd gdVar = new gd();
                if (str5 == null) {
                    throw new NullPointerException();
                }
                gdVar.b |= 1;
                gdVar.c = str5;
                if (str4 == null) {
                    throw new NullPointerException();
                }
                gdVar.b |= 2;
                gdVar.d = str4;
                str4 = (String) list3.get(i2);
                if (str4 == null) {
                    throw new NullPointerException();
                }
                gdVar.b |= 4;
                gdVar.e = str4;
                gdVarArr[i2] = gdVar;
            }
            gfVar.f = gdVarArr;
        }
        boolean a = this.f9502g.mo2294a(12609897);
        this.f9501f.mo1576a(gfVar, new C1850f(this, bundle, semaphore, i, str, str2, gfVar), new C1851g(this, bundle, a, str, str3, semaphore));
        try {
            if (!semaphore.tryAcquire(this.f9499d, TimeUnit.MILLISECONDS)) {
                bundle.putInt("RESPONSE_CODE", C1868x.RESULT_ERROR.f9566l);
                if (a) {
                    m9930a(bundle, str, str3);
                }
            }
        } catch (Throwable e) {
            bundle.putInt("RESPONSE_CODE", C1868x.RESULT_ERROR.f9566l);
            if (a) {
                m9945a(bundle, str, e, null, str3);
            }
        }
    }

    static bz m9927a(VolleyError volleyError) {
        return new bz().a(C2482j.m13280a(volleyError));
    }

    final boolean m9948a(String str, String str2, String str3) {
        this.f9508m.mo2820c();
        return this.f9508m.mo2811a(this.f9501f.mo1620b()).mo2781a(C1867w.m9987a(str2, str, str3)) != null;
    }

    final Intent m9936a(Bundle bundle, PurchaseParams purchaseParams) {
        this.f9511p.m9770c(this.f9500e, this.f9501f.mo1636c());
        Intent a = this.f9512q.mo2489a(this.f9501f.mo1620b(), purchaseParams);
        if (a == null) {
            bundle.putInt("RESPONSE_CODE", C1868x.RESULT_DEVELOPER_ERROR.f9566l);
        } else {
            if (!this.f9502g.mo2294a(12617885)) {
                a.setData(Uri.parse(String.format("iabData:%s", new Object[]{purchaseParams.f9286b})));
            }
            bundle.putInt("RESPONSE_CODE", C1868x.RESULT_OK.f9566l);
        }
        return a;
    }

    final void m9943a(Intent intent, Bundle bundle) {
        int i;
        this.f9503h.m13366a(this.f9501f.mo1620b()).m13376a(intent);
        String str = "BUY_INTENT";
        Context context = this.f9500e;
        if (this.f9502g.mo2294a(12641956)) {
            i = 0;
        } else {
            i = f9497b.getAndAdd(1);
        }
        bundle.putParcelable(str, PendingIntent.getActivity(context, i, intent, MemoryMappedFileBuffer.DEFAULT_SIZE));
    }

    private final void m9933a(String str, String str2, String str3, Bundle bundle) {
        String str4;
        C2197a a = this.f9508m.mo2811a(this.f9501f.mo1620b());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Pair a2;
        if (str2.equals("inapp")) {
            a2 = C1849e.m9925a(a.mo2787c(str), str3);
            List<C2230i> list = (List) a2.first;
            str4 = (String) a2.second;
            for (C2230i c2230i : list) {
                arrayList.add(C1867w.m9986a(c2230i.f11104k));
                arrayList2.add(c2230i.f11127a);
                arrayList3.add(c2230i.f11128b);
            }
        } else if (str2.equals("subs")) {
            a2 = C1849e.m9925a(a.mo2789d(str), str3);
            List<C2232j> list2 = (List) a2.first;
            str4 = (String) a2.second;
            for (C2232j c2232j : list2) {
                arrayList.add(C1867w.m9986a(c2232j.f11104k));
                arrayList2.add(c2232j.f11132a);
                arrayList3.add(c2232j.f11133b);
            }
        } else {
            str4 = str3;
        }
        bundle.putStringArrayList("INAPP_PURCHASE_ITEM_LIST", arrayList);
        bundle.putStringArrayList("INAPP_PURCHASE_DATA_LIST", arrayList2);
        bundle.putStringArrayList("INAPP_DATA_SIGNATURE_LIST", arrayList3);
        if (str4 != null) {
            bundle.putString("INAPP_CONTINUATION_TOKEN", str4);
        }
    }

    private static Pair m9925a(List list, String str) {
        if (list.size() <= f9496a) {
            return Pair.create(list, null);
        }
        int i;
        Object encodeToString;
        int i2;
        if (TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            String str2 = new String(Base64.decode(str, 0), C4677h.f24059a);
            if (str2.startsWith("CONT-TOKEN-")) {
                i = Integer.parseInt(str2.substring(11));
            } else {
                i = -1;
            }
            if (i < 0 || i >= list.size()) {
                i = 0;
            }
        }
        int i3 = f9496a + i;
        if (i3 < list.size()) {
            int i4 = i3;
            encodeToString = Base64.encodeToString(("CONT-TOKEN-" + i3).getBytes(C4677h.f24059a), 0);
            i2 = i4;
        } else {
            i2 = list.size();
            encodeToString = null;
        }
        return Pair.create(list.subList(i, i2), encodeToString);
    }

    private final C1868x m9926a(String str, String str2) {
        Semaphore semaphore = new Semaphore(0);
        C1868x[] c1868xArr = new C1868x[]{C1868x.RESULT_OK};
        this.f9501f.mo1591a(str2, str, new C1852h(this, c1868xArr, str, semaphore), new C1854j(this, c1868xArr, str, semaphore));
        try {
            if (semaphore.tryAcquire(this.f9499d, TimeUnit.MILLISECONDS)) {
                return c1868xArr[0];
            }
            m9946a(C1868x.RESULT_ERROR, str);
            return C1868x.RESULT_ERROR;
        } catch (Throwable e) {
            m9947a(C1868x.RESULT_ERROR, str, e, null);
            return C1868x.RESULT_ERROR;
        }
    }

    static ew[] m9934a(Bundle bundle) {
        ew[] ewVarArr = new ew[bundle.size()];
        int i = 0;
        for (String str : bundle.keySet()) {
            ew ewVar = new ew();
            String str2;
            if (str2 == null) {
                throw new NullPointerException();
            }
            ewVar.b |= 1;
            ewVar.c = str2;
            Object obj = bundle.get(str2);
            if (obj != null) {
                if (obj instanceof Boolean) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    ewVar.b |= 4;
                    ewVar.e = booleanValue;
                } else if (obj instanceof Long) {
                    ewVar.a(((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    ewVar.a((long) ((Integer) obj).intValue());
                } else {
                    str2 = obj.toString();
                    if (str2 == null) {
                        throw new NullPointerException();
                    }
                    ewVar.b |= 2;
                    ewVar.d = str2;
                }
            }
            int i2 = i + 1;
            ewVarArr[i] = ewVar;
            i = i2;
        }
        return ewVarArr;
    }
}
