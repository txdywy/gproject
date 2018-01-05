package android.support.v7.app;

import android.support.v7.app.AlertController.RecycleListView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class C0429u implements OnItemClickListener {
    public final /* synthetic */ RecycleListView f2502a;
    public final /* synthetic */ AlertController f2503b;
    public final /* synthetic */ C0425q f2504c;

    C0429u(C0425q c0425q, RecycleListView recycleListView, AlertController alertController) {
        this.f2504c = c0425q;
        this.f2502a = recycleListView;
        this.f2503b = alertController;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f2504c.f2457C != null) {
            this.f2504c.f2457C[i] = this.f2502a.isItemChecked(i);
        }
        this.f2504c.f2461G.onClick(this.f2503b.f2216b, i, this.f2502a.isItemChecked(i));
    }
}
