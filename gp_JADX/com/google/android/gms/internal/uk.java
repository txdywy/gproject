package com.google.android.gms.internal;

class uk extends uj {
    public final byte[] f27517f;

    uk(byte[] bArr) {
        this.f27517f = bArr;
    }

    public byte mo4891a(int i) {
        return this.f27517f[i];
    }

    public int mo4892a() {
        return this.f27517f.length;
    }

    protected final int mo4893a(int i, int i2) {
        return vd.m25787a(i, this.f27517f, mo4900e(), i2);
    }

    final void mo4894a(uc ucVar) {
        ucVar.mo4924a(this.f27517f, mo4900e(), mo4892a());
    }

    protected void mo4895a(byte[] bArr, int i) {
        System.arraycopy(this.f27517f, 0, bArr, 0, i);
    }

    final boolean mo4896a(ud udVar, int i) {
        if (i > udVar.mo4892a()) {
            throw new IllegalArgumentException("Length too large: " + i + mo4892a());
        } else if (i + 0 > udVar.mo4892a()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i + ", " + udVar.mo4892a());
        } else if (!(udVar instanceof uk)) {
            return udVar.mo4897b(i + 0).equals(mo4897b(i));
        } else {
            uk ukVar = (uk) udVar;
            byte[] bArr = this.f27517f;
            byte[] bArr2 = ukVar.f27517f;
            int e = mo4900e() + i;
            int e2 = mo4900e();
            int e3 = ukVar.mo4900e();
            while (e2 < e) {
                if (bArr[e2] != bArr2[e3]) {
                    return false;
                }
                e2++;
                e3++;
            }
            return true;
        }
    }

    public final ud mo4897b(int i) {
        int a = ud.m25651a(0, i, mo4892a());
        return a == 0 ? ud.f27511a : new ug(this.f27517f, mo4900e() + 0, a);
    }

    public final um mo4898d() {
        return um.m25685a(this.f27517f, mo4900e(), mo4892a());
    }

    protected int mo4900e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        if (mo4892a() != ((ud) obj).mo4892a()) {
            return false;
        }
        if (mo4892a() == 0) {
            return true;
        }
        if (!(obj instanceof uk)) {
            return obj.equals(this);
        }
        uk ukVar = (uk) obj;
        int i = this.f27513c;
        int i2 = ukVar.f27513c;
        return (i == 0 || i2 == 0 || i == i2) ? mo4896a((uk) obj, mo4892a()) : false;
    }
}
