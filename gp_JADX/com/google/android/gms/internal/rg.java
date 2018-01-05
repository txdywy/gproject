package com.google.android.gms.internal;

import java.io.IOException;

public final class rg extends uu implements vm {
    public static final rg f27402c;
    public static volatile vo f27403d;
    public String f27404a = "";
    public ud f27405b = ud.f27511a;

    private rg() {
    }

    protected final Object mo4849a(int i, Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = true;
        switch (rq.f27428a[i - 1]) {
            case 1:
                return new rg();
            case 2:
                return f27402c;
            case 3:
                return null;
            case 4:
                return new rh();
            case 5:
                vc vcVar = (vc) obj;
                rg rgVar = (rg) obj2;
                this.f27404a = vcVar.mo4934a(!this.f27404a.isEmpty(), this.f27404a, !rgVar.f27404a.isEmpty(), rgVar.f27404a);
                boolean z3 = this.f27405b != ud.f27511a;
                ud udVar = this.f27405b;
                if (rgVar.f27405b == ud.f27511a) {
                    z2 = false;
                }
                this.f27405b = vcVar.mo4930a(z3, udVar, z2, rgVar.f27405b);
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
                                this.f27404a = umVar.mo4907c();
                                break;
                            case 18:
                                this.f27405b = umVar.mo4908d();
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
                if (f27403d == null) {
                    synchronized (rg.class) {
                        if (f27403d == null) {
                            f27403d = new uw();
                        }
                    }
                }
                return f27403d;
            default:
                throw new UnsupportedOperationException();
        }
        return f27402c;
    }

    public final void mo4850a(zzfwg com_google_android_gms_internal_zzfwg) {
        if (!this.f27404a.isEmpty()) {
            com_google_android_gms_internal_zzfwg.mo4923a(this.f27404a);
        }
        if (!this.f27405b.m25663b()) {
            com_google_android_gms_internal_zzfwg.mo4918a(2, this.f27405b);
        }
    }

    public final int mo4851c() {
        int i = this.i;
        if (i == -1) {
            i = 0;
            if (!this.f27404a.isEmpty()) {
                i = zzfwg.m25722c(this.f27404a) + 0;
            }
            if (!this.f27405b.m25663b()) {
                i += zzfwg.m25718b(2, this.f27405b);
            }
            this.i = i;
        }
        return i;
    }

    static {
        uu rgVar = new rg();
        f27402c = rgVar;
        rgVar.mo4849a(vb.f27554d, null, null);
    }
}
