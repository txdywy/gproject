package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class gh extends C0758b {
    public int f12439a;
    public eu f12440b;
    public js f12441c;
    public ev f12442d;

    public final eu bc_() {
        if (this.f12439a == 0) {
            return this.f12440b;
        }
        return null;
    }

    public final boolean bd_() {
        return this.f12439a == 0;
    }

    public final js m12641d() {
        if (this.f12439a == 1) {
            return this.f12441c;
        }
        return null;
    }

    public final boolean m12642e() {
        return this.f12439a == 1;
    }

    public final ev m12643f() {
        if (this.f12439a == 2) {
            return this.f12442d;
        }
        return null;
    }

    public final boolean m12644g() {
        return this.f12439a == 2;
    }

    public gh() {
        this.f12439a = -1;
        this.f12439a = -1;
        this.f12440b = null;
        this.f12439a = -1;
        this.f12441c = null;
        this.f12439a = -1;
        this.f12442d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        if (this.f12440b == null) {
            if (ghVar.f12440b != null) {
                return false;
            }
        } else if (!this.f12440b.equals(ghVar.f12440b)) {
            return false;
        }
        if (this.f12441c == null) {
            if (ghVar.f12441c != null) {
                return false;
            }
        } else if (!this.f12441c.equals(ghVar.f12441c)) {
            return false;
        }
        if (this.f12442d == null) {
            if (ghVar.f12442d != null) {
                return false;
            }
        } else if (!this.f12442d.equals(ghVar.f12442d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ghVar.aO);
        }
        if (ghVar.aO == null || ghVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        eu euVar = this.f12440b;
        if (this.f12439a != 0) {
            euVar = null;
        }
        hashCode = (hashCode * 31) + (euVar == null ? 0 : euVar.hashCode());
        js jsVar = this.f12441c;
        if (this.f12439a != 1) {
            jsVar = null;
        }
        hashCode = (hashCode * 31) + (jsVar == null ? 0 : jsVar.hashCode());
        ev evVar = this.f12442d;
        if (this.f12439a != 2) {
            evVar = null;
        }
        int hashCode2 = ((evVar == null ? 0 : evVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode2 + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12439a == 0) {
            codedOutputByteBufferNano.b(1, this.f12440b);
        }
        if (this.f12439a == 1) {
            codedOutputByteBufferNano.b(2, this.f12441c);
        }
        if (this.f12439a == 2) {
            codedOutputByteBufferNano.b(3, this.f12442d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12439a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12440b);
        }
        if (this.f12439a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f12441c);
        }
        if (this.f12439a == 2) {
            return b + CodedOutputByteBufferNano.d(3, this.f12442d);
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
                    if (this.f12440b == null) {
                        this.f12440b = new eu();
                    }
                    aVar.a(this.f12440b);
                    this.f12439a = 0;
                    continue;
                case 18:
                    if (this.f12441c == null) {
                        this.f12441c = new js();
                    }
                    aVar.a(this.f12441c);
                    this.f12439a = 1;
                    continue;
                case 26:
                    if (this.f12442d == null) {
                        this.f12442d = new ev();
                    }
                    aVar.a(this.f12442d);
                    this.f12439a = 2;
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
