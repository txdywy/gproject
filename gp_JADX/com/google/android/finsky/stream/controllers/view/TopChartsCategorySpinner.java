package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import com.google.android.finsky.cv.p177a.jh;
import com.google.android.finsky.cv.p177a.ji;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.minitopcharts.C4452a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public class TopChartsCategorySpinner extends AppCompatSpinner implements OnItemSelectedListener, ad {
    public ad f23059j;
    public final ce f23060k = C2482j.m13283a(6360);
    public final ce f23061l = C2482j.m13283a(6361);
    public final ad f23062m = new an(this);
    public C2495w f23063n;
    public ao f23064o;
    public int f23065p = -1;

    public TopChartsCategorySpinner(Context context) {
        super(context);
    }

    public TopChartsCategorySpinner(Context context, int i) {
        super(context, i);
    }

    public TopChartsCategorySpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopChartsCategorySpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TopChartsCategorySpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public TopChartsCategorySpinner(Context context, AttributeSet attributeSet, int i, int i2, Theme theme) {
        super(context, attributeSet, i, i2, theme);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        super.setOnItemSelectedListener(this);
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        FinskyLog.m21669e("setOnItemSelectedListener cannot be used with a TopChartsCategorySpinner", new Object[0]);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        FinskyLog.m21669e("setAdapter cannot be used with a TopChartsCategorySpinner", new Object[0]);
    }

    public final void m21062a(C4452a c4452a, int i, ao aoVar, ad adVar, C2495w c2495w) {
        this.f23063n = c2495w;
        this.f23059j = adVar;
        this.f23064o = aoVar;
        if (getAdapter() != c4452a) {
            super.setAdapter((SpinnerAdapter) c4452a);
        }
        if (this.f23065p != i) {
            if (!(((ji) c4452a.getItem(i)).m12870d() && ((ji) c4452a.getItem(i)).by_().f12783d)) {
                for (int i2 = 0; i2 < c4452a.getCount(); i2++) {
                    ji jiVar = (ji) c4452a.getItem(i2);
                    if (jiVar.m12870d()) {
                        boolean z;
                        jh by_ = jiVar.by_();
                        if (i2 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        by_.m12863a(z);
                    }
                }
            }
            this.f23065p = i;
            c4452a.notifyDataSetChanged();
        }
        if (getSelectedItemPosition() != i) {
            setSelection(i);
        }
        this.f23059j.mo1219a(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f23063n.m13379b(new C2475d(this));
            C2482j.m13291a((ad) this, this.f23062m);
        }
        return super.onTouchEvent(motionEvent);
    }

    public ce getPlayStoreUiElement() {
        return this.f23060k;
    }

    public ad getParentNode() {
        return this.f23059j;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (view != null && this.f23065p != i) {
            if (this.f23064o != null) {
                this.f23064o.mo4144b(i);
            }
            this.f23063n.m13379b(new C2475d(this.f23062m));
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
