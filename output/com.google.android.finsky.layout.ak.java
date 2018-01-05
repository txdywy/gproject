package com.google.android.finsky.layout;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class com.google.android.finsky.layout.ak extends DialogFragment
{

    public EditText i;
    public ViewGroup j;
    public Button k;
    public Button l;
    public Button m;
    public String[] n;

    ak() {
        DialogFragment();
    }

    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = p0.inflate(2130968868, p1, 0);
        this.i = (EditText)v1.findViewById(2131755867);
        this.j = (ViewGroup)v1.findViewById(2131755869);
        this.k = (Button)v1.findViewById(2131755873);
        this.l = (Button)v1.findViewById(2131755872);
        this.m = (Button)v1.findViewById(2131755871);
        return v1;
    }

    public void onStart() {
        super.onStart();
        if (this.getDialog() != 0) {
            v0 = this.getDialog().getWindow();
            v0.setLayout(-1, -1);
            v0.setSoftInputMode(16);
        }
    }

    public void onViewCreated(View p0, Bundle p1) {
        this.i.addTextChangedListener(new com.google.android.finsky.layout.al(this));
    }

}
