package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.volley.a.q;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.b.a.ap;
import com.google.a.a.a.a.b.a.b.a.aq;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.b.a.w;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6515e;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.ui.address.C6730x;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SelectFieldView extends LinearLayout implements OnItemSelectedListener, C6511g, C6508h, be, C6756y {
    public FormSpinner f33463a;
    public InlineSelectView f33464b;
    public InfoMessageView f33465c;
    public ImageWithCaptionView f33466d;
    public TextView f33467e;
    public View f33468f;
    public al f33469g;
    public boolean f33470h;
    public int f33471i;
    public C6512i f33472j;
    public final ArrayList f33473k = new ArrayList();
    public int f33474l = -1;
    public View f33475m;
    public boolean f33476n;

    public SelectFieldView(Context context) {
        super(context);
    }

    public SelectFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public SelectFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setVisibilityMatchingView(View view) {
        this.f33475m = view;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f33463a = (FormSpinner) findViewById(C6622f.ui_field_spinner);
        this.f33464b = (InlineSelectView) findViewById(C6622f.ui_field_inline_select);
        this.f33465c = (InfoMessageView) findViewById(C6622f.ui_field_info_message_description);
        this.f33466d = (ImageWithCaptionView) findViewById(C6622f.ui_field_read_only_text_icon);
        this.f33467e = (TextView) findViewById(C6622f.ui_field_read_only_text);
    }

    public final void m30684a(al alVar, LogContext logContext, q qVar) {
        boolean z = true;
        this.f33469g = alVar;
        ap d = this.f33469g.d();
        if (d == null || d.a.length == 0) {
            throw new IllegalArgumentException("SelectField must be non-null and contain options.");
        }
        int i;
        if (this.f33469g.d().d == 0) {
            Log.w("SelectFieldView", String.format(Locale.US, "Unknown select field display type for field %s.", new Object[]{this.f33469g.c}));
            this.f33469g.d().d = 1;
        }
        if (cp.m30908a(alVar) || alVar.g) {
            i = true;
        } else {
            i = 0;
        }
        this.f33474l = cp.m30900a(d);
        if (i != 0 && d.a.length > 1 && this.f33474l < 0) {
            throw new IllegalArgumentException("Read-only field does not have clear indication of which option to display.");
        } else if (i != 0 && d.d == 1) {
            this.f33468f = this.f33467e;
            this.f33467e.setVisibility(0);
            this.f33463a.setVisibility(8);
            this.f33464b.setVisibility(8);
            aq aqVar = d.a[this.f33474l];
            if (TextUtils.isEmpty(aqVar.b)) {
                throw new IllegalArgumentException("Each option must be provided a display value.");
            }
            this.f33467e.setText(aqVar.b);
            this.f33465c.setInfoMessage(aqVar.f);
            if (aqVar.g == null) {
                return;
            }
            if (TextUtils.isEmpty(aqVar.g.c)) {
                r2 = "Empty option icon url for option: ";
                r0 = String.valueOf(aqVar.b);
                throw new IllegalArgumentException(r0.length() != 0 ? r2.concat(r0) : new String(r2));
            }
            this.f33466d.setVisibility(0);
            this.f33466d.m30638a(aqVar.g, qVar, ((Boolean) C6489e.f32495a.a()).booleanValue(), logContext);
        } else if (d.d == 1) {
            SpinnerAdapter c6730x;
            this.f33468f = this.f33463a;
            this.f33463a.setVisibility(0);
            this.f33463a.setUiReference(alVar.d);
            this.f33463a.setName(alVar.c);
            this.f33463a.setLogContext(logContext);
            this.f33464b.setVisibility(8);
            this.f33466d.setVisibility(8);
            this.f33467e.setVisibility(8);
            this.f33470h = cp.m30913c(alVar);
            List arrayList = new ArrayList(d.a.length);
            for (aq aqVar2 : d.a) {
                if (TextUtils.isEmpty(aqVar2.b)) {
                    throw new IllegalArgumentException("Option at index " + arrayList.size() + " has no display value.");
                }
                arrayList.add(new bz(aqVar2.c, aqVar2.b));
            }
            if (this.f33470h) {
                r2 = "";
                if (TextUtils.isEmpty(d.c)) {
                    r0 = alVar.h;
                } else {
                    r0 = d.c;
                }
                c6730x = new C6730x(getContext(), C6623g.view_row_spinner, C6622f.description, arrayList, new bz(r2, r0));
            } else {
                c6730x = new cr(getContext(), C6623g.view_row_spinner, C6622f.description, arrayList);
            }
            c6730x.setDropDownViewResource(C6623g.view_spinner_dropdown);
            this.f33463a.setAdapter(c6730x);
            this.f33463a.setOnItemSelectedListener(this);
            this.f33463a.setDelegateForDependencyGraph(this);
            this.f33474l = Math.max(this.f33474l, 0);
            this.f33471i = this.f33474l;
            this.f33463a.setNonUserInputSelection(this.f33474l);
            FormSpinner formSpinner = this.f33463a;
            if (this.f33469g.f) {
                z = false;
            }
            formSpinner.setRequired(z);
            this.f33463a.setPrompt(this.f33469g.h);
            this.f33463a.setLabel(this.f33469g.h);
        } else if (d.d == 2) {
            this.f33468f = this.f33464b;
            this.f33464b.setVisibility(0);
            this.f33463a.setVisibility(8);
            this.f33466d.setVisibility(8);
            this.f33467e.setVisibility(8);
            this.f33464b.setOnItemSelectedListener(this);
            this.f33464b.setDelegateForDependencyGraph(this);
            this.f33464b.m30647a(d, alVar.d, alVar.c, logContext, qVar);
            InlineSelectView inlineSelectView = this.f33464b;
            if (this.f33469g.f) {
                z = false;
            }
            inlineSelectView.setRequired(z);
        } else {
            throw new IllegalArgumentException("Unknown SelectField display type: " + d.d);
        }
    }

    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        super.dispatchFreezeSelfOnly(sparseArray);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        super.dispatchThawSelfOnly(sparseArray);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putParcelable("formSpinnerState", this.f33463a.onSaveInstanceState());
        bundle.putParcelable("inlineSelectViewState", this.f33464b.onSaveInstanceState());
        bundle.putParcelable("infoMessageState", this.f33465c.onSaveInstanceState());
        bundle.putParcelable("readOnlyTextIconState", this.f33466d.onSaveInstanceState());
        bundle.putParcelable("readOnlyTextState", this.f33467e.onSaveInstanceState());
        bundle.putBoolean("hiddenByDependencyGraph", this.f33476n);
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            this.f33463a.onRestoreInstanceState(bundle.getParcelable("formSpinnerState"));
            this.f33464b.onRestoreInstanceState(bundle.getParcelable("inlineSelectViewState"));
            this.f33465c.onRestoreInstanceState(bundle.getParcelable("infoMessageState"));
            this.f33466d.onRestoreInstanceState(bundle.getParcelable("readOnlyTextIconState"));
            this.f33467e.onRestoreInstanceState(bundle.getParcelable("readOnlyTextState"));
            m30681a(bundle.getBoolean("hiddenByDependencyGraph"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f33470h) {
            i--;
        }
        m30682b(i, view == null);
    }

    public final void mo5656a(int i, boolean z) {
        m30682b(i, !z);
    }

    public void onNothingSelected(AdapterView adapterView) {
        this.f33465c.setInfoMessage(null);
    }

    public View getInnerFieldView() {
        return this.f33468f;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f33463a.setEnabled(z);
        this.f33464b.setEnabled(z);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f33475m != null) {
            this.f33475m.setVisibility(i);
        }
    }

    private final void m30682b(int i, boolean z) {
        if (i >= 0) {
            aq aqVar = this.f33469g.d().a[i];
            this.f33465c.setInfoMessage(aqVar.f);
            Object obj = (i == this.f33471i && this.f33463a.getVisibility() == 0) ? 1 : null;
            if (!z && obj == null) {
                ArrayList arrayList = this.f33473k;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    C6515e c6515e = (C6515e) arrayList.get(i2);
                    w c = c6515e.f32578a.c();
                    if (c.a == null) {
                        this.f33472j.mo5460a(c6515e);
                        i2 = i3;
                    } else {
                        for (long j : c.a.a) {
                            if (j == aqVar.e) {
                                this.f33472j.mo5460a(c6515e);
                                i2 = i3;
                                break;
                            }
                        }
                        i2 = i3;
                    }
                }
            }
        } else {
            this.f33465c.setInfoMessage(null);
        }
        this.f33471i = i;
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        switch (lVar.c) {
            case 1:
                m30681a(false);
                return;
            case 2:
                if (this.f33463a.getVisibility() == 0) {
                    this.f33463a.setNonUserInputSelection(this.f33474l);
                }
                if (this.f33464b.getVisibility() == 0) {
                    this.f33464b.m30646a(this.f33474l, false);
                    return;
                }
                return;
            case 11:
                m30681a(true);
                return;
            default:
                throw new IllegalArgumentException("Unknown ResultingActionReference action type " + lVar.c);
        }
    }

    private final void m30681a(boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        this.f33476n = z;
        setVisibility(z ? 8 : 0);
        if (this.f33468f == this.f33463a) {
            FormSpinner formSpinner = this.f33463a;
            if (!(z || this.f33469g.f)) {
                z3 = true;
            }
            formSpinner.setRequired(z3);
        } else if (this.f33468f == this.f33464b) {
            InlineSelectView inlineSelectView = this.f33464b;
            if (z || this.f33469g.f) {
                z2 = false;
            }
            inlineSelectView.setRequired(z2);
        }
    }

    public void setTriggerListener(C6512i c6512i) {
        this.f33472j = c6512i;
    }

    public final void mo5456a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C6515e c6515e = (C6515e) arrayList.get(i);
            switch (c6515e.f32578a.d) {
                case 1:
                    this.f33473k.add(c6515e);
                    break;
                case 3:
                    break;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported trigger type: %d", new Object[]{Integer.valueOf(c6515e.f32578a.d)}));
            }
        }
    }

    public final boolean mo5457a(t tVar) {
        switch (tVar.d) {
            case 1:
                return false;
            case 3:
                if (this.f33469g == null || !C6516f.m29564a(tVar, this.f33469g.d().a[this.f33471i].e)) {
                    return false;
                }
                return true;
            default:
                throw new IllegalArgumentException("Unsupported trigger type: " + tVar.d);
        }
    }
}
