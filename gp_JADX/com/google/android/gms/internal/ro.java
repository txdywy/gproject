package com.google.android.gms.internal;

import java.io.IOException;

public final class ro extends uu implements vm {
    public static final ro f27422e;
    public static volatile vo f27423f;
    public String f27424a = "";
    public int f27425b;
    public int f27426c;
    public int f27427d;

    private ro() {
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (rq.f27428a[i - 1]) {
            case 1:
                return new ro();
            case 2:
                return f27422e;
            case 3:
                return null;
            case 4:
                return new rp();
            case 5:
                vc vcVar = (vc) obj;
                ro roVar = (ro) obj2;
                this.f27424a = vcVar.mo4934a(!this.f27424a.isEmpty(), this.f27424a, !roVar.f27424a.isEmpty(), roVar.f27424a);
                this.f27425b = vcVar.mo4929a(this.f27425b != 0, this.f27425b, roVar.f27425b != 0, roVar.f27425b);
                this.f27426c = vcVar.mo4929a(this.f27426c != 0, this.f27426c, roVar.f27426c != 0, roVar.f27426c);
                boolean z3 = this.f27427d != 0;
                int i2 = this.f27427d;
                if (roVar.f27427d == 0) {
                    z2 = false;
                }
                this.f27427d = vcVar.mo4929a(z3, i2, z2, roVar.f27427d);
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
                            case 10:
                                this.f27424a = umVar.mo4907c();
                                break;
                            case 16:
                                this.f27425b = umVar.mo4910e();
                                break;
                            case 24:
                                this.f27426c = umVar.mo4904b();
                                break;
                            case 32:
                                this.f27427d = umVar.mo4910e();
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
                if (f27423f == null) {
                    synchronized (ro.class) {
                        if (f27423f == null) {
                            f27423f = new uw();
                        }
                    }
                }
                return f27423f;
            default:
                throw new UnsupportedOperationException();
        }
        return f27422e;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (!this.f27424a.isEmpty()) {
            com_google_android_gms_internal_zzfwg.mo4923a(this.f27424a);
        }
        if (this.f27425b != rs.UNKNOWN_STATUS.m25484a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(2, this.f27425b);
        }
        if (this.f27426c != 0) {
            com_google_android_gms_internal_zzfwg.mo4926b(3, this.f27426c);
        }
        if (this.f27427d != ru.UNKNOWN_PREFIX.m25486a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(4, this.f27427d);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (!this.f27424a.isEmpty()) {
                i = zzfwg.m25722c(this.f27424a) + 0;
            }
            if (this.f27425b != rs.UNKNOWN_STATUS.m25484a()) {
                i += zzfwg.m25724d(2, this.f27425b);
            }
            if (this.f27426c != 0) {
                i += zzfwg.m25721c(3, this.f27426c);
            }
            if (this.f27427d != ru.UNKNOWN_PREFIX.m25486a()) {
                i += zzfwg.m25724d(4, this.f27427d);
            }
            this.i = i;
        }
        return i;
    }

    static /* synthetic */ void m25479a(ro roVar, String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        roVar.f27424a = str;
    }

    static /* synthetic */ void m25477a(ro roVar, rs rsVar) {
        if (rsVar == null) {
            throw new NullPointerException();
        }
        roVar.f27425b = rsVar.m25484a();
    }

    static /* synthetic */ void m25478a(ro roVar, ru ruVar) {
        if (ruVar == null) {
            throw new NullPointerException();
        }
        roVar.f27427d = ruVar.m25486a();
    }

    static {
        uu roVar = new ro();
        f27422e = roVar;
        roVar.mo4849a(vb.f27554d, null, null);
    }
}
