package android.support.design.p018a;

import android.util.Property;
import android.view.ViewGroup;

public final class C0098d extends Property {
    public static final Property f426a = new C0098d("childrenAlpha");

    private C0098d(String str) {
        super(Float.class, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(C0105k.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(C0105k.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
