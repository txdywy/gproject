package com.google.android.gms.internal;

import java.io.IOException;

public final class ri extends uu implements vm {
    public static final ri f27406d;
    public static volatile vo f27407e;
    public int f27408a;
    public int f27409b;
    public vf f27410c = vp.f27566b;

    private ri() {
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27409b != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27409b);
        }
        for (int i = 0; i < this.f27410c.size(); i++) {
            com_google_android_gms_internal_zzfwg.mo4919a(2, (vk) this.f27410c.get(i));
        }
    }

    public final int mo4851c() {
        int i = 0;
        int i2 = this.i;
        if (i2 == -1) {
            i2 = this.f27409b != 0 ? zzfwg.m25721c(1, this.f27409b) + 0 : 0;
            while (i < this.f27410c.size()) {
                i++;
                i2 = zzfwg.m25719b(2, (vk) this.f27410c.get(i)) + i2;
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
                return new ri();
            case 2:
                return f27406d;
            case 3:
                this.f27410c.mo4889b();
                return null;
            case 4:
                return new rj();
            case 5:
                vc vcVar = (vc) obj;
                ri riVar = (ri) obj2;
                boolean z3 = this.f27409b != 0;
                int i2 = this.f27409b;
                if (riVar.f27409b == 0) {
                    z2 = false;
                }
                this.f27409b = vcVar.mo4929a(z3, i2, z2, riVar.f27409b);
                this.f27410c = vcVar.mo4931a(this.f27410c, riVar.f27410c);
                if (vcVar != va.f27550a) {
                    return this;
                }
                this.f27408a |= riVar.f27408a;
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
                                this.f27409b = umVar.mo4904b();
                                break;
                            case 18:
                                if (!this.f27410c.mo4888a()) {
                                    vf vfVar = this.f27410c;
                                    a = vfVar.size();
                                    this.f27410c = vfVar.mo4937a(a == 0 ? 10 : a << 1);
                                }
                                this.f27410c.add((rk) umVar.mo4902a(rk.f27411e, uqVar));
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
                if (f27407e == null) {
                    synchronized (ri.class) {
                        if (f27407e == null) {
                            f27407e = new uw();
                        }
                    }
                }
                return f27407e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27406d;
    }

    static {
        uu riVar = new ri();
        f27406d = riVar;
        riVar.mo4849a(vb.f27554d, null, null);
    }
}
