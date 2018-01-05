package com.google.android.gms.internal;

import java.io.IOException;

public final class qh extends uu implements vm {
    public static final qh f27359c;
    public static volatile vo f27360d;
    public qj f27361a;
    public int f27362b;

    private qh() {
    }

    public final qj m25412a() {
        if (this.f27361a == null) {
            return qj.f27363c;
        }
        return this.f27361a;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27361a != null) {
            vk vkVar;
            if (this.f27361a == null) {
                vkVar = qj.f27363c;
            } else {
                vkVar = this.f27361a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
        if (this.f27362b != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(2, this.f27362b);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27361a != null) {
                vk vkVar;
                if (this.f27361a == null) {
                    vkVar = qj.f27363c;
                } else {
                    vkVar = this.f27361a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            if (this.f27362b != 0) {
                i += zzfwg.m25721c(2, this.f27362b);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (ql.f27367a[i - 1]) {
            case 1:
                return new qh();
            case 2:
                return f27359c;
            case 3:
                return null;
            case 4:
                return new qi();
            case 5:
                vc vcVar = (vc) obj;
                qh qhVar = (qh) obj2;
                this.f27361a = (qj) vcVar.mo4932a(this.f27361a, qhVar.f27361a);
                boolean z2 = this.f27362b != 0;
                int i2 = this.f27362b;
                if (qhVar.f27362b == 0) {
                    z = false;
                }
                this.f27362b = vcVar.mo4929a(z2, i2, z, qhVar.f27362b);
                return this;
            case 6:
                um umVar = (um) obj;
                uq uqVar = (uq) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int a = umVar.mo4901a();
                        switch (a) {
                            case 0:
                                z3 = true;
                                break;
                            case 10:
                                uv uvVar;
                                if (this.f27361a != null) {
                                    uu uuVar = this.f27361a;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (qk) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27361a = (qj) umVar.mo4902a(qj.f27363c, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27361a);
                                this.f27361a = (qj) uvVar.m25316c();
                                break;
                            case 16:
                                this.f27362b = umVar.mo4904b();
                                break;
                            default:
                                if (!umVar.mo4905b(a)) {
                                    z3 = true;
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
                if (f27360d == null) {
                    synchronized (qh.class) {
                        if (f27360d == null) {
                            f27360d = new uw();
                        }
                    }
                }
                return f27360d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27359c;
    }

    static {
        uu qhVar = new qh();
        f27359c = qhVar;
        qhVar.mo4849a(vb.f27554d, null, null);
    }
}
