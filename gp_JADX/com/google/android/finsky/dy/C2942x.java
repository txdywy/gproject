package com.google.android.finsky.dy;

import com.google.android.finsky.verifier.p259a.p260a.ab;

public final class C2942x {
    public ab f15561a = new ab();

    public final C2942x m15305a(byte[] bArr) {
        ab abVar = this.f15561a;
        if (bArr == null) {
            throw new NullPointerException();
        }
        abVar.f24100a |= 1;
        abVar.f24101b = bArr;
        return this;
    }

    public final C2942x m15303a(long j) {
        ab abVar = this.f15561a;
        abVar.f24100a |= 2;
        abVar.f24102c = j;
        return this;
    }

    public final C2942x m15302a(int i) {
        ab abVar = this.f15561a;
        abVar.f24100a |= 4;
        abVar.f24103d = i;
        return this;
    }

    public final C2942x m15304a(String str) {
        ab abVar;
        if (str == null) {
            abVar = this.f15561a;
            abVar.f24104e = "";
            abVar.f24100a &= -9;
        } else {
            abVar = this.f15561a;
            if (str == null) {
                throw new NullPointerException();
            }
            abVar.f24100a |= 8;
            abVar.f24104e = str;
        }
        return this;
    }

    public final C2942x m15307b(String str) {
        ab abVar;
        if (str == null) {
            abVar = this.f15561a;
            abVar.f24105f = "";
            abVar.f24100a &= -17;
        } else {
            abVar = this.f15561a;
            if (str == null) {
                throw new NullPointerException();
            }
            abVar.f24100a |= 16;
            abVar.f24105f = str;
        }
        return this;
    }

    public final C2942x m15308c(String str) {
        ab abVar;
        if (str == null) {
            abVar = this.f15561a;
            abVar.f24106g = "";
            abVar.f24100a &= -33;
        } else {
            abVar = this.f15561a;
            if (str == null) {
                throw new NullPointerException();
            }
            abVar.f24100a |= 32;
            abVar.f24106g = str;
        }
        return this;
    }

    public final C2942x m15306b(int i) {
        ab abVar = this.f15561a;
        abVar.f24108i = i;
        abVar.f24100a |= 128;
        return this;
    }
}
