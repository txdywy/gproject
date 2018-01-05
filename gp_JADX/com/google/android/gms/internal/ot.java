package com.google.android.gms.internal;

import java.io.IOException;

public final class ot extends uu implements vm {
    public static final ot f27279b;
    public static volatile vo f27280c;
    public int f27281a;

    private ot() {
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (ov.f27282a[i - 1]) {
            case 1:
                return new ot();
            case 2:
                return f27279b;
            case 3:
                return null;
            case 4:
                return new ou();
            case 5:
                vc vcVar = (vc) obj;
                ot otVar = (ot) obj2;
                boolean z3 = this.f27281a != 0;
                int i2 = this.f27281a;
                if (otVar.f27281a == 0) {
                    z2 = false;
                }
                this.f27281a = vcVar.mo4929a(z3, i2, z2, otVar.f27281a);
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
                                this.f27281a = umVar.mo4904b();
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
                if (f27280c == null) {
                    synchronized (ot.class) {
                        if (f27280c == null) {
                            f27280c = new uw();
                        }
                    }
                }
                return f27280c;
            default:
                throw new UnsupportedOperationException();
        }
        return f27279b;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (this.f27281a != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(1, this.f27281a);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (this.f27281a != 0) {
                i = zzfwg.m25721c(1, this.f27281a) + 0;
            }
            this.i = i;
        }
        return i;
    }

    static {
        uu otVar = new ot();
        f27279b = otVar;
        otVar.mo4849a(vb.f27554d, null, null);
    }
}
