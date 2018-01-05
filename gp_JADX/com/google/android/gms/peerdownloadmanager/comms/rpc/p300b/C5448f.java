package com.google.android.gms.peerdownloadmanager.comms.rpc.p300b;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ad;
import com.google.protobuf.ah;
import com.google.protobuf.at;
import com.google.protobuf.av;
import com.google.protobuf.ay;
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

public final class C5448f extends at implements ch {
    public static final C5448f f28151d;
    public static volatile cs f28152e;
    public String f28153a = "";
    public String f28154b = "";
    public int f28155c;

    private C5448f() {
    }

    public final void m26308a(CodedOutputStream codedOutputStream) {
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
        if (!this.f28153a.isEmpty()) {
            codedOutputStream.a(1, this.f28153a);
        }
        if (!this.f28154b.isEmpty()) {
            codedOutputStream.a(2, this.f28154b);
        }
        if (this.f28155c != 0) {
            codedOutputStream.b(3, this.f28155c);
        }
        this.h.a(codedOutputStream);
    }

    public final int m26306a() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        if (g) {
            this.i = cu.a.a(this).b(this);
            return this.i;
        }
        i = 0;
        if (!this.f28153a.isEmpty()) {
            i = CodedOutputStream.b(1, this.f28153a) + 0;
        }
        if (!this.f28154b.isEmpty()) {
            i += CodedOutputStream.b(2, this.f28154b);
        }
        if (this.f28155c != 0) {
            i += CodedOutputStream.f(3, this.f28155c);
        }
        i += this.h.a();
        this.i = i;
        return i;
    }

    protected final Object m26307a(ay ayVar, Object obj, Object obj2) {
        switch (ayVar.ordinal()) {
            case 0:
                return f28151d;
            case 1:
                return Byte.valueOf((byte) 1);
            case 2:
            case 4:
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
                            switch (a) {
                                case 0:
                                    b = (byte) 1;
                                    break;
                                case 10:
                                    this.f28153a = sVar.k();
                                    break;
                                case 18:
                                    this.f28154b = sVar.k();
                                    break;
                                case 24:
                                    this.f28155c = sVar.f();
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
                    return f28151d;
                } catch (InvalidProtocolBufferException e) {
                    throw e;
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2);
                } catch (Throwable e3) {
                    throw new RuntimeException(e3);
                } catch (IOException e22) {
                    throw new RuntimeException(new InvalidProtocolBufferException(e22.getMessage()));
                }
            case 5:
                return new C5448f();
            case 6:
                return new C5449g();
            case 7:
                break;
            case 8:
                if (f28152e == null) {
                    synchronized (C5448f.class) {
                        if (f28152e == null) {
                            f28152e = new av(f28151d);
                        }
                    }
                }
                return f28152e;
            default:
                throw new UnsupportedOperationException();
        }
        return f28151d;
    }

    protected final Object m26309b() {
        Object[] objArr = new Object[]{"a", "b", "c"};
        return new cw(f28151d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", objArr);
    }

    static {
        at c5448f = new C5448f();
        f28151d = c5448f;
        c5448f.a(ay.e, null, null);
        c5448f.h.f = false;
        C5448f c5448f2 = f28151d;
        at.j.put(C5448f.class, c5448f2);
    }
}
