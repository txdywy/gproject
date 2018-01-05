package com.google.android.gms.internal;

import java.io.IOException;

public final class ph extends uu implements vm {
    public static final ph f27301c;
    public static volatile vo f27302d;
    public pj f27303a;
    public int f27304b;

    private ph() {
    }

    public static ph m25367a(ud udVar) {
        return (ph) uu.m25289a(f27301c, udVar);
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27303a != null) {
            vk vkVar;
            if (this.f27303a == null) {
                vkVar = pj.f27305a;
            } else {
                vkVar = this.f27303a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
        if (this.f27304b != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(2, this.f27304b);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27303a != null) {
                vk vkVar;
                if (this.f27303a == null) {
                    vkVar = pj.f27305a;
                } else {
                    vkVar = this.f27303a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            if (this.f27304b != 0) {
                i += zzfwg.m25721c(2, this.f27304b);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (pl.f27307a[i - 1]) {
            case 1:
                return new ph();
            case 2:
                return f27301c;
            case 3:
                return null;
            case 4:
                return new pi();
            case 5:
                vc vcVar = (vc) obj;
                ph phVar = (ph) obj2;
                this.f27303a = (pj) vcVar.mo4932a(this.f27303a, phVar.f27303a);
                boolean z2 = this.f27304b != 0;
                int i2 = this.f27304b;
                if (phVar.f27304b == 0) {
                    z = false;
                }
                this.f27304b = vcVar.mo4929a(z2, i2, z, phVar.f27304b);
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
                                if (this.f27303a != null) {
                                    uu uuVar = this.f27303a;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (pk) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27303a = (pj) umVar.mo4902a(pj.f27305a, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27303a);
                                this.f27303a = (pj) uvVar.m25316c();
                                break;
                            case 16:
                                this.f27304b = umVar.mo4904b();
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
                if (f27302d == null) {
                    synchronized (ph.class) {
                        if (f27302d == null) {
                            f27302d = new uw();
                        }
                    }
                }
                return f27302d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27301c;
    }

    static {
        uu phVar = new ph();
        f27301c = phVar;
        phVar.mo4849a(vb.f27554d, null, null);
    }
}
