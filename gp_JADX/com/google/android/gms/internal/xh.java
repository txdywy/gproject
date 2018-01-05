package com.google.android.gms.internal;

public final class xh extends wu implements Cloneable {
    public static volatile xh[] f27696a;
    public String f27697b;
    public String f27698c;

    public xh() {
        this.f27697b = "";
        this.f27698c = "";
        this.ah = null;
        this.ai = -1;
    }

    public static xh[] m25960b() {
        if (f27696a == null) {
            synchronized (wy.f27652b) {
                if (f27696a == null) {
                    f27696a = new xh[0];
                }
            }
        }
        return f27696a;
    }

    private final xh m25961f() {
        try {
            return (xh) super.mo4948c();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (!(this.f27697b == null || this.f27697b.equals(""))) {
            a += wt.m25892b(1, this.f27697b);
        }
        return (this.f27698c == null || this.f27698c.equals("")) ? a : a + wt.m25892b(2, this.f27698c);
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27697b = wsVar.m25872c();
                    continue;
                case 18:
                    this.f27698c = wsVar.m25872c();
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
        if (!(this.f27697b == null || this.f27697b.equals(""))) {
            wtVar.m25904a(1, this.f27697b);
        }
        if (!(this.f27698c == null || this.f27698c.equals(""))) {
            wtVar.m25904a(2, this.f27698c);
        }
        super.mo4702a(wtVar);
    }

    public final /* synthetic */ wu mo4948c() {
        return (xh) clone();
    }

    public final /* synthetic */ Object clone() {
        return m25961f();
    }

    public final /* synthetic */ wz mo4704d() {
        return (xh) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xh)) {
            return false;
        }
        xh xhVar = (xh) obj;
        if (this.f27697b == null) {
            if (xhVar.f27697b != null) {
                return false;
            }
        } else if (!this.f27697b.equals(xhVar.f27697b)) {
            return false;
        }
        if (this.f27698c == null) {
            if (xhVar.f27698c != null) {
                return false;
            }
        } else if (!this.f27698c.equals(xhVar.f27698c)) {
            return false;
        }
        return (this.ah == null || this.ah.m25913a()) ? xhVar.ah == null || xhVar.ah.m25913a() : this.ah.equals(xhVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f27698c == null ? 0 : this.f27698c.hashCode()) + (((this.f27697b == null ? 0 : this.f27697b.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }
}
