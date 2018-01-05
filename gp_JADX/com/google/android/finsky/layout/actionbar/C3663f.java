package com.google.android.finsky.layout.actionbar;

public final class C3663f {
    public int f18471a;
    public CharSequence f18472b;
    public String f18473c;

    public C3663f(int i, CharSequence charSequence) {
        this.f18471a = i;
        this.f18472b = charSequence;
    }

    public final String toString() {
        int i = this.f18471a;
        String valueOf = String.valueOf(this.f18472b);
        String str = this.f18473c;
        return new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(str).length()).append("[type: ").append(i).append(", title: ").append(valueOf).append(", shareUrl: ").append(str).append("]").toString();
    }
}
