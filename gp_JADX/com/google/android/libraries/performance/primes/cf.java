package com.google.android.libraries.performance.primes;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;
import com.google.android.libraries.p326c.p327a.C5917b;
import com.google.android.libraries.performance.primes.p336h.C5984a;

final class cf extends C5949a implements dy, C5952o {
    public final SharedPreferences f29868e;
    public final C6018r f29869f;
    public final boolean f29870g;

    static boolean m27779a(SharedPreferences sharedPreferences) {
        C5917b.m27414b();
        long j = sharedPreferences.getLong("primes.packageMetric.lastSendTime", -1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < j) {
            if ((!sharedPreferences.edit().remove("primes.packageMetric.lastSendTime").commit() ? 1 : 0) != 0) {
                C5989do.m27824a(3, "PackageMetricService", "Failure storing timestamp persistently", new Object[0]);
            }
            j = -1;
        }
        if (j == -1 || elapsedRealtime > j + 43200000) {
            return false;
        }
        if (Log.isLoggable("PackageMetricService", 3)) {
            String str = "PackageMetricService";
            String str2 = "SentRecently countdown: ";
            String valueOf = String.valueOf(DateUtils.formatElapsedTime(((j + 43200000) - elapsedRealtime) / 1000));
            C5989do.m27824a(3, str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        return true;
    }

    cf(Application application, C5984a c5984a, eo eoVar, SharedPreferences sharedPreferences, boolean z) {
        super(c5984a, application, eoVar, bv.SAME_THREAD);
        this.f29868e = sharedPreferences;
        this.f29870g = z;
        this.f29869f = C6018r.m27894a(application);
    }

    public final void mo5223d() {
        this.f29869f.m27896a((C5950g) this);
    }

    public final void mo5224e() {
    }

    public final void mo5226b(Activity activity) {
        this.f29869f.m27897b((C5950g) this);
        m27581b().submit(new cg(this));
    }

    final void mo5222c() {
        this.f29869f.m27897b((C5950g) this);
    }
}
