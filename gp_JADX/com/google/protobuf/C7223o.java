package com.google.protobuf;

final class C7223o {
    public final CodedOutputStream f35480a = CodedOutputStream.m32583a(this.f35481b);
    public final byte[] f35481b;

    C7223o(int i) {
        this.f35481b = new byte[i];
    }

    public final C7203j m33625a() {
        if (this.f35480a.mo6024i() == 0) {
            return new C7211q(this.f35481b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
}
