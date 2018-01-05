package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class gp extends C0758b {
    public static volatile gp[] f12471a;
    public int f12472b;
    public String f12473c;
    public eu f12474d;

    public static gp[] bg_() {
        if (f12471a == null) {
            synchronized (h.b) {
                if (f12471a == null) {
                    f12471a = new gp[0];
                }
            }
        }
        return f12471a;
    }

    public gp() {
        this.f12472b = 0;
        this.f12473c = "";
        this.f12474d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        if ((this.f12472b & 1) != (gpVar.f12472b & 1)) {
            return false;
        }
        if (!this.f12473c.equals(gpVar.f12473c)) {
            return false;
        }
        if (this.f12474d == null) {
            if (gpVar.f12474d != null) {
                return false;
            }
        } else if (!this.f12474d.equals(gpVar.f12474d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gpVar.aO);
        }
        if (gpVar.aO == null || gpVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12473c.hashCode();
        eu euVar = this.f12474d;
        hashCode = ((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12472b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12473c);
        }
        if (this.f12474d != null) {
            codedOutputByteBufferNano.b(2, this.f12474d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12472b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12473c);
        }
        if (this.f12474d != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12474d);
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
                    this.f12473c = aVar.f();
                    this.f12472b |= 1;
                    continue;
                case 18:
                    if (this.f12474d == null) {
                        this.f12474d = new eu();
                    }
                    aVar.a(this.f12474d);
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
