package com.google.android.gms.internal;

import java.io.IOException;

public final class pz extends uu implements vm {
    public static final pz f27340e;
    public static volatile vo f27341f;
    public int f27342a;
    public px f27343b;
    public ud f27344c = ud.f27511a;
    public ud f27345d = ud.f27511a;

    private pz() {
    }

    public final px m25390a() {
        if (this.f27343b == null) {
            return px.f27335d;
        }
        return this.f27343b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27342a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27342a);
        }
        if (this.f27343b != null) {
            vk vkVar;
            if (this.f27343b == null) {
                vkVar = px.f27335d;
            } else {
                vkVar = this.f27343b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
        if (!this.f27344c.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(3, this.f27344c);
        }
        if (!this.f27345d.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(4, this.f27345d);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27342a != 0) {
                i = zzfwg.m25721c(1, this.f27342a) + 0;
            }
            if (this.f27343b != null) {
                vk vkVar;
                if (this.f27343b == null) {
                    vkVar = px.f27335d;
                } else {
                    vkVar = this.f27343b;
                }
                i += zzfwg.m25719b(2, vkVar);
            }
            if (!this.f27344c.m25663b()) {
                i += zzfwg.m25718b(3, this.f27344c);
            }
            if (!this.f27345d.m25663b()) {
                i += zzfwg.m25718b(4, this.f27345d);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (qd.f27353a[i - 1]) {
            case 1:
                return new pz();
            case 2:
                return f27340e;
            case 3:
                return null;
            case 4:
                return new qa();
            case 5:
                vc vcVar = (vc) obj;
                pz pzVar = (pz) obj2;
                this.f27342a = vcVar.mo4929a(this.f27342a != 0, this.f27342a, pzVar.f27342a != 0, pzVar.f27342a);
                this.f27343b = (px) vcVar.mo4932a(this.f27343b, pzVar.f27343b);
                this.f27344c = vcVar.mo4930a(this.f27344c != ud.f27511a, this.f27344c, pzVar.f27344c != ud.f27511a, pzVar.f27344c);
                boolean z2 = this.f27345d != ud.f27511a;
                ud udVar = this.f27345d;
                if (pzVar.f27345d == ud.f27511a) {
                    z = false;
                }
                this.f27345d = vcVar.mo4930a(z2, udVar, z, pzVar.f27345d);
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
                                this.f27342a = umVar.mo4904b();
                                break;
                            case 18:
                                uv uvVar;
                                if (this.f27343b != null) {
                                    uu uuVar = this.f27343b;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (py) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27343b = (px) umVar.mo4902a(px.f27335d, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27343b);
                                this.f27343b = (px) uvVar.m25316c();
                                break;
                            case 26:
                                this.f27344c = umVar.mo4908d();
                                break;
                            case 34:
                                this.f27345d = umVar.mo4908d();
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
                if (f27341f == null) {
                    synchronized (pz.class) {
                        if (f27341f == null) {
                            f27341f = new uw();
                        }
                    }
                }
                return f27341f;
            default:
                throw new UnsupportedOperationException();
        }
        return f27340e;
    }

    static {
        uu pzVar = new pz();
        f27340e = pzVar;
        pzVar.mo4849a(vb.f27554d, null, null);
    }
}
