package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class C0141p extends Fragment implements OnCancelListener, OnDismissListener {
    public int f770a = 0;
    public int f771b = 0;
    public boolean f772c = true;
    public boolean f773d = true;
    public int f774e = -1;
    public Dialog f775f;
    public boolean f776g;
    public boolean f777h;
    public boolean f778i;

    public final void m625a(ab abVar, String str) {
        this.f777h = false;
        this.f778i = true;
        aw a = abVar.mo284a();
        a.mo328a((Fragment) this, str);
        a.mo334c();
    }

    public final void m626a(boolean z) {
        if (!this.f777h) {
            this.f777h = true;
            this.f778i = false;
            if (this.f775f != null) {
                this.f775f.dismiss();
                this.f775f = null;
            }
            this.f776g = true;
            if (this.f774e >= 0) {
                this.f730B.mo289b(this.f774e);
                this.f774e = -1;
                return;
            }
            aw a = this.f730B.mo284a();
            a.mo327a((Fragment) this);
            if (z) {
                a.mo336d();
            } else {
                a.mo334c();
            }
        }
    }

    public final void m628b(boolean z) {
        this.f772c = z;
        if (this.f775f != null) {
            this.f775f.setCancelable(z);
        }
    }

    public void mo135a(Context context) {
        super.mo135a(context);
        if (!this.f778i) {
            this.f777h = false;
        }
    }

    public final void mo134a() {
        super.mo134a();
        if (!this.f778i && !this.f777h) {
            this.f777h = true;
        }
    }

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f773d = this.H == 0;
        if (bundle != null) {
            this.f770a = bundle.getInt("android:style", 0);
            this.f771b = bundle.getInt("android:theme", 0);
            this.f772c = bundle.getBoolean("android:cancelable", true);
            this.f773d = bundle.getBoolean("android:showsDialog", this.f773d);
            this.f774e = bundle.getInt("android:backStackId", -1);
        }
    }

    public final LayoutInflater mo137c(Bundle bundle) {
        if (!this.f773d) {
            return super.mo137c(bundle);
        }
        this.f775f = mo143a(bundle);
        if (this.f775f == null) {
            return (LayoutInflater) this.C.f1285c.getSystemService("layout_inflater");
        }
        mo144a(this.f775f, this.f770a);
        return (LayoutInflater) this.f775f.getContext().getSystemService("layout_inflater");
    }

    public void mo144a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog mo143a(Bundle bundle) {
        return new Dialog(m603h(), this.f771b);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f776g) {
            m626a(true);
        }
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        if (this.f773d) {
            View view = this.f746R;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f775f.setContentView(view);
            }
            Activity h = m603h();
            if (h != null) {
                this.f775f.setOwnerActivity(h);
            }
            this.f775f.setCancelable(this.f772c);
            this.f775f.setOnCancelListener(this);
            this.f775f.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f775f.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void g_() {
        super.g_();
        if (this.f775f != null) {
            this.f776g = false;
            this.f775f.show();
        }
    }

    public void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        if (this.f775f != null) {
            Bundle onSaveInstanceState = this.f775f.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.f770a != 0) {
            bundle.putInt("android:style", this.f770a);
        }
        if (this.f771b != 0) {
            bundle.putInt("android:theme", this.f771b);
        }
        if (!this.f772c) {
            bundle.putBoolean("android:cancelable", this.f772c);
        }
        if (!this.f773d) {
            bundle.putBoolean("android:showsDialog", this.f773d);
        }
        if (this.f774e != -1) {
            bundle.putInt("android:backStackId", this.f774e);
        }
    }

    public final void h_() {
        super.h_();
        if (this.f775f != null) {
            this.f775f.hide();
        }
    }

    public final void mo138d() {
        super.mo138d();
        if (this.f775f != null) {
            this.f776g = true;
            this.f775f.dismiss();
            this.f775f = null;
        }
    }
}
