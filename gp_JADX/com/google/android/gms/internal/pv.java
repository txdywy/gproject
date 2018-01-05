package com.google.android.gms.internal;

import java.io.IOException;

public final class pv extends uu implements vm {
    public static final pv f27332b;
    public static volatile vo f27333c;
    public rg f27334a;

    private pv() {
    }

    public final rg m25380a() {
        if (this.f27334a == null) {
            return rg.f27402c;
        }
        return this.f27334a;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27334a != null) {
            vk vkVar;
            if (this.f27334a == null) {
                vkVar = rg.f27402c;
            } else {
                vkVar = this.f27334a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27334a != null) {
                vk vkVar;
                if (this.f27334a == null) {
                    vkVar = rg.f27402c;
                } else {
                    vkVar = this.f27334a;
                }
                i = zzfwg.m25719b(2, vkVar) + 0;
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        switch (qd.f27353a[i - 1]) {
            case 1:
                return new pv();
            case 2:
                return f27332b;
            case 3:
                return null;
            case 4:
                return new pw();
            case 5:
                this.f27334a = (rg) ((vc) obj).mo4932a(this.f27334a, ((pv) obj2).f27334a);
                return this;
            case 6:
                um umVar = (um) obj;
                uq uqVar = (uq) obj2;
                Object obj3 = null;
                while (obj3 == null) {
                    try {
                        int a = umVar.mo4901a();
                        switch (a) {
                            case 0:
                                obj3 = 1;
                                break;
                            case 18:
                                uv uvVar;
                                if (this.f27334a != null) {
                                    uu uuVar = this.f27334a;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (rh) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27334a = (rg) umVar.mo4902a(rg.f27402c, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27334a);
                                this.f27334a = (rg) uvVar.m25316c();
                                break;
                            default:
                                if (!umVar.mo4905b(a)) {
                                    obj3 = 1;
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
                if (f27333c == null) {
                    synchronized (pv.class) {
                        if (f27333c == null) {
                            f27333c = new uw();
                        }
                    }
                }
                return f27333c;
            default:
                throw new UnsupportedOperationException();
        }
        return f27332b;
    }

    static {
        uu pvVar = new pv();
        f27332b = pvVar;
        pvVar.mo4849a(vb.f27554d, null, null);
    }
}
