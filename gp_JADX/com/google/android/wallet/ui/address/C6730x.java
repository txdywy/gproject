package com.google.android.wallet.ui.address;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.TextView;
import com.google.android.wallet.ui.common.cr;
import java.util.List;

public final class C6730x extends cr {
    public TextView f33195a;
    public View f33196b;

    public C6730x(Context context, int i, int i2, List list, Object obj) {
        super(context, i, i2, list);
        insert(obj, 0);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (isEnabled(i)) {
            if (view == this.f33195a) {
                view = null;
            }
            return super.getView(i, view, viewGroup);
        }
        if (this.f33195a == null) {
            this.f33195a = (TextView) super.getView(0, null, viewGroup);
            this.f33195a.setHint(this.f33195a.getText());
            this.f33195a.setText(null);
        }
        return this.f33195a;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (isEnabled(i)) {
            if (view == this.f33196b) {
                view = null;
            }
            return super.getDropDownView(i, view, viewGroup);
        }
        if (this.f33196b == null) {
            this.f33196b = new View(getContext());
            this.f33196b.setVisibility(8);
            this.f33196b.setLayoutParams(new LayoutParams(0, 0));
        }
        return this.f33196b;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return i != 0;
    }
}
