package com.google.android.wallet.ui.common;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.support.v7.app.z;
import android.view.View;
import com.google.android.wallet.p383e.C6617a;
import com.squareup.leakcanary.C7582R;

public final class C6760a {
    public final z f33510a;
    public final Builder f33511b;

    public C6760a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6617a.uicDelegateToSupportLibAlertDialog});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (z) {
            this.f33510a = new z(context);
            this.f33511b = null;
            return;
        }
        this.f33510a = null;
        this.f33511b = new Builder(context);
    }

    public C6760a(Context context, byte b) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6617a.uicDelegateToSupportLibAlertDialog});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (z) {
            this.f33510a = new z(context, C7582R.style.FinskyLightDialogWithDimTheme);
            this.f33511b = null;
            return;
        }
        this.f33510a = null;
        this.f33511b = new Builder(context, C7582R.style.FinskyLightDialogWithDimTheme);
    }

    public final C6760a m30714a(int i) {
        if (this.f33511b != null) {
            this.f33511b.setTitle(i);
        } else {
            z zVar = this.f33510a;
            zVar.a.f = zVar.a.a.getText(i);
        }
        return this;
    }

    public final C6760a m30717a(CharSequence charSequence) {
        if (this.f33511b != null) {
            this.f33511b.setTitle(charSequence);
        } else {
            this.f33510a.a(charSequence);
        }
        return this;
    }

    public final C6760a m30721b(int i) {
        if (this.f33511b != null) {
            this.f33511b.setMessage(i);
        } else {
            z zVar = this.f33510a;
            zVar.a.h = zVar.a.a.getText(i);
        }
        return this;
    }

    public final C6760a m30723b(CharSequence charSequence) {
        if (this.f33511b != null) {
            this.f33511b.setMessage(charSequence);
        } else {
            this.f33510a.b(charSequence);
        }
        return this;
    }

    public final C6760a m30715a(int i, OnClickListener onClickListener) {
        if (this.f33511b != null) {
            this.f33511b.setPositiveButton(i, onClickListener);
        } else {
            this.f33510a.a(i, onClickListener);
        }
        return this;
    }

    public final C6760a m30718a(CharSequence charSequence, OnClickListener onClickListener) {
        if (this.f33511b != null) {
            this.f33511b.setPositiveButton(charSequence, onClickListener);
        } else {
            this.f33510a.a(charSequence, onClickListener);
        }
        return this;
    }

    public final C6760a m30722b(int i, OnClickListener onClickListener) {
        if (this.f33511b != null) {
            this.f33511b.setNegativeButton(i, onClickListener);
        } else {
            this.f33510a.b(i, onClickListener);
        }
        return this;
    }

    public final C6760a m30724b(CharSequence charSequence, OnClickListener onClickListener) {
        if (this.f33511b != null) {
            this.f33511b.setNegativeButton(charSequence, onClickListener);
        } else {
            this.f33510a.b(charSequence, onClickListener);
        }
        return this;
    }

    public final C6760a m30719a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
        if (this.f33511b != null) {
            this.f33511b.setSingleChoiceItems(charSequenceArr, i, onClickListener);
        } else {
            z zVar = this.f33510a;
            zVar.a.s = charSequenceArr;
            zVar.a.u = onClickListener;
            zVar.a.F = i;
            zVar.a.E = true;
        }
        return this;
    }

    public final C6760a m30716a(View view) {
        if (this.f33511b != null) {
            this.f33511b.setView(view);
        } else {
            this.f33510a.a(view);
        }
        return this;
    }

    public final Dialog m30713a() {
        if (this.f33511b != null) {
            return this.f33511b.create();
        }
        return this.f33510a.a();
    }

    public final Dialog m30720b() {
        Dialog a = m30713a();
        a.show();
        return a;
    }
}
