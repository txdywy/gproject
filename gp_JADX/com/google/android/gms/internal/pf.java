package com.google.android.gms.internal;

import java.io.IOException;

public final class pf extends uu implements vm {
    public static final pf f27296d;
    public static volatile vo f27297e;
    public int f27298a;
    public pj f27299b;
    public ud f27300c = ud.f27511a;

    private pf() {
    }

    public static pg m25359a() {
        uu uuVar = f27296d;
        uv uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
        uvVar.m25314a(uuVar);
        return (pg) uvVar;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27298a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27298a);
        }
        if (this.f27299b != null) {
            vk vkVar;
            if (this.f27299b == null) {
                vkVar = pj.f27305a;
            } else {
                vkVar = this.f27299b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
        if (!this.f27300c.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(3, this.f27300c);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27298a != 0) {
                i = zzfwg.m25721c(1, this.f27298a) + 0;
            }
            if (this.f27299b != null) {
                vk vkVar;
                if (this.f27299b == null) {
                    vkVar = pj.f27305a;
                } else {
                    vkVar = this.f27299b;
                }
                i += zzfwg.m25719b(2, vkVar);
            }
            if (!this.f27300c.m25663b()) {
                i += zzfwg.m25718b(3, this.f27300c);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (pl.f27307a[i - 1]) {
            case 1:
                return new pf();
            case 2:
                return f27296d;
            case 3:
                return null;
            case 4:
                return new pg();
            case 5:
                vc vcVar = (vc) obj;
                pf pfVar = (pf) obj2;
                this.f27298a = vcVar.mo4929a(this.f27298a != 0, this.f27298a, pfVar.f27298a != 0, pfVar.f27298a);
                this.f27299b = (pj) vcVar.mo4932a(this.f27299b, pfVar.f27299b);
                boolean z2 = this.f27300c != ud.f27511a;
                ud udVar = this.f27300c;
                if (pfVar.f27300c == ud.f27511a) {
                    z = false;
                }
                this.f27300c = vcVar.mo4930a(z2, udVar, z, pfVar.f27300c);
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
                            case 8:
                                this.f27298a = umVar.mo4904b();
                                break;
                            case 18:
                                uv uvVar;
                                if (this.f27299b != null) {
                                    uu uuVar = this.f27299b;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (pk) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27299b = (pj) umVar.mo4902a(pj.f27305a, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27299b);
                                this.f27299b = (pj) uvVar.m25316c();
                                break;
                            case 26:
                                this.f27300c = umVar.mo4908d();
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
                if (f27297e == null) {
                    synchronized (pf.class) {
                        if (f27297e == null) {
                            f27297e = new uw();
                        }
                    }
                }
                return f27297e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27296d;
    }

    static /* synthetic */ void m25361a(pf pfVar, pj pjVar) {
        if (pjVar == null) {
            throw new NullPointerException();
        }
        pfVar.f27299b = pjVar;
    }

    static /* synthetic */ void m25362a(pf pfVar, ud udVar) {
        if (udVar == null) {
            throw new NullPointerException();
        }
        pfVar.f27300c = udVar;
    }

    static {
        uu pfVar = new pf();
        f27296d = pfVar;
        pfVar.mo4849a(vb.f27554d, null, null);
    }
}
