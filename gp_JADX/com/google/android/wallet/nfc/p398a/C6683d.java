package com.google.android.wallet.nfc.p398a;

public final class C6683d {
    public byte f32980a = (byte) 0;
    public byte f32981b;
    public byte f32982c = (byte) 0;
    public byte f32983d = (byte) 0;
    public byte[] f32984e;
    public byte f32985f;
    public boolean f32986g;
    public boolean f32987h;

    public C6683d(byte b) {
        this.f32981b = b;
    }

    public final C6683d m30311a(byte[] bArr) {
        this.f32986g = bArr != null;
        this.f32984e = bArr;
        return this;
    }

    public final C6683d m30310a(byte b) {
        this.f32987h = true;
        this.f32985f = b;
        return this;
    }

    public final C6682c m30309a() {
        return new C6682c(this.f32980a, this.f32981b, this.f32982c, this.f32983d, this.f32984e, this.f32985f, this.f32986g, this.f32987h);
    }
}
