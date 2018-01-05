package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.support.v7.app.C0433y;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;

final class C0484s implements OnClickListener, OnDismissListener, OnKeyListener, ag {
    public C0471p f2813a;
    public C0433y f2814b;
    public C0481m f2815c;
    public ag f2816d;

    public C0484s(C0471p c0471p) {
        this.f2813a = c0471p;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.f2814b.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                window = this.f2814b.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.f2813a.m2824a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f2813a.performShortcut(i, keyEvent, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2815c.mo665a(this.f2813a, true);
    }

    public final void mo553a(C0471p c0471p, boolean z) {
        if ((z || c0471p == this.f2813a) && this.f2814b != null) {
            this.f2814b.dismiss();
        }
        if (this.f2816d != null) {
            this.f2816d.mo553a(c0471p, z);
        }
    }

    public final boolean mo554a(C0471p c0471p) {
        if (this.f2816d != null) {
            return this.f2816d.mo554a(c0471p);
        }
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2813a.m2827a((C0485t) this.f2815c.m2900b().getItem(i), null, 0);
    }
}
