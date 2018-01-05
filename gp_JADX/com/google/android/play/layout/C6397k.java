package com.google.android.play.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.play.g;
import com.google.android.play.h;
import java.util.List;

public final class C6397k extends BaseAdapter {
    public final Context f32256a;
    public List f32257b;

    public C6397k(Context context, List list) {
        this.f32256a = context;
        this.f32257b = list;
    }

    public final int getCount() {
        return this.f32257b.size();
    }

    public final Object getItem(int i) {
        return this.f32257b.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f32256a).inflate(h.abc_popup_menu_item_layout, viewGroup, false);
            C6398l c6398l = new C6398l();
            c6398l.f32258a = (TextView) view.findViewById(g.title);
            c6398l.f32259b = (TextView) view.findViewById(g.shortcut);
            view.setTag(c6398l);
        }
        C6398l c6398l2 = (C6398l) view.getTag();
        C6396j c6396j = (C6396j) this.f32257b.get(i);
        c6398l2.f32258a.setText(c6396j.f32253b);
        c6398l2.f32258a.setEnabled(c6396j.f32254c);
        c6398l2.f32259b.setVisibility(8);
        return view;
    }

    public final boolean isEnabled(int i) {
        return ((C6396j) this.f32257b.get(i)).f32254c;
    }
}
