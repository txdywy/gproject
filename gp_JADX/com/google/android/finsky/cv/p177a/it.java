package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class it extends C0758b {
    public static volatile it[] f12705b;
    public int f12706a;
    public int f12707c;
    public String f12708d;
    public String f12709e;
    public boolean f12710f;
    public long f12711g;
    public int f12712h;

    public static it[] bp_() {
        if (f12705b == null) {
            synchronized (h.b) {
                if (f12705b == null) {
                    f12705b = new it[0];
                }
            }
        }
        return f12705b;
    }

    public final it m12815a(String str) {
        this.f12707c |= 1;
        this.f12708d = str;
        return this;
    }

    public final String bq_() {
        if (this.f12706a == 0) {
            return this.f12709e;
        }
        return "";
    }

    public final boolean m12820d() {
        return this.f12706a == 0;
    }

    public final it m12819b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f12706a = -1;
        this.f12706a = 0;
        this.f12709e = str;
        return this;
    }

    public final boolean m12821e() {
        if (this.f12706a == 1) {
            return this.f12710f;
        }
        return false;
    }

    public final boolean m12822f() {
        return this.f12706a == 1;
    }

    public final long m12823g() {
        if (this.f12706a == 2) {
            return this.f12711g;
        }
        return 0;
    }

    public final boolean m12824h() {
        return this.f12706a == 2;
    }

    public final it m12814a(int i) {
        this.f12706a = -1;
        this.f12706a = 3;
        this.f12712h = i;
        return this;
    }

    public it() {
        this.f12706a = -1;
        this.f12707c = 0;
        this.f12708d = "";
        this.f12706a = -1;
        this.f12709e = "";
        this.f12706a = -1;
        this.f12710f = false;
        this.f12706a = -1;
        this.f12711g = 0;
        this.f12706a = -1;
        this.f12712h = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof it)) {
            return false;
        }
        it itVar = (it) obj;
        if ((this.f12707c & 1) != (itVar.f12707c & 1)) {
            return false;
        }
        if (!this.f12708d.equals(itVar.f12708d)) {
            return false;
        }
        if (this.f12706a != itVar.f12706a) {
            return false;
        }
        if (this.f12706a == 0 && !this.f12709e.equals(itVar.f12709e)) {
            return false;
        }
        if (this.f12706a != itVar.f12706a) {
            return false;
        }
        if (this.f12706a == 1 && this.f12710f != itVar.f12710f) {
            return false;
        }
        if (this.f12706a != itVar.f12706a) {
            return false;
        }
        if (this.f12706a == 2 && this.f12711g != itVar.f12711g) {
            return false;
        }
        if (this.f12706a != itVar.f12706a) {
            return false;
        }
        if (this.f12706a == 3 && this.f12712h != itVar.f12712h) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(itVar.aO);
        }
        if (itVar.aO == null || itVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f12708d.hashCode() + ((getClass().getName().hashCode() + 527) * 31);
        String str = this.f12709e;
        if (this.f12706a != 0) {
            str = "";
        }
        hashCode = (hashCode * 31) + str.hashCode();
        boolean z = this.f12710f;
        if (this.f12706a != 1) {
            z = false;
        }
        int i2 = (hashCode * 31) + (z ? 1231 : 1237);
        long j = this.f12711g;
        if (this.f12706a != 2) {
            j = 0;
        }
        hashCode = (i2 * 31) + ((int) (j ^ (j >>> 32)));
        int i3 = this.f12712h;
        if (this.f12706a != 3) {
            i3 = 0;
        }
        i3 = (i3 + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return i3 + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12707c & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12708d);
        }
        if (this.f12706a == 0) {
            codedOutputByteBufferNano.a(2, this.f12709e);
        }
        if (this.f12706a == 1) {
            codedOutputByteBufferNano.a(3, this.f12710f);
        }
        if (this.f12706a == 2) {
            codedOutputByteBufferNano.b(4, this.f12711g);
        }
        if (this.f12706a == 3) {
            codedOutputByteBufferNano.a(5, this.f12712h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12707c & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12708d);
        }
        if (this.f12706a == 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12709e);
        }
        if (this.f12706a == 1) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if (this.f12706a == 2) {
            b += CodedOutputByteBufferNano.f(4, this.f12711g);
        }
        if (this.f12706a == 3) {
            return b + CodedOutputByteBufferNano.d(5, this.f12712h);
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
                    this.f12708d = aVar.f();
                    this.f12707c |= 1;
                    continue;
                case 18:
                    this.f12709e = aVar.f();
                    this.f12706a = 0;
                    continue;
                case 24:
                    this.f12710f = aVar.e();
                    this.f12706a = 1;
                    continue;
                case 32:
                    this.f12711g = aVar.j();
                    this.f12706a = 2;
                    continue;
                case 40:
                    this.f12712h = aVar.i();
                    this.f12706a = 3;
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
