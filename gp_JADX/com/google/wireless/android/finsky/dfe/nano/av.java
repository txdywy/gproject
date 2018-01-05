package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class av extends b {
    public static volatile av[] f38392a;
    public int f38393b;
    public String f38394c;
    public byte[] f38395d;
    public String f38396e;
    public String f38397f;

    public static av[] m36035d() {
        if (f38392a == null) {
            synchronized (C7219h.f35465b) {
                if (f38392a == null) {
                    f38392a = new av[0];
                }
            }
        }
        return f38392a;
    }

    public av() {
        this.f38393b = 0;
        this.f38394c = "";
        this.f38395d = C7222l.f35479l;
        this.f38396e = "";
        this.f38397f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36037a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38393b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38394c);
        }
        if ((this.f38393b & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f38395d);
        }
        if ((this.f38393b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38396e);
        }
        if ((this.f38393b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38397f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36038b() {
        int b = super.b();
        if ((this.f38393b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38394c);
        }
        if ((this.f38393b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f38395d);
        }
        if ((this.f38393b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38396e);
        }
        if ((this.f38393b & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f38397f);
        }
        return b;
    }

    public final /* synthetic */ i m36036a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38394c = c7213a.m33564f();
                    this.f38393b |= 1;
                    continue;
                case 18:
                    this.f38395d = c7213a.m33565g();
                    this.f38393b |= 2;
                    continue;
                case 26:
                    this.f38396e = c7213a.m33564f();
                    this.f38393b |= 4;
                    continue;
                case 34:
                    this.f38397f = c7213a.m33564f();
                    this.f38393b |= 8;
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
