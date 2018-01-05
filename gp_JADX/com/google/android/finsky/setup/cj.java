package com.google.android.finsky.setup;

import android.os.AsyncTask;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.google.wireless.android.finsky.dfe.nano.fr;
import java.util.concurrent.ExecutionException;

final class cj extends AsyncTask {
    public final /* synthetic */ SetupWizardSelectAppsForDeviceActivity f20925a;

    cj(SetupWizardSelectAppsForDeviceActivity setupWizardSelectAppsForDeviceActivity) {
        this.f20925a = setupWizardSelectAppsForDeviceActivity;
    }

    private final fp[] m19392a() {
        Throwable e;
        C1254c b = C1473m.f7980a.mo2112b(this.f20925a.f20635o);
        if (b == null) {
            return null;
        }
        C0657w agVar = new ag();
        C1473m.f7980a.bJ().m21191a(b, C2693e.m14552a(), this.f20925a.f20636p.c, agVar, agVar, true);
        try {
            FinskyLog.m21659a("getBackupDocumentChoices returned with %d documents", Integer.valueOf(((fr) C1473m.f7980a.cL().m19365b(b, agVar, "Unable to fetch backup document choices")).b.length));
            return ((fr) C1473m.f7980a.cL().m19365b(b, agVar, "Unable to fetch backup document choices")).b;
        } catch (VolleyError e2) {
            e = e2;
            FinskyLog.m21660a(e, "Error in getPackagesForDevice", new Object[0]);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Error in getPackagesForDevice", new Object[0]);
            return null;
        } catch (ExecutionException e4) {
            e = e4;
            FinskyLog.m21660a(e, "Error in getPackagesForDevice", new Object[0]);
            return null;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        int i = 0;
        this.f20925a.f20637q = (fp[]) obj;
        if (this.f20925a.f20637q == null || this.f20925a.f20637q.length == 0) {
            this.f20925a.f20637q = new fp[0];
            this.f20925a.f20639s = new boolean[0];
            C1473m.f7980a.cK().mo3927a(this.f20925a.getApplicationContext(), this.f20925a.f20635o, this.f20925a.f20637q, true);
        } else if (this.f20925a.f20639s == null) {
            this.f20925a.f20639s = new boolean[this.f20925a.f20637q.length];
            while (i < this.f20925a.f20639s.length) {
                this.f20925a.f20639s[i] = true;
                i++;
            }
        }
        this.f20925a.m19119f();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m19392a();
    }
}
