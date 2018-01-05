package com.google.android.finsky.activities;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.cs.b;
import com.google.android.finsky.cs.f;
import com.google.android.finsky.m;
import com.google.android.finsky.phenotypedebug.a;
import com.google.android.finsky.phenotypedebug.b;
import com.google.android.finsky.phenotypedebug.c;
import com.google.android.finsky.phenotypedebug.d;
import com.google.android.finsky.phenotypedebug.f;
import com.google.android.finsky.phenotypedebug.g;
import com.google.android.finsky.phenotypedebug.h;
import com.google.android.finsky.phenotypedebug.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public final class com.google.android.finsky.activities.fl extends DialogFragment
{

    public final com.google.android.finsky.accounts.c a;
    public final com.google.android.finsky.cs.b b;
    public final List c;
    public final List d;
    public final Runnable e;
    public Context f;
    public EditText g;
    public RecyclerView h;
    public com.google.android.finsky.phenotypedebug.d i;
    public Button j;
    public Button k;
    public Button l;

    fl() {
        DialogFragment();
        this.a = com.google.android.finsky.m.a.T();
        this.b = (com.google.android.finsky.cs.b)com.google.android.finsky.m.a.ag();
        this.c = com.google.android.finsky.activities.fl.a(this.b.a().a);
        this.d = com.google.android.finsky.activities.fl.a(this.b.a(this.a.cZ()).a);
        this.e = new com.google.android.finsky.activities.fm(this);
    }

    private static List a(Map p0) {
        v2 = new ArrayList();
        v3 = p0.entrySet().iterator();
        while (true) {
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                if (!v3.hasNext())
                                    return v2;
                                v0 = (Map$Entry)v3.next();
                                v1 = (String)v0.getKey();
                                v0 = v0.getValue();
                                if (!(v0 instanceof String))
                                    break;
                                v2.add(new com.google.android.finsky.phenotypedebug.i(v1, (String)v0));
                            }
                            if (!(v0 instanceof Boolean))
                                break;
                            v2.add(new com.google.android.finsky.phenotypedebug.b(v1, (Boolean)v0));
                        }
                        if (!(v0 instanceof Integer))
                            break;
                        v2.add(new com.google.android.finsky.phenotypedebug.g(v1, (Integer)v0));
                    }
                    if (!(v0 instanceof Long))
                        break;
                    v2.add(new com.google.android.finsky.phenotypedebug.h(v1, (Long)v0));
                }
                if (!(v0 instanceof Double))
                    break;
                v2.add(new com.google.android.finsky.phenotypedebug.f(v1, (Double)v0));
            }
            if (!(v0 instanceof byte[]))
                break;
            v2.add(new com.google.android.finsky.phenotypedebug.c(v1, (byte[])v0));
        }
        v0 = String.valueOf(v0);
        throw new IllegalStateException((String.valueOf(v0).length() + 30) + "Unknown type for onCreateView " + v0);
    }

    static Map a(List p0) {
        v1 = new HashMap();
        v2 = p0.iterator();
        while (v2.hasNext()) {
            v0 = (com.google.android.finsky.phenotypedebug.a)v2.next();
            if (!v0.a())
                continue;
            v1.put(v0.a, v0.b());
        }
        return v1;
    }

    public final void onAttach(Activity p0) {
        super.onAttach(p0);
        this.f = p0;
    }

    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = p0.inflate(2130968727, p1, 0);
        this.g = (EditText)v1.findViewById(2131755560);
        this.h = (RecyclerView)v1.findViewById(2131755561);
        this.j = (Button)v1.findViewById(2131755565);
        this.k = (Button)v1.findViewById(2131755564);
        this.l = (Button)v1.findViewById(2131755563);
        this.h.setLayoutManager(new LinearLayoutManager(1, 0));
        this.i = new com.google.android.finsky.phenotypedebug.d(this.f, this.c, this.d);
        this.h.setAdapter(this.i);
        this.j.setOnClickListener(new com.google.android.finsky.activities.fo(this));
        this.l.setOnClickListener(new com.google.android.finsky.activities.fp(this));
        this.k.setOnClickListener(new com.google.android.finsky.activities.fn(this));
        return v1;
    }

    public final void onStart() {
        super.onStart();
        if (this.getDialog() != 0)
            this.getDialog().getWindow().setLayout(-1, -1);
    }

    public final void onViewCreated(View p0, Bundle p1) {
        super.onViewCreated(p0, p1);
        this.getDialog().setTitle(2131951999);
        this.g.setHint(2131951994);
        this.g.addTextChangedListener(new com.google.android.finsky.activities.fq(this));
    }

}
