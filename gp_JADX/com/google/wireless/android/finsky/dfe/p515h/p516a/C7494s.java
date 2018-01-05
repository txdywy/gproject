package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7494s extends b {
    public static volatile C7494s[] f38135a;
    public int f38136b;
    public String f38137c;
    public String f38138d;

    public static C7494s[] m35843d() {
        if (f38135a == null) {
            synchronized (C7219h.f35465b) {
                if (f38135a == null) {
                    f38135a = new C7494s[0];
                }
            }
        }
        return f38135a;
    }

    public C7494s() {
        this.f38136b = 0;
        this.f38137c = "";
        this.f38138d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35845a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38136b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38137c);
        }
        if ((this.f38136b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38138d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35846b() {
        int b = super.b();
        if ((this.f38136b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38137c);
        }
        if ((this.f38136b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38138d);
        }
        return b;
    }

    public final /* synthetic */ i m35844a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38137c = c7213a.m33564f();
                    this.f38136b |= 1;
                    continue;
                case 18:
                    this.f38138d = c7213a.m33564f();
                    this.f38136b |= 2;
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
