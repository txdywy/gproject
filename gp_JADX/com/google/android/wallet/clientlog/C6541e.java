package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6541e implements Creator {
    C6541e() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogContext[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        LogContext logContext = new LogContext(parcel);
        C6543g a = C6543g.m29717a();
        LogContext logContext2 = (LogContext) a.f32639b.get(logContext.f32615e);
        if (logContext2 != null) {
            return logContext2;
        }
        a.m29718a(logContext.m29671b().f32619a, logContext);
        if (!(logContext.f32616f || logContext.f32612b == null)) {
            logContext.f32612b.f32613c.add(logContext);
        }
        return logContext;
    }
}
