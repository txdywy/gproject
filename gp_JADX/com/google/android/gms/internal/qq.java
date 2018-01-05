package com.google.android.gms.internal;

import java.io.IOException;

public final class qq extends uu implements vm {
    public static final qq f27369c;
    public static volatile vo f27370d;
    public int f27371a;
    public qu f27372b;

    private qq() {
    }

    public final qu m25428a() {
        if (this.f27372b == null) {
            return qu.f27376c;
        }
        return this.f27372b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27371a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27371a);
        }
        if (this.f27372b != null) {
            vk vkVar;
            if (this.f27372b == null) {
                vkVar = qu.f27376c;
            } else {
                vkVar = this.f27372b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27371a != 0) {
                i = zzfwg.m25721c(1, this.f27371a) + 0;
            }
            if (this.f27372b != null) {
                vk vkVar;
                if (this.f27372b == null) {
                    vkVar = qu.f27376c;
                } else {
                    vkVar = this.f27372b;
                }
                i += zzfwg.m25719b(2, vkVar);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (qw.f27380a[i - 1]) {
            case 1:
                return new qq();
            case 2:
                return f27369c;
            case 3:
                return null;
            case 4:
                return new qr();
            case 5:
                vc vcVar = (vc) obj;
                qq qqVar = (qq) obj2;
                boolean z2 = this.f27371a != 0;
                int i2 = this.f27371a;
                if (qqVar.f27371a == 0) {
                    z = false;
                }
                this.f27371a = vcVar.mo4929a(z2, i2, z, qqVar.f27371a);
                this.f27372b = (qu) vcVar.mo4932a(this.f27372b, qqVar.f27372b);
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
                                this.f27371a = umVar.mo4904b();
                                break;
                            case 18:
                                uv uvVar;
                                if (this.f27372b != null) {
                                    uu uuVar = this.f27372b;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (qv) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27372b = (qu) umVar.mo4902a(qu.f27376c, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27372b);
                                this.f27372b = (qu) uvVar.m25316c();
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
                if (f27370d == null) {
                    synchronized (qq.class) {
                        if (f27370d == null) {
                            f27370d = new uw();
                        }
                    }
                }
                return f27370d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27369c;
    }

    static /* synthetic */ void m25427a(qq qqVar, qu quVar) {
        if (quVar == null) {
            throw new NullPointerException();
        }
        qqVar.f27372b = quVar;
    }

    static {
        uu qqVar = new qq();
        f27369c = qqVar;
        qqVar.mo4849a(vb.f27554d, null, null);
    }
}
