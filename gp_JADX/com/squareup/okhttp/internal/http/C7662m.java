package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7689v;
import com.squareup.okhttp.C7690w;
import com.squareup.okhttp.af;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ak;
import com.squareup.okhttp.al;
import com.squareup.okhttp.am;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.internal.p525a.C7614e;
import com.squareup.okhttp.internal.p525a.C7630t;
import com.squareup.okhttp.internal.p525a.C7636x;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p526e.C7631z;
import p526e.C7728j;
import p526e.C7733p;

public final class C7662m implements C7654v {
    public static final C7728j f39655a = C7728j.m37412a("connection");
    public static final C7728j f39656b = C7728j.m37412a("host");
    public static final C7728j f39657c = C7728j.m37412a("keep-alive");
    public static final C7728j f39658d = C7728j.m37412a("proxy-connection");
    public static final C7728j f39659e = C7728j.m37412a("transfer-encoding");
    public static final C7728j f39660f = C7728j.m37412a("te");
    public static final C7728j f39661g = C7728j.m37412a("encoding");
    public static final C7728j f39662h = C7728j.m37412a("upgrade");
    public static final List f39663i = k.a(new C7728j[]{f39655a, f39656b, f39657c, f39658d, f39659e, C7636x.f39539b, C7636x.f39540c, C7636x.f39541d, C7636x.f39542e, C7636x.f39543f, C7636x.f39544g});
    public static final List f39664j = k.a(new C7728j[]{f39655a, f39656b, f39657c, f39658d, f39659e});
    public static final List f39665k = k.a(new C7728j[]{f39655a, f39656b, f39657c, f39658d, f39660f, f39659e, f39661g, f39662h, C7636x.f39539b, C7636x.f39540c, C7636x.f39541d, C7636x.f39542e, C7636x.f39543f, C7636x.f39544g});
    public static final List f39666l = k.a(new C7728j[]{f39655a, f39656b, f39657c, f39658d, f39660f, f39659e, f39661g, f39662h});
    public final ad f39667m;
    public final C7614e f39668n;
    public C7666q f39669o;
    public C7630t f39670p;

    public C7662m(ad adVar, C7614e c7614e) {
        this.f39667m = adVar;
        this.f39668n = c7614e;
    }

    public final void mo6472a(C7666q c7666q) {
        this.f39669o = c7666q;
    }

    public final C7631z mo6469a(ag agVar, long j) {
        return this.f39670p.m36829d();
    }

    public final void mo6470a(ag agVar) {
        if (this.f39670p == null) {
            List arrayList;
            this.f39669o.m36966a();
            boolean a = C7666q.m36963a(agVar);
            if (this.f39668n.f39448b == af.d) {
                C7689v c7689v = agVar.f39290c;
                arrayList = new ArrayList((c7689v.f39793a.length / 2) + 4);
                arrayList.add(new C7636x(C7636x.f39539b, agVar.f39289b));
                arrayList.add(new C7636x(C7636x.f39540c, C7674z.m36993a(agVar.f39288a)));
                arrayList.add(new C7636x(C7636x.f39542e, k.a(agVar.f39288a)));
                arrayList.add(new C7636x(C7636x.f39541d, agVar.f39288a.f39796b));
                int length = c7689v.f39793a.length / 2;
                for (int i = 0; i < length; i++) {
                    C7728j a2 = C7728j.m37412a(c7689v.m37013a(i).toLowerCase(Locale.US));
                    if (!f39665k.contains(a2)) {
                        arrayList.add(new C7636x(a2, c7689v.m37017b(i)));
                    }
                }
            } else {
                arrayList = C7662m.m36952b(agVar);
            }
            this.f39670p = this.f39668n.m36788a(arrayList, a);
            this.f39670p.f39514h.mo6479a((long) this.f39669o.f39677b.z, TimeUnit.MILLISECONDS);
            this.f39670p.f39515i.mo6479a((long) this.f39669o.f39677b.A, TimeUnit.MILLISECONDS);
        }
    }

