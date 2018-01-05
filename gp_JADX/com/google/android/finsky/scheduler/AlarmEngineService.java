package com.google.android.finsky.scheduler;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class AlarmEngineService extends Service {
    public ak f20131a;
    public C4042t f20132b;
    public C2471a f20133c;
    public C2495w f20134d;

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
        ((bl) C3947d.m18649a(bl.class)).mo1898a(this);
        this.f20134d = this.f20133c.m13184a("SchedulerAlarmEngineWakeup");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        FinskyLog.m21659a("AlarmManagerEngine onStart", new Object[0]);
        this.f20131a.m18813a(intent, this, this.f20134d.m13365a());
        return super.onStartCommand(intent, i, i2);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print("Device State: ");
        printWriter.println(this.f20132b.m18945a());
    }
}
