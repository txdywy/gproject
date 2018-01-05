package com.google.android.wallet.ui.common;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.List;

public final class bf extends ArrayAdapter {
    public final List f33558a;
    public final Filter f33559b = new bg(this);

    public bf(Context context, List list) {
        super(context, 17367050, m30748a(list));
        this.f33558a = m30748a(list);
    }

    public final Filter getFilter() {
        return this.f33559b;
    }

    private static List m30748a(List list) {
        if (list.size() > 3) {
            return list.subList(0, 3);
        }
        return list;
    }
}
