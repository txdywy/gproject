package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class hw extends C0758b {
    public static volatile hw[] f12628a;
    public int f12629b;
    public ck f12630c;
    public String f12631d;
    public hx f12632e;
    public hy f12633f;
    public hz f12634g;

    public static hw[] bm_() {
        if (f12628a == null) {
            synchronized (h.b) {
                if (f12628a == null) {
                    f12628a = new hw[0];
                }
            }
        }
        return f12628a;
    }

    public hw() {
        this.f12629b = 0;
        this.f12630c = null;
        this.f12631d = "";
        this.f12632e = null;
        this.f12633f = null;
        this.f12634g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hw)) {
            return false;
        }
        hw hwVar = (hw) obj;
        if (this.f12630c == null) {
            if (hwVar.f12630c != null) {
                return false;
            }
        } else if (!this.f12630c.equals(hwVar.f12630c)) {
            return false;
        }
        if ((this.f12629b & 1) != (hwVar.f12629b & 1)) {
            return false;
        }
        if (!this.f12631d.equals(hwVar.f12631d)) {
            return false;
        }
        if (this.f12632e == null) {
            if (hwVar.f12632e != null) {
                return false;
            }
        } else if (!this.f12632e.equals(hwVar.f12632e)) {
            return false;
        }
        if (this.f12633f == null) {
            if (hwVar.f12633f != null) {
                return false;
            }
        } else if (!this.f12633f.equals(hwVar.f12633f)) {
            return false;
        }
        if (this.f12634g == null) {
            if (hwVar.f12634g != null) {
                return false;
            }
        } else if (!this.f12634g.equals(hwVar.f12634g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hwVar.aO);
        }
        if (hwVar.aO == null || hwVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ck ckVar = this.f12630c;
        hashCode = (((ckVar == null ? 0 : ckVar.hashCode()) + (hashCode * 31)) * 31) + this.f12631d.hashCode();
        hx hxVar = this.f12632e;
        hashCode = (hxVar == null ? 0 : hxVar.hashCode()) + (hashCode * 31);
        hy hyVar = this.f12633f;
        hashCode = (hyVar == null ? 0 : hyVar.hashCode()) + (hashCode * 31);
        hz hzVar = this.f12634g;
        hashCode = ((hzVar == null ? 0 : hzVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12629b & 1) != 0) {
            codedOutputByteBufferNano.a(3, this.f12631d);
        }
        if (this.f12632e != null) {
            codedOutputByteBufferNano.b(4, this.f12632e);
        }
        if (this.f12633f != null) {
            codedOutputByteBufferNano.b(5, this.f12633f);
        }
        if (this.f12630c != null) {
            codedOutputByteBufferNano.b(7, this.f12630c);
        }
        if (this.f12634g != null) {
            codedOutputByteBufferNano.b(9, this.f12634g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12629b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12631d);
        }
        if (this.f12632e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12632e);
        }
        if (this.f12633f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f12633f);
        }
        if (this.f12630c != null) {
            b += CodedOutputByteBufferNano.d(7, this.f12630c);
        }
        if (this.f12634g != null) {
            return b + CodedOutputByteBufferNano.d(9, this.f12634g);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 26:
                    this.f12631d = aVar.f();
                    this.f12629b |= 1;
                    continue;
                case 34:
                    if (this.f12632e == null) {
                        this.f12632e = new hx();
                    }
                    aVar.a(this.f12632e);
                    continue;
                case 42:
                    if (this.f12633f == null) {
                        this.f12633f = new hy();
                    }
                    aVar.a(this.f12633f);
                    continue;
                case 58:
                    if (this.f12630c == null) {
                        this.f12630c = new ck();
                    }
                    aVar.a(this.f12630c);
                    continue;
                case 74:
                    if (this.f12634g == null) {
                        this.f12634g = new hz();
                    }
                    aVar.a(this.f12634g);
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
}
