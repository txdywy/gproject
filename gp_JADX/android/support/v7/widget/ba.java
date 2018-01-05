package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class ba implements OnItemClickListener {
    public final /* synthetic */ az f3181a;

    ba(az azVar) {
        this.f3181a = azVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f3181a.f3177d.setSelection(i);
        if (this.f3181a.f3177d.getOnItemClickListener() != null) {
            this.f3181a.f3177d.performItemClick(view, i, this.f3181a.f3175b.getItemId(i));
        }
        this.f3181a.mo674c();
    }
}
