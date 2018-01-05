package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1749e;

public class AddressAutoComplete extends AutoCompleteTextView implements OnItemClickListener {
    public C1730a f8750a;
    public C1741m f8751b;
    public boolean f8752c;

    public AddressAutoComplete(Context context) {
        this(context, null);
    }

    public AddressAutoComplete(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddressAutoComplete(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f8750a = new C1730a(this, getContext());
        setAdapter(this.f8750a);
        setOnItemClickListener(this);
    }

    public synchronized void setSuggestionProvider(C1741m c1741m) {
        this.f8751b = c1741m;
    }

    public final synchronized void m9485a() {
        this.f8752c = true;
    }

    protected void replaceText(CharSequence charSequence) {
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f8751b != null) {
            this.f8751b.mo2427a((C1749e) this.f8750a.f9017a.get(i));
        }
    }
}
