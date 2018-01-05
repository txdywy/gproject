package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class ce extends C0758b {
    public static volatile ce[] f12024a;
    public int f12025b;
    public boolean f12026c;
    public String f12027d;
    public String f12028e;
    public byte[] f12029f;

    public static ce[] aO_() {
        if (f12024a == null) {
            synchronized (h.b) {
                if (f12024a == null) {
                    f12024a = new ce[0];
                }
            }
        }
        return f12024a;
    }

    public ce() {
        this.f12025b = 0;
        this.f12026c = false;
        this.f12027d = "";
        this.f12028e = "";
        this.f12029f = l.l;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj;
        if ((this.f12025b & 1) != (ceVar.f12025b & 1)) {
            return false;
        }
        if (this.f12026c != ceVar.f12026c) {
            return false;
        }
        if ((this.f12025b & 2) != (ceVar.f12025b & 2)) {
            return false;
        }
        if (!this.f12027d.equals(ceVar.f12027d)) {
            return false;
        }
        if ((this.f12025b & 4) != (ceVar.f12025b & 4)) {
            return false;
        }
        if (!this.f12028e.equals(ceVar.f12028e)) {
            return false;
        }
        if ((this.f12025b & 8) != (ceVar.f12025b & 8)) {
            return false;
        }
        if (!Arrays.equals(this.f12029f, ceVar.f12029f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ceVar.aO);
        }
        if (ceVar.aO == null || ceVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.f12026c ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f12027d.hashCode()) * 31) + this.f12028e.hashCode()) * 31) + Arrays.hashCode(this.f12029f)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12025b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12026c);
        }
        if ((this.f12025b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12027d);
        }
        if ((this.f12025b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12028e);
        }
        if ((this.f12025b & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12029f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12025b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f12025b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12027d);
        }
        if ((this.f12025b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12028e);
        }
        if ((this.f12025b & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12029f);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12026c = aVar.e();
                    this.f12025b |= 1;
                    continue;
                case 18:
                    this.f12027d = aVar.f();
                    this.f12025b |= 2;
                    continue;
                case 26:
                    this.f12028e = aVar.f();
                    this.f12025b |= 4;
                    continue;
                case 34:
                    this.f12029f = aVar.g();
                    this.f12025b |= 8;
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
