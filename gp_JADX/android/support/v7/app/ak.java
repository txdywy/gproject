package android.support.v7.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.view.Window.Callback;

class ak extends aj {
    public int f2292s = -100;
    public boolean f2293t;
    public boolean f2294u = true;
    public am f2295v;

    ak(Context context, Window window, ab abVar) {
        super(context, window, abVar);
    }

    public final void mo523a(Bundle bundle) {
        super.mo523a(bundle);
        if (bundle != null && this.f2292s == -100) {
            this.f2292s = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    Callback mo544a(Callback callback) {
        return new al(this, callback);
    }

    public final boolean mo546o() {
        return this.f2294u;
    }

    public final boolean mo508l() {
        int i;
        boolean z;
        if (this.f2292s != -100) {
            i = this.f2292s;
        } else {
            i = ac.f2244a;
        }
        int f = mo545f(i);
        if (f != -1) {
            Resources resources = this.e.getResources();
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            f = f == 2 ? 32 : 16;
            if (i2 != f) {
                if (m2445s()) {
                    ((Activity) this.e).recreate();
                } else {
                    Configuration configuration2 = new Configuration(configuration);
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    configuration2.uiMode = f | (configuration2.uiMode & -49);
                    resources.updateConfiguration(configuration2, displayMetrics);
                    if (VERSION.SDK_INT < 26) {
                        if (VERSION.SDK_INT >= 24) {
                            bi.m2495c(resources);
                        } else if (VERSION.SDK_INT >= 23) {
                            bi.m2494b(resources);
                        } else if (VERSION.SDK_INT >= 21) {
                            bi.m2492a(resources);
                        }
                    }
                }
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (i == 0) {
            m2444r();
            am amVar = this.f2295v;
            amVar.m2459a();
            if (amVar.f2302c == null) {
                amVar.f2302c = new an(amVar);
            }
            if (amVar.f2303d == null) {
                amVar.f2303d = new IntentFilter();
                amVar.f2303d.addAction("android.intent.action.TIME_SET");
                amVar.f2303d.addAction("android.intent.action.TIMEZONE_CHANGED");
                amVar.f2303d.addAction("android.intent.action.TIME_TICK");
            }
            amVar.f2304e.e.registerReceiver(amVar.f2302c, amVar.f2303d);
        }
        this.f2293t = true;
        return z;
    }

    public final void mo504e() {
        super.mo504e();
        mo508l();
    }

    public final void mo505f() {
        super.mo505f();
        if (this.f2295v != null) {
            this.f2295v.m2459a();
        }
    }

    int mo545f(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                m2444r();
                am amVar = this.f2295v;
                amVar.f2301b = amVar.f2300a.m2534a();
                return amVar.f2301b ? 2 : 1;
            default:
                return i;
        }
    }

    public final void mo503b(Bundle bundle) {
        super.mo503b(bundle);
        if (this.f2292s != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f2292s);
        }
    }

    public final void mo506i() {
        super.mo506i();
        if (this.f2295v != null) {
            this.f2295v.m2459a();
        }
    }

    private final void m2444r() {
        if (this.f2295v == null) {
            Context context = this.e;
            if (bq.f2382a == null) {
                Context applicationContext = context.getApplicationContext();
                bq.f2382a = new bq(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2295v = new am(this, bq.f2382a);
        }
    }

    private final boolean m2445s() {
        if (!this.f2293t || !(this.e instanceof Activity)) {
            return false;
        }
        try {
            if ((this.e.getPackageManager().getActivityInfo(new ComponentName(this.e, this.e.getClass()), 0).configChanges & 512) == 0) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }
}
