package com.google.android.wallet.ui.common;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.C6523b;
import com.google.android.wallet.common.C6565a;
import com.google.android.wallet.ui.expander.C6521h;
import com.google.android.wallet.ui.expander.C6811c;
import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;

public abstract class C6522i extends Fragment implements C6520b, C6521h {
    public int bc;
    public ContextThemeWrapper bd;
    public LayoutInflater be;
    public bb bf;
    public SparseArray bg = new SparseArray();
    public LogContext bh;

    public abstract View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public static Bundle m29587a(int i, LogContext logContext) {
        Bundle bundle = new Bundle();
        bundle.putInt("themeResourceId", i);
        bundle.putParcelable("parentLogContext", logContext);
        return bundle;
    }

    public void mo5470a(Activity activity) {
        super.a(activity);
        if (getExpandable() != null) {
            C6565a c;
            for (Fragment fragment = this; fragment != null; fragment = fragment.F) {
                if (fragment instanceof C6523b) {
                    c = ((C6523b) fragment).mo5480c();
                    break;
                }
            }
            c = null;
            if (c == null && (activity instanceof C6523b)) {
                c = ((C6523b) activity).mo5480c();
            }
            getExpandable().m31007a(activity, c);
        }
    }

    public void mo5477b(Bundle bundle) {
        super.b(bundle);
        this.bc = this.q.getInt("themeResourceId");
        if (this.bc <= 0) {
            throw new IllegalArgumentException("Invalid theme resource id: " + this.bc);
        }
        this.bd = new ContextThemeWrapper(h(), this.bc);
        this.bh = (LogContext) this.q.getParcelable("parentLogContext");
        if (bundle != null) {
            if (bundle.containsKey("expandableSavedInstance")) {
                getExpandable().m31008a(bundle.getParcelable("expandableSavedInstance"));
            }
            this.bf = bb.m30738b(bundle);
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("resettableIdGeneratorBundleMap");
            if (sparseParcelableArray != null) {
                int size = sparseParcelableArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseParcelableArray.keyAt(i);
                    this.bg.put(keyAt, bb.m30738b((Bundle) sparseParcelableArray.get(keyAt)));
                }
            }
        }
    }

    public final View m29588a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.be = layoutInflater.cloneInContext(this.bd);
        View c = mo5479c(this.be, viewGroup, bundle);
        mo5517a(bundle, c);
        return c;
    }

    public void mo5482e(Bundle bundle) {
        super.e(bundle);
        if (getExpandable() != null) {
            bundle.putParcelable("expandableSavedInstance", getExpandable().m31004a());
        }
        if (this.bf != null) {
            this.bf.m30743a(bundle);
        }
        SparseArray sparseArray = new SparseArray();
        int size = this.bg.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.bg.keyAt(i);
            Bundle bundle2 = new Bundle();
            ((bb) this.bg.get(keyAt)).m30743a(bundle2);
            sparseArray.put(keyAt, bundle2);
        }
        bundle.putSparseParcelableArray("resettableIdGeneratorBundleMap", sparseArray);
    }

    public C6811c getExpandable() {
        return null;
    }

    protected void mo5517a(Bundle bundle, View view) {
    }

    public final bb au() {
        if (this.bf == null) {
            this.bf = bb.m30739c();
        }
        return this.bf;
    }

    public final Object av() {
        Fragment fragment = this.F;
        return fragment != null ? fragment : h();
    }

    public LogContext as() {
        return this.bh;
    }

    public C7178b at() {
        u h = h();
        Fragment fragment = this.F;
        if (h instanceof C6520b) {
            return ((C6520b) h).at();
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.F) {
            if (fragment2 instanceof C6520b) {
                return ((C6520b) fragment2).at();
            }
        }
        return null;
    }
}
