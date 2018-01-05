package com.google.android.gms.clearcut.internal;

import android.util.Log;
import com.google.android.gms.clearcut.C5012a;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.cn;
import com.google.android.gms.internal.wz;

final class C5027c extends cn {
    public final LogEventParcelable f25594a;

    C5027c(LogEventParcelable logEventParcelable, C5058o c5058o) {
        super(C5012a.f25522c, c5058o);
        this.f25594a = logEventParcelable;
    }

    protected final /* synthetic */ C4980w mo4495a(Status status) {
        return status;
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        C5029e c5029e = (C5029e) c4948f;
        C5024g c5028d = new C5028d(this);
        try {
            LogEventParcelable logEventParcelable = this.f25594a;
            if (logEventParcelable.f25518j != null && logEventParcelable.f25517i.f27683k.length == 0) {
                logEventParcelable.f25517i.f27683k = logEventParcelable.f25518j.mo4533a();
            }
            if (logEventParcelable.f25519k != null && logEventParcelable.f25517i.f27690r.length == 0) {
                logEventParcelable.f25517i.f27690r = logEventParcelable.f25519k.mo4533a();
            }
            logEventParcelable.f25510b = wz.m24212a(logEventParcelable.f25517i);
            ((C5031i) c5029e.m23032u()).mo4529a(c5028d, this.f25594a);
        } catch (Throwable e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            m23084b(new Status(10, "MessageProducer"));
        }
    }
}
