package android.support.v7.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

final class bc implements OnDismissListener {
    public final /* synthetic */ OnGlobalLayoutListener f3183a;
    public final /* synthetic */ az f3184b;

    bc(az azVar, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f3184b = azVar;
        this.f3183a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3184b.f3177d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3183a);
        }
    }
}
