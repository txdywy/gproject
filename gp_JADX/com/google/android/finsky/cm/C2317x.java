package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller.Session;
import java.io.FilterOutputStream;
import java.io.OutputStream;

final class C2317x extends FilterOutputStream {
    public final OutputStream f11396a;
    public final Session f11397b;

    public C2317x(OutputStream outputStream, Session session) {
        super(outputStream);
        this.f11396a = outputStream;
        this.f11397b = session;
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f11396a.write(bArr, i, i2);
    }
}
