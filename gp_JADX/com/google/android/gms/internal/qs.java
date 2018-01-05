package com.google.android.gms.internal;

import java.io.IOException;

public final class qs extends uu implements vm {
    public static final qs f27373b;
    public static volatile vo f27374c;
    public qu f27375a;

    private qs() {
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27375a != null) {
            vk vkVar;
            if (this.f27375a == null) {
                vkVar = qu.f27376c;
            } else {
                vkVar = this.f27375a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27375a != null) {
                vk vkVar;
                if (this.f27375a == null) {
                    vkVar = qu.f27376c;
                } else {
                    vkVar = this.f27375a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        switch (qw.f27380a[i - 1]) {
            case 1:
                return new qs();
            case 2:
                return f27373b;
            case 3:
                return null;
            case 4:
                return new qt();
            case 5:
                this.f27375a = (qu) ((vc) obj).mo4932a(this.f27375a, ((qs) obj2).f27375a);
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
                            case 10:
                                uv uvVar;
                                if (this.f27375a != null) {
                                    uu uuVar = this.f27375a;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (qv) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27375a = (qu) umVar.mo4902a(qu.f27376c, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27375a);
                                this.f27375a = (qu) uvVar.m25316c();
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
                if (f27374c == null) {
                    synchronized (qs.class) {
                        if (f27374c == null) {
                            f27374c = new uw();
                        }
                    }
                }
                return f27374c;
            default:
                throw new UnsupportedOperationException();
        }
        return f27373b;
    }

    static {
        uu qsVar = new qs();
        f27373b = qsVar;
        qsVar.mo4849a(vb.f27554d, null, null);
    }
}
