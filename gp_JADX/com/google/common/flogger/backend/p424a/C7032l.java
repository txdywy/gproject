package com.google.common.flogger.backend.p424a;

import android.util.Log;
import com.google.common.flogger.backend.C7013i;
import com.google.common.flogger.backend.C7031r;
import com.google.common.flogger.backend.C7046q;
import java.util.logging.Level;

public final class C7032l extends C7018a implements C7031r {
    public final String f34518b;

    public C7032l(String str) {
        this("", str);
    }

    private C7032l(String str, String str2) {
        super(str2);
        if (str.length() + str2.length() <= 23) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(str2);
            this.f34518b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            return;
        }
        valueOf2 = str2.replace('$', '.');
        valueOf2 = valueOf2.substring(valueOf2.lastIndexOf(46) + 1, valueOf2.length());
        valueOf = String.valueOf(str);
        valueOf2 = String.valueOf(valueOf2);
        valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        this.f34518b = valueOf2.substring(0, Math.min(valueOf2.length(), 23));
    }

    public final boolean mo5985a(Level level) {
        return Log.isLoggable(this.f34518b, C7032l.m32065b(level));
    }

    public final void mo5984a(C7013i c7013i) {
        C7046q.m32104a(c7013i, (C7031r) this);
    }

    private static int m32065b(Level level) {
        int intValue = level.intValue();
        if (intValue >= 1000) {
            return 6;
        }
        if (intValue >= 900) {
            return 5;
        }
        if (intValue >= 800) {
            return 4;
        }
        if (intValue >= 700) {
            return 3;
        }
        return 2;
    }

    public final void mo5992a(Level level, String str, Throwable th) {
        switch (C7032l.m32065b(level)) {
            case 2:
                Log.v(this.f34518b, str, th);
                return;
            case 3:
                Log.d(this.f34518b, str, th);
                return;
            case 4:
                Log.i(this.f34518b, str, th);
                return;
            case 5:
                Log.w(this.f34518b, str, th);
                return;
            case 6:
                Log.e(this.f34518b, str, th);
                return;
            default:
                Log.wtf(this.f34518b, String.format("Level \"%d\" is not a valid level", new Object[]{Integer.valueOf(level.intValue())}));
                return;
        }
    }
}
