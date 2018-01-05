package com.google.android.finsky.layout;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.squareup.leakcanary.C7582R;

public class ak extends DialogFragment {
    public EditText f6785i;
    public ViewGroup f6786j;
    public Button f6787k;
    public Button f6788l;
    public Button f6789m;
    public String[] f6790n;

    public void onStart() {
        super.onStart();
        if (getDialog() != null) {
            Window window = getDialog().getWindow();
            window.setLayout(-1, -1);
            window.setSoftInputMode(16);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.filter_list_layout, viewGroup, false);
        this.f6785i = (EditText) inflate.findViewById(C7582R.id.filter_list_search_text);
        this.f6786j = (ViewGroup) inflate.findViewById(C7582R.id.filter_list_dynamic_targets_list);
        this.f6787k = (Button) inflate.findViewById(C7582R.id.filter_list_button_OK);
        this.f6788l = (Button) inflate.findViewById(C7582R.id.filter_list_button_cancel);
        this.f6789m = (Button) inflate.findViewById(C7582R.id.filter_list_button_reset);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f6785i.addTextChangedListener(new al(this));
    }
}
