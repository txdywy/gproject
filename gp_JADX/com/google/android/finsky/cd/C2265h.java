package com.google.android.finsky.cd;

import com.google.android.finsky.cv.p177a.cv;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C2265h extends C0758b {
    public int f11245a;
    public cv[] f11246b;
    public int f11247c;

    public final C2265h m11713a(int i) {
        this.f11245a |= 1;
        this.f11247c = i;
        return this;
    }

    public C2265h() {
        this.f11245a = 0;
        this.f11246b = cv.aS_();
        this.f11247c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11246b != null && this.f11246b.length > 0) {
            for (C0757i c0757i : this.f11246b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f11245a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f11247c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11246b != null && this.f11246b.length > 0) {
            for (C0757i c0757i : this.f11246b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f11245a & 1) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f11247c);
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
                    a = this.f11246b == null ? 0 : this.f11246b.length;
                    Object obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11246b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new cv();
                    aVar.a(obj[a]);
                    this.f11246b = obj;
                    continue;
                case 16:
                    this.f11247c = aVar.i();
                    this.f11245a |= 1;
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