    public final void mo6471a(aa aaVar) {
        aaVar.m36901a(this.f39670p.m36829d());
    }

    public final void mo6473b() {
        this.f39670p.m36829d().close();
    }

    public final al mo6467a() {
        if (this.f39668n.f39448b != af.d) {
            return C7662m.m36951a(this.f39670p.m36827c());
        }
        List c = this.f39670p.m36827c();
        String str = null;
        C7690w c7690w = new C7690w();
        int size = c.size();
        int i = 0;
        while (i < size) {
            C7728j c7728j = ((C7636x) c.get(i)).f39545h;
            String a = ((C7636x) c.get(i)).f39546i.mo6515a();
            if (!c7728j.equals(C7636x.f39538a)) {
                if (!f39666l.contains(c7728j)) {
                    c7690w.m37023a(c7728j.mo6515a(), a);
                }
                a = str;
            }
            i++;
            str = a;
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ac a2 = ac.m36908a("HTTP/1.1 " + str);
        al alVar = new al();
        alVar.f39316b = af.d;
        alVar.f39317c = a2.f39609b;
        alVar.f39318d = a2.f39610c;
        return alVar.m36657a(c7690w.m37021a());
    }

    private static List m36952b(ag agVar) {
        C7689v c7689v = agVar.f39290c;
        List arrayList = new ArrayList((c7689v.f39793a.length / 2) + 5);
        arrayList.add(new C7636x(C7636x.f39539b, agVar.f39289b));
        arrayList.add(new C7636x(C7636x.f39540c, C7674z.m36993a(agVar.f39288a)));
        arrayList.add(new C7636x(C7636x.f39544g, "HTTP/1.1"));
        arrayList.add(new C7636x(C7636x.f39543f, k.a(agVar.f39288a)));
        arrayList.add(new C7636x(C7636x.f39541d, agVar.f39288a.f39796b));
        Set linkedHashSet = new LinkedHashSet();
        int length = c7689v.f39793a.length / 2;
        for (int i = 0; i < length; i++) {
            C7728j a = C7728j.m37412a(c7689v.m37013a(i).toLowerCase(Locale.US));
            if (!f39663i.contains(a)) {
                String b = c7689v.m37017b(i);
                if (linkedHashSet.add(a)) {
                    arrayList.add(new C7636x(a, b));
                } else {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (((C7636x) arrayList.get(i2)).f39545h.equals(a)) {
                            arrayList.set(i2, new C7636x(a, new StringBuilder(((C7636x) arrayList.get(i2)).f39546i.mo6515a()).append('\u0000').append(b).toString()));
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static al m36951a(List list) {
        String str = null;
        String str2 = "HTTP/1.1";
        C7690w c7690w = new C7690w();
        int size = list.size();
        int i = 0;
        while (i < size) {
            C7728j c7728j = ((C7636x) list.get(i)).f39545h;
            String a = ((C7636x) list.get(i)).f39546i.mo6515a();
            String str3 = str2;
            int i2 = 0;
            while (i2 < a.length()) {
                int indexOf = a.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = a.length();
                }
                str2 = a.substring(i2, indexOf);
                if (!c7728j.equals(C7636x.f39538a)) {
                    if (c7728j.equals(C7636x.f39544g)) {
                        str3 = str2;
                        str2 = str;
                    } else {
                        if (!f39664j.contains(c7728j)) {
                            c7690w.m37023a(c7728j.mo6515a(), str2);
                        }
                        str2 = str;
                    }
                }
                str = str2;
                i2 = indexOf + 1;
            }
            i++;
            str2 = str3;
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ac a2 = ac.m36908a(str2 + " " + str);
        al alVar = new al();
        alVar.f39316b = af.c;
        alVar.f39317c = a2.f39609b;
        alVar.f39318d = a2.f39610c;
        return alVar.m36657a(c7690w.m37021a());
    }

    public final am mo6468a(ak akVar) {
        return new C7673y(akVar.f39309f, C7733p.m37442a(new C7663n(this, this.f39670p.f39512f)));
    }
}
