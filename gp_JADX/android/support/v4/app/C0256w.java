package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

final class C0256w extends aa {
    public final /* synthetic */ C0254u f1620a;

    public C0256w(C0254u c0254u) {
        this.f1620a = c0254u;
        super(c0254u);
    }

    public final void mo354a(String str, PrintWriter printWriter, String[] strArr) {
        this.f1620a.dump(str, null, printWriter, strArr);
    }

    public final boolean mo355b() {
        return !this.f1620a.isFinishing();
    }

    public final LayoutInflater mo356c() {
        return this.f1620a.getLayoutInflater().cloneInContext(this.f1620a);
    }

    public final void mo357d() {
        this.f1620a.A_();
    }

    public final void mo352a(Fragment fragment, Intent intent, int i) {
        Activity activity = this.f1620a;
        activity.b = true;
        if (i == -1) {
            try {
                C0234a.m1141a(activity, intent, -1);
            } finally {
                activity.b = false;
            }
        } else {
            C0248m.m1489b(i);
            C0234a.m1141a(activity, intent, ((activity.m1496a(fragment) + 1) << 16) + (65535 & i));
            activity.b = false;
        }
    }

    public final void mo353a(Fragment fragment, String[] strArr) {
        Activity activity = this.f1620a;
        C0248m.m1489b(200);
        try {
            activity.f1616j = true;
            int a = ((activity.m1496a(fragment) + 1) << 16) + 200;
            if (C0234a.f1283a == null || !C0234a.f1283a.m1449a()) {
                if (VERSION.SDK_INT >= 23) {
                    if (activity instanceof C0240e) {
                        ((C0240e) activity).b_(a);
                    }
                    activity.requestPermissions(strArr, a);
                } else if (activity instanceof C0238c) {
                    new Handler(Looper.getMainLooper()).post(new C0237b(strArr, activity, a));
                }
            }
            activity.f1616j = false;
        } catch (Throwable th) {
            activity.f1616j = false;
        }
    }

    public final boolean mo358e() {
        return this.f1620a.getWindow() != null;
    }

    public final int mo359f() {
        Window window = this.f1620a.getWindow();
        return window == null ? 0 : window.getAttributes().windowAnimations;
    }

    public final View mo279a(int i) {
        return this.f1620a.findViewById(i);
    }

    public final boolean mo280a() {
        Window window = this.f1620a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
