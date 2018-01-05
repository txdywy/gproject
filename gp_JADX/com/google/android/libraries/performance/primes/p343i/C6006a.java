package com.google.android.libraries.performance.primes.p343i;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import com.google.android.libraries.performance.primes.C5989do;

public final class C6006a {
    public static Long m27869a(Context context) {
        try {
            try {
                return Long.valueOf(Long.parseLong(context.getResources().getString(C6007b.primes_version)));
            } catch (NumberFormatException e) {
                String str = "PrimesVersion";
                String str2 = "Couldn't parse Primes version number from ";
                String valueOf = String.valueOf(r0);
                C5989do.m27824a(5, str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                return null;
            }
        } catch (NotFoundException e2) {
            C5989do.m27824a(5, "PrimesVersion", "Primes version number string not found", new Object[0]);
        }
    }
}
