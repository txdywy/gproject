package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class hc extends C0758b {
    public static volatile hc[] f12535a;
    public int f12536b;
    public String f12537c;
    public byte[] f12538d;
    public String f12539e;
    public long f12540f;
    public long f12541g;
    public long f12542h;
    public long f12543i;

    public static hc[] bh_() {
        if (f12535a == null) {
            synchronized (h.b) {
                if (f12535a == null) {
                    f12535a = new hc[0];
                }
            }
        }
        return f12535a;
    }

    public hc() {
        this.f12536b = 0;
        this.f12537c = "";
        this.f12538d = l.l;
        this.f12539e = "";
        this.f12540f = 0;
        this.f12541g = 0;
        this.f12542h = 0;
        this.f12543i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        if ((this.f12536b & 1) != (hcVar.f12536b & 1)) {
            return false;
        }
        if (!this.f12537c.equals(hcVar.f12537c)) {
            return false;
        }
        if ((this.f12536b & 2) != (hcVar.f12536b & 2)) {
            return false;
        }
        if (!Arrays.equals(this.f12538d, hcVar.f12538d)) {
            return false;
        }
        if ((this.f12536b & 4) != (hcVar.f12536b & 4)) {
            return false;
        }
        if (!this.f12539e.equals(hcVar.f12539e)) {
            return false;
        }
        if ((this.f12536b & 8) != (hcVar.f12536b & 8)) {
            return false;
        }
        if (this.f12540f != hcVar.f12540f) {
            return false;
        }
        if ((this.f12536b & 16) != (hcVar.f12536b & 16)) {
            return false;
        }
        if (this.f12541g != hcVar.f12541g) {
            return false;
        }
        if ((this.f12536b & 32) != (hcVar.f12536b & 32)) {
            return false;
        }
        if (this.f12542h != hcVar.f12542h) {
            return false;
        }
        if ((this.f12536b & 64) != (hcVar.f12536b & 64)) {
            return false;
        }
        if (this.f12543i != hcVar.f12543i) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hcVar.aO);
        }
        if (hcVar.aO == null || hcVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f12537c.hashCode()) * 31) + Arrays.hashCode(this.f12538d)) * 31) + this.f12539e.hashCode();
        long j = this.f12540f;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12541g;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12542h;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12543i;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12536b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12537c);
        }
        if ((this.f12536b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12538d);
        }
        if ((this.f12536b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12539e);
        }
        if ((this.f12536b & 8) != 0) {
            codedOutputByteBufferNano.b(4, this.f12540f);
        }
        if ((this.f12536b & 16) != 0) {
            codedOutputByteBufferNano.b(5, this.f12541g);
        }
        if ((this.f12536b & 32) != 0) {
            codedOutputByteBufferNano.b(6, this.f12542h);
        }
        if ((this.f12536b & 64) != 0) {
            codedOutputByteBufferNano.b(7, this.f12543i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12536b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12537c);
        }
        if ((this.f12536b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12538d);
        }
        if ((this.f12536b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12539e);
        }
        if ((this.f12536b & 8) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f12540f);
        }
        if ((this.f12536b & 16) != 0) {
            b += CodedOutputByteBufferNano.f(5, this.f12541g);
        }
        if ((this.f12536b & 32) != 0) {
            b += CodedOutputByteBufferNano.f(6, this.f12542h);
        }
        if ((this.f12536b & 64) != 0) {
            return b + CodedOutputByteBufferNano.f(7, this.f12543i);
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
                    this.f12537c = aVar.f();
                    this.f12536b |= 1;
                    continue;
                case 18:
                    this.f12538d = aVar.g();
                    this.f12536b |= 2;
                    continue;
                case 26:
                    this.f12539e = aVar.f();
                    this.f12536b |= 4;
                    continue;
                case 32:
                    this.f12540f = aVar.j();
                    this.f12536b |= 8;
                    continue;
                case 40:
                    this.f12541g = aVar.j();
                    this.f12536b |= 16;
                    continue;
                case 48:
                    this.f12542h = aVar.j();
                    this.f12536b |= 32;
                    continue;
                case 56:
                    this.f12543i = aVar.j();
                    this.f12536b |= 64;
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
