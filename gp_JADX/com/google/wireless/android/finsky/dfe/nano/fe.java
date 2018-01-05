package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fe extends b {
    public static volatile fe[] f38906a;
    public int f38907b;
    public String f38908c;
    public String f38909d;
    public String f38910e;

    public static fe[] m36406d() {
        if (f38906a == null) {
            synchronized (C7219h.f35465b) {
                if (f38906a == null) {
                    f38906a = new fe[0];
                }
            }
        }
        return f38906a;
    }

    public fe() {
        this.f38907b = 0;
        this.f38908c = "";
        this.f38909d = "";
        this.f38910e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36408a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38907b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38908c);
        }
        if ((this.f38907b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38909d);
        }
        if ((this.f38907b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38910e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36409b() {
        int b = super.b();
        if ((this.f38907b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38908c);
        }
        if ((this.f38907b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38909d);
        }
        if ((this.f38907b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38910e);
        }
        return b;
    }

    public final /* synthetic */ i m36407a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38908c = c7213a.m33564f();
                    this.f38907b |= 1;
                    continue;
                case 18:
                    this.f38909d = c7213a.m33564f();
                    this.f38907b |= 2;
                    continue;
                case 26:
                    this.f38910e = c7213a.m33564f();
                    this.f38907b |= 4;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
