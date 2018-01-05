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

public final class C5444b extends at implements ch {
    public static final C5444b f28143c;
    public static volatile cs f28144d;
    public String f28145a = "";
    public String f28146b = "";

    private C5444b() {
    }

    public final void m26300a(CodedOutputStream codedOutputStream) {
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
        if (!this.f28145a.isEmpty()) {
            codedOutputStream.a(1, this.f28145a);
        }
        if (!this.f28146b.isEmpty()) {
            codedOutputStream.a(2, this.f28146b);
        }
        this.h.a(codedOutputStream);
    }

    public final int m26298a() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        if (g) {
            this.i = cu.a.a(this).b(this);
            return this.i;
        }
        i = 0;
        if (!this.f28145a.isEmpty()) {
            i = CodedOutputStream.b(1, this.f28145a) + 0;
        }
        if (!this.f28146b.isEmpty()) {
            i += CodedOutputStream.b(2, this.f28146b);
        }
        i += this.h.a();
        this.i = i;
        return i;
    }

    protected final Object m26299a(ay ayVar, Object obj, Object obj2) {
        switch (ayVar.ordinal()) {
            case 0:
                return f28143c;
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
                                    this.f28145a = sVar.k();
                                    break;
                                case 18:
                                    this.f28146b = sVar.k();
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
                    return f28143c;
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
                return new C5444b();
            case 6:
                return new C5445c();
            case 7:
                break;
            case 8:
                if (f28144d == null) {
                    synchronized (C5444b.class) {
                        if (f28144d == null) {
                            f28144d = new av(f28143c);
                        }
                    }
                }
                return f28144d;
            default:
                throw new UnsupportedOperationException();
        }
        return f28143c;
    }

    protected final Object m26301b() {
        Object[] objArr = new Object[]{"a", "b"};
        return new cw(f28143c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", objArr);
    }

    static {
        at c5444b = new C5444b();
        f28143c = c5444b;
        c5444b.a(ay.e, null, null);
        c5444b.h.f = false;
        C5444b c5444b2 = f28143c;
        at.j.put(C5444b.class, c5444b2);
    }
}
