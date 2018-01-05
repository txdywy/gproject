package com.google.android.libraries.performance.primes.metriccapture;

import android.content.pm.IPackageStatsObserver;

final class C6014f extends PackageStatsInvocation {
    C6014f(String str, Class[] clsArr) {
        super(str, clsArr);
    }

    final Object[] mo5260a(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        return new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
    }
}
