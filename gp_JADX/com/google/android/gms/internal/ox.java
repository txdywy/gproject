package com.google.android.gms.internal;

import java.io.IOException;

public final class ox extends uu implements vm {
    public static final ox f27283d;
    public static volatile vo f27284e;
    public int f27285a;
    public pb f27286b;
    public ud f27287c = ud.f27511a;

    private ox() {
    }

    public final pb m25348a() {
        if (this.f27286b == null) {
            return pb.f27292b;
        }
        return this.f27286b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27285a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27285a);
        }
        if (this.f27286b != null) {
            vk vkVar;
            if (this.f27286b == null) {
                vkVar = pb.f27292b;
            } else {
                vkVar = this.f27286b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
        if (!this.f27287c.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(3, this.f27287c);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27285a != 0) {
                i = zzfwg.m25721c(1, this.f27285a) + 0;
            }
            if (this.f27286b != null) {
                vk vkVar;
                if (this.f27286b == null) {
                    vkVar = pb.f27292b;
                } else {
                    vkVar = this.f27286b;
                }
                i += zzfwg.m25719b(2, vkVar);
            }
            if (!this.f27287c.m25663b()) {
                i += zzfwg.m25718b(3, this.f27287c);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (pd.f27295a[i - 1]) {
            case 1:
                return new ox();
            case 2:
                return f27283d;
            case 3:
                return null;
            case 4:
                return new oy();
            case 5:
                vc vcVar = (vc) obj;
                ox oxVar = (ox) obj2;
                this.f27285a = vcVar.mo4929a(this.f27285a != 0, this.f27285a, oxVar.f27285a != 0, oxVar.f27285a);
                this.f27286b = (pb) vcVar.mo4932a(this.f27286b, oxVar.f27286b);
                boolean z2 = this.f27287c != ud.f27511a;
                ud udVar = this.f27287c;
                if (oxVar.f27287c == ud.f27511a) {
                    z = false;
                }
                this.f27287c = vcVar.mo4930a(z2, udVar, z, oxVar.f27287c);
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
                                this.f27285a = umVar.mo4904b();
                                break;
                            case 18:
                                uv uvVar;
                                if (this.f27286b != null) {
                                    uu uuVar = this.f27286b;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (pc) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27286b = (pb) umVar.mo4902a(pb.f27292b, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27286b);
                                this.f27286b = (pb) uvVar.m25316c();
                                break;
                            case 26:
                                this.f27287c = umVar.mo4908d();
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
                if (f27284e == null) {
                    synchronized (ox.class) {
                        if (f27284e == null) {
                            f27284e = new uw();
                        }
                    }
                }
                return f27284e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27283d;
    }

    static /* synthetic */ void m25346a(ox oxVar, pb pbVar) {
        if (pbVar == null) {
            throw new NullPointerException();
        }
        oxVar.f27286b = pbVar;
    }

    static /* synthetic */ void m25347a(ox oxVar, ud udVar) {
        if (udVar == null) {
            throw new NullPointerException();
        }
        oxVar.f27287c = udVar;
    }

    static {
        uu oxVar = new ox();
        f27283d = oxVar;
        oxVar.mo4849a(vb.f27554d, null, null);
    }
}
