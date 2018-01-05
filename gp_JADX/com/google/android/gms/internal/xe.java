package com.google.android.gms.internal;

public final class xe extends wu implements Cloneable {
    public int f27666a;
    public String f27667b;
    public String f27668c;

    public xe() {
        this.f27666a = 0;
        this.f27667b = "";
        this.f27668c = "";
        this.ah = null;
        this.ai = -1;
    }

    private final xe m25942b() {
        try {
            return (xe) super.mo4948c();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f27666a != 0) {
            a += wt.m25889b(1, this.f27666a);
        }
        if (!(this.f27667b == null || this.f27667b.equals(""))) {
            a += wt.m25892b(2, this.f27667b);
        }
        return (this.f27668c == null || this.f27668c.equals("")) ? a : a + wt.m25892b(3, this.f27668c);
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27666a = wsVar.m25875e();
                    continue;
                case 18:
                    this.f27667b = wsVar.m25872c();
                    continue;
                case 26:
                    this.f27668c = wsVar.m25872c();
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
        if (this.f27666a != 0) {
            wtVar.m25901a(1, this.f27666a);
        }
        if (!(this.f27667b == null || this.f27667b.equals(""))) {
            wtVar.m25904a(2, this.f27667b);
        }
        if (!(this.f27668c == null || this.f27668c.equals(""))) {
            wtVar.m25904a(3, this.f27668c);
        }
        super.mo4702a(wtVar);
    }

    public final /* synthetic */ wu mo4948c() {
        return (xe) clone();
    }

    public final /* synthetic */ Object clone() {
        return m25942b();
    }

    public final /* synthetic */ wz mo4704d() {
        return (xe) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        if (this.f27666a != xeVar.f27666a) {
            return false;
        }
        if (this.f27667b == null) {
            if (xeVar.f27667b != null) {
                return false;
            }
        } else if (!this.f27667b.equals(xeVar.f27667b)) {
            return false;
        }
        if (this.f27668c == null) {
            if (xeVar.f27668c != null) {
                return false;
            }
        } else if (!this.f27668c.equals(xeVar.f27668c)) {
            return false;
        }
        return (this.ah == null || this.ah.m25913a()) ? xeVar.ah == null || xeVar.ah.m25913a() : this.ah.equals(xeVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f27668c == null ? 0 : this.f27668c.hashCode()) + (((this.f27667b == null ? 0 : this.f27667b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f27666a) * 31)) * 31)) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }
}
