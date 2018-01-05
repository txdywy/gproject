package com.google.android.gms.internal;

import java.io.IOException;

public final class pb extends uu implements vm {
    public static final pb f27292b;
    public static volatile vo f27293c;
    public int f27294a;

    private pb() {
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (pd.f27295a[i - 1]) {
            case 1:
                return new pb();
            case 2:
                return f27292b;
            case 3:
                return null;
            case 4:
                return new pc();
            case 5:
                vc vcVar = (vc) obj;
                pb pbVar = (pb) obj2;
                boolean z3 = this.f27294a != 0;
                int i2 = this.f27294a;
                if (pbVar.f27294a == 0) {
                    z2 = false;
                }
                this.f27294a = vcVar.mo4929a(z3, i2, z2, pbVar.f27294a);
                return this;
            case 6:
                um umVar = (um) obj;
                while (!z) {
                    try {
                        int a = umVar.mo4901a();
                        switch (a) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.f27294a = umVar.mo4904b();
                                break;
                            default:
                                if (!umVar.mo4905b(a)) {
                                    z = true;
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
                if (f27293c == null) {
                    synchronized (pb.class) {
                        if (f27293c == null) {
                            f27293c = new uw();
                        }
                    }
                }
                return f27293c;
            default:
                throw new UnsupportedOperationException();
        }
        return f27292b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27294a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27294a);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27294a != 0) {
                i = zzfwg.m25721c(1, this.f27294a) + 0;
            }
            this.i = i;
        }
        return i;
    }

    static {
        uu pbVar = new pb();
        f27292b = pbVar;
        pbVar.mo4849a(vb.f27554d, null, null);
    }
}
