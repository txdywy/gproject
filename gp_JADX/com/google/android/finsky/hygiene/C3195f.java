package com.google.android.finsky.hygiene;

import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.services.GmsCoreUpdateService;

final class C3195f implements Runnable {
    public int f16488a;
    public final /* synthetic */ C1254c f16489b;
    public final /* synthetic */ boolean f16490c;
    public final /* synthetic */ DailyHygiene f16491d;

    C3195f(DailyHygiene dailyHygiene, C1254c c1254c, boolean z) {
        this.f16491d = dailyHygiene;
        this.f16489b = c1254c;
        this.f16490c = z;
    }

    public final void run() {
        this.f16488a++;
        if (this.f16488a == 4) {
            DailyHygiene dailyHygiene = this.f16491d;
            C1254c c1254c = this.f16489b;
            boolean z = this.f16490c;
            DailyHygiene.m16178a("contentSyncAndAutoUpdateAndContinue");
            if (!dailyHygiene.f16444p) {
                dailyHygiene.f16441m.m5816a();
            }
            if (dailyHygiene.f16437i) {
                dailyHygiene.m16191a(c1254c, z);
            } else if (C1473m.f7980a.mo2050a(dailyHygiene.f16440l).mo2946a()) {
                dailyHygiene.m16191a(c1254c, z);
            } else {
                C1473m.f7980a.ah().mo2821d();
                if (dailyHygiene.f16431c.m8841d() && ((Boolean) C0955b.gW.m28964b()).booleanValue() && !dailyHygiene.f16440l.mo2294a(12644528)) {
                    Context context = dailyHygiene.f16436h;
                    Intent intent = new Intent();
                    intent.setClass(context, GmsCoreUpdateService.class);
                    Builder builder = new Builder();
                    builder.scheme("gmscoreupdateservice").appendPath("update_gms_core");
                    intent.setData(builder.build());
                    context.startService(intent);
                    dailyHygiene.m16195c(c1254c, z);
                    return;
                }
                C1473m.f7980a.bE().mo4314a().mo4316a(new C3196g(dailyHygiene, c1254c, z), dailyHygiene.f16432d.f8182f, -1, dailyHygiene.f16442n.m13375a("daily_hygiene"));
            }
        }
    }
}
