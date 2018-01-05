package com.google.android.gms.internal;

public final class ct extends wu {
    public byte[][] f26646a;
    public byte[] f26647b;
    public Integer f26648c;
    public Integer f26649d;

    public ct() {
        this.f26646a = xc.f27659e;
        this.f26647b = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int i = 0;
        int a = super.mo4701a();
        if (this.f26646a == null || this.f26646a.length <= 0) {
            i = a;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f26646a.length) {
                byte[] bArr = this.f26646a[i];
                if (bArr != null) {
                    i3++;
                    i2 += wt.m25886a(bArr);
                }
                i++;
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.f26647b != null) {
            i += wt.m25893b(2, this.f26647b);
        }
        if (this.f26648c != null) {
            i += wt.m25889b(3, this.f26648c.intValue());
        }
        return this.f26649d != null ? i + wt.m25889b(4, this.f26649d.intValue()) : i;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            int a2;
            int e;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = xc.m25935a(wsVar, 10);
                    a = this.f26646a == null ? 0 : this.f26646a.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f26646a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25874d();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25874d();
                    this.f26646a = obj;
                    continue;
                case 18:
                    this.f26647b = wsVar.m25874d();
                    continue;
                case 24:
                    a2 = wsVar.m25881j();
                    e = wsVar.m25875e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.f26648c = Integer.valueOf(e);
                            break;
                        default:
                            wsVar.m25876e(a2);
                            m24220a(wsVar, a);
                            continue;
                    }
                case 32:
                    a2 = wsVar.m25881j();
                    e = wsVar.m25875e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26649d = Integer.valueOf(e);
                            break;
                        default:
                            wsVar.m25876e(a2);
                            m24220a(wsVar, a);
                            continue;
                    }
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
        if (this.f26646a != null && this.f26646a.length > 0) {
            for (byte[] bArr : this.f26646a) {
                if (bArr != null) {
                    wtVar.m25906a(1, bArr);
                }
            }
        }
        if (this.f26647b != null) {
            wtVar.m25906a(2, this.f26647b);
        }
        if (this.f26648c != null) {
            wtVar.m25901a(3, this.f26648c.intValue());
        }
        if (this.f26649d != null) {
            wtVar.m25901a(4, this.f26649d.intValue());
        }
        super.mo4702a(wtVar);
    }
}
