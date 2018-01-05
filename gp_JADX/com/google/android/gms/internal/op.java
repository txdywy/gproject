package com.google.android.gms.internal;

import java.io.IOException;

public final class op extends uu implements vm {
    public static final op f27270d;
    public static volatile vo f27271e;
    public int f27272a;
    public ot f27273b;
    public ud f27274c = ud.f27511a;

    private op() {
    }

    public static oq m25332b() {
        uu uuVar = f27270d;
        uv uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
        uvVar.m25314a(uuVar);
        return (oq) uvVar;
    }

    public final ot m25333a() {
        if (this.f27273b == null) {
            return ot.f27279b;
        }
        return this.f27273b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27272a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27272a);
        }
        if (this.f27273b != null) {
            vk vkVar;
            if (this.f27273b == null) {
                vkVar = ot.f27279b;
            } else {
                vkVar = this.f27273b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
        if (!this.f27274c.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(3, this.f27274c);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27272a != 0) {
                i = zzfwg.m25721c(1, this.f27272a) + 0;
            }
            if (this.f27273b != null) {
                vk vkVar;
                if (this.f27273b == null) {
                    vkVar = ot.f27279b;
                } else {
                    vkVar = this.f27273b;
                }
                i += zzfwg.m25719b(2, vkVar);
            }
            if (!this.f27274c.m25663b()) {
                i += zzfwg.m25718b(3, this.f27274c);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (ov.f27282a[i - 1]) {
            case 1:
                return new op();
            case 2:
                return f27270d;
            case 3:
                return null;
            case 4:
                return new oq();
            case 5:
                vc vcVar = (vc) obj;
                op opVar = (op) obj2;
                this.f27272a = vcVar.mo4929a(this.f27272a != 0, this.f27272a, opVar.f27272a != 0, opVar.f27272a);
                this.f27273b = (ot) vcVar.mo4932a(this.f27273b, opVar.f27273b);
                boolean z2 = this.f27274c != ud.f27511a;
                ud udVar = this.f27274c;
                if (opVar.f27274c == ud.f27511a) {
                    z = false;
                }
                this.f27274c = vcVar.mo4930a(z2, udVar, z, opVar.f27274c);
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
                                this.f27272a = umVar.mo4904b();
                                break;
                            case 18:
                                uv uvVar;
                                if (this.f27273b != null) {
                                    uu uuVar = this.f27273b;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (ou) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27273b = (ot) umVar.mo4902a(ot.f27279b, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27273b);
                                this.f27273b = (ot) uvVar.m25316c();
                                break;
                            case 26:
                                this.f27274c = umVar.mo4908d();
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
                if (f27271e == null) {
                    synchronized (op.class) {
                        if (f27271e == null) {
                            f27271e = new uw();
                        }
                    }
                }
                return f27271e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27270d;
    }

    static /* synthetic */ void m25330a(op opVar, ot otVar) {
        if (otVar == null) {
            throw new NullPointerException();
        }
        opVar.f27273b = otVar;
    }

    static /* synthetic */ void m25331a(op opVar, ud udVar) {
        if (udVar == null) {
            throw new NullPointerException();
        }
        opVar.f27274c = udVar;
    }

    static {
        uu opVar = new op();
        f27270d = opVar;
        opVar.mo4849a(vb.f27554d, null, null);
    }
}
