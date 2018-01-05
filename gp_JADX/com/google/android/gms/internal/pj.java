package com.google.android.gms.internal;

import java.io.IOException;

public final class pj extends uu implements vm {
    public static final pj f27305a;
    public static volatile vo f27306b;

    private pj() {
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        switch (pl.f27307a[i - 1]) {
            case 1:
                return new pj();
            case 2:
                return f27305a;
            case 3:
                return null;
            case 4:
                return new pk();
            case 5:
                return this;
            case 6:
                um umVar = (um) obj;
                Object obj3 = null;
                while (obj3 == null) {
                    try {
                        int a = umVar.mo4901a();
                        switch (a) {
                            case 0:
                                obj3 = 1;
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
                if (f27306b == null) {
                    synchronized (pj.class) {
                        if (f27306b == null) {
                            f27306b = new uw();
                        }
                    }
                }
                return f27306b;
            default:
                throw new UnsupportedOperationException();
        }
        return f27305a;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
    }

    public final int mo4851c() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        this.i = 0;
        return 0;
    }

    static {
        uu pjVar = new pj();
        f27305a = pjVar;
        pjVar.mo4849a(vb.f27554d, null, null);
    }
}
