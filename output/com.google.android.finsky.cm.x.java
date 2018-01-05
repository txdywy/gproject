package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller$Session;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class com.google.android.finsky.cm.x extends FilterOutputStream
{

    public final OutputStream a;
    public final PackageInstaller$Session b;

    x(OutputStream p0, PackageInstaller$Session p1) {
        FilterOutputStream(p0);
        this.a = p0;
        this.b = p1;
    }

    public final void write(byte[] p0, int p1, int p2) {
        this.a.write(p0, p1, p2);
    }

}
