package com.google.android.finsky.notification.impl;

import android.accounts.Account;
import android.support.v4.p037h.C0305a;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0987b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.cd.C2259b;
import com.google.android.finsky.cd.C2261d;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.notification.C3667j;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3784h;
import com.google.android.finsky.notification.C3816o;
import com.google.android.finsky.notification.aa;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.utils.C4678i;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class af implements C0987b, aa, C3784h {
    public final C1198a f19013b;
    public final C1202e f19014c;
    public final as f19015d;
    public final C4817d f19016e;
    public final C0988c f19017f;
    public final Set f19018g = new HashSet();
    public int f19019h;

    public af(C1203f c1203f, as asVar, C4817d c4817d, C0986a c0986a, C0988c c0988c) {
        Map c0305a = new C0305a(4);
        c0305a.put("notification_id", "TEXT");
        c0305a.put("account_name", "TEXT");
        c0305a.put("timestamp", "INTEGER");
        c0305a.put("notification_count", "INTEGER");
        C1201d c1201d = new C1201d("notifications", "TEXT", c0305a);
        this.f19013b = c1203f.mo1516a("notification_cache", new C1201d[]{c1201d});
        this.f19014c = c1203f.mo1517a(this.f19013b, "notifications", new ah(), new ai(), new aj(), 0, new ak());
        this.f19015d = asVar;
        this.f19016e = c4817d;
        this.f19017f = c0988c;
        c0986a.mo1192a((C0987b) this);
        this.f19019h = 0;
        m18091c();
    }

    static String m18083a(String str, String str2) {
        CharSequence charSequence = "|";
        String[] strArr = new String[2];
        strArr[0] = str;
        if (str2 == null) {
            str2 = "";
        }
        strArr[1] = str2;
        return TextUtils.join(charSequence, Arrays.asList(strArr));
    }

    final C4809e m18086a(C3781e c3781e) {
        if (c3781e.f18987a.f18996h == 2) {
            Object obj = null;
        } else {
            C2259b c2259b = new C2259b();
            String str = c3781e.f18987a.f18989a;
            if (str == null) {
                throw new NullPointerException();
            }
            c2259b.f11205a |= 1;
            c2259b.f11206b = str;
            str = c3781e.f18987a.f18992d;
            if (str == null) {
                throw new NullPointerException();
            }
            c2259b.f11205a |= 32;
            c2259b.f11211g = str;
            int i = c3781e.f18987a.f18993e;
            c2259b.f11205a |= 64;
            c2259b.f11212h = i;
            str = c3781e.f18987a.f18991c;
            if (str == null) {
                throw new NullPointerException();
            }
            c2259b.f11205a |= 16;
            c2259b.f11210f = str;
            long j = c3781e.f18987a.f18995g;
            c2259b.f11205a |= 4;
            c2259b.f11208d = j;
            if (c3781e.f18987a.f18996h == 0) {
                i = 1;
            } else {
                i = 0;
            }
            c2259b.f11205a |= 8;
            c2259b.f11209e = i;
            if (c3781e.f18987a.f18990b != null) {
                str = c3781e.f18987a.f18990b;
                if (str == null) {
                    throw new NullPointerException();
                }
                c2259b.f11205a |= 2;
                c2259b.f11207c = str;
            }
            if (c3781e.f18987a.f18994f != null) {
                C3816o c3816o = c3781e.f18987a.f18994f;
                C2261d c2261d = new C2261d();
                if (c3816o.f19140a != null) {
                    i = c3816o.f19140a.intValue();
                    c2261d.f11229a = -1;
                    c2261d.f11229a = 0;
                    c2261d.f11230b = i;
                } else if (c3816o.f19141b != null) {
                    bd bdVar = c3816o.f19141b;
                    if (bdVar == null) {
                        if (c2261d.f11229a == 1) {
                            c2261d.f11229a = -1;
                        }
                        c2261d.f11231c = null;
                    } else {
                        c2261d.f11229a = -1;
                        c2261d.f11229a = 1;
                        c2261d.f11231c = bdVar;
                    }
                } else if (c3816o.f19142c != null) {
                    str = c3816o.f19142c;
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    c2261d.f11229a = -1;
                    c2261d.f11229a = 2;
                    c2261d.f11232d = str;
                }
                c2259b.f11213i = c2261d;
            }
            if (c3781e.f18987a.f18997i != null) {
                c2259b.f11214j = as.m18106a(c3781e.f18987a.f18997i);
            }
            if (c3781e.f18987a.f18998j != null) {
                c2259b.f11215k = as.m18106a(c3781e.f18987a.f18998j);
            }
            if (c3781e.f18987a.f18999k != null) {
                c2259b.f11216l = as.m18105a(c3781e.f18987a.f18999k);
            }
            if (c3781e.f18987a.f19000l != null) {
                c2259b.f11217m = as.m18105a(c3781e.f18987a.f19000l);
            }
            if (c3781e.f18987a.f19001m != null) {
                c2259b.f11218n = c3781e.f18987a.f19001m.intValue();
                c2259b.f11205a |= 128;
            }
            if (c3781e.f18987a.f19002n != null) {
                byte[] bArr = c3781e.f18987a.f19002n;
                if (bArr == null) {
                    throw new NullPointerException();
                }
                c2259b.f11205a |= 256;
                c2259b.f11219o = bArr;
            }
            C2259b c2259b2 = c2259b;
        }
        if (obj == null) {
            return this.f19016e.mo4402a(null);
        }
        return this.f19014c.mo1524b(obj).mo4396a(new al(this));
    }

    static long m18084b() {
        return C4678i.m21812a() - TimeUnit.DAYS.toMillis((long) ((Integer) C0955b.jE.m28964b()).intValue());
    }

    public final void mo3757a(C3667j c3667j) {
        this.f19018g.add(c3667j);
    }

    public final void mo3758b(C3667j c3667j) {
        this.f19018g.remove(c3667j);
    }

    public final int mo3756a() {
        return this.f19019h;
    }

    public final void mo2020a(Account account) {
        if (account != null) {
            m18091c();
        }
    }

    public final C4809e mo3759a(String str) {
        C1215q a = C1215q.m7189a(new C1215q().m7191a("account_name", (Object) str), new C1215q().m7190a("account_name"), "OR");
        C1215q c1215q = new C1215q();
        c1215q.m7193a("timestamp", ">=", Long.valueOf(m18084b()));
        return this.f19014c.mo1520a(C1215q.m7189a(a, c1215q, "AND"), "timestamp desc", null).mo4397a(new ap(this));
    }

    final void m18091c() {
        this.f19014c.mo1519a(C1215q.m7189a(C1215q.m7189a(new C1215q().m7191a("account_name", this.f19017f.cZ()), new C1215q().m7190a("account_name"), "OR"), new C1215q().m7191a("notification_count", Integer.valueOf(1)), "AND")).mo4397a(new ag(this));
    }
}
