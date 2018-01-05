package com.google.android.finsky.stream.controllers.minitopcharts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.jh;
import com.google.android.finsky.cv.p177a.ji;
import com.google.android.finsky.cv.p177a.jj;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C4452a extends ArrayAdapter {
    public final int f22617a;
    public final int f22618b;

    private C4452a(Context context, ji[] jiVarArr, int i, int i2) {
        super(context, 17367049, jiVarArr);
        this.f22617a = i;
        this.f22618b = i2;
    }

    public static C4452a m20810a(Context context, jj jjVar, int i, int i2) {
        if (jjVar != null && jjVar.f12788a.length != 0) {
            return new C4452a(context, jjVar.f12788a, i, i2);
        }
        FinskyLog.m21669e("SelectOptions for MiniTopCharts creation is null or empty", new Object[0]);
        return null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Resources resources = getContext().getResources();
        if (view != null) {
            return view;
        }
        int color = resources.getColor(C1608h.m9251b(this.f22617a));
        view = LayoutInflater.from(getContext()).inflate(this.f22618b, viewGroup, false);
        ((TextView) view.findViewById(C7582R.id.li_title)).setTextColor(color);
        ((ImageView) view.findViewById(C7582R.id.drop_down_icon)).setColorFilter(color, Mode.SRC_ATOP);
        return view;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int i2 = 1;
        int i3 = 0;
        if (getItemViewType(i) == 1) {
            if (view == null || view.getId() != C7582R.id.spinner_dropdown_divider) {
                i2 = 0;
            }
            if (i2 == 0) {
                return LayoutInflater.from(getContext()).inflate(C7582R.layout.jpkr_mini_top_charts_spinner_divider, viewGroup, false);
            }
            return view;
        }
        jh by_ = ((ji) getItem(i)).by_();
        int i4 = (view == null || view.getId() != C7582R.id.spinner_dropdown_item) ? 0 : 1;
        if (i4 == 0) {
            view = LayoutInflater.from(getContext()).inflate(C7582R.layout.jpkr_mini_top_charts_spinner_item, viewGroup, false);
        }
        ((TextView) view.findViewById(C7582R.id.li_title)).setText(by_.f12781b);
        ImageView imageView = (ImageView) view.findViewById(C7582R.id.checkmark);
        if (!by_.f12783d) {
            i3 = 4;
        }
        imageView.setVisibility(i3);
        return view;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getItemViewType(int i) {
        ji jiVar = (ji) getItem(i);
        if (jiVar.m12870d()) {
            return 2;
        }
        if (jiVar.f12785a == 1) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown option type at position " + i);
    }

    public final boolean isEnabled(int i) {
        return ((ji) getItem(i)).m12870d();
    }
}
