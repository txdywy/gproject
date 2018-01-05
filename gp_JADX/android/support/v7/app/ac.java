package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class ac {
    public static int f2244a = -1;
    public static boolean f2245b = false;

    public static ac m2348a(Activity activity, ab abVar) {
        return m2349a(activity, activity.getWindow(), abVar);
    }

    public abstract C0404a mo500a();

    public abstract View mo522a(int i);

    public abstract void mo523a(Bundle bundle);

    public abstract void mo525a(Toolbar toolbar);

    public abstract void mo526a(View view);

    public abstract void mo527a(View view, LayoutParams layoutParams);

    public abstract void mo501a(CharSequence charSequence);

    public abstract MenuInflater mo502b();

    public abstract void mo531b(int i);

    public abstract void mo503b(Bundle bundle);

    public abstract void mo532b(View view, LayoutParams layoutParams);

    public abstract void mo534c();

    public abstract boolean mo535c(int i);

    public abstract void mo536d();

    public abstract void mo504e();

    public abstract void mo505f();

    public abstract void mo539g();

    public abstract void mo540h();

    public abstract void mo506i();

    public abstract C0406f mo507j();

    public abstract void mo541k();

    public abstract boolean mo508l();

    static ac m2349a(Context context, Window window, ab abVar) {
        if (VERSION.SDK_INT >= 24) {
            return new ah(context, window, abVar);
        }
        if (VERSION.SDK_INT >= 23) {
            return new ao(context, window, abVar);
        }
        if (VERSION.SDK_INT >= 14) {
            return new ak(context, window, abVar);
        }
        if (VERSION.SDK_INT >= 11) {
            return new aj(context, window, abVar);
        }
        return new aq(context, window, abVar);
    }

    ac() {
    }
}
