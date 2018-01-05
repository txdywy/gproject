package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.p004a.p007b.C0015c;
import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0310e;
import android.support.v4.p037h.C0325v;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class C0254u extends C0249n implements C0238c, C0240e {
    public final Handler f1609c = new C0255v(this);
    public final C0258z f1610d = new C0258z(new C0256w(this));
    public boolean f1611e;
    public boolean f1612f;
    public boolean f1613g = true;
    public boolean f1614h = true;
    public boolean f1615i;
    public boolean f1616j;
    public int f1617k;
    public C0325v f1618l;

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1610d.m1510a();
        int i3 = i >> 16;
        if (i3 != 0) {
            Object obj;
            int i4 = i3 - 1;
            C0325v c0325v = this.f1618l;
            int a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, i4);
            if (a < 0 || c0325v.f1770d[a] == C0325v.f1767a) {
                obj = null;
            } else {
                obj = c0325v.f1770d[a];
            }
            String str = (String) obj;
            C0325v c0325v2 = this.f1618l;
            i4 = C0310e.m1672a(c0325v2.f1769c, c0325v2.f1771e, i4);
            if (i4 >= 0 && c0325v2.f1770d[i4] != C0325v.f1767a) {
                c0325v2.f1770d[i4] = C0325v.f1767a;
                c0325v2.f1768b = true;
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.f1610d.m1509a(str);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
                return;
            } else {
                a2.mo2342a(65535 & i, i2, intent);
                return;
            }
        }
        C0239d c0239d = C0234a.f1283a;
        if (c0239d == null || !c0239d.m1450b()) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        ab abVar = this.f1610d.f1624a.f1288f;
        boolean i = abVar.mo298i();
        if (i && VERSION.SDK_INT <= 25) {
            return;
        }
        if (i || !abVar.mo293d()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1610d.f1624a.f1288f.m1248b(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1610d.f1624a.f1288f.m1254c(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1610d.f1624a.f1288f.m1226a(configuration);
    }

    public void onCreate(Bundle bundle) {
        C0258z c0258z = this.f1610d;
        c0258z.f1624a.f1288f.m1232a(c0258z.f1624a, c0258z.f1624a, null);
        super.onCreate(bundle);
        C0257x c0257x = (C0257x) getLastNonConfigurationInstance();
        if (c0257x != null) {
            C0258z c0258z2 = this.f1610d;
            C0304u c0304u = c0257x.f1623c;
            aa aaVar = c0258z2.f1624a;
            if (c0304u != null) {
                int size = c0304u.size();
                for (int i = 0; i < size; i++) {
                    ((by) c0304u.m1630c(i)).f1449h = aaVar;
                }
            }
            aaVar.f1289g = c0304u;
        }
        if (bundle != null) {
            this.f1610d.f1624a.f1288f.m1228a(bundle.getParcelable("android:support:fragments"), c0257x != null ? c0257x.f1622b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1617k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1618l = new C0325v(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.f1618l.m1710a(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.f1618l == null) {
            this.f1618l = new C0325v();
            this.f1617k = 0;
        }
        this.f1610d.f1624a.f1288f.m1272r();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0258z c0258z = this.f1610d;
        return onCreatePanelMenu | c0258z.f1624a.f1288f.m1240a(menu, getMenuInflater());
    }

    final View mo342a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1610d.f1624a.f1288f.onCreateView(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        m1498a(false);
        this.f1610d.f1624a.f1288f.m1277w();
        aa aaVar = this.f1610d.f1624a;
        if (aaVar.f1291i != null) {
            aaVar.f1291i.m1393g();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1610d.f1624a.f1288f.m1278x();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f1610d.f1624a.f1288f.m1241a(menuItem);
            case 6:
                return this.f1610d.f1624a.f1288f.m1250b(menuItem);
            default:
                return false;
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f1610d.f1624a.f1288f.m1247b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.f1612f = false;
        if (this.f1609c.hasMessages(2)) {
            this.f1609c.removeMessages(2);
            z_();
        }
        this.f1610d.f1624a.f1288f.m1252c(4);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f1610d.m1510a();
    }

    public void onStateNotSaved() {
        this.f1610d.m1510a();
    }

    public void onResume() {
        super.onResume();
        this.f1609c.sendEmptyMessage(2);
        this.f1612f = true;
        this.f1610d.m1512b();
    }

    public void onPostResume() {
        super.onPostResume();
        this.f1609c.removeMessages(2);
        z_();
        this.f1610d.m1512b();
    }

    public void z_() {
        this.f1610d.f1624a.f1288f.m1275u();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return super.onPreparePanel(0, view, menu) | this.f1610d.f1624a.f1288f.m1239a(menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        int i;
        C0304u c0304u;
        int i2 = 0;
        if (this.f1613g) {
            m1498a(true);
        }
        Object T_ = T_();
        ae aeVar = this.f1610d.f1624a.f1288f;
        ae.m1191a(aeVar.f1301D);
        at atVar = aeVar.f1301D;
        aa aaVar = this.f1610d.f1624a;
        if (aaVar.f1289g != null) {
            int size = aaVar.f1289g.size();
            by[] byVarArr = new by[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                byVarArr[i3] = (by) aaVar.f1289g.m1630c(i3);
            }
            boolean z = aaVar.f1290h;
            i = 0;
            while (i2 < size) {
                by byVar = byVarArr[i2];
                if (!byVar.f1447f && z) {
                    if (!byVar.f1446e) {
                        byVar.m1388b();
                    }
                    byVar.m1390d();
                }
                if (byVar.f1447f) {
                    i = true;
                } else {
                    byVar.m1393g();
                    aaVar.f1289g.remove(byVar.f1445d);
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            c0304u = aaVar.f1289g;
        } else {
            c0304u = null;
        }
        if (atVar == null && c0304u == null && T_ == null) {
            return null;
        }
        Object c0257x = new C0257x();
        c0257x.f1621a = T_;
        c0257x.f1622b = atVar;
        c0257x.f1623c = c0304u;
        return c0257x;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo1274i();
        Parcelable o = this.f1610d.f1624a.f1288f.m1269o();
        if (o != null) {
            bundle.putParcelable("android:support:fragments", o);
        }
        if (this.f1618l.m1708a() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1617k);
            int[] iArr = new int[this.f1618l.m1708a()];
            String[] strArr = new String[this.f1618l.m1708a()];
            for (int i = 0; i < this.f1618l.m1708a(); i++) {
                iArr[i] = this.f1618l.m1714c(i);
                strArr[i] = (String) this.f1618l.m1715d(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.f1613g = false;
        this.f1614h = false;
        this.f1609c.removeMessages(1);
        if (!this.f1611e) {
            this.f1611e = true;
            this.f1610d.f1624a.f1288f.m1273s();
        }
        this.f1610d.m1510a();
        this.f1610d.m1512b();
        aa aaVar = this.f1610d.f1624a;
        if (!aaVar.f1293k) {
            aaVar.f1293k = true;
            if (aaVar.f1291i != null) {
                aaVar.f1291i.m1388b();
            } else if (!aaVar.f1292j) {
                aaVar.f1291i = aaVar.m1146a("(root)", aaVar.f1293k, false);
                if (!(aaVar.f1291i == null || aaVar.f1291i.f1446e)) {
                    aaVar.f1291i.m1388b();
                }
            }
            aaVar.f1292j = true;
        }
        this.f1610d.f1624a.f1288f.m1274t();
        aa aaVar2 = this.f1610d.f1624a;
        if (aaVar2.f1289g != null) {
            int i;
            int size = aaVar2.f1289g.size();
            by[] byVarArr = new by[size];
            for (i = size - 1; i >= 0; i--) {
                byVarArr[i] = (by) aaVar2.f1289g.m1630c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                by byVar = byVarArr[i2];
                if (byVar.f1447f) {
                    if (by.f1442a) {
                        Log.v("LoaderManager", "Finished Retaining in " + byVar);
                    }
                    byVar.f1447f = false;
                    for (i = byVar.f1443b.m1708a() - 1; i >= 0; i--) {
                        bz bzVar = (bz) byVar.f1443b.m1715d(i);
                        if (bzVar.f1458i) {
                            if (by.f1442a) {
                                Log.v("LoaderManager", "  Finished Retaining: " + bzVar);
                            }
                            bzVar.f1458i = false;
                            if (!(bzVar.f1457h == bzVar.f1459j || bzVar.f1457h)) {
                                bzVar.m1397b();
                            }
                        }
                        if (bzVar.f1457h && bzVar.f1454e && !bzVar.f1460k) {
                            bzVar.m1398b(bzVar.f1453d, bzVar.f1456g);
                        }
                    }
                }
                byVar.m1392f();
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.f1613g = true;
        mo1274i();
        this.f1609c.sendEmptyMessage(1);
        this.f1610d.f1624a.f1288f.m1276v();
    }

    public Object T_() {
        return null;
    }

    @Deprecated
    public void A_() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1611e);
        printWriter.print("mResumed=");
        printWriter.print(this.f1612f);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1613g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f1614h);
        aa aaVar = this.f1610d.f1624a;
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(aaVar.f1293k);
        if (aaVar.f1291i != null) {
            printWriter.print(str2);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(aaVar.f1291i)));
            printWriter.println(":");
            aaVar.f1291i.m1385a(str2 + "  ", fileDescriptor, printWriter, strArr);
        }
        this.f1610d.f1624a.f1288f.mo288a(str, fileDescriptor, printWriter, strArr);
    }

    final void m1498a(boolean z) {
        if (!this.f1614h) {
            this.f1614h = true;
            this.f1615i = z;
            this.f1609c.removeMessages(1);
            this.f1610d.m1511a(this.f1615i);
            this.f1610d.f1624a.f1288f.m1252c(2);
        } else if (z) {
            aa aaVar = this.f1610d.f1624a;
            if (!aaVar.f1293k) {
                aaVar.f1293k = true;
                if (aaVar.f1291i != null) {
                    aaVar.f1291i.m1388b();
                } else if (!aaVar.f1292j) {
                    aaVar.f1291i = aaVar.m1146a("(root)", aaVar.f1293k, false);
                    if (!(aaVar.f1291i == null || aaVar.f1291i.f1446e)) {
                        aaVar.f1291i.m1388b();
                    }
                }
                aaVar.f1292j = true;
            }
            this.f1610d.m1511a(true);
        }
    }

    public final ab H_() {
        return this.f1610d.f1624a.f1288f;
    }

    public final bw b_() {
        aa aaVar = this.f1610d.f1624a;
        if (aaVar.f1291i != null) {
            return aaVar.f1291i;
        }
        aaVar.f1292j = true;
        aaVar.f1291i = aaVar.m1146a("(root)", aaVar.f1293k, true);
        return aaVar.f1291i;
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.b || i == -1)) {
            C0248m.m1489b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public final void b_(int i) {
        if (!this.f1616j && i != -1) {
            C0248m.m1489b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1610d.m1510a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            Object obj;
            int i3 = i2 - 1;
            C0325v c0325v = this.f1618l;
            int a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, i3);
            if (a < 0 || c0325v.f1770d[a] == C0325v.f1767a) {
                obj = null;
            } else {
                obj = c0325v.f1770d[a];
            }
            String str = (String) obj;
            C0325v c0325v2 = this.f1618l;
            i3 = C0310e.m1672a(c0325v2.f1769c, c0325v2.f1771e, i3);
            if (i3 >= 0 && c0325v2.f1770d[i3] != C0325v.f1767a) {
                c0325v2.f1770d[i3] = C0325v.f1767a;
                c0325v2.f1768b = true;
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.f1610d.m1509a(str);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
            } else {
                a2.m587a(iArr);
            }
        }
    }

    final int m1496a(Fragment fragment) {
        if (this.f1618l.m1708a() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f1618l.m1716e(this.f1617k) >= 0) {
            this.f1617k = (this.f1617k + 1) % 65534;
        }
        int i = this.f1617k;
        this.f1618l.m1710a(i, fragment.f759p);
        this.f1617k = (this.f1617k + 1) % 65534;
        return i;
    }

    private final void mo1274i() {
        do {
        } while (C0254u.m1494a(H_(), C0015c.CREATED));
    }

    private static boolean m1494a(ab abVar, C0015c c0015c) {
        boolean z = false;
        for (Fragment fragment : abVar.mo296g()) {
            if (fragment != null) {
                boolean a;
                if ((fragment.ae.mo3a().compareTo(C0015c.STARTED) >= 0 ? 1 : null) != null) {
                    fragment.ae.f34b = c0015c;
                    z = true;
                }
                ab abVar2 = fragment.f732D;
                if (abVar2 != null) {
                    a = C0254u.m1494a(abVar2, c0015c) | z;
                } else {
                    a = z;
                }
                z = a;
            }
        }
        return z;
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }
}
