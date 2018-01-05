package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class C0428t implements OnItemClickListener {
    public final /* synthetic */ AlertController f2500a;
    public final /* synthetic */ C0425q f2501b;

    C0428t(C0425q c0425q, AlertController alertController) {
        this.f2501b = c0425q;
        this.f2500a = alertController;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f2501b.f2487u.onClick(this.f2500a.f2216b, i);
        if (!this.f2501b.f2459E) {
            this.f2500a.f2216b.dismiss();
        }
    }
}
