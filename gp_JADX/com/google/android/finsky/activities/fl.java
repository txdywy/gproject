package com.google.android.finsky.activities;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.cs.C2378b;
import com.google.android.finsky.phenotypedebug.C3880a;
import com.google.android.finsky.phenotypedebug.C3881b;
import com.google.android.finsky.phenotypedebug.C3882c;
import com.google.android.finsky.phenotypedebug.C3884d;
import com.google.android.finsky.phenotypedebug.C3886f;
import com.google.android.finsky.phenotypedebug.C3887g;
import com.google.android.finsky.phenotypedebug.C3888h;
import com.google.android.finsky.phenotypedebug.C3889i;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class fl extends DialogFragment {
    public final C0988c f6804a = C1473m.f7980a.mo2040T();
    public final C2378b f6805b = ((C2378b) C1473m.f7980a.ag());
    public final List f6806c = m6561a(this.f6805b.mo2882a().f11707a);
    public final List f6807d = m6561a(this.f6805b.mo2883a(this.f6804a.cZ()).f11707a);
    public final Runnable f6808e = new fm(this);
    public Context f6809f;
    public EditText f6810g;
    public RecyclerView f6811h;
    public C3884d f6812i;
    public Button f6813j;
    public Button f6814k;
    public Button f6815l;

    public final void onStart() {
        super.onStart();
        if (getDialog() != null) {
            getDialog().getWindow().setLayout(-1, -1);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f6809f = activity;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.debug_override_phenotype_flags_layout, viewGroup, false);
        this.f6810g = (EditText) inflate.findViewById(C7582R.id.override_phenotype_search_text);
        this.f6811h = (RecyclerView) inflate.findViewById(C7582R.id.override_phenotype_flags_container);
        this.f6813j = (Button) inflate.findViewById(C7582R.id.override_phenotype_button_ok);
        this.f6814k = (Button) inflate.findViewById(C7582R.id.override_phenotype_button_cancel);
        this.f6815l = (Button) inflate.findViewById(C7582R.id.override_phenotype_button_reset);
        this.f6811h.setLayoutManager(new LinearLayoutManager(1, false));
        this.f6812i = new C3884d(this.f6809f, this.f6806c, this.f6807d);
        this.f6811h.setAdapter(this.f6812i);
        this.f6813j.setOnClickListener(new fo(this));
        this.f6815l.setOnClickListener(new fp(this));
        this.f6814k.setOnClickListener(new fn(this));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getDialog().setTitle(C7582R.string.debug_override_phenotype_experiments_title);
        this.f6810g.setHint(C7582R.string.debug_override_client_experiments_search_hint);
        this.f6810g.addTextChangedListener(new fq(this));
    }

    private static List m6561a(Map map) {
        List arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                arrayList.add(new C3889i(str, (String) value));
            } else if (value instanceof Boolean) {
                arrayList.add(new C3881b(str, (Boolean) value));
            } else if (value instanceof Integer) {
                arrayList.add(new C3887g(str, (Integer) value));
            } else if (value instanceof Long) {
                arrayList.add(new C3888h(str, (Long) value));
            } else if (value instanceof Double) {
                arrayList.add(new C3886f(str, (Double) value));
            } else if (value instanceof byte[]) {
                arrayList.add(new C3882c(str, (byte[]) value));
            } else {
                String valueOf = String.valueOf(value);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Unknown type for onCreateView ").append(valueOf).toString());
            }
        }
        return arrayList;
    }

    static Map m6562a(List list) {
        Map hashMap = new HashMap();
        for (C3880a c3880a : list) {
            if (c3880a.mo3831a()) {
                hashMap.put(c3880a.f19304a, c3880a.m18373b());
            }
        }
        return hashMap;
    }
}
