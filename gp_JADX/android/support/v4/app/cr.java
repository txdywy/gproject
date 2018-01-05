package android.support.v4.app;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.p004a.p007b.C0015c;
import android.p004a.p007b.C0016d;
import android.p004a.p007b.C0019g;
import android.support.v4.p037h.C0304u;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class cr extends Activity {
    public C0016d f1553m = new C0016d();

    public cr() {
        C0304u c0304u = new C0304u();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0019g(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f1553m.f34b = C0015c.CREATED;
        super.onSaveInstanceState(bundle);
    }
}
