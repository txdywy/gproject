package com.google.android.gms.internal;

import java.io.IOException;

public final class ol extends uu implements vm {
    public static final ol f27265c;
    public static volatile vo f27266d;
    public or f27267a;
    public qh f27268b;

    private ol() {
    }

    public static ol m25323a(ud udVar) {
        return (ol) uu.m25289a(f27265c, udVar);
    }

    public final or m25324a() {
        if (this.f27267a == null) {
            return or.f27275c;
        }
        return this.f27267a;
    }

    public final qh m25327b() {
        if (this.f27268b == null) {
            return qh.f27359c;
        }
        return this.f27268b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        vk vkVar;
        if (this.f27267a != null) {
            if (this.f27267a == null) {
                vkVar = or.f27275c;
            } else {
                vkVar = this.f27267a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
        if (this.f27268b != null) {
            if (this.f27268b == null) {
                vkVar = qh.f27359c;
            } else {
                vkVar = this.f27268b;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(2, vkVar);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27267a != null) {
                vk vkVar;
                if (this.f27267a == null) {
                    vkVar = or.f27275c;
                } else {
                    vkVar = this.f27267a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            if (this.f27268b != null) {
                vk vkVar2;
                if (this.f27268b == null) {
                    vkVar2 = qh.f27359c;
                } else {
                    vkVar2 = this.f27268b;
                }
                i += zzfwg.m25719b(2, vkVar2);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        switch (on.f27269a[i - 1]) {
            case 1:
                return new ol();
            case 2:
                return f27265c;
            case 3:
                return null;
            case 4:
                return new om();
            case 5:
                vc vcVar = (vc) obj;
                ol olVar = (ol) obj2;
                this.f27267a = (or) vcVar.mo4932a(this.f27267a, olVar.f27267a);
                this.f27268b = (qh) vcVar.mo4932a(this.f27268b, olVar.f27268b);
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
                                if (this.f27267a != null) {
                                    uuVar = this.f27267a;
                                    uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar.m25314a(uuVar);
                                    uvVar2 = (os) uvVar;
                                } else {
                                    uvVar2 = null;
                                }
                                this.f27267a = (or) umVar.mo4902a(or.f27275c, uqVar);
                                if (uvVar2 == null) {
                                    break;
                                }
                                uvVar2.m25314a(this.f27267a);
                                this.f27267a = (or) uvVar2.m25316c();
                                break;
                            case 18:
                                if (this.f27268b != null) {
                                    uuVar = this.f27268b;
                                    uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar.m25314a(uuVar);
                                    uvVar2 = (qi) uvVar;
                                } else {
                                    uvVar2 = null;
                                }
                                this.f27268b = (qh) umVar.mo4902a(qh.f27359c, uqVar);
                                if (uvVar2 == null) {
                                    break;
                                }
                                uvVar2.m25314a(this.f27268b);
                                this.f27268b = (qh) uvVar2.m25316c();
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
                if (f27266d == null) {
                    synchronized (ol.class) {
                        if (f27266d == null) {
                            f27266d = new uw();
                        }
                    }
                }
                return f27266d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27265c;
    }

    static {
        uu olVar = new ol();
        f27265c = olVar;
        olVar.mo4849a(vb.f27554d, null, null);
    }
}
