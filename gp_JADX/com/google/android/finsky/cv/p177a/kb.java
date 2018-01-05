package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class kb extends C0758b {
    public static volatile kb[] f12854a;
    public int f12855b;
    public int f12856c;
    public String f12857d;
    public bd f12858e;
    public bd f12859f;

    public static kb[] bF_() {
        if (f12854a == null) {
            synchronized (h.b) {
                if (f12854a == null) {
                    f12854a = new kb[0];
                }
            }
        }
        return f12854a;
    }

    public kb() {
        this.f12855b = 0;
        this.f12856c = 0;
        this.f12857d = "";
        this.f12858e = null;
        this.f12859f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        if ((this.f12855b & 1) != (kbVar.f12855b & 1)) {
            return false;
        }
        if (this.f12856c != kbVar.f12856c) {
            return false;
        }
        if ((this.f12855b & 2) != (kbVar.f12855b & 2)) {
            return false;
        }
        if (!this.f12857d.equals(kbVar.f12857d)) {
            return false;
        }
        if (this.f12858e == null) {
            if (kbVar.f12858e != null) {
                return false;
            }
        } else if (!this.f12858e.equals(kbVar.f12858e)) {
            return false;
        }
        if (this.f12859f == null) {
            if (kbVar.f12859f != null) {
                return false;
            }
        } else if (!this.f12859f.equals(kbVar.f12859f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kbVar.aO);
        }
        if (kbVar.aO == null || kbVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12856c) * 31) + this.f12857d.hashCode();
        bd bdVar = this.f12858e;
        hashCode = (bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31);
        bdVar = this.f12859f;
        hashCode = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12855b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12856c);
        }
        if ((this.f12855b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12857d);
        }
        if (this.f12858e != null) {
            codedOutputByteBufferNano.b(3, this.f12858e);
        }
        if (this.f12859f != null) {
            codedOutputByteBufferNano.b(4, this.f12859f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12855b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12856c);
        }
        if ((this.f12855b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12857d);
        }
        if (this.f12858e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12858e);
        }
        if (this.f12859f != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f12859f);
        }
        return b;
    }

    private final kb m12930b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12855b |= 1;
                    int o = aVar.o();
                    try {
                        this.f12856c = kc.m12934a(aVar.i());
                        this.f12855b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 18:
                    this.f12857d = aVar.f();
                    this.f12855b |= 2;
                    continue;
                case 26:
                    if (this.f12858e == null) {
                        this.f12858e = new bd();
                    }
                    aVar.a(this.f12858e);
                    continue;
                case 34:
                    if (this.f12859f == null) {
                        this.f12859f = new bd();
                    }
                    aVar.a(this.f12859f);
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12930b(aVar);
    }
}
