package com.squareup.okhttp;

public final class C7683p {
    public boolean f39784a;
    public String[] f39785b;
    public String[] f39786c;
    public boolean f39787d;

    C7683p(boolean z) {
        this.f39784a = z;
    }

    public C7683p(C7682o c7682o) {
        this.f39784a = c7682o.f39780e;
        this.f39785b = c7682o.f39782g;
        this.f39786c = c7682o.f39783h;
        this.f39787d = c7682o.f39781f;
    }

    public final C7683p m37003a(C7679k... c7679kArr) {
        if (this.f39784a) {
            String[] strArr = new String[c7679kArr.length];
            for (int i = 0; i < c7679kArr.length; i++) {
                strArr[i] = c7679kArr[i].aS;
            }
            return m37004a(strArr);
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final C7683p m37004a(String... strArr) {
        if (!this.f39784a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        } else if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        } else {
            this.f39785b = (String[]) strArr.clone();
            return this;
        }
    }

    public final C7683p m37002a(ao... aoVarArr) {
        if (this.f39784a) {
            String[] strArr = new String[aoVarArr.length];
            for (int i = 0; i < aoVarArr.length; i++) {
                strArr[i] = aoVarArr[i].f39333e;
            }
            return m37006b(strArr);
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final C7683p m37006b(String... strArr) {
        if (!this.f39784a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        } else {
            this.f39786c = (String[]) strArr.clone();
            return this;
        }
    }

    public final C7683p m37001a() {
        if (this.f39784a) {
            this.f39787d = true;
            return this;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final C7682o m37005b() {
        return new C7682o(this);
    }
}
