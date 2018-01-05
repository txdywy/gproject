package com.google.android.gms.internal;

import java.io.IOException;

public final class or extends uu implements vm {
    public static final or f27275c;
    public static volatile vo f27276d;
    public ot f27277a;
    public int f27278b;

    private or() {
    }

    public final ot m25338a() {
        if (this.f27277a == null) {
            return ot.f27279b;
        }
        return this.f27277a;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27277a != null) {
            vk vkVar;
            if (this.f27277a == null) {
                vkVar = ot.f27279b;
            } else {
                vkVar = this.f27277a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
        if (this.f27278b != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(2, this.f27278b);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27277a != null) {
                vk vkVar;
                if (this.f27277a == null) {
                    vkVar = ot.f27279b;
                } else {
                    vkVar = this.f27277a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            if (this.f27278b != 0) {
                i += zzfwg.m25721c(2, this.f27278b);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (ov.f27282a[i - 1]) {
            case 1:
                return new or();
            case 2:
                return f27275c;
            case 3:
                return null;
            case 4:
                return new os();
            case 5:
                vc vcVar = (vc) obj;
                or orVar = (or) obj2;
                this.f27277a = (ot) vcVar.mo4932a(this.f27277a, orVar.f27277a);
                boolean z2 = this.f27278b != 0;
                int i2 = this.f27278b;
                if (orVar.f27278b == 0) {
                    z = false;
                }
                this.f27278b = vcVar.mo4929a(z2, i2, z, orVar.f27278b);
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
                                if (this.f27277a != null) {
                                    uu uuVar = this.f27277a;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (ou) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27277a = (ot) umVar.mo4902a(ot.f27279b, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27277a);
                                this.f27277a = (ot) uvVar.m25316c();
                                break;
                            case 16:
                                this.f27278b = umVar.mo4904b();
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
                if (f27276d == null) {
                    synchronized (or.class) {
                        if (f27276d == null) {
                            f27276d = new uw();
                        }
                    }
                }
                return f27276d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27275c;
    }

    static {
        uu orVar = new or();
        f27275c = orVar;
        orVar.mo4849a(vb.f27554d, null, null);
    }
}
