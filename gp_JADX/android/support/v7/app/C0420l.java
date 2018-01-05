package android.support.v7.app;

import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class C0420l implements OnClickListener {
    public final /* synthetic */ AlertController f2444a;

    C0420l(AlertController alertController) {
        this.f2444a = alertController;
    }

    public final void onClick(View view) {
        Message obtain;
        if (view == this.f2444a.f2228n && this.f2444a.f2230p != null) {
            obtain = Message.obtain(this.f2444a.f2230p);
        } else if (view == this.f2444a.f2231q && this.f2444a.f2233s != null) {
            obtain = Message.obtain(this.f2444a.f2233s);
        } else if (view != this.f2444a.f2234t || this.f2444a.f2236v == null) {
            obtain = null;
        } else {
            obtain = Message.obtain(this.f2444a.f2236v);
        }
        if (obtain != null) {
            obtain.sendToTarget();
        }
        this.f2444a.f2213N.obtainMessage(1, this.f2444a.f2216b).sendToTarget();
    }
}
