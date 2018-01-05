package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import java.util.List;

public class ObservableScrollView extends ScrollView {
    public List f18266a;

    public ObservableScrollView(Context context) {
        this(context, null);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f18266a != null) {
            for (int size = this.f18266a.size() - 1; size >= 0; size--) {
                ((at) this.f18266a.get(size)).m17424a();
            }
        }
    }
}
