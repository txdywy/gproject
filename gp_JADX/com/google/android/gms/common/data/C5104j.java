package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class C5104j extends C4975a {
    public boolean f25963b = false;
    public ArrayList f25964c;

    public C5104j(DataHolder dataHolder) {
        super(dataHolder);
    }

    private final int m23683b(int i) {
        if (i >= 0 && i < this.f25964c.size()) {
            return ((Integer) this.f25964c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    public final Object mo4502a(int i) {
        int i2;
        mo4505b();
        int b = m23683b(i);
        if (i < 0 || i == this.f25964c.size()) {
            i2 = 0;
        } else {
            i2 = i == this.f25964c.size() + -1 ? this.a.f25956h - ((Integer) this.f25964c.get(i)).intValue() : ((Integer) this.f25964c.get(i + 1)).intValue() - ((Integer) this.f25964c.get(i)).intValue();
            if (i2 == 1) {
                this.a.m23676a(m23683b(i));
            }
        }
        return mo5063a(b, i2);
    }

    public abstract Object mo5063a(int i, int i2);

    public final int mo4501c() {
        mo4505b();
        return this.f25964c.size();
    }

    public abstract String mo5064d();

    private final void mo4505b() {
        synchronized (this) {
            if (!this.f25963b) {
                int i = this.a.f25956h;
                this.f25964c = new ArrayList();
                if (i > 0) {
                    this.f25964c.add(Integer.valueOf(0));
                    String d = mo5064d();
                    String a = this.a.m23677a(d, 0, this.a.m23676a(0));
                    int i2 = 1;
                    while (i2 < i) {
                        int a2 = this.a.m23676a(i2);
                        String a3 = this.a.m23677a(d, i2, a2);
                        if (a3 == null) {
                            throw new NullPointerException(new StringBuilder(String.valueOf(d).length() + 78).append("Missing value for markerColumn: ").append(d).append(", at row: ").append(i2).append(", for window: ").append(a2).toString());
                        }
                        if (a3.equals(a)) {
                            a3 = a;
                        } else {
                            this.f25964c.add(Integer.valueOf(i2));
                        }
                        i2++;
                        a = a3;
                    }
                }
                this.f25963b = true;
            }
        }
    }
}
