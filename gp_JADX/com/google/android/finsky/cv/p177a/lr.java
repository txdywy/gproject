package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class lr extends C0758b {
    public static volatile lr[] f13049a;
    public int f13050b;
    public bd[] f13051c;
    public String f13052d;
    public String f13053e;

    public static lr[] bP_() {
        if (f13049a == null) {
            synchronized (h.b) {
                if (f13049a == null) {
                    f13049a = new lr[0];
                }
            }
        }
        return f13049a;
    }

    public lr() {
        this.f13050b = 0;
        this.f13051c = bd.aH_();
        this.f13052d = "";
        this.f13053e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lr)) {
            return false;
        }
        lr lrVar = (lr) obj;
        if (!h.a(this.f13051c, lrVar.f13051c)) {
            return false;
        }
        if ((this.f13050b & 1) != (lrVar.f13050b & 1)) {
            return false;
        }
        if (!this.f13052d.equals(lrVar.f13052d)) {
            return false;
        }
        if ((this.f13050b & 2) != (lrVar.f13050b & 2)) {
            return false;
        }
        if (!this.f13053e.equals(lrVar.f13053e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lrVar.aO);
        }
        if (lrVar.aO == null || lrVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f13051c)) * 31) + this.f13052d.hashCode()) * 31) + this.f13053e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13051c != null && this.f13051c.length > 0) {
            for (C0757i c0757i : this.f13051c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f13050b & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f13052d);
        }
        if ((this.f13050b & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f13053e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13051c != null && this.f13051c.length > 0) {
            for (C0757i c0757i : this.f13051c) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f13050b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13052d);
        }
        if ((this.f13050b & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f13053e);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = l.a(aVar, 10);
                    a = this.f13051c == null ? 0 : this.f13051c.length;
                    Object obj = new bd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13051c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bd();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bd();
                    aVar.a(obj[a]);
                    this.f13051c = obj;
                    continue;
                case 18:
                    this.f13052d = aVar.f();
                    this.f13050b |= 1;
                    continue;
                case 26:
                    this.f13053e = aVar.f();
                    this.f13050b |= 2;
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
