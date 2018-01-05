package com.google.android.gms.internal;

import java.util.Arrays;

public final class xl extends wu {
    public long f27708a;
    public long f27709b;
    public xk[] f27710c;
    public byte[] f27711d;
    public String f27712e;
    public String f27713f;

    public xl() {
        this.f27708a = 0;
        this.f27709b = 0;
        this.f27710c = xk.m25977b();
        this.f27711d = xc.f27660f;
        this.f27712e = "";
        this.f27713f = "";
        this.ah = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f27708a != 0) {
            a += wt.m25890b(1, this.f27708a);
        }
        if (this.f27710c != null && this.f27710c.length > 0) {
            int i = a;
            for (wz wzVar : this.f27710c) {
                if (wzVar != null) {
                    i += wt.m25891b(2, wzVar);
                }
            }
            a = i;
        }
        if (!Arrays.equals(this.f27711d, xc.f27660f)) {
            a += wt.m25893b(3, this.f27711d);
        }
        if (this.f27709b != 0) {
            a += wt.m25890b(4, this.f27709b);
        }
        if (!(this.f27712e == null || this.f27712e.equals(""))) {
            a += wt.m25892b(5, this.f27712e);
        }
        return (this.f27713f == null || this.f27713f.equals("")) ? a : a + wt.m25892b(6, this.f27713f);
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27708a = wsVar.m25877f();
                    continue;
                case 18:
                    int a2 = xc.m25935a(wsVar, 18);
                    a = this.f27710c == null ? 0 : this.f27710c.length;
                    Object obj = new xk[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27710c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new xk();
                        wsVar.m25868a(obj[a]);
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = new xk();
                    wsVar.m25868a(obj[a]);
                    this.f27710c = obj;
                    continue;
                case 26:
                    this.f27711d = wsVar.m25874d();
                    continue;
                case 32:
                    this.f27709b = wsVar.m25877f();
                    continue;
                case 42:
                    this.f27712e = wsVar.m25872c();
                    continue;
                case 50:
                    this.f27713f = wsVar.m25872c();
                    continue;
                default:
                    if (!super.m24220a(wsVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void mo4702a(wt wtVar) {
        if (this.f27708a != 0) {
            wtVar.m25902a(1, this.f27708a);
        }
        if (this.f27710c != null && this.f27710c.length > 0) {
            for (wz wzVar : this.f27710c) {
                if (wzVar != null) {
                    wtVar.m25903a(2, wzVar);
                }
            }
        }
        if (!Arrays.equals(this.f27711d, xc.f27660f)) {
            wtVar.m25906a(3, this.f27711d);
        }
        if (this.f27709b != 0) {
            wtVar.m25902a(4, this.f27709b);
        }
        if (!(this.f27712e == null || this.f27712e.equals(""))) {
            wtVar.m25904a(5, this.f27712e);
        }
        if (!(this.f27713f == null || this.f27713f.equals(""))) {
            wtVar.m25904a(6, this.f27713f);
        }
        super.mo4702a(wtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xl)) {
            return false;
        }
        xl xlVar = (xl) obj;
        if (this.f27708a != xlVar.f27708a) {
            return false;
        }
        if (this.f27709b != xlVar.f27709b) {
            return false;
        }
        if (!wy.m25928a(this.f27710c, xlVar.f27710c)) {
            return false;
        }
        if (!Arrays.equals(this.f27711d, xlVar.f27711d)) {
            return false;
        }
        if (this.f27712e == null) {
            if (xlVar.f27712e != null) {
                return false;
            }
        } else if (!this.f27712e.equals(xlVar.f27712e)) {
            return false;
        }
        if (this.f27713f == null) {
            if (xlVar.f27713f != null) {
                return false;
            }
        } else if (!this.f27713f.equals(xlVar.f27713f)) {
            return false;
        }
        return (this.ah == null || this.ah.m25913a()) ? xlVar.ah == null || xlVar.ah.m25913a() : this.ah.equals(xlVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f27713f == null ? 0 : this.f27713f.hashCode()) + (((this.f27712e == null ? 0 : this.f27712e.hashCode()) + ((((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f27708a ^ (this.f27708a >>> 32)))) * 31) + ((int) (this.f27709b ^ (this.f27709b >>> 32)))) * 31) + wy.m25922a(this.f27710c)) * 31) + Arrays.hashCode(this.f27711d)) * 31)) * 31)) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }
}
