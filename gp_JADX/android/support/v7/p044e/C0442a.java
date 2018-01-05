package android.support.v7.p044e;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class C0442a implements TransformationMethod {
    public Locale f2527a;

    public C0442a(Context context) {
        this.f2527a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        return charSequence != null ? charSequence.toString().toUpperCase(this.f2527a) : null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
