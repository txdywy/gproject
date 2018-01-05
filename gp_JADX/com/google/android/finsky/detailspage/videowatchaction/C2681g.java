package com.google.android.finsky.detailspage.videowatchaction;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

final class C2681g implements OnGroupClickListener {
    C2681g() {
    }

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        WatchActionListViewItem watchActionListViewItem = (WatchActionListViewItem) view;
        if (expandableListView.isGroupExpanded(i)) {
            expandableListView.collapseGroup(i);
            watchActionListViewItem.m14500a(false);
            watchActionListViewItem.f14770e.invalidate();
        } else {
            expandableListView.expandGroup(i);
            watchActionListViewItem.m14500a(true);
            watchActionListViewItem.f14770e.invalidate();
        }
        return true;
    }
}
