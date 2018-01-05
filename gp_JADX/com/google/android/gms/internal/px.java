package com.google.android.gms.internal;

import java.io.IOException;

public final class px extends uu implements vm {
    public static final px f27335d;
    public static volatile vo f27336e;
    public qb f27337a;
    public pv f27338b;
    public int f27339c;

    private px() {
    }

    public final qb m25384a() {
        if (this.f27337a == null) {
            return qb.f27348d;
        }
        return this.f27337a;
    }

    public final pm m25389d() {
        pm a = pm.m25374a(this.f27339c);
        return a == null ? pm.UNRECOGNIZED : a;
    }

    public final pv m25387b() {
        if (this.f27338b == null) {
            return pv.f27332b;
        }
        return this.f27338b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        vk vkVar;
        if (this.f27337a != null) {
            if (this.f27337a == null) {
                vkVar = qb.f27348d;
            } else {
                vkVar = this.f27337a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
        if (this.f27338b != null) {
            if (this.f27338b == null) {
                vkVar = pv.f27332b;
            } else {
                vkVar = this.f27338b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
        if (this.f27339c != pm.UNKNOWN_FORMAT.m25375a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(3, this.f27339c);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27337a != null) {
                vk vkVar;
                if (this.f27337a == null) {
                    vkVar = qb.f27348d;
                } else {
                    vkVar = this.f27337a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            if (this.f27338b != null) {
                vk vkVar2;
                if (this.f27338b == null) {
                    vkVar2 = pv.f27332b;
                } else {
                    vkVar2 = this.f27338b;
                }
                i += zzfwg.m25719b(2, vkVar2);
            }
            if (this.f27339c != pm.UNKNOWN_FORMAT.m25375a()) {
                i += zzfwg.m25724d(3, this.f27339c);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (qd.f27353a[i - 1]) {
            case 1:
                return new px();
            case 2:
                return f27335d;
            case 3:
                return null;
            case 4:
                return new py();
            case 5:
                vc vcVar = (vc) obj;
                px pxVar = (px) obj2;
                this.f27337a = (qb) vcVar.mo4932a(this.f27337a, pxVar.f27337a);
                this.f27338b = (pv) vcVar.mo4932a(this.f27338b, pxVar.f27338b);
                boolean z2 = this.f27339c != 0;
                int i2 = this.f27339c;
                if (pxVar.f27339c == 0) {
                    z = false;
                }
                this.f27339c = vcVar.mo4929a(z2, i2, z, pxVar.f27339c);
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
                            case 10:
                                if (this.f27337a != null) {
                                    uuVar = this.f27337a;
                                    uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar.m25314a(uuVar);
                                    uvVar2 = (qc) uvVar;
                                } else {
                                    uvVar2 = null;
                                }
                                this.f27337a = (qb) umVar.mo4902a(qb.f27348d, uqVar);
                                if (uvVar2 == null) {
                                    break;
                                }
                                uvVar2.m25314a(this.f27337a);
                                this.f27337a = (qb) uvVar2.m25316c();
                                break;
                            case 18:
                                if (this.f27338b != null) {
                                    uuVar = this.f27338b;
                                    uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar.m25314a(uuVar);
                                    uvVar2 = (pw) uvVar;
                                } else {
                                    uvVar2 = null;
                                }
                                this.f27338b = (pv) umVar.mo4902a(pv.f27332b, uqVar);
                                if (uvVar2 == null) {
                                    break;
                                }
                                uvVar2.m25314a(this.f27338b);
                                this.f27338b = (pv) uvVar2.m25316c();
                                break;
                            case 24:
                                this.f27339c = umVar.mo4910e();
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
                if (f27336e == null) {
                    synchronized (px.class) {
                        if (f27336e == null) {
                            f27336e = new uw();
                        }
                    }
                }
                return f27336e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27335d;
    }

    static {
        uu pxVar = new px();
        f27335d = pxVar;
        pxVar.mo4849a(vb.f27554d, null, null);
    }
}
