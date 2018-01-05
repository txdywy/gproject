package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

public final class am extends C0368a {
    public final ListView f2075s;

    public am(ListView listView) {
        super(listView);
        this.f2075s = listView;
    }

    public final void mo464a(int i) {
        ListView listView = this.f2075s;
        if (VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            View childAt = listView.getChildAt(0);
            if (childAt != null) {
                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
            }
        }
    }

    public final boolean mo465b() {
        return false;
    }

    public final boolean mo466b(int i) {
        ListView listView = this.f2075s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
