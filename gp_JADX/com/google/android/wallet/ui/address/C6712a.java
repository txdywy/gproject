package com.google.android.wallet.ui.address;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.f.a;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.C6756y;
import com.google.android.wallet.ui.common.SummaryTextLayout;
import com.google.android.wallet.ui.expander.C6521h;
import com.google.android.wallet.ui.expander.C6811c;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;

public final class C6712a extends C6711b implements OnFocusChangeListener, OnCheckedChangeListener {
    public ViewGroup f33099a;
    public SummaryExpanderWrapper f33100b;
    public SummaryTextLayout f33101c;
    public final ArrayList f33102d = new ArrayList();
    public final C6811c f33103e = new C6811c();
    public boolean f33104f;

    public static C6712a m30393a(a aVar, int i, LogContext logContext) {
        Fragment c6712a = new C6712a();
        Bundle a = C6711b.m30375a(i, aVar, logContext);
        a.putBoolean("isInsideTree", false);
        c6712a.f(a);
        return c6712a;
    }

    public final void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        this.g.f33116I = this;
        this.f33104f = this.q.getBoolean("isInsideTree");
        this.f33103e.f33771g = this.f33104f;
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View c = super.mo5479c(layoutInflater, viewGroup, bundle);
        this.f33100b = (SummaryExpanderWrapper) c.findViewById(C6622f.address_wrapper);
        C6521h c6521h = this.f33100b;
        int i = C6622f.address_summary_image;
        int i2 = C6622f.address_summary_text;
        c6521h.setSummaryImage(i);
        c6521h.setSummaryView(i2);
        c6521h.setTitleView(-1);
        c6521h.getExpandable().m31015b();
        c6521h.m30966a(new C6749z(this));
        c6521h.getExpandable().m31018c();
        getExpandable().m31013a(c6521h);
        this.f33101c = (SummaryTextLayout) c.findViewById(C6622f.address_summary_text);
        this.f33099a = (ViewGroup) c.findViewById(C6622f.container);
        if (this.f33101c != null) {
            if (!TextUtils.isEmpty(((a) this.aD).A)) {
                this.f33101c.setHint(((a) this.aD).A);
            } else if (!TextUtils.isEmpty(((a) this.aD).e)) {
                this.f33101c.setHint(((a) this.aD).e);
                this.f33099a.findViewById(C6622f.address_title).setVisibility(8);
            }
        }
        if (((a) this.aD).y == 4) {
            this.f33100b.setViewMode(4);
        }
        this.f33101c.setOnFocusChangeListener(this);
        return c;
    }

    public final void mo5537u() {
        super.mo5537u();
        ai();
        if (!getExpandable().f33781q) {
            this.f33099a.setVisibility(getExpandable().f33767c ? 0 : 8);
        }
        if (!this.f33104f) {
            this.f33103e.f33787w.f33782r = true;
            this.f33103e.m31020d();
        }
    }

    public final void mo5616d(Bundle bundle) {
        super.mo5616d(bundle);
        if (((a) this.aD).y == 4) {
            ac();
        }
        aw();
    }

    public final boolean cP_() {
        this.f33099a.requestFocus();
        return true;
    }

    public final boolean mo5524a(long[] jArr) {
        boolean a = super.mo5524a(jArr);
        if (!(a || this.f33104f)) {
            this.f33103e.m31017b(false);
        }
        return a;
    }

    public final boolean mo5535a(g gVar) {
        boolean a = super.mo5535a(gVar);
        if (a && !this.f33104f) {
            this.f33103e.m31017b(false);
        }
        return a;
    }

    protected final boolean ac() {
        boolean ac = super.ac();
        if (ac) {
            aw();
        }
        return ac;
    }

    private final void aw() {
        C6811c expandable = this.f33100b.getExpandable();
        boolean z = this.g.m30453p() || this.f33096g.f33156z;
        expandable.m31014a(z);
    }

    public final void r_(int i) {
        if (this.f33099a != null && this.f33102d != null) {
            int size = this.f33102d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6712a.m30394a((View) this.f33102d.get(i2), i);
            }
        }
    }

    public final ArrayList ad() {
        return this.f33102d;
    }

    public final C6811c getExpandable() {
        return this.f33103e;
    }

    protected final void mo5533W() {
        if (this.f33100b != null) {
            super.mo5533W();
            this.f33100b.setEnabled(this.aH);
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        aw();
        this.f33100b.setSummaryImageVisible(!this.g.m30453p());
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f33101c && z && !getExpandable().f33767c) {
            this.f33100b.getExpandable().m31017b(true);
        }
    }

    public final void ah() {
        if (!this.f33104f && !mo5527c(null) && mo5608a(null, false)) {
            this.f33103e.m31019c(true);
        }
    }

    public final void ai() {
        if (this.f33099a != null) {
            this.f33102d.clear();
            m30395a(this.f33099a);
            this.f33099a.setVisibility(0);
        }
    }

    private final void m30395a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                Object obj = ((childAt instanceof C6756y) || (childAt instanceof AdapterView)) ? 1 : null;
                if (obj == null) {
                    if (childAt.getVisibility() == 0) {
                        m30395a((ViewGroup) childAt);
                    }
                }
            }
            if (!(childAt instanceof ProgressBar)) {
                if (getExpandable().f33767c) {
                    childAt.setTag(C6622f.summary_expander_transition_name, null);
                    if (C6712a.m30399d(childAt) == 0) {
                        this.f33102d.add(childAt);
                    }
                } else if (childAt.getTag(C6622f.summary_expander_transition_name) != null || C6712a.m30399d(childAt) == 0) {
                    if (childAt.getTag(C6622f.summary_expander_transition_name) == null) {
                        childAt.setTag(C6622f.summary_expander_transition_name, "animatingViewTransitionName");
                    }
                    C6712a.m30394a(childAt, 8);
                    this.f33102d.add(childAt);
                }
            }
        }
    }

    public final View aj() {
        return m30396b(this.f33099a);
    }

    private final View m30396b(ViewGroup viewGroup) {
        View view = null;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C6756y) {
                childAt = ((C6756y) childAt).getInnerFieldView();
                if (childAt != null && C6712a.m30398c(childAt)) {
                    return childAt;
                }
                childAt = view;
            } else if (C6712a.m30398c(childAt)) {
                return childAt;
            } else {
                if (C6712a.m30397b(childAt) && (childAt instanceof ViewGroup)) {
                    childAt = m30396b((ViewGroup) childAt);
                    if (childAt != null) {
                        return childAt;
                    }
                } else {
                    childAt = view;
                }
            }
            i++;
            view = childAt;
        }
        return view;
    }

    private static boolean m30397b(View view) {
        Object obj;
        if (!(view.getParent() instanceof C6756y) || ((View) view.getParent()).getTag(C6622f.summary_expander_transition_name) == null) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null && view.getVisibility() != 0 && view.getTag(C6622f.summary_expander_transition_name) == null) {
            return false;
        }
        return true;
    }

    private static boolean m30398c(View view) {
        return view.getId() != C6622f.address_title && C6712a.m30397b(view) && ((view instanceof TextView) || (view.getParent() instanceof C6756y));
    }

    private static void m30394a(View view, int i) {
        view.setVisibility(i);
        if (view instanceof C6756y) {
            View innerFieldView = ((C6756y) view).getInnerFieldView();
            if (innerFieldView != null) {
                innerFieldView.setVisibility(i);
            }
        }
    }

    private static int m30399d(View view) {
        if (view instanceof C6756y) {
            View innerFieldView = ((C6756y) view).getInnerFieldView();
            if (innerFieldView != null) {
                return innerFieldView.getVisibility();
            }
        }
        return view.getVisibility();
    }

    protected final int ak() {
        return C6623g.fragment_address_expander;
    }
}
