package com.google.android.wallet.ui.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.v4.app.p;
import android.support.v7.app.y;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.google.android.wallet.p383e.C6617a;

public abstract class C6665h extends p implements OnShowListener {
    public C6528w af;

    public abstract Dialog mo5575W();

    public static Bundle m30137b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("themeResourceId", i);
        return bundle;
    }

    public final Dialog m30141a(Bundle bundle) {
        Dialog W = mo5575W();
        W.setOnShowListener(this);
        return W;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.af != null && k()) {
            this.af.mo5469a(16, Bundle.EMPTY);
        }
    }

    public void onShow(DialogInterface dialogInterface) {
        if (this.af != null && k()) {
            this.af.mo5469a(15, Bundle.EMPTY);
        }
        TypedValue typedValue = new TypedValue();
        if (m30139X().getTheme().resolveAttribute(C6617a.internalUicFormDialogButtonTextColor, typedValue, true)) {
            int i = typedValue.data;
            if (dialogInterface instanceof AlertDialog) {
                ((AlertDialog) dialogInterface).getButton(-1).setTextColor(i);
            } else if (dialogInterface instanceof y) {
                ((y) dialogInterface).a(-1).setTextColor(i);
            }
        }
    }

    public final ContextThemeWrapper m30139X() {
        int i = this.q.getInt("themeResourceId");
        if (i > 0) {
            return new ContextThemeWrapper(h(), i);
        }
        throw new IllegalArgumentException("Invalid theme resource id: " + i);
    }

    public final LayoutInflater m30140Y() {
        return h().getLayoutInflater().cloneInContext(m30139X());
    }
}
