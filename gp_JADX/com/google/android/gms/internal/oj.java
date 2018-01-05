package com.google.android.gms.internal;

import java.io.IOException;

public final class oj extends uu implements vm {
    public static final oj f27257d;
    public static volatile vo f27258e;
    public int f27259a;
    public op f27260b;
    public qf f27261c;

    private oj() {
    }

    public static ok m25300d() {
        uu uuVar = f27257d;
        uv uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
        uvVar.m25314a(uuVar);
        return (ok) uvVar;
    }

    public final op m25301a() {
        if (this.f27260b == null) {
            return op.f27270d;
        }
        return this.f27260b;
    }

    public final qf m25304b() {
        if (this.f27261c == null) {
            return qf.f27354d;
        }
        return this.f27261c;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        vk vkVar;
        if (this.f27259a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27259a);
        }
        if (this.f27260b != null) {
            if (this.f27260b == null) {
                vkVar = op.f27270d;
            } else {
                vkVar = this.f27260b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
        if (this.f27261c != null) {
            if (this.f27261c == null) {
                vkVar = qf.f27354d;
            } else {
                vkVar = this.f27261c;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(3, vkVar);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            vk vkVar;
            i = 0;
            if (this.f27259a != 0) {
                i = zzfwg.m25721c(1, this.f27259a) + 0;
            }
            if (this.f27260b != null) {
                if (this.f27260b == null) {
                    vkVar = op.f27270d;
                } else {
                    vkVar = this.f27260b;
                }
                i += zzfwg.m25719b(2, vkVar);
            }
            if (this.f27261c != null) {
                if (this.f27261c == null) {
                    vkVar = qf.f27354d;
                } else {
                    vkVar = this.f27261c;
                }
                i += zzfwg.m25719b(3, vkVar);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (on.f27269a[i - 1]) {
            case 1:
                return new oj();
            case 2:
                return f27257d;
            case 3:
                return null;
            case 4:
                return new ok();
            case 5:
                vc vcVar = (vc) obj;
                oj ojVar = (oj) obj2;
                boolean z2 = this.f27259a != 0;
                int i2 = this.f27259a;
                if (ojVar.f27259a == 0) {
                    z = false;
                }
                this.f27259a = vcVar.mo4929a(z2, i2, z, ojVar.f27259a);
                this.f27260b = (op) vcVar.mo4932a(this.f27260b, ojVar.f27260b);
                this.f27261c = (qf) vcVar.mo4932a(this.f27261c, ojVar.f27261c);
                return this;
            case 6:
                um umVar = (um) obj;
                uq uqVar = (uq) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int a = umVar.mo4901a();
                        uu uuVar;
                        uv uvVar;
                        uv uvVar2;
                        switch (a) {
                            case 0:
                                z3 = true;
                                break;
                            case 8:
                                this.f27259a = umVar.mo4904b();
                                break;
                            case 18:
                                if (this.f27260b != null) {
                                    uuVar = this.f27260b;
                                    uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar.m25314a(uuVar);
                                    uvVar2 = (oq) uvVar;
                                } else {
                                    uvVar2 = null;
                                }
                                this.f27260b = (op) umVar.mo4902a(op.f27270d, uqVar);
                                if (uvVar2 == null) {
                                    break;
                                }
                                uvVar2.m25314a(this.f27260b);
                                this.f27260b = (op) uvVar2.m25316c();
                                break;
                            case 26:
                                if (this.f27261c != null) {
                                    uuVar = this.f27261c;
                                    uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar.m25314a(uuVar);
                                    uvVar2 = (qg) uvVar;
                                } else {
                                    uvVar2 = null;
                                }
                                this.f27261c = (qf) umVar.mo4902a(qf.f27354d, uqVar);
                                if (uvVar2 == null) {
                                    break;
                                }
                                uvVar2.m25314a(this.f27261c);
                                this.f27261c = (qf) uvVar2.m25316c();
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
                if (f27258e == null) {
                    synchronized (oj.class) {
                        if (f27258e == null) {
                            f27258e = new uw();
                        }
                    }
                }
                return f27258e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27257d;
    }

    static /* synthetic */ void m25298a(oj ojVar, op opVar) {
        if (opVar == null) {
            throw new NullPointerException();
        }
        ojVar.f27260b = opVar;
    }

    static /* synthetic */ void m25299a(oj ojVar, qf qfVar) {
        if (qfVar == null) {
            throw new NullPointerException();
        }
        ojVar.f27261c = qfVar;
    }

    static {
        uu ojVar = new oj();
        f27257d = ojVar;
        ojVar.mo4849a(vb.f27554d, null, null);
    }
}
