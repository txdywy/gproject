package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.ac;
import java.lang.ref.WeakReference;

public final class hv extends Resources {
    public final WeakReference f3609a;

    public static boolean m3848a() {
        return ac.f2245b && VERSION.SDK_INT <= 20;
    }

    public hv(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3609a = new WeakReference(context);
    }

    public final Drawable getDrawable(int i) {
        Context context = (Context) this.f3609a.get();
        if (context == null) {
            return super.getDrawable(i);
        }
        ag a = ag.m3175a();
        Drawable a2 = a.m3183a(context, i);
        if (a2 == null) {
            a2 = super.getDrawable(i);
        }
        if (a2 != null) {
            return a.m3185a(context, i, false, a2);
        }
        return null;
    }
}
