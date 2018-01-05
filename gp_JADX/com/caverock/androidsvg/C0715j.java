package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.List;

final class C0715j {
    public C0710e f4585a = null;
    public String f4586b = null;
    public List f4587c = null;
    public List f4588d = null;

    public C0715j(C0710e c0710e, String str) {
        if (c0710e == null) {
            c0710e = C0710e.DESCENDANT;
        }
        this.f4585a = c0710e;
        this.f4586b = str;
    }

    public final void m4777a(String str, C0708c c0708c, String str2) {
        if (this.f4587c == null) {
            this.f4587c = new ArrayList();
        }
        this.f4587c.add(new C0706b(str, c0708c, str2));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f4585a == C0710e.CHILD) {
            stringBuilder.append("> ");
        } else if (this.f4585a == C0710e.FOLLOWS) {
            stringBuilder.append("+ ");
        }
        stringBuilder.append(this.f4586b == null ? "*" : this.f4586b);
        if (this.f4587c != null) {
            for (C0706b c0706b : this.f4587c) {
                stringBuilder.append('[').append(c0706b.f4328a);
                switch (c0706b.f4329b.ordinal()) {
                    case 1:
                        stringBuilder.append('=').append(c0706b.f4330c);
                        break;
                    case 2:
                        stringBuilder.append("~=").append(c0706b.f4330c);
                        break;
                    case 3:
                        stringBuilder.append("|=").append(c0706b.f4330c);
                        break;
                    default:
                        break;
                }
                stringBuilder.append(']');
            }
        }
        if (this.f4588d != null) {
            for (String append : this.f4588d) {
                stringBuilder.append(':').append(append);
            }
        }
        return stringBuilder.toString();
    }
}
