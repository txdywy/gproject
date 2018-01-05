package com.google.android.finsky.flushlogs;

import android.accounts.Account;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v4.p028a.C0233w;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class FlushLogsReceiver extends C0233w {

    public class FlushLogsService extends IntentService {
        public C1463g f16125a;
        public C0986a f16126b;

        public FlushLogsService() {
            super("FlushLogsService");
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

        public void onCreate() {
            super.onCreate();
            ((C1385c) C3947d.m18649a(C1385c.class)).mo1840a(this);
        }

        protected void onHandleIntent(Intent intent) {
            Account[] d = this.f16126b.mo1188d();
            CountDownLatch countDownLatch = new CountDownLatch(d.length + 1);
            Runnable c3134g = new C3134g(countDownLatch);
            for (Account account : d) {
                FinskyLog.m21659a("Flushing event logs for %s", FinskyLog.m21655a(account.name));
                this.f16125a.mo2049a(account).m13329a(c3134g);
            }
            this.f16125a.mo2049a(null).m13329a(c3134g);
            try {
                if (!countDownLatch.await(((Long) C0955b.ft.m28964b()).longValue(), TimeUnit.MILLISECONDS)) {
                    FinskyLog.m21659a("Logs flushing took more than %d ms. Releasing wake lock.", C0955b.ft.m28964b());
                }
            } catch (InterruptedException e) {
                FinskyLog.m21659a("Logs flushing was interrupted. Releasing wake lock.", new Object[0]);
            }
            C0954a.ax.m5763a(Long.valueOf(0));
            C0233w.m1138a(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        C0233w.m1137a(context, new Intent(context, FlushLogsService.class));
    }
}
