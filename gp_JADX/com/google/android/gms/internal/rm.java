package com.google.android.gms.internal;

import java.io.IOException;

public final class rm extends uu implements vm {
    public static final rm f27417d;
    public static volatile vo f27418e;
    public int f27419a;
    public int f27420b;
    public vf f27421c = vp.f27566b;

    private rm() {
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27420b != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27420b);
        }
        for (int i = 0; i < this.f27421c.size(); i++) {
            com_google_android_gms_internal_zzfwg.mo4919a(2, (vk) this.f27421c.get(i));
        }
    }

    public final int mo4851c() {
        int i = 0;
        int i2 = this.i;
        if (i2 == -1) {
            i2 = this.f27420b != 0 ? zzfwg.m25721c(1, this.f27420b) + 0 : 0;
            while (i < this.f27421c.size()) {
                i++;
                i2 = zzfwg.m25719b(2, (vk) this.f27421c.get(i)) + i2;
            }
            this.i = i2;
        }
        return i2;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (rq.f27428a[i - 1]) {
            case 1:
                return new rm();
            case 2:
                return f27417d;
            case 3:
                this.f27421c.mo4889b();
                return null;
            case 4:
                return new rn();
            case 5:
                vc vcVar = (vc) obj;
                rm rmVar = (rm) obj2;
                boolean z3 = this.f27420b != 0;
                int i2 = this.f27420b;
                if (rmVar.f27420b == 0) {
                    z2 = false;
                }
                this.f27420b = vcVar.mo4929a(z3, i2, z2, rmVar.f27420b);
                this.f27421c = vcVar.mo4931a(this.f27421c, rmVar.f27421c);
                if (vcVar != va.f27550a) {
                    return this;
                }
                this.f27419a |= rmVar.f27419a;
                return this;
            case 6:
                um umVar = (um) obj;
                uq uqVar = (uq) obj2;
                while (!z) {
                    try {
                        int a = umVar.mo4901a();
                        switch (a) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.f27420b = umVar.mo4904b();
                                break;
                            case 18:
                                if (!this.f27421c.mo4888a()) {
                                    vf vfVar = this.f27421c;
                                    a = vfVar.size();
                                    this.f27421c = vfVar.mo4937a(a == 0 ? 10 : a << 1);
                                }
                                this.f27421c.add((ro) umVar.mo4902a(ro.f27422e, uqVar));
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
                if (f27418e == null) {
                    synchronized (rm.class) {
                        if (f27418e == null) {
                            f27418e = new uw();
                        }
                    }
                }
                return f27418e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27417d;
    }

    static /* synthetic */ void m25472a(rm rmVar, ro roVar) {
        if (roVar == null) {
            throw new NullPointerException();
        }
        if (!rmVar.f27421c.mo4888a()) {
            vf vfVar = rmVar.f27421c;
            int size = vfVar.size();
            rmVar.f27421c = vfVar.mo4937a(size == 0 ? 10 : size << 1);
        }
        rmVar.f27421c.add(roVar);
    }

    static {
        uu rmVar = new rm();
        f27417d = rmVar;
        rmVar.mo4849a(vb.f27554d, null, null);
    }
}
