package com.google.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

final class cn implements de {
    public final cf f35275a;
    public final du f35276b;
    public final boolean f35277c;
    public final aj f35278d;

    private cn(Class cls, du duVar, aj ajVar, cf cfVar) {
        this.f35276b = duVar;
        this.f35277c = ajVar.mo6107a(cls);
        this.f35278d = ajVar;
        this.f35275a = cfVar;
    }

    static cn m33119a(Class cls, du duVar, aj ajVar, cf cfVar) {
        return new cn(cls, duVar, ajVar, cfVar);
    }

    public final Object mo6156a() {
        return this.f35275a.mo6120g().mo6125c();
    }

    public final boolean mo6159a(Object obj, Object obj2) {
        if (!this.f35276b.mo6195b(obj).equals(this.f35276b.mo6195b(obj2))) {
            return false;
        }
        if (this.f35277c) {
            return this.f35278d.mo6103a(obj).equals(this.f35278d.mo6103a(obj2));
        }
        return true;
    }

    public final int mo6155a(Object obj) {
        int hashCode = this.f35276b.mo6195b(obj).hashCode();
        if (this.f35277c) {
            return (hashCode * 53) + this.f35278d.mo6103a(obj).hashCode();
        }
        return hashCode;
    }

    public final void mo6161b(Object obj, Object obj2) {
        dg.m33252a(this.f35276b, obj, obj2);
        if (this.f35277c) {
            dg.m33250a(this.f35278d, obj, obj2);
        }
    }

    public final void mo6158a(Object obj, eq eqVar) {
        Iterator b = this.f35278d.mo6103a(obj).m32918b();
        while (b.hasNext()) {
            Entry entry = (Entry) b.next();
            an anVar = (an) entry.getKey();
            if (anVar.m32921c() != ep.MESSAGE || anVar.m32922d() || anVar.m32923e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof bk) {
                eqVar.mo6072c(anVar.m32919a(), ((bj) ((bk) entry).f35228a.getValue()).m33004b());
            } else {
                eqVar.mo6072c(anVar.m32919a(), entry.getValue());
            }
        }
        du duVar = this.f35276b;
        duVar.mo6197b(duVar.mo6195b(obj), eqVar);
    }

    public final void mo6157a(Object obj, cz czVar, ah ahVar) {
        du duVar = this.f35276b;
        aj ajVar = this.f35278d;
        Object c = duVar.mo6199c(obj);
        ajVar.mo6108b(obj);
        while (czVar.mo6261a() != Integer.MAX_VALUE) {
            try {
                boolean c2;
                int b = czVar.mo6266b();
                if (b != ej.f35390a) {
                    if ((b & 7) != 2) {
                        c2 = czVar.mo6271c();
                        continue;
                    } else if (ajVar.mo6105a(ahVar, this.f35275a, b >>> 3) != null) {
                        ajVar.mo6109b();
                    } else {
                        c2 = duVar.m33313a(c, czVar);
                        continue;
                    }
                    if (!c2) {
                        return;
                    }
                }
                C7203j c7203j = null;
                int i = 0;
                Object obj2 = null;
                while (true) {
                    int a = czVar.mo6261a();
                    if (a != Integer.MAX_VALUE) {
                        switch (a) {
                            case 2:
                                i = czVar.mo6294o();
                                obj2 = ajVar.mo6105a(ahVar, this.f35275a, i);
                                break;
                            case 3:
                                if (obj2 == null) {
                                    c7203j = czVar.mo6292n();
                                    break;
                                } else {
                                    ajVar.mo6109b();
                                    break;
                                }
                            default:
                                if (!czVar.mo6271c()) {
                                    break;
                                }
                                break;
                        }
                    }
                    if (czVar.mo6266b() != ej.f35391b) {
                        throw InvalidProtocolBufferException.m32668e();
                    } else if (c7203j != null) {
                        if (obj2 != null) {
                            ajVar.mo6111c();
                        } else {
                            duVar.mo6189a(c, i, c7203j);
                        }
                    }
                }
                c2 = true;
                continue;
                if (c2) {
                    return;
                }
            } finally {
                duVar.mo6198b(obj, c);
            }
        }
        duVar.mo6198b(obj, c);
    }

    public final void mo6162c(Object obj) {
        this.f35276b.mo6201d(obj);
        this.f35278d.mo6112c(obj);
    }

    public final int mo6160b(Object obj) {
        int i = 0;
        du duVar = this.f35276b;
        int e = duVar.mo6202e(duVar.mo6195b(obj)) + 0;
        if (!this.f35277c) {
            return e;
        }
        am a = this.f35278d.mo6103a(obj);
        int i2 = 0;
        while (i < a.f35114a.m33290b()) {
            i2 += am.m32914b(a.f35114a.m33291b(i));
            i++;
        }
        for (Entry b : a.f35114a.m33292c()) {
            i2 += am.m32914b(b);
        }
        return e + i2;
    }
}
