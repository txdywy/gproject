package com.google.android.gms.peerdownloadmanager.comms.rpc.p300b;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ad;
import com.google.protobuf.ah;
import com.google.protobuf.at;
import com.google.protobuf.au;
import com.google.protobuf.av;
import com.google.protobuf.ay;
import com.google.protobuf.bh;
import com.google.protobuf.cf;
import com.google.protobuf.ch;
import com.google.protobuf.cs;
import com.google.protobuf.cu;
import com.google.protobuf.cv;
import com.google.protobuf.cw;
import com.google.protobuf.cz;
import com.google.protobuf.de;
import com.google.protobuf.dv;
import com.google.protobuf.eq;
import com.google.protobuf.s;
import com.google.protobuf.w;
import java.io.IOException;

public final class C5452j extends at implements ch {
    public static final C5452j f28161d;
    public static volatile cs f28162e;
    public int f28163a;
    public bh f28164b = cv.b;
    public C5454l f28165c;

    private C5452j() {
    }

    public final void m26316a(CodedOutputStream codedOutputStream) {
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
        for (int i = 0; i < this.f28164b.size(); i++) {
            codedOutputStream.a(1, (cf) this.f28164b.get(i));
        }
        if (this.f28165c != null) {
            cf cfVar;
            if (this.f28165c == null) {
                cfVar = C5454l.f28167d;
            } else {
                cfVar = this.f28165c;
            }
            codedOutputStream.a(2, cfVar);
        }
        this.h.a(codedOutputStream);
    }

    public final int m26314a() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        if (g) {
            this.i = cu.a.a(this).b(this);
            return this.i;
        }
        int i2 = 0;
        for (i = 0; i < this.f28164b.size(); i++) {
            i2 += CodedOutputStream.c(1, (cf) this.f28164b.get(i));
        }
        if (this.f28165c != null) {
            cf cfVar;
            if (this.f28165c == null) {
                cfVar = C5454l.f28167d;
            } else {
                cfVar = this.f28165c;
            }
            i2 += CodedOutputStream.c(2, cfVar);
        }
        int a = this.h.a() + i2;
        this.i = a;
        return a;
    }

    protected final Object m26315a(ay ayVar, Object obj, Object obj2) {
        switch (ayVar.ordinal()) {
            case 0:
                return f28161d;
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
                            switch (a) {
                                case 0:
                                    b = (byte) 1;
                                    break;
                                case 10:
                                    if (!this.f28164b.a()) {
                                        bh bhVar = this.f28164b;
                                        a = bhVar.size();
                                        this.f28164b = bhVar.a(a == 0 ? 10 : a * 2);
                                    }
                                    this.f28164b.add((C5450h) sVar.a(C5450h.f28156d, ahVar));
                                    break;
                                case 18:
                                    au auVar;
                                    if (this.f28165c != null) {
                                        at atVar = this.f28165c;
                                        au auVar2 = (au) atVar.a(ay.g, null, null);
                                        auVar2.a(atVar);
                                        auVar = (C5456n) auVar2;
                                    } else {
                                        auVar = null;
                                    }
                                    this.f28165c = (C5454l) sVar.a(C5454l.f28167d, ahVar);
                                    if (auVar == null) {
                                        break;
                                    }
                                    at atVar2;
                                    auVar.a(this.f28165c);
                                    if (auVar.c) {
                                        atVar2 = auVar.b;
                                    } else {
                                        atVar2 = auVar.b;
                                        atVar2.a(ay.e, null, null);
                                        atVar2.h.f = false;
                                        auVar.c = true;
                                        atVar2 = auVar.b;
                                    }
                                    this.f28165c = (C5454l) atVar2;
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
                    return f28161d;
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
                this.f28164b.b();
                return null;
            case 5:
                return new C5452j();
            case 6:
                return new C5453k();
            case 7:
                break;
            case 8:
                if (f28162e == null) {
                    synchronized (C5452j.class) {
                        if (f28162e == null) {
                            f28162e = new av(f28161d);
                        }
                    }
                }
                return f28162e;
            default:
                throw new UnsupportedOperationException();
        }
        return f28161d;
    }

    protected final Object m26317b() {
        Object[] objArr = new Object[]{"a", "b", C5450h.class, "c"};
        return new cw(f28161d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", objArr);
    }

    static {
        at c5452j = new C5452j();
        f28161d = c5452j;
        c5452j.a(ay.e, null, null);
        c5452j.h.f = false;
        C5452j c5452j2 = f28161d;
        at.j.put(C5452j.class, c5452j2);
    }
}
