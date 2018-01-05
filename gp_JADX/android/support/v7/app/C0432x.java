package android.support.v7.app;

import android.content.Context;
import android.widget.ArrayAdapter;

final class C0432x extends ArrayAdapter {
    public C0432x(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, 16908308, charSequenceArr);
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final long getItemId(int i) {
        return (long) i;
    }
}
