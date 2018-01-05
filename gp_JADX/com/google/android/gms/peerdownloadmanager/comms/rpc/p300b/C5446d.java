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

public final class C5446d extends at implements ch {
    public static final C5446d f28147c;
    public static volatile cs f28148d;
    public String f28149a = "";
    public int f28150b;

    private C5446d() {
    }

    public final void m26304a(CodedOutputStream codedOutputStream) {
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
        if (!this.f28149a.isEmpty()) {
            codedOutputStream.a(1, this.f28149a);
        }
        if (this.f28150b != 0) {
            codedOutputStream.b(2, this.f28150b);
        }
        this.h.a(codedOutputStream);
    }

    public final int m26302a() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        if (g) {
            this.i = cu.a.a(this).b(this);
            return this.i;
        }
        i = 0;
        if (!this.f28149a.isEmpty()) {
            i = CodedOutputStream.b(1, this.f28149a) + 0;
        }
        if (this.f28150b != 0) {
            i += CodedOutputStream.f(2, this.f28150b);
        }
        i += this.h.a();
        this.i = i;
        return i;
    }

    protected final Object m26303a(ay ayVar, Object obj, Object obj2) {
        switch (ayVar.ordinal()) {
            case 0:
                return f28147c;
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
                                    this.f28149a = sVar.k();
                                    break;
                                case 16:
                                    this.f28150b = sVar.f();
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
                    return f28147c;
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
                return new C5446d();
            case 6:
                return new C5447e();
            case 7:
                break;
            case 8:
                if (f28148d == null) {
                    synchronized (C5446d.class) {
                        if (f28148d == null) {
                            f28148d = new av(f28147c);
                        }
                    }
                }
                return f28148d;
            default:
                throw new UnsupportedOperationException();
        }
        return f28147c;
    }

    protected final Object m26305b() {
        Object[] objArr = new Object[]{"a", "b"};
        return new cw(f28147c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", objArr);
    }

    static {
        at c5446d = new C5446d();
        f28147c = c5446d;
        c5446d.a(ay.e, null, null);
        c5446d.h.f = false;
        C5446d c5446d2 = f28147c;
        at.j.put(C5446d.class, c5446d2);
    }
}
