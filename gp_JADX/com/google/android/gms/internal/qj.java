package com.google.android.gms.internal;

import java.io.IOException;

public final class qj extends uu implements vm {
    public static final qj f27363c;
    public static volatile vo f27364d;
    public int f27365a;
    public int f27366b;

    private qj() {
    }

    public final pq m25416a() {
        pq a = pq.m25378a(this.f27365a);
        return a == null ? pq.UNRECOGNIZED : a;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (ql.f27367a[i - 1]) {
            case 1:
                return new qj();
            case 2:
                return f27363c;
            case 3:
                return null;
            case 4:
                return new qk();
            case 5:
                vc vcVar = (vc) obj;
                qj qjVar = (qj) obj2;
                this.f27365a = vcVar.mo4929a(this.f27365a != 0, this.f27365a, qjVar.f27365a != 0, qjVar.f27365a);
                boolean z3 = this.f27366b != 0;
                int i2 = this.f27366b;
                if (qjVar.f27366b == 0) {
                    z2 = false;
                }
                this.f27366b = vcVar.mo4929a(z3, i2, z2, qjVar.f27366b);
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
                                this.f27365a = umVar.mo4910e();
                                break;
                            case 16:
                                this.f27366b = umVar.mo4904b();
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
                if (f27364d == null) {
                    synchronized (qj.class) {
                        if (f27364d == null) {
                            f27364d = new uw();
                        }
                    }
                }
                return f27364d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27363c;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27365a != pq.UNKNOWN_HASH.m25379a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27365a);
        }
        if (this.f27366b != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(2, this.f27366b);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27365a != pq.UNKNOWN_HASH.m25379a()) {
                i = zzfwg.m25724d(1, this.f27365a) + 0;
            }
            if (this.f27366b != 0) {
                i += zzfwg.m25721c(2, this.f27366b);
            }
            this.i = i;
        }
        return i;
    }

    static {
        uu qjVar = new qj();
        f27363c = qjVar;
        qjVar.mo4849a(vb.f27554d, null, null);
    }
}
