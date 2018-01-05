package com.google.android.gms.internal;

import java.io.IOException;

public final class rd extends uu implements vm {
    public static final rd f27389d;
    public static volatile vo f27390e;
    public String f27391a = "";
    public ud f27392b = ud.f27511a;
    public int f27393c;

    private rd() {
    }

    public static re m25449b() {
        uu uuVar = f27389d;
        uv uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
        uvVar.m25314a(uuVar);
        return (re) uvVar;
    }

    public final rf m25450a() {
        rf a = rf.m25457a(this.f27393c);
        return a == null ? rf.UNRECOGNIZED : a;
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (rq.f27428a[i - 1]) {
            case 1:
                return new rd();
            case 2:
                return f27389d;
            case 3:
                return null;
            case 4:
                return new re();
            case 5:
                vc vcVar = (vc) obj;
                rd rdVar = (rd) obj2;
                this.f27391a = vcVar.mo4934a(!this.f27391a.isEmpty(), this.f27391a, !rdVar.f27391a.isEmpty(), rdVar.f27391a);
                this.f27392b = vcVar.mo4930a(this.f27392b != ud.f27511a, this.f27392b, rdVar.f27392b != ud.f27511a, rdVar.f27392b);
                boolean z3 = this.f27393c != 0;
                int i2 = this.f27393c;
                if (rdVar.f27393c == 0) {
                    z2 = false;
                }
                this.f27393c = vcVar.mo4929a(z3, i2, z2, rdVar.f27393c);
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
                                this.f27391a = umVar.mo4907c();
                                break;
                            case 18:
                                this.f27392b = umVar.mo4908d();
                                break;
                            case 24:
                                this.f27393c = umVar.mo4910e();
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
                if (f27390e == null) {
                    synchronized (rd.class) {
                        if (f27390e == null) {
                            f27390e = new uw();
                        }
                    }
                }
                return f27390e;
            default:
                throw new UnsupportedOperationException();
        }
        return f27389d;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (!this.f27391a.isEmpty()) {
            com_google_android_gms_internal_zzfwg.mo4923a(this.f27391a);
        }
        if (!this.f27392b.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(2, this.f27392b);
        }
        if (this.f27393c != rf.UNKNOWN_KEYMATERIAL.m25458a()) {
            com_google_android_gms_internal_zzfwg.mo4926b(3, this.f27393c);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (!this.f27391a.isEmpty()) {
                i = zzfwg.m25722c(this.f27391a) + 0;
            }
            if (!this.f27392b.m25663b()) {
                i += zzfwg.m25718b(2, this.f27392b);
            }
            if (this.f27393c != rf.UNKNOWN_KEYMATERIAL.m25458a()) {
                i += zzfwg.m25724d(3, this.f27393c);
            }
            this.i = i;
        }
        return i;
    }

    static /* synthetic */ void m25448a(rd rdVar, String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        rdVar.f27391a = str;
    }

    static /* synthetic */ void m25447a(rd rdVar, ud udVar) {
        if (udVar == null) {
            throw new NullPointerException();
        }
        rdVar.f27392b = udVar;
    }

    static /* synthetic */ void m25446a(rd rdVar, rf rfVar) {
        if (rfVar == null) {
            throw new NullPointerException();
        }
        rdVar.f27393c = rfVar.m25458a();
    }

    static {
        uu rdVar = new rd();
        f27389d = rdVar;
        rdVar.mo4849a(vb.f27554d, null, null);
    }
}
