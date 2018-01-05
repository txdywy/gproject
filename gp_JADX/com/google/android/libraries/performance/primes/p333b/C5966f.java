package com.google.android.libraries.performance.primes.p333b;

import android.support.v4.p037h.C0305a;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p333b.p334a.C5955a;
import com.google.android.libraries.performance.primes.p333b.p334a.C5956b;
import com.google.android.libraries.performance.primes.p333b.p334a.C5957c;
import com.google.android.libraries.performance.primes.p333b.p334a.C5958d;
import com.google.android.libraries.performance.primes.p333b.p334a.C5959e;
import com.squareup.haha.perflib.HprofParser;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class C5966f {
    public static final Map f29734a;
    public final C5970j f29735b;
    public final ByteBuffer f29736c;
    public final C5955a f29737d = new C5955a();
    public final C5955a f29738e = new C5955a();
    public final C5957c f29739f = new C5957c();
    public final C5957c f29740g = new C5957c();
    public final Map f29741h = new C0305a();
    public final C5955a f29742i = new C5955a();
    public int f29743j;
    public final C5957c f29744k = new C5957c();
    public final C5957c f29745l = new C5957c();
    public final C5959e f29746m = new C5959e();

    public static C5971k m27698a(C5970j c5970j, Iterable iterable, Iterable iterable2, Iterable iterable3) {
        C5966f c5966f = new C5966f(c5970j, iterable, iterable2, iterable3);
        while (c5966f.f29736c.hasRemaining()) {
            byte b = c5966f.f29736c.get();
            c5966f.f29736c.getInt();
            if (c5966f.f29736c.getInt(c5966f.f29736c.position()) >= 0) {
                int position;
                int i;
                switch (b) {
                    case (byte) 1:
                        position = c5966f.f29736c.position();
                        i = c5966f.f29736c.getInt();
                        c5966f.f29737d.m27657a(c5966f.f29735b.m27706a(), position);
                        c5966f.f29735b.m27709c(i - c5966f.f29735b.f29753b);
                        break;
                    case (byte) 2:
                        c5966f.f29736c.getInt();
                        c5966f.f29736c.getInt();
                        position = c5966f.f29736c.position();
                        i = c5966f.f29735b.m27706a();
                        c5966f.f29736c.getInt();
                        int b2 = c5966f.f29737d.m27659b(c5966f.f29735b.m27706a());
                        C5964c c5964c = new C5964c(position, b2);
                        c5966f.f29739f.m27664a(i, c5964c);
                        C5970j c5970j2 = c5966f.f29735b;
                        position = c5970j2.f29752a.getInt(b2) - c5970j2.f29753b;
                        C5967g c5967g = (C5967g) c5966f.f29746m.m27669a(c5966f.f29736c, (b2 + 4) + c5966f.f29735b.f29753b, position);
                        if (c5967g != C5967g.IDENTIFY_OBJECT_CLASS) {
                            if (c5967g != C5967g.CLASSIFY_REF) {
                                if (c5967g == null) {
                                    break;
                                }
                                c5966f.f29744k.m27664a(i, c5967g);
                                break;
                            }
                            c5964c.k |= 2;
                            break;
                        }
                        c5966f.f29743j = i;
                        break;
                    case (byte) 12:
                    case (byte) 28:
                        c5966f.m27699a();
                        break;
                    default:
                        c5966f.f29735b.m27709c(c5966f.f29736c.getInt());
                        break;
                }
            }
            throw new RuntimeException("Length too large to parse.");
        }
        C5958d b3 = c5966f.f29739f.m27666b();
        while (b3.m27667a()) {
            ((C5964c) b3.f29714e).m27690a();
        }
        List arrayList = new ArrayList();
        C5955a c5955a = c5966f.f29738e;
        C5956b c5956b = new C5956b(c5955a.f29697d, c5955a.f29698e, c5955a.f29695b);
        while (c5956b.m27661a()) {
            int i2 = c5956b.f29704e;
            C5962e c5962e = (C5962e) c5966f.f29739f.m27663a(i2);
            if (c5962e == null) {
                c5962e = (C5962e) c5966f.f29740g.m27663a(i2);
                if (c5962e == null) {
                }
            }
            c5962e.f29723k |= 1;
            arrayList.add(c5962e);
        }
        c5966f.f29737d.m27658a();
        c5966f.f29744k.m27665a();
        return new C5971k(c5966f.f29739f, c5966f.f29740g, arrayList, c5966f.f29741h);
    }

    private C5966f(C5970j c5970j, Iterable iterable, Iterable iterable2, Iterable iterable3) {
        this.f29735b = c5970j;
        this.f29736c = c5970j.f29752a;
        this.f29746m.m27668a(Reference.class.getName(), C5967g.CLASSIFY_REF);
        this.f29746m.m27668a(Object.class.getName(), C5967g.IDENTIFY_OBJECT_CLASS);
        if (iterable2 != null) {
            for (String str : iterable2) {
                this.f29746m.m27668a(str, C5967g.EXCLUDE_INSTANCE);
                if (f29734a.containsKey(str)) {
                    this.f29745l.m27664a(((Integer) f29734a.get(str)).intValue(), C5967g.EXCLUDE_INSTANCE);
                }
            }
        }
        if (iterable3 != null) {
            for (String str2 : iterable3) {
                this.f29746m.m27668a(str2, C5967g.FIND_INSTANCE);
            }
        }
        if (iterable != null) {
            for (Integer intValue : iterable) {
                this.f29742i.m27657a(intValue.intValue(), 0);
            }
        }
    }

    private final void m27699a() {
        boolean z;
        int position = this.f29736c.position() + this.f29736c.getInt();
        while (this.f29736c.position() < position) {
            int i = this.f29736c.get() & HprofParser.ROOT_UNKNOWN;
            int b;
            if (this.f29735b.f29755d.m27660c(i)) {
                b = this.f29735b.f29755d.m27659b(i);
                if (this.f29742i.m27660c(i)) {
                    this.f29735b.m27709c(b);
                } else {
                    this.f29738e.m27657a(this.f29735b.m27706a(), i);
                    this.f29735b.m27709c(b - this.f29735b.f29753b);
                }
            } else {
                C5964c c5964c;
                int i2;
                int i3;
                int a;
                C5967g c5967g;
                switch (i) {
                    case 32:
                        i = this.f29735b.m27706a();
                        C5957c c5957c;
                        if (i != this.f29743j) {
                            int a2;
                            byte b2;
                            int[] iArr;
                            int[] iArr2;
                            c5964c = (C5964c) this.f29739f.m27663a(i);
                            C5970j c5970j = this.f29735b;
                            c5957c = this.f29739f;
                            C5955a c5955a = this.f29737d;
                            ByteBuffer byteBuffer = c5970j.f29752a;
                            c5964c.i = byteBuffer.position() - c5970j.f29753b;
                            byteBuffer.getInt();
                            c5964c.f29731g = (C5964c) c5957c.m27663a(c5970j.m27706a());
                            c5970j.m27709c((c5970j.f29753b * 5) + 4);
                            C5964c.m27686c(c5970j);
                            ByteBuffer byteBuffer2 = c5970j.f29752a;
                            int i4 = byteBuffer2.getShort() & 65535;
                            c5964c.f29726b = new int[i4];
                            c5964c.f29727c = new int[i4];
                            b = 0;
                            for (i2 = 0; i2 < i4; i2++) {
                                a2 = c5970j.m27706a();
                                b2 = byteBuffer2.get();
                                if (C5970j.m27705e(b2)) {
                                    int a3 = c5970j.m27706a();
                                    if (a3 != 0) {
                                        c5964c.f29726b[b] = a3;
                                        c5964c.f29727c[b] = c5955a.m27659b(a2);
                                        b++;
                                    }
                                } else {
                                    c5970j.m27709c(c5970j.m27708b(b2));
                                }
                            }
                            if (b == i4) {
                                iArr = c5964c.f29726b;
                            } else {
                                iArr = Arrays.copyOf(c5964c.f29726b, b);
                            }
                            c5964c.f29726b = iArr;
                            if (b == i4) {
                                iArr2 = c5964c.f29727c;
                            } else {
                                iArr2 = Arrays.copyOf(c5964c.f29727c, b);
                            }
                            c5964c.f29727c = iArr2;
                            byteBuffer2 = c5970j.f29752a;
                            i4 = byteBuffer2.getShort() & 65535;
                            c5964c.f29728d = new int[i4];
                            c5964c.f29729e = new int[i4];
                            c5964c.f29730f = 0;
                            b = 0;
                            for (i2 = 0; i2 < i4; i2++) {
                                a2 = c5970j.m27706a();
                                b2 = byteBuffer2.get();
                                if (C5970j.m27705e(b2)) {
                                    c5964c.f29728d[b] = c5955a.m27659b(a2);
                                    c5964c.f29729e[b] = c5964c.f29730f;
                                    b++;
                                }
                                c5964c.f29730f += c5970j.m27708b(b2);
                            }
                            if (b == i4) {
                                iArr = c5964c.f29728d;
                            } else {
                                iArr = Arrays.copyOf(c5964c.f29728d, b);
                            }
                            c5964c.f29728d = iArr;
                            if (b == i4) {
                                iArr2 = c5964c.f29729e;
                            } else {
                                iArr2 = Arrays.copyOf(c5964c.f29729e, b);
                            }
                            c5964c.f29729e = iArr2;
                            break;
                        }
                        c5964c = (C5964c) this.f29739f.m27663a(i);
                        C5970j c5970j2 = this.f29735b;
                        c5957c = this.f29739f;
                        ByteBuffer byteBuffer3 = c5970j2.f29752a;
                        c5964c.i = byteBuffer3.position() - c5970j2.f29753b;
                        byteBuffer3.getInt();
                        c5964c.f29731g = (C5964c) c5957c.m27663a(c5970j2.m27706a());
                        c5970j2.m27709c((c5970j2.f29753b * 5) + 4);
                        C5964c.m27686c(c5970j2);
                        byteBuffer3 = c5970j2.f29752a;
                        i3 = byteBuffer3.getShort() & 65535;
                        for (b = 0; b < i3; b++) {
                            c5970j2.m27706a();
                            c5970j2.m27709c(c5970j2.m27708b(byteBuffer3.get()));
                        }
                        c5964c.f29726b = new int[0];
                        c5964c.f29727c = new int[0];
                        byteBuffer3 = c5970j2.f29752a;
                        i3 = byteBuffer3.getShort() & 65535;
                        c5964c.f29730f = 0;
                        for (b = 0; b < i3; b++) {
                            c5970j2.m27706a();
                            c5964c.f29730f = c5970j2.m27708b(byteBuffer3.get()) + c5964c.f29730f;
                        }
                        c5964c.f29728d = new int[0];
                        c5964c.f29729e = new int[0];
                        break;
                    case 33:
                        i2 = this.f29736c.position();
                        a = this.f29735b.m27706a();
                        this.f29736c.getInt();
                        b = this.f29735b.m27706a();
                        i3 = this.f29736c.getInt();
                        c5964c = (C5964c) this.f29739f.m27663a(b);
                        C5967g c5967g2 = (C5967g) this.f29744k.m27663a(b);
                        if (!(c5964c == null || c5967g2 == C5967g.EXCLUDE_INSTANCE)) {
                            C5965d c5965d = new C5965d(i2, c5964c);
                            this.f29740g.m27664a(a, c5965d);
                            if (c5967g2 == C5967g.FIND_INSTANCE) {
                                String b3 = c5964c.m27691b(this.f29735b);
                                List list = (List) this.f29741h.get(b3);
                                if (list == null) {
                                    list = new ArrayList();
                                    this.f29741h.put(b3, list);
                                }
                                list.add(c5965d);
                            }
                        }
                        this.f29735b.m27709c(i3);
                        break;
                    case 34:
                        i2 = this.f29736c.position();
                        a = this.f29735b.m27706a();
                        this.f29736c.getInt();
                        i3 = this.f29736c.getInt();
                        int a4 = this.f29735b.m27706a();
                        c5967g = (C5967g) this.f29744k.m27663a(a4);
                        if (!((this.f29739f.m27663a(a4) != null ? 1 : 0) == 0 || c5967g == C5967g.EXCLUDE_INSTANCE)) {
                            this.f29740g.m27664a(a, new C5963b(i2, (C5964c) this.f29739f.m27663a(a4)));
                        }
                        this.f29735b.m27709c(this.f29735b.f29753b * i3);
                        break;
                    case 35:
                    case HprofParser.ROOT_PRIMITIVE_ARRAY_NODATA /*195*/:
                        b = this.f29736c.position();
                        i2 = this.f29735b.m27706a();
                        this.f29736c.getInt();
                        a = this.f29736c.getInt();
                        byte b4 = this.f29736c.get();
                        c5967g = (C5967g) this.f29745l.m27663a(b4);
                        this.f29735b.m27709c(a * this.f29735b.m27708b(b4));
                        if (c5967g == C5967g.EXCLUDE_INSTANCE) {
                            break;
                        }
                        this.f29740g.m27664a(i2, new C5968h(b));
                        break;
                    case HprofParser.ROOT_HEAP_DUMP_INFO /*254*/:
                        this.f29736c.getInt();
                        this.f29735b.m27706a();
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown tag " + i);
                }
            }
        }
        if (this.f29736c.position() == position) {
            z = true;
        } else {
            z = false;
        }
        C5916a.m27410b(z);
    }

    static {
        Map c0305a = new C0305a();
        f29734a = c0305a;
        c0305a.put("boolean[]", Integer.valueOf(4));
        f29734a.put("char[]", Integer.valueOf(5));
        f29734a.put("float[]", Integer.valueOf(6));
        f29734a.put("double[]", Integer.valueOf(7));
        f29734a.put("byte[]", Integer.valueOf(8));
        f29734a.put("short[]", Integer.valueOf(9));
        f29734a.put("int[]", Integer.valueOf(10));
        f29734a.put("long[]", Integer.valueOf(11));
    }
}
