package com.google.android.gms.internal;

import java.io.IOException;

public final class qb extends uu implements vm {
    public static final qb f27348d;
    public static volatile vo f27349e;
    public int f27350a;
    public int f27351b;
    public ud f27352c = ud.f27511a;

    private qb() {
    }

    public final po m25398a() {
        po a = po.m25376a(this.f27350a);
        return a == null ? po.UNRECOGNIZED : a;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (qd.f27353a[i - 1]) {
            case 1:
                return new qb();
            case 2:
                return f27348d;
            case 3:
                return null;
            case 4:
                return new qc();
            case 5:
                vc vcVar = (vc) obj;
                qb qbVar = (qb) obj2;
                this.f27350a = vcVar.mo4929a(this.f27350a != 0, this.f27350a, qbVar.f27350a != 0, qbVar.f27350a);
                this.f27351b = vcVar.mo4929a(this.f27351b != 0, this.f27351b, qbVar.f27351b != 0, qbVar.f27351b);
                boolean z3 = this.f27352c != ud.f27511a;
                ud udVar = this.f27352c;
                if (qbVar.f27352c == ud.f27511a) {
                    z2 = false;
                }
                this.f27352c = vcVar.mo4930a(z3, udVar, z2, qbVar.f27352c);
                return this;
            case 6:
                um umVar = (um) obj;
                while (!z) {
                    try {
                        int a = umVar.mo4901a();
                        switch (a) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.f27350a = umVar.mo4910e();
                                break;
                            case 16:
                                this.f27351b = umVar.mo4910e();
                                break;
                            case 90:
                                this.f27352c = umVar.mo4908d();
                                break;
                            default:
                                if (!umVar.mo4905b(a)) {
                                    z = true;
                                    break;
                                }
                                break;
                        }
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        throw new RuntimeException(new zzfxb(e2.getMessage()));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f27349e == null) {
                    synchronized (qb.class) {
                        if (f27349e == null) {
                            f27349e = new uw();
                        }
                    }
                }
                return f27349e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27348d;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27350a != po.UNKNOWN_CURVE.m25377a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27350a);
        }
        if (this.f27351b != pq.UNKNOWN_HASH.m25379a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(2, this.f27351b);
        }
        if (!this.f27352c.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(11, this.f27352c);
        }
    }

    public final pq m25401b() {
        pq a = pq.m25378a(this.f27351b);
        return a == null ? pq.UNRECOGNIZED : a;
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27350a != po.UNKNOWN_CURVE.m25377a()) {
                i = zzfwg.m25724d(1, this.f27350a) + 0;
            }
            if (this.f27351b != pq.UNKNOWN_HASH.m25379a()) {
                i += zzfwg.m25724d(2, this.f27351b);
            }
            if (!this.f27352c.m25663b()) {
                i += zzfwg.m25718b(11, this.f27352c);
            }
            this.i = i;
        }
        return i;
    }

    static {
        uu qbVar = new qb();
        f27348d = qbVar;
        qbVar.mo4849a(vb.f27554d, null, null);
    }
}
