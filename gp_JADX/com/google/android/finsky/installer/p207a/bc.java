package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.installer.C3284c;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

final class bc implements C3284c {
    public final int f17000a;
    public final File f17001b;
    public final int f17002c;
    public final File f17003d;

    bc(int i, File file, int i2, File file2) {
        this.f17000a = i;
        this.f17001b = file;
        this.f17002c = i2;
        this.f17003d = file2;
    }

    public final int mo3421a() {
        return this.f17000a;
    }

    public final int mo3422b() {
        return this.f17002c;
    }

    public final File mo3423c() {
        if (this.f17000a < 0) {
            FinskyLog.m21669e("Main OBB file does not exist.", new Object[0]);
        }
        return this.f17001b;
    }

    public final File mo3424d() {
        if (this.f17002c < 0) {
            FinskyLog.m21669e("Patch OBB file does not exist.", new Object[0]);
        }
        return this.f17003d;
    }

    public final String mo3425e() {
        if (this.f17000a >= 0) {
            return this.f17001b.toURI().toString();
        }
        FinskyLog.m21669e("Main OBB URI does not exist.", new Object[0]);
        return "";
    }

    public final String mo3426f() {
        if (this.f17002c >= 0) {
            return this.f17003d.toURI().toString();
        }
        FinskyLog.m21669e("Patch OBB URI does not exist.", new Object[0]);
        return "";
    }

    public final void mo3427g() {
    }
}
