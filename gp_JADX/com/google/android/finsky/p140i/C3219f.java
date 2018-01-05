package com.google.android.finsky.p140i;

import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.aa.C0955b;
import java.util.List;

public final class C3219f {
    public final Context f16551a;
    public final C3212a f16552b;

    public C3219f(Context context, C3212a c3212a) {
        this.f16552b = c3212a;
        this.f16551a = context;
    }

    public final void m16266a(int i, Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(new C3220g(this, runnable, i), (long) i);
    }

    public final boolean m16267a() {
        if (!((Boolean) C0955b.gg.m28964b()).booleanValue()) {
            return this.f16552b.mo3376a();
        }
        List recentTasks = ((ActivityManager) this.f16551a.getSystemService("activity")).getRecentTasks(1, 0);
        if (recentTasks.size() == 0) {
            return true;
        }
        RecentTaskInfo recentTaskInfo = (RecentTaskInfo) recentTasks.get(0);
        if (recentTaskInfo.baseIntent == null || recentTaskInfo.baseIntent.getComponent() == null || this.f16551a.getPackageName().equals(recentTaskInfo.baseIntent.getComponent().getPackageName())) {
            return false;
        }
        return true;
    }
}
