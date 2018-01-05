package com.google.archivepatcher.p406a;

import java.util.zip.Inflater;

public final class C6870f {
    public boolean f33913a = true;
    public int f33914b = 32768;
    public int f33915c = 32768;
    public Inflater f33916d = null;
    public boolean f33917e = false;

    public final void m31241a() {
        if (this.f33916d != null) {
            this.f33916d.end();
            this.f33916d = null;
        }
    }
}
