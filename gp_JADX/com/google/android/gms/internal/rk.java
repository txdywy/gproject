package com.google.android.gms.internal;

import java.io.IOException;

public final class rk extends uu implements vm {
    public static final rk f27411e;
    public static volatile vo f27412f;
    public rd f27413a;
    public int f27414b;
    public int f27415c;
    public int f27416d;

    private rk() {
    }

    public final rd m25465a() {
        if (this.f27413a == null) {
            return rd.f27389d;
        }
        return this.f27413a;
    }

    public final rs m25468b() {
        rs a = rs.m25483a(this.f27414b);
        return a == null ? rs.UNRECOGNIZED : a;
    }

    public final ru m25470d() {
        ru a = ru.m25485a(this.f27416d);
        return a == null ? ru.UNRECOGNIZED : a;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27413a != null) {
            vk vkVar;
            if (this.f27413a == null) {
                vkVar = rd.f27389d;
            } else {
                vkVar = this.f27413a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
        if (this.f27414b != rs.UNKNOWN_STATUS.m25484a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(2, this.f27414b);
        }
        if (this.f27415c != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(3, this.f27415c);
        }
        if (this.f27416d != ru.UNKNOWN_PREFIX.m25486a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(4, this.f27416d);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27413a != null) {
                vk vkVar;
                if (this.f27413a == null) {
                    vkVar = rd.f27389d;
                } else {
                    vkVar = this.f27413a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            if (this.f27414b != rs.UNKNOWN_STATUS.m25484a()) {
                i += zzfwg.m25724d(2, this.f27414b);
            }
            if (this.f27415c != 0) {
                i += zzfwg.m25721c(3, this.f27415c);
            }
            if (this.f27416d != ru.UNKNOWN_PREFIX.m25486a()) {
                i += zzfwg.m25724d(4, this.f27416d);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (rq.f27428a[i - 1]) {
            case 1:
                return new rk();
            case 2:
                return f27411e;
            case 3:
                return null;
            case 4:
                return new rl();
            case 5:
                vc vcVar = (vc) obj;
                rk rkVar = (rk) obj2;
                this.f27413a = (rd) vcVar.mo4932a(this.f27413a, rkVar.f27413a);
                this.f27414b = vcVar.mo4929a(this.f27414b != 0, this.f27414b, rkVar.f27414b != 0, rkVar.f27414b);
                this.f27415c = vcVar.mo4929a(this.f27415c != 0, this.f27415c, rkVar.f27415c != 0, rkVar.f27415c);
                boolean z2 = this.f27416d != 0;
                int i2 = this.f27416d;
                if (rkVar.f27416d == 0) {
                    z = false;
                }
                this.f27416d = vcVar.mo4929a(z2, i2, z, rkVar.f27416d);
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
                                if (this.f27413a != null) {
                                    uu uuVar = this.f27413a;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (re) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27413a = (rd) umVar.mo4902a(rd.f27389d, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27413a);
                                this.f27413a = (rd) uvVar.m25316c();
                                break;
                            case 16:
                                this.f27414b = umVar.mo4910e();
                                break;
                            case 24:
                                this.f27415c = umVar.mo4904b();
                                break;
                            case 32:
                                this.f27416d = umVar.mo4910e();
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
                if (f27412f == null) {
                    synchronized (rk.class) {
                        if (f27412f == null) {
                            f27412f = new uw();
                        }
                    }
                }
                return f27412f;
            default:
                throw new UnsupportedOperationException();
        }
        return f27411e;
    }

    static {
        uu rkVar = new rk();
        f27411e = rkVar;
        rkVar.mo4849a(vb.f27554d, null, null);
    }
}
