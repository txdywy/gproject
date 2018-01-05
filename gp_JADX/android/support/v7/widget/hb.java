package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

final class hb extends fu {
    public final WeakReference f3556b;

    public hb(Context context, Resources resources) {
        super(resources);
        this.f3556b = new WeakReference(context);
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f3556b.get();
        if (!(drawable == null || context == null)) {
            ag.m3175a();
            ag.m3179a(context, i, drawable);
        }
        return drawable;
    }
}
