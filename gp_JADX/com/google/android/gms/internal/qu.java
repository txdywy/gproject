package com.google.android.gms.internal;

import java.io.IOException;

public final class qu extends uu implements vm {
    public static final qu f27376c;
    public static volatile vo f27377d;
    public rd f27378a;
    public rg f27379b;

    private qu() {
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        vk vkVar;
        if (this.f27378a != null) {
            if (this.f27378a == null) {
                vkVar = rd.f27389d;
            } else {
                vkVar = this.f27378a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
        if (this.f27379b != null) {
            if (this.f27379b == null) {
                vkVar = rg.f27402c;
            } else {
                vkVar = this.f27379b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27378a != null) {
                vk vkVar;
                if (this.f27378a == null) {
                    vkVar = rd.f27389d;
                } else {
                    vkVar = this.f27378a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            if (this.f27379b != null) {
                vk vkVar2;
                if (this.f27379b == null) {
                    vkVar2 = rg.f27402c;
                } else {
                    vkVar2 = this.f27379b;
                }
                i += zzfwg.m25719b(2, vkVar2);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        switch (qw.f27380a[i - 1]) {
            case 1:
                return new qu();
            case 2:
                return f27376c;
            case 3:
                return null;
            case 4:
                return new qv();
            case 5:
                vc vcVar = (vc) obj;
                qu quVar = (qu) obj2;
                this.f27378a = (rd) vcVar.mo4932a(this.f27378a, quVar.f27378a);
                this.f27379b = (rg) vcVar.mo4932a(this.f27379b, quVar.f27379b);
                return this;
            case 6:
                um umVar = (um) obj;
                uq uqVar = (uq) obj2;
                Object obj3 = null;
                while (obj3 == null) {
                    try {
                        int a = umVar.mo4901a();
                        uu uuVar;
                        uv uvVar;
                        uv uvVar2;
                        switch (a) {
                            case 0:
                                obj3 = 1;
                                break;
                            case 10:
                                if (this.f27378a != null) {
                                    uuVar = this.f27378a;
                                    uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar.m25314a(uuVar);
                                    uvVar2 = (re) uvVar;
                                } else {
                                    uvVar2 = null;
                                }
                                this.f27378a = (rd) umVar.mo4902a(rd.f27389d, uqVar);
                                if (uvVar2 == null) {
                                    break;
                                }
                                uvVar2.m25314a(this.f27378a);
                                this.f27378a = (rd) uvVar2.m25316c();
                                break;
                            case 18:
                                if (this.f27379b != null) {
                                    uuVar = this.f27379b;
                                    uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar.m25314a(uuVar);
                                    uvVar2 = (rh) uvVar;
                                } else {
                                    uvVar2 = null;
                                }
                                this.f27379b = (rg) umVar.mo4902a(rg.f27402c, uqVar);
                                if (uvVar2 == null) {
                                    break;
                                }
                                uvVar2.m25314a(this.f27379b);
                                this.f27379b = (rg) uvVar2.m25316c();
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
                if (f27377d == null) {
                    synchronized (qu.class) {
                        if (f27377d == null) {
                            f27377d = new uw();
                        }
                    }
                }
                return f27377d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27376c;
    }

    static {
        uu quVar = new qu();
        f27376c = quVar;
        quVar.mo4849a(vb.f27554d, null, null);
    }
}
