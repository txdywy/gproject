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

public final class C5450h extends at implements ch {
    public static final C5450h f28156d;
    public static volatile cs f28157e;
    public int f28158a;
    public bh f28159b = cv.b;
    public C5444b f28160c;

    private C5450h() {
    }

    public final void m26312a(CodedOutputStream codedOutputStream) {
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
        for (int i = 0; i < this.f28159b.size(); i++) {
            codedOutputStream.a(1, (String) this.f28159b.get(i));
        }
        if (this.f28160c != null) {
            cf cfVar;
            if (this.f28160c == null) {
                cfVar = C5444b.f28143c;
            } else {
                cfVar = this.f28160c;
            }
            codedOutputStream.a(2, cfVar);
        }
        this.h.a(codedOutputStream);
    }

    public final int m26310a() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        if (g) {
            this.i = cu.a.a(this).b(this);
            return this.i;
        }
        int c;
        int i2 = 0;
        for (i = 0; i < this.f28159b.size(); i++) {
            i2 += CodedOutputStream.b((String) this.f28159b.get(i));
        }
        i = (this.f28159b.size() * 1) + (i2 + 0);
        if (this.f28160c != null) {
            cf cfVar;
            if (this.f28160c == null) {
                cfVar = C5444b.f28143c;
            } else {
                cfVar = this.f28160c;
            }
            c = CodedOutputStream.c(2, cfVar) + i;
        } else {
            c = i;
        }
        c += this.h.a();
        this.i = c;
        return c;
    }

    protected final Object m26311a(ay ayVar, Object obj, Object obj2) {
        switch (ayVar.ordinal()) {
            case 0:
                return f28156d;
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
                                    String k = sVar.k();
                                    if (!this.f28159b.a()) {
                                        bh bhVar = this.f28159b;
                                        a = bhVar.size();
                                        this.f28159b = bhVar.a(a == 0 ? 10 : a * 2);
                                    }
                                    this.f28159b.add(k);
                                    break;
                                case 18:
                                    au auVar;
                                    if (this.f28160c != null) {
                                        at atVar = this.f28160c;
                                        au auVar2 = (au) atVar.a(ay.g, null, null);
                                        auVar2.a(atVar);
                                        auVar = (C5445c) auVar2;
                                    } else {
                                        auVar = null;
                                    }
                                    this.f28160c = (C5444b) sVar.a(C5444b.f28143c, ahVar);
                                    if (auVar == null) {
                                        break;
                                    }
                                    at atVar2;
                                    auVar.a(this.f28160c);
                                    if (auVar.c) {
                                        atVar2 = auVar.b;
                                    } else {
                                        atVar2 = auVar.b;
                                        atVar2.a(ay.e, null, null);
                                        atVar2.h.f = false;
                                        auVar.c = true;
                                        atVar2 = auVar.b;
                                    }
                                    this.f28160c = (C5444b) atVar2;
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
                    return f28156d;
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
                this.f28159b.b();
                return null;
            case 5:
                return new C5450h();
            case 6:
                return new C5451i();
            case 7:
                break;
            case 8:
                if (f28157e == null) {
                    synchronized (C5450h.class) {
                        if (f28157e == null) {
                            f28157e = new av(f28156d);
                        }
                    }
                }
                return f28157e;
            default:
                throw new UnsupportedOperationException();
        }
        return f28156d;
    }

    protected final Object m26313b() {
        Object[] objArr = new Object[]{"a", "b", "c"};
        return new cw(f28156d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0000\u0001\u0000\u0001Ț\u0002\t", objArr);
    }

    static {
        at c5450h = new C5450h();
        f28156d = c5450h;
        c5450h.a(ay.e, null, null);
        c5450h.h.f = false;
        C5450h c5450h2 = f28156d;
        at.j.put(C5450h.class, c5450h2);
    }
}
