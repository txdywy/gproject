package com.google.android.finsky.detailspage.videowatchaction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C2679e extends BaseExpandableListAdapter {
    public Context f14786a;
    public ExpandableListView f14787b;
    public List f14788c;
    public Integer f14789d = Integer.valueOf(0);

    public C2679e(Context context, ExpandableListView expandableListView, List list, int i, OnItemClickListener onItemClickListener) {
        this.f14786a = context;
        this.f14787b = expandableListView;
        this.f14788c = list;
        this.f14789d = Integer.valueOf(i);
        this.f14787b.setOnChildClickListener(new C2680f(this, onItemClickListener));
        this.f14787b.setOnGroupClickListener(new C2681g());
    }

    public final Object getChild(int i, int i2) {
        return this.f14788c.get(m14517a(i2));
    }

    public final long getChildId(int i, int i2) {
        return (long) m14517a(i2);
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = LayoutInflater.from(this.f14786a).inflate(C7582R.layout.watch_action_list_item, null);
        } else {
            inflate = view;
        }
        ((WatchActionListViewItem) inflate).m14499a((C2682h) getChild(i, i2), false);
        return inflate;
    }

    public final int getChildrenCount(int i) {
        return this.f14788c.size() - 1;
    }

    public final Object getGroup(int i) {
        return this.f14788c.get(this.f14789d.intValue());
    }

    public final int getGroupCount() {
        return 1;
    }

    public final long getGroupId(int i) {
        return (long) this.f14789d.intValue();
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = LayoutInflater.from(this.f14786a).inflate(C7582R.layout.watch_action_list_item, null);
        } else {
            inflate = view;
        }
        WatchActionListViewItem watchActionListViewItem = (WatchActionListViewItem) inflate;
        watchActionListViewItem.m14499a((C2682h) getGroup(i), z);
        watchActionListViewItem.setGroupIndicatorVisibility(getChildrenCount(i) > 0 ? 0 : 4);
        return inflate;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    final int m14517a(int i) {
        return i < this.f14789d.intValue() ? i : i + 1;
    }
}
