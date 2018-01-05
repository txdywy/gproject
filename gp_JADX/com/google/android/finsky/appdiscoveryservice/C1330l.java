package com.google.android.finsky.appdiscoveryservice;

import android.app.Service;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.vending.p055a.C0625a;
import com.android.vending.p055a.C0628d;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.appdiscoveryservice.p128b.C1308f;
import com.google.android.finsky.appdiscoveryservice.p128b.C1309k;
import com.google.android.finsky.appdiscoveryservice.p128b.C1310a;
import com.google.android.finsky.appdiscoveryservice.p128b.C1314e;
import com.google.android.finsky.appdiscoveryservice.p128b.C1317i;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;
import java.util.concurrent.Executor;

final class C1330l extends C0628d {
    public final Map f7824a;
    public final Executor f7825b;
    public final C1317i f7826c;
    public final C1461c f7827d;
    public final C1333o f7828e;
    public final C2471a f7829f;
    public final PackageManager f7830g;
    public Service f7831h;
    public C2495w f7832i = this.f7829f.m13184a(null);

    C1330l(Service service, Executor executor, C1317i c1317i, Map map, C1461c c1461c, C1333o c1333o, C2471a c2471a, PackageManager packageManager) {
        this.f7831h = service;
        this.f7825b = executor;
        this.f7826c = c1317i;
        this.f7824a = map;
        this.f7827d = c1461c;
        this.f7828e = c1333o;
        this.f7829f = c2471a;
        this.f7830g = packageManager;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (this.f7827d.dj().mo2294a(12628776)) {
            this.f7831h.stopSelf();
            throw new RemoteException("This service is no longer available");
        }
        Object nameForUid = this.f7830g.getNameForUid(Binder.getCallingUid());
        if (TextUtils.isEmpty(nameForUid)) {
            throw new SecurityException("AppDiscoveryService cannot be used with apps with a shared user");
        } else if (C1340v.m7821a(nameForUid)) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            throw new SecurityException(String.format("Calling package - %s - has not been whitelisted for the AppDiscoveryService.", new Object[]{nameForUid}));
        }
    }

    public final void mo1686a(int i, int i2, int i3, boolean z, String str, C0625a c0625a) {
        String str2;
        C1307a c1307a;
        C1314e c1314e;
        C1310a c1310a;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        String nameForUid = this.f7830g.getNameForUid(Binder.getCallingUid());
        C1307a c1307a2 = (C1307a) this.f7824a.get(Integer.valueOf(Binder.getCallingUid()));
        if (c1307a2 != null) {
            Object obj = (c1307a2.f7754a.equals(nameForUid) && c1307a2.f7757d == i) ? 1 : null;
            if (obj != null) {
                c1307a = c1307a2;
                FinskyLog.m21662b("findApps called with query: %s, max results: %d", str2, Integer.valueOf(i3));
                c1314e = new C1314e(this.f7832i);
                if (z || !c1307a.f7756c) {
                    FinskyLog.m21662b("Server results enabled.", new Object[0]);
                    C1317i c1317i = this.f7826c;
                    c1310a = new C1310a(c1317i.f7803a, new C1331m(this, Binder.getCallingUid()), i, i2, i3, str2, nameForUid, c1307a.f7755b, c0625a, c1317i.f7806d, c1317i.f7807e, c1317i.f7804b, c1317i.f7805c, c1317i.f7808f, c1317i.f7809g, c1314e, c1317i.f7810h, c1307a.f7756c, new ConditionVariable());
                } else {
                    FinskyLog.m21662b("Server results disabled.", new Object[0]);
                    C1317i c1317i2 = this.f7826c;
                    c1310a = new C1309k(c1317i2.f7803a, new C1331m(this, Binder.getCallingUid()), i, i2, i3, str2, nameForUid, c1307a.f7755b, c0625a, c1317i2.f7806d, c1317i2.f7807e, c1317i2.f7804b, c1314e, c1317i2.f7810h);
                }
                try {
                    if (((C1308f) c1307a.f7758e.putIfAbsent(Integer.valueOf(i2), c1310a)) == null) {
                        throw new IllegalArgumentException("The caller must have unique a requestCode specified across any simultaneously active tasks.");
                    }
                    this.f7825b.execute(c1310a);
                    return;
                } catch (IllegalArgumentException e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
        if (c1307a2 != null) {
            for (Integer remove : c1307a2.f7758e.keySet()) {
                ((C1308f) c1307a2.f7758e.remove(remove)).m7771c();
            }
            c1307a2.f7758e.clear();
        }
        try {
            boolean z2;
            int i4 = this.f7830g.getPackageInfo(nameForUid, 0).versionCode;
            C1333o c1333o = this.f7828e;
            if (((Boolean) C0955b.iF.m28964b()).booleanValue()) {
                for (String checkPermission : C1333o.f7835b) {
                    if (c1333o.f7836a.checkPermission(checkPermission, nameForUid) == 0) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = true;
            }
            C1307a c1307a3 = new C1307a(nameForUid, i4, i, z2);
            this.f7824a.put(Integer.valueOf(Binder.getCallingUid()), c1307a3);
            c1307a = c1307a3;
            FinskyLog.m21662b("findApps called with query: %s, max results: %d", str2, Integer.valueOf(i3));
            c1314e = new C1314e(this.f7832i);
            if (z) {
            }
            FinskyLog.m21662b("Server results enabled.", new Object[0]);
            C1317i c1317i3 = this.f7826c;
            c1310a = new C1310a(c1317i3.f7803a, new C1331m(this, Binder.getCallingUid()), i, i2, i3, str2, nameForUid, c1307a.f7755b, c0625a, c1317i3.f7806d, c1317i3.f7807e, c1317i3.f7804b, c1317i3.f7805c, c1317i3.f7808f, c1317i3.f7809g, c1314e, c1317i3.f7810h, c1307a.f7756c, new ConditionVariable());
            if (((C1308f) c1307a.f7758e.putIfAbsent(Integer.valueOf(i2), c1310a)) == null) {
                this.f7825b.execute(c1310a);
                return;
            }
            throw new IllegalArgumentException("The caller must have unique a requestCode specified across any simultaneously active tasks.");
        } catch (NameNotFoundException e2) {
            FinskyLog.m21669e("Failed to retrieve version code for client.", e2);
        }
    }

    public final void mo1685a(int i) {
        C1307a c1307a = (C1307a) this.f7824a.get(Integer.valueOf(Binder.getCallingUid()));
        if (c1307a != null) {
            C1308f a = c1307a.m7766a(i);
            if (a != null) {
                a.m7771c();
            }
        }
    }
}
