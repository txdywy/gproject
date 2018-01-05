package com.google.android.gms.internal;

import java.io.IOException;

public final class qf extends uu implements vm {
    public static final qf f27354d;
    public static volatile vo f27355e;
    public int f27356a;
    public qj f27357b;
    public ud f27358c = ud.f27511a;

    private qf() {
    }

    public static qg m25406b() {
        uu uuVar = f27354d;
        uv uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
        uvVar.m25314a(uuVar);
        return (qg) uvVar;
    }

    public final qj m25407a() {
        if (this.f27357b == null) {
            return qj.f27363c;
        }
        return this.f27357b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27356a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27356a);
        }
        if (this.f27357b != null) {
            vk vkVar;
            if (this.f27357b == null) {
                vkVar = qj.f27363c;
            } else {
                vkVar = this.f27357b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
        if (!this.f27358c.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(3, this.f27358c);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27356a != 0) {
                i = zzfwg.m25721c(1, this.f27356a) + 0;
            }
            if (this.f27357b != null) {
                vk vkVar;
                if (this.f27357b == null) {
                    vkVar = qj.f27363c;
                } else {
                    vkVar = this.f27357b;
                }
                i += zzfwg.m25719b(2, vkVar);
            }
            if (!this.f27358c.m25663b()) {
                i += zzfwg.m25718b(3, this.f27358c);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (ql.f27367a[i - 1]) {
            case 1:
                return new qf();
            case 2:
                return f27354d;
            case 3:
                return null;
            case 4:
                return new qg();
            case 5:
                vc vcVar = (vc) obj;
                qf qfVar = (qf) obj2;
                this.f27356a = vcVar.mo4929a(this.f27356a != 0, this.f27356a, qfVar.f27356a != 0, qfVar.f27356a);
                this.f27357b = (qj) vcVar.mo4932a(this.f27357b, qfVar.f27357b);
                boolean z2 = this.f27358c != ud.f27511a;
                ud udVar = this.f27358c;
                if (qfVar.f27358c == ud.f27511a) {
                    z = false;
                }
                this.f27358c = vcVar.mo4930a(z2, udVar, z, qfVar.f27358c);
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
                                this.f27356a = umVar.mo4904b();
                                break;
                            case 18:
                                uv uvVar;
                                if (this.f27357b != null) {
                                    uu uuVar = this.f27357b;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (qk) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27357b = (qj) umVar.mo4902a(qj.f27363c, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27357b);
                                this.f27357b = (qj) uvVar.m25316c();
                                break;
                            case 26:
                                this.f27358c = umVar.mo4908d();
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
                if (f27355e == null) {
                    synchronized (qf.class) {
                        if (f27355e == null) {
                            f27355e = new uw();
                        }
                    }
                }
                return f27355e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27354d;
    }

    static /* synthetic */ void m25404a(qf qfVar, qj qjVar) {
        if (qjVar == null) {
            throw new NullPointerException();
        }
        qfVar.f27357b = qjVar;
    }

    static /* synthetic */ void m25405a(qf qfVar, ud udVar) {
        if (udVar == null) {
            throw new NullPointerException();
        }
        qfVar.f27358c = udVar;
    }

    static {
        uu qfVar = new qf();
        f27354d = qfVar;
        qfVar.mo4849a(vb.f27554d, null, null);
    }
}
