package com.google.android.finsky.family.library;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v4.widget.C0380k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.finsky.bg.C1608h;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C3055f extends C0141p implements OnClickListener {
    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f775f.getWindow().requestFeature(1);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C7582R.layout.family_library_filter_dialog, viewGroup);
        ArrayList parcelableArrayList = this.f760q.getParcelableArrayList("filter_options");
        int i = this.f760q.getInt("selected_filter");
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C7582R.id.family_library_filter_dialog_container);
        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
            RadioButton radioButton = (RadioButton) layoutInflater.inflate(C7582R.layout.family_library_filter_option, viewGroup);
            radioButton.setText(((FamilyLibraryFilterOption) parcelableArrayList.get(i2)).f15918a);
            radioButton.setTag(Integer.valueOf(i2));
            if (i2 == i) {
                C0380k.m2283a(radioButton, ColorStateList.valueOf(C1608h.m9243a(m603h(), this.f760q.getInt("backend"))));
                radioButton.setChecked(true);
            }
            if (((FamilyLibraryFilterOption) parcelableArrayList.get(i2)).f15921d) {
                radioButton.setOnClickListener(this);
            } else {
                radioButton.setEnabled(false);
            }
            viewGroup3.addView(radioButton);
        }
        return viewGroup2;
    }

    public final void onClick(View view) {
        ((C3056g) this.f761r).mo3278a(((Integer) view.getTag()).intValue());
        m626a(false);
    }
}
