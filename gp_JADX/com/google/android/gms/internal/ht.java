package com.google.android.gms.internal;

import com.google.android.gms.common.internal.am;
import java.util.concurrent.FutureTask;

final class ht extends FutureTask implements Comparable {
    public final long f26915a = hr.f26905h.getAndIncrement();
    public final boolean f26916b;
    public final String f26917c;
    public /* synthetic */ hr f26918d;

    ht(hr hrVar, Runnable runnable, String str) {
        this.f26918d = hrVar;
        super(runnable, null);
        am.m23733a((Object) str);
        this.f26917c = str;
        this.f26916b = false;
        if (this.f26915a == Long.MAX_VALUE) {
            hrVar.mo4742p().f26845d.m24652a("Tasks index overflow");
        }
    }

    protected final void setException(Throwable th) {
        this.f26918d.mo4742p().f26845d.m24653a(this.f26917c, th);
        if (th instanceof zzcsd) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        ht htVar = (ht) obj;
        if (this.f26916b != htVar.f26916b) {
            if (this.f26916b) {
                return -1;
            }
            return 1;
        } else if (this.f26915a < htVar.f26915a) {
            return -1;
        } else {
            if (this.f26915a > htVar.f26915a) {
                return 1;
            }
            this.f26918d.mo4742p().f26846e.m24653a("Two tasks share the same index. index", Long.valueOf(this.f26915a));
            return 0;
        }
    }
}
