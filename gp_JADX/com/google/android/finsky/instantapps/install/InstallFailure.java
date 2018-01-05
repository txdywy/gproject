package com.google.android.finsky.instantapps.install;

public class InstallFailure extends Exception {
    public InstallFailure(String str) {
        super(str);
    }

    public InstallFailure(Throwable th) {
        super(th);
    }
}
