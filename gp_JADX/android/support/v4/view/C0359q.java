package android.support.v4.view;

import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;

class C0359q {
    C0359q() {
    }

    public void mo448a(LayoutInflater layoutInflater, Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            C0358o.m2045a(layoutInflater, (Factory2) factory);
        } else {
            C0358o.m2045a(layoutInflater, factory2);
        }
    }
}
