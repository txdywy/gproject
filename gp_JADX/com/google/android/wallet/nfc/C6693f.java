package com.google.android.wallet.nfc;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public final class C6693f implements C6646c, C6692e {
    public static final long f33029a = TimeUnit.SECONDS.toMillis(300);
    public final Activity f33030b;
    public final NfcAdapter f33031c;
    public final PendingIntent f33032d;
    public final C6646c f33033e;
    public C6691d f33034f;
    public boolean f33035g;
    public long f33036h;
    public String f33037i = "";
    public Handler f33038j = new Handler();

    public C6693f(Activity activity, C6646c c6646c) {
        this.f33030b = activity;
        this.f33031c = NfcAdapter.getDefaultAdapter(this.f33030b);
        this.f33032d = PendingIntent.getActivity(this.f33030b, 0, new Intent(this.f33030b, this.f33030b.getClass()).addFlags(536870912), 0);
        this.f33033e = c6646c;
        this.f33035g = false;
    }

    public final boolean mo5604d() {
        return this.f33035g;
    }

    public final void mo5601a(Intent intent) {
        this.f33035g = true;
        this.f33034f = new C6691d(this);
        this.f33034f.execute(new Intent[]{intent});
    }

    public final void mo5600a() {
        this.f33031c.enableForegroundDispatch(this.f33030b, this.f33032d, null, null);
    }

    public final void mo5602b() {
        this.f33031c.disableForegroundDispatch(this.f33030b);
    }

    public final boolean mo5603c() {
        return this.f33031c.isEnabled();
    }

    public final void mo5551a(int i, C6690a c6690a, long j) {
        this.f33035g = false;
        if (c6690a != null) {
            if (!this.f33037i.equals(c6690a.f33022a) || SystemClock.elapsedRealtime() - this.f33036h >= f33029a) {
                this.f33037i = c6690a.f33022a;
            } else {
                i = 7;
                c6690a = null;
                mo5602b();
                this.f33038j.postDelayed(new C6694g(this), f33029a);
            }
        }
        this.f33036h = SystemClock.elapsedRealtime();
        this.f33033e.mo5551a(i, c6690a, j);
    }
}
