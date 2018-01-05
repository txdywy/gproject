package com.caverock.androidsvg;

public final class ak extends bn {
    public String f4249a;
    public bn f4250b;

    public ak(String str, bn bnVar) {
        this.f4249a = str;
        this.f4250b = bnVar;
    }

    public final String toString() {
        String str = this.f4249a;
        String valueOf = String.valueOf(this.f4250b);
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()).append(str).append(" ").append(valueOf).toString();
    }
}
