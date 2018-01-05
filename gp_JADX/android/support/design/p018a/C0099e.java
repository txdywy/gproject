package android.support.design.p018a;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import com.squareup.haha.perflib.HprofParser;
import java.util.WeakHashMap;

public final class C0099e extends Property {
    public static final Property f427a = new C0099e();
    public final WeakHashMap f428b = new WeakHashMap();

    private C0099e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public final /* synthetic */ Object get(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f428b.containsKey(drawable)) {
            return (Integer) this.f428b.get(drawable);
        }
        return Integer.valueOf(HprofParser.ROOT_UNKNOWN);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        Integer num = (Integer) obj2;
        if (VERSION.SDK_INT < 19) {
            this.f428b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
