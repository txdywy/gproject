package com.google.android.gms.peerdownloadmanager.comms.rpc.p300b;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ad;
import com.google.protobuf.ah;
import com.google.protobuf.at;
import com.google.protobuf.av;
import com.google.protobuf.ay;
import com.google.protobuf.ba;
import com.google.protobuf.be;
import com.google.protobuf.bf;
import com.google.protobuf.bg;
import com.google.protobuf.ch;
import com.google.protobuf.cs;
import com.google.protobuf.cu;
import com.google.protobuf.cw;
import com.google.protobuf.cz;
import com.google.protobuf.de;
import com.google.protobuf.dv;
import com.google.protobuf.eq;
import com.google.protobuf.s;
import com.google.protobuf.w;
import java.io.IOException;

public final class C5454l extends at implements ch {
    public static final bg f28166b = new C5455m();
    public static final C5454l f28167d;
    public static volatile cs f28168e;
    public be f28169a = ba.b;
    public int f28170c;

    private C5454l() {
    }

    public final void m26320a(CodedOutputStream codedOutputStream) {
        if (g) {
            eq eqVar;
            de a = cu.a.a(getClass());
            if (codedOutputStream.c != null) {
                eqVar = codedOutputStream.c;
            } else {
                eqVar = new ad(codedOutputStream);
            }
            a.a(this, eqVar);
            return;
        }
        a();
        if (new bf(this.f28169a, f28166b).size() > 0) {
            codedOutputStream.c(10);
            codedOutputStream.c(this.f28170c);
        }
        for (int i = 0; i < this.f28169a.size(); i++) {
            codedOutputStream.b(this.f28169a.c(i));
        }
        this.h.a(codedOutputStream);
    }

    public final int m26318a() {
        int i = 0;
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        if (g) {
            this.i = cu.a.a(this).b(this);
            return this.i;
        }
        i2 = 0;
        while (i < this.f28169a.size()) {
            i2 += CodedOutputStream.q(this.f28169a.c(i));
            i++;
        }
        i = i2 + 0;
        if (!new bf(this.f28169a, f28166b).isEmpty()) {
            i = (i + 1) + CodedOutputStream.o(i2);
        }
        this.f28170c = i2;
        i += this.h.a();
        this.i = i;
        return i;
    }

    protected final Object m26319a(ay ayVar, Object obj, Object obj2) {
        switch (ayVar.ordinal()) {
            case 0:
                return f28167d;
            case 1:
                return Byte.valueOf((byte) 1);
            case 2:
                return null;
            case 3:
                s sVar = (s) obj;
                ah ahVar = (ah) obj2;
                if (ahVar == null) {
                    throw new NullPointerException();
                }
                try {
                    if (!g) {
                        byte b = (byte) 0;
                        while (b == (byte) 0) {
                            int a = sVar.a();
                            be beVar;
                            switch (a) {
                                case 0:
                                    b = (byte) 1;
                                    break;
                                case 8:
                                    if (!this.f28169a.a()) {
                                        beVar = this.f28169a;
                                        a = beVar.size();
                                        this.f28169a = beVar.b(a == 0 ? 10 : a * 2);
                                    }
                                    this.f28169a.d(sVar.n());
                                    break;
                                case 10:
                                    if (!this.f28169a.a()) {
                                        beVar = this.f28169a;
                                        a = beVar.size();
                                        this.f28169a = beVar.b(a == 0 ? 10 : a * 2);
                                    }
                                    a = sVar.c(sVar.s());
                                    while (sVar.u() > 0) {
                                        this.f28169a.d(sVar.n());
                                    }
                                    sVar.d(a);
                                    break;
                                default:
                                    boolean z;
                                    if ((a & 7) == 4) {
                                        z = false;
                                    } else {
                                        if (this.h == dv.a) {
                                            this.h = new dv();
                                        }
                                        z = this.h.a(a, sVar);
                                    }
                                    if (!z) {
                                        b = (byte) 1;
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    }
                    cz czVar;
                    de a2 = cu.a.a(getClass());
                    if (sVar.d != null) {
                        czVar = sVar.d;
                    } else {
                        czVar = new w(sVar);
                    }
                    a2.a(this, czVar, ahVar);
                    return f28167d;
                } catch (InvalidProtocolBufferException e) {
                    throw e;
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2);
                } catch (Throwable e3) {
                    throw new RuntimeException(e3);
                } catch (IOException e22) {
                    throw new RuntimeException(new InvalidProtocolBufferException(e22.getMessage()));
                }
            case 4:
                this.f28169a.b();
                return null;
            case 5:
                return new C5454l();
            case 6:
                return new C5456n();
            case 7:
                break;
            case 8:
                if (f28168e == null) {
                    synchronized (C5454l.class) {
                        if (f28168e == null) {
                            f28168e = new av(f28167d);
                        }
                    }
                }
                return f28168e;
            default:
                throw new UnsupportedOperationException();
        }
        return f28167d;
    }

    protected final Object m26321b() {
        Object[] objArr = new Object[]{"a"};
        return new cw(f28167d, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001,", objArr);
    }

    static {
        at c5454l = new C5454l();
        f28167d = c5454l;
        c5454l.a(ay.e, null, null);
        c5454l.h.f = false;
        C5454l c5454l2 = f28167d;
        at.j.put(C5454l.class, c5454l2);
    }
}
