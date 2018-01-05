package com.google.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class am {
    public final dh f35114a = dh.m33286a(16);
    public boolean f35115b;
    public boolean f35116c = false;

    am() {
    }

    private am(byte b) {
        m32916a();
    }

    public final void m32916a() {
        if (!this.f35115b) {
            this.f35114a.mo6182a();
            this.f35115b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        return this.f35114a.equals(((am) obj).f35114a);
    }

    public final int hashCode() {
        return this.f35114a.hashCode();
    }

    public final Iterator m32918b() {
        if (this.f35116c) {
            return new bl(this.f35114a.entrySet().iterator());
        }
        return this.f35114a.entrySet().iterator();
    }

    private final Object m32909a(an anVar) {
        Object obj = this.f35114a.get(anVar);
        if (obj instanceof bj) {
            return bj.m33005a();
        }
        return obj;
    }

    private final void m32915b(an anVar, Object obj) {
        Object obj2;
        if (!anVar.m32922d()) {
            m32912a(anVar.m32920b(), obj);
            obj2 = obj;
        } else if (obj instanceof List) {
            obj2 = new ArrayList();
            obj2.addAll((List) obj);
            ArrayList arrayList = (ArrayList) obj2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                m32912a(anVar.m32920b(), obj3);
            }
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj2 instanceof bj) {
            this.f35116c = true;
        }
        this.f35114a.m33288a(anVar, obj2);
    }

    private static void m32912a(ek ekVar, Object obj) {
        boolean z = false;
        bb.m32993a(obj);
        switch (ekVar.f35411s.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof C7203j) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof bc)) {
                    z = true;
                    break;
                }
            case 8:
                if ((obj instanceof cf) || (obj instanceof bj)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static Object m32910a(Object obj) {
        if (obj instanceof co) {
            return ((co) obj).m33128b();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        Object obj2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, obj2, 0, bArr.length);
        return obj2;
    }

    final void m32917a(Entry entry) {
        an anVar = (an) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof bj) {
            value = bj.m33005a();
        }
        Object a;
        if (anVar.m32922d()) {
            a = m32909a(anVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m32910a(a2));
            }
            this.f35114a.m33288a(anVar, a);
        } else if (anVar.m32921c() == ep.MESSAGE) {
            a = m32909a(anVar);
            if (a == null) {
                this.f35114a.m33288a(anVar, m32910a(value));
                return;
            }
            if (a instanceof co) {
                value = anVar.m32925g();
            } else {
                ((cf) a).mo6119f();
                value = anVar.m32924f().mo6127d();
            }
            this.f35114a.m33288a(anVar, value);
        } else {
            this.f35114a.m33288a(anVar, m32910a(value));
        }
    }

    static void m32911a(CodedOutputStream codedOutputStream, ek ekVar, int i, Object obj) {
        if (ekVar == ek.GROUP) {
            bb.m32996a();
            codedOutputStream.m32661e(i, (cf) obj);
            return;
        }
        codedOutputStream.mo6027a(i, ekVar.f35412t);
        switch (ekVar.ordinal()) {
            case 0:
                codedOutputStream.m32629a(((Double) obj).doubleValue());
                return;
            case 1:
                codedOutputStream.m32630a(((Float) obj).floatValue());
                return;
            case 2:
                codedOutputStream.mo6033a(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.mo6033a(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo6039b(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.mo6047c(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.mo6048e(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.m32644a(((Boolean) obj).booleanValue());
                return;
            case 8:
                if (obj instanceof C7203j) {
                    codedOutputStream.mo6035a((C7203j) obj);
                    return;
                } else {
                    codedOutputStream.mo6036a((String) obj);
                    return;
                }
            case 9:
                ((cf) obj).mo6116a(codedOutputStream);
                return;
            case 10:
                codedOutputStream.mo6034a((cf) obj);
                return;
            case 11:
                if (obj instanceof C7203j) {
                    codedOutputStream.mo6035a((C7203j) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.mo6037a(bArr, bArr.length);
                return;
            case 12:
                codedOutputStream.mo6044c(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof bc) {
                    codedOutputStream.mo6039b(((bc) obj).m33000a());
                    return;
                } else {
                    codedOutputStream.mo6039b(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.mo6048e(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo6047c(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.m32657d(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.m32651b(((Long) obj).longValue());
                return;
            default:
                return;
        }
    }

    static int m32914b(Entry entry) {
        an anVar = (an) entry.getKey();
        Object value = entry.getValue();
        if (anVar.m32921c() != ep.MESSAGE || anVar.m32922d() || anVar.m32923e()) {
            return m32907a(anVar, value);
        }
        if (value instanceof bj) {
            return CodedOutputStream.m32585b(((an) entry.getKey()).m32919a(), (bj) value);
        }
        return CodedOutputStream.m32597d(((an) entry.getKey()).m32919a(), (cf) value);
    }

    static int m32908a(ek ekVar, int i, Object obj) {
        int m = CodedOutputStream.m32620m(i);
        if (ekVar == ek.GROUP) {
            bb.m32996a();
            m *= 2;
        }
        return m + m32913b(ekVar, obj);
    }

    private static int m32913b(ek ekVar, Object obj) {
        switch (ekVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return CodedOutputStream.m32603f();
            case 1:
                ((Float) obj).floatValue();
                return CodedOutputStream.m32600e();
            case 2:
                return CodedOutputStream.m32599d(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.m32602e(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m32621n(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return CodedOutputStream.m32591c();
            case 6:
                ((Integer) obj).intValue();
                return CodedOutputStream.m32577a();
            case 7:
                ((Boolean) obj).booleanValue();
                return CodedOutputStream.m32609g();
            case 8:
                if (obj instanceof C7203j) {
                    return CodedOutputStream.m32588b((C7203j) obj);
                }
                return CodedOutputStream.m32589b((String) obj);
            case 9:
                return CodedOutputStream.m32594c((cf) obj);
            case 10:
                if (obj instanceof bj) {
                    return CodedOutputStream.m32580a((bj) obj);
                }
                return CodedOutputStream.m32587b((cf) obj);
            case 11:
                if (obj instanceof C7203j) {
                    return CodedOutputStream.m32588b((C7203j) obj);
                }
                return CodedOutputStream.m32590b((byte[]) obj);
            case 12:
                return CodedOutputStream.m32622o(((Integer) obj).intValue());
            case 13:
                if (obj instanceof bc) {
                    return CodedOutputStream.m32624q(((bc) obj).m33000a());
                }
                return CodedOutputStream.m32624q(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return CodedOutputStream.m32584b();
            case 15:
                ((Long) obj).longValue();
                return CodedOutputStream.m32595d();
            case 16:
                return CodedOutputStream.m32623p(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m32608f(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int m32907a(an anVar, Object obj) {
        int i = 0;
        ek b = anVar.m32920b();
        int a = anVar.m32919a();
        if (!anVar.m32922d()) {
            return m32908a(b, a, obj);
        }
        if (anVar.m32923e()) {
            for (Object b2 : (List) obj) {
                i += m32913b(b, b2);
            }
            return CodedOutputStream.m32626s(i) + (CodedOutputStream.m32620m(a) + i);
        }
        for (Object b22 : (List) obj) {
            i += m32908a(b, a, b22);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        am amVar = new am();
        for (int i = 0; i < this.f35114a.m33290b(); i++) {
            Entry b = this.f35114a.m33291b(i);
            amVar.m32915b((an) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f35114a.m33292c()) {
            amVar.m32915b((an) entry.getKey(), entry.getValue());
        }
        amVar.f35116c = this.f35116c;
        return amVar;
    }

    static {
        am amVar = new am((byte) 0);
    }
}
