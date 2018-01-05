package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.google.android.finsky.billing.addresschallenge.placesapi.e;
import java.util.List;

public synchronized class AddressAutoComplete extends AutoCompleteTextView implements AdapterView$OnItemClickListener
{

    public com.google.android.finsky.billing.addresschallenge.a a;
    public com.google.android.finsky.billing.addresschallenge.m b;
    public boolean c;

    AddressAutoComplete(Context p0) {
        AddressAutoComplete(p0, 0);
    }

    AddressAutoComplete(Context p0, AttributeSet p1) {
        AddressAutoComplete(p0, p1, 0);
    }

    AddressAutoComplete(Context p0, AttributeSet p1, int p2) {
        AutoCompleteTextView(p0, p1, p2);
    }

    public final synchronized void a() {
        enter this;
        try {
            this.c = 1;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = new com.google.android.finsky.billing.addresschallenge.a(this, this.getContext());
        this.setAdapter(this.a);
        this.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView p0, View p1, int p2, long p3) {
        if (this.b != 0)
            this.b.a((com.google.android.finsky.billing.addresschallenge.placesapi.e)this.a.a.get(p2));
    }

    protected void replaceText(CharSequence p0) {
    }

    public synchronized void setSuggestionProvider(com.google.android.finsky.billing.addresschallenge.m p0) {
        enter this;
        try {
            this.b = p0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}
