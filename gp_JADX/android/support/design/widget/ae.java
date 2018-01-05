package android.support.design.widget;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;

final class ae implements OnClickListener {
    public final /* synthetic */ ad f724a;

    ae(ad adVar) {
        this.f724a = adVar;
    }

    public final void onClick(View view) {
        if (this.f724a.f720b && this.f724a.isShowing()) {
            ad adVar = this.f724a;
            if (!adVar.f722d) {
                if (VERSION.SDK_INT < 11) {
                    adVar.f721c = true;
                } else {
                    TypedArray obtainStyledAttributes = adVar.getContext().obtainStyledAttributes(new int[]{16843611});
                    adVar.f721c = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                }
                adVar.f722d = true;
            }
            if (adVar.f721c) {
                this.f724a.cancel();
            }
        }
    }
}
