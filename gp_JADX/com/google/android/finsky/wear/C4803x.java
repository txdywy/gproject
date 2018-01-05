package com.google.android.finsky.wear;

import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import com.google.android.finsky.bn.C2130d;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5613a;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5651m;
import com.google.android.gms.wearable.C5652n;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

final class C4803x extends AsyncTask {
    public final /* synthetic */ String f25066a;
    public final /* synthetic */ C3647b f25067b;
    public final /* synthetic */ String f25068c;
    public final /* synthetic */ long f25069d;
    public final /* synthetic */ C4796q f25070e;

    C4803x(C4796q c4796q, String str, C3647b c3647b, String str2, long j) {
        this.f25070e = c4796q;
        this.f25066a = str;
        this.f25067b = c3647b;
        this.f25068c = str2;
        this.f25069d = j;
    }

    private static Throwable m22579a(Object... objArr) {
        Closeable fileInputStream;
        Throwable th;
        Closeable closeable;
        Closeable closeable2 = null;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) objArr[1];
        try {
            fileInputStream = new FileInputStream((File) objArr[0]);
            try {
                Closeable autoCloseOutputStream = new AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    C4692x.m21843a(fileInputStream, autoCloseOutputStream);
                    autoCloseOutputStream.flush();
                    C4679j.m21814a(fileInputStream);
                    C4679j.m21814a(autoCloseOutputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = autoCloseOutputStream;
                    C4679j.m21814a(fileInputStream);
                    C4679j.m21814a(closeable2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C4679j.m21814a(fileInputStream);
                C4679j.m21814a(closeable2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            C4679j.m21814a(fileInputStream);
            C4679j.m21814a(closeable2);
            throw th;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Throwable th = (Throwable) obj;
        this.f25070e.m22573d();
        if (th != null) {
            C4796q c4796q = this.f25070e;
            String th2 = th.toString();
            String str = this.f25066a;
            C4790k c4790k = c4796q.f25042k;
            String str2 = c4796q.f25034c;
            String str3 = c4796q.f25035d;
            C4789j a = new C4789j(111, c4796q.f25048q).m22537b(c4796q.f25034c).m22533a(994).m22539d(th2).m22534a(c4796q.f25038g);
            a.f24996b = c4796q.f25035d;
            c4790k.m22545a(str2, str3, a.m22535a(str).m22536a());
            this.f25070e.m22566a(this.f25067b);
            return;
        }
        String str4 = this.f25070e.f25034c;
        th2 = this.f25066a;
        th2 = new StringBuilder((String.valueOf(str4).length() + 19) + String.valueOf(th2).length()).append("/install_wearable/").append(str4).append("/").append(th2).toString();
        FinskyLog.m21659a("Writing Install Request to install %s (%s) to %s", this.f25070e.f25034c, this.f25070e.f25035d, th2);
        C5651m a2 = C5651m.m26837a(th2);
        C5620h c5620h = a2.f28707b;
        c5620h.m26646a("assetIdentifier", this.f25068c);
        c5620h.m26643a("apkSize", this.f25070e.f25039h.d);
        c5620h.m26646a("apkSha1", this.f25070e.f25039h.f);
        c5620h.m26652a("nodeIds", new String[]{this.f25070e.f25035d});
        c5620h.m26643a("timestamp", this.f25069d);
        C2322b c2322b = this.f25067b.f18028c;
        c5620h.m26642a("wearCurrentVersion", c2322b != null ? c2322b.f11419d : -1);
        c5620h.m26642a("wearDesiredVersion", this.f25067b.f18029d.f10809c);
        C5613a c5613a = C5652n.f28708a;
        C5058o c5058o = this.f25070e.f25047p;
        PutDataRequest a3 = a2.m26838a();
        a3.f28571e = 0;
        c5613a.mo5117a(c5058o, a3).mo4490a(new C4804y(this, th2));
        this.f25070e.f25044m.mo2659a(C2130d.m11121a(this.f25070e.f25044m.mo2657a(this.f25070e.f25034c), this.f25070e.f25034c).m11151i(this.f25066a).m11140e(90).f10833a);
        this.f25070e.m22568b();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return C4803x.m22579a(objArr);
    }
}
