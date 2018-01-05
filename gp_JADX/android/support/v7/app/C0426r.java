package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.AlertController.RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

final class C0426r extends ArrayAdapter {
    public final /* synthetic */ RecycleListView f2493a;
    public final /* synthetic */ C0425q f2494b;

    C0426r(C0425q c0425q, Context context, int i, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
        this.f2494b = c0425q;
        this.f2493a = recycleListView;
        super(context, i, 16908308, charSequenceArr);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f2494b.f2457C != null && this.f2494b.f2457C[i]) {
            this.f2493a.setItemChecked(i, true);
        }
        return view2;
    }
}
