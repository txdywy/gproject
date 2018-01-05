package com.google.android.finsky.setup;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView.BufferType;
import com.squareup.leakcanary.C7582R;

@TargetApi(19)
public class SetupWizardNavBar extends Fragment {
    public ViewGroup f20628a;
    public NavButton f20629b;
    public NavButton f20630c;

    public class NavButton extends Button {
        public float f20627a;

        @TargetApi(21)
        public NavButton(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            m19116a();
        }

        public NavButton(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            m19116a();
        }

        public NavButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            m19116a();
        }

        public NavButton(Context context) {
            super(context);
            m19116a();
        }

        private final void m19116a() {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(C7582R.dimen.setup_wizard_navbar_positive_button_disabled_alpha, typedValue, true);
            this.f20627a = typedValue.getFloat();
        }

        public void setEnabled(boolean z) {
            super.setEnabled(z);
            setAlpha(z ? 1.0f : this.f20627a);
        }

        public void setText(CharSequence charSequence, BufferType bufferType) {
            if (getId() == C7582R.id.negative_button) {
                charSequence = "";
            }
            super.setText(charSequence, bufferType);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context activity = getActivity();
        TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(new int[]{C7582R.attr.setup_wizard_navbar_theme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            resourceId = (fArr[2] > fArr2[2] ? 1 : (fArr[2] == fArr2[2] ? 0 : -1)) > 0 ? C7582R.style.SetupWizardNavbarThemeDark : C7582R.style.SetupWizardNavbarThemeLight;
        }
        obtainStyledAttributes.recycle();
        this.f20628a = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(activity, resourceId)).inflate(C7582R.layout.setup_wizard_navbar_layout, viewGroup, false);
        this.f20629b = (NavButton) this.f20628a.findViewById(C7582R.id.positive_button);
        this.f20630c = (NavButton) this.f20628a.findViewById(C7582R.id.negative_button);
        this.f20629b = (NavButton) this.f20628a.findViewById(C7582R.id.positive_button);
        this.f20629b.setText(C7582R.string.setup_wizard_next_button_label);
        this.f20629b.setOnClickListener(null);
        this.f20629b.setEnabled(true);
        this.f20630c.setOnClickListener(new ci(this));
        this.f20630c.setEnabled(true);
        return this.f20628a;
    }
}
