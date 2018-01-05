package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class C1110j extends em {
    public final Context f7017c;
    public final ArrayList f7018d;
    public final /* synthetic */ C1106f f7019e;

    public C1110j(C1106f c1106f, Context context, ArrayList arrayList) {
        this.f7019e = c1106f;
        this.f7017c = context;
        this.f7018d = arrayList;
    }

    public final int mo1039a() {
        return this.f7018d.size();
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        CharSequence string;
        C1112l c1112l = (C1112l) frVar;
        C1109i c1109i = (C1109i) this.f7018d.get(i);
        c1112l.f7021t.setText(c1109i.f7014a.d);
        TextView textView = c1112l.f7022u;
        Context context = this.f7017c;
        long toDays = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - c1109i.f7014a.f);
        Resources resources = context.getResources();
        if (toDays == 0) {
            string = resources.getString(C7582R.string.setup_wizard_device_last_used_today_message);
        } else {
            string = resources.getQuantityString(C7582R.plurals.setup_wizard_device_last_used_message, (int) toDays, new Object[]{Long.valueOf(toDays)});
        }
        textView.setText(string);
        c1112l.f7023v.setChecked(c1109i.f7015b);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C7582R.layout.my_apps_restore_device_item_view, viewGroup, false);
        fr c1112l = new C1112l(inflate);
        inflate.setTag(c1112l);
        inflate.setOnClickListener(new C1111k(this));
        return c1112l;
    }
}
