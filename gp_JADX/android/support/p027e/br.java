package android.support.p027e;

import android.util.Property;
import android.view.View;

final class br extends Property {
    br(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(bq.m946c((View) obj));
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        bq.m942a((View) obj, ((Float) obj2).floatValue());
    }
}
