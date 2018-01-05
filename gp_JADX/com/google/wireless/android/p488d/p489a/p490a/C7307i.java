package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7307i extends b {
    public static volatile C7307i[] f36264b;
    public int f36265a;
    public String f36266c;
    public String f36267d;
    public String f36268e;
    public String f36269f;
    public String f36270g;
    public String f36271h;
    public String f36272i;

    public static C7307i[] m34551d() {
        if (f36264b == null) {
            synchronized (C7219h.f35465b) {
                if (f36264b == null) {
                    f36264b = new C7307i[0];
                }
            }
        }
        return f36264b;
    }

    public C7307i() {
        this.f36265a = -1;
        this.f36266c = "";
        this.f36267d = "";
        this.f36268e = "";
        this.f36265a = -1;
        this.f36265a = -1;
        this.f36265a = -1;
        this.f36272i = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34553a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36266c == null || this.f36266c.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36266c);
        }
        if (!(this.f36267d == null || this.f36267d.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36267d);
        }
        if (!(this.f36268e == null || this.f36268e.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36268e);
        }
        if (this.f36265a == 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36269f);
        }
        if (this.f36265a == 1) {
            codedOutputByteBufferNano.m33521a(5, this.f36270g);
        }
        if (this.f36265a == 2) {
            codedOutputByteBufferNano.m33521a(6, this.f36271h);
        }
        if (!(this.f36272i == null || this.f36272i.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36272i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34554b() {
        int b = super.b();
        if (!(this.f36266c == null || this.f36266c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36266c);
        }
        if (!(this.f36267d == null || this.f36267d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36267d);
        }
        if (!(this.f36268e == null || this.f36268e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36268e);
        }
        if (this.f36265a == 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36269f);
        }
        if (this.f36265a == 1) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36270g);
        }
        if (this.f36265a == 2) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36271h);
        }
        if (this.f36272i == null || this.f36272i.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(7, this.f36272i);
    }

    public final /* synthetic */ i m34552a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36266c = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36267d = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36268e = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36269f = c7213a.m33564f();
                    this.f36265a = 0;
                    continue;
                case 42:
                    this.f36270g = c7213a.m33564f();
                    this.f36265a = 1;
                    continue;
                case 50:
                    this.f36271h = c7213a.m33564f();
                    this.f36265a = 2;
                    continue;
                case 58:
                    this.f36272i = c7213a.m33564f();
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
