package com.google.android.gms.internal;

import java.io.IOException;

public final class oz extends uu implements vm {
    public static final oz f27288c;
    public static volatile vo f27289d;
    public pb f27290a;
    public int f27291b;

    private oz() {
    }

    public final pb m25352a() {
        if (this.f27290a == null) {
            return pb.f27292b;
        }
        return this.f27290a;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27290a != null) {
            vk vkVar;
            if (this.f27290a == null) {
                vkVar = pb.f27292b;
            } else {
                vkVar = this.f27290a;
            }
            com_google_android_gms_internal_zzfwg.mo4919a(1, vkVar);
        }
        if (this.f27291b != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(2, this.f27291b);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27290a != null) {
                vk vkVar;
                if (this.f27290a == null) {
                    vkVar = pb.f27292b;
                } else {
                    vkVar = this.f27290a;
                }
                i = zzfwg.m25719b(1, vkVar) + 0;
            }
            if (this.f27291b != 0) {
                i += zzfwg.m25721c(2, this.f27291b);
            }
            this.i = i;
        }
        return i;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = true;
        switch (pd.f27295a[i - 1]) {
            case 1:
                return new oz();
            case 2:
                return f27288c;
            case 3:
                return null;
            case 4:
                return new pa();
            case 5:
                vc vcVar = (vc) obj;
                oz ozVar = (oz) obj2;
                this.f27290a = (pb) vcVar.mo4932a(this.f27290a, ozVar.f27290a);
                boolean z2 = this.f27291b != 0;
                int i2 = this.f27291b;
                if (ozVar.f27291b == 0) {
                    z = false;
                }
                this.f27291b = vcVar.mo4929a(z2, i2, z, ozVar.f27291b);
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
                                if (this.f27290a != null) {
                                    uu uuVar = this.f27290a;
                                    uv uvVar2 = (uv) uuVar.mo4849a(vb.f27556f, null, null);
                                    uvVar2.m25314a(uuVar);
                                    uvVar = (pc) uvVar2;
                                } else {
                                    uvVar = null;
                                }
                                this.f27290a = (pb) umVar.mo4902a(pb.f27292b, uqVar);
                                if (uvVar == null) {
                                    break;
                                }
                                uvVar.m25314a(this.f27290a);
                                this.f27290a = (pb) uvVar.m25316c();
                                break;
                            case 16:
                                this.f27291b = umVar.mo4904b();
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
                if (f27289d == null) {
                    synchronized (oz.class) {
                        if (f27289d == null) {
                            f27289d = new uw();
                        }
                    }
                }
                return f27289d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27288c;
    }

    static {
        uu ozVar = new oz();
        f27288c = ozVar;
        ozVar.mo4849a(vb.f27554d, null, null);
    }
}
