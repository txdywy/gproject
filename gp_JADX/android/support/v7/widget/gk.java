package android.support.v7.widget;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

final class gk {
    public Method f3511a;
    public Method f3512b;
    public Method f3513c;

    gk() {
        try {
            this.f3511a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f3511a.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.f3512b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f3512b.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            this.f3513c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
            this.f3513c.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
    }

    final void m3733a(AutoCompleteTextView autoCompleteTextView) {
        if (this.f3513c != null) {
            try {
                this.f3513c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(true)});
            } catch (Exception e) {
            }
        }
    }
}
