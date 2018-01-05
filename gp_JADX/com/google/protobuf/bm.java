package com.google.protobuf;

public class bm {
    public C7203j f35224a;
    public ah f35225b;
    public volatile cf f35226c;
    public volatile C7203j f35227d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        cf cfVar = this.f35226c;
        cf cfVar2 = bmVar.f35226c;
        if (cfVar == null && cfVar2 == null) {
            return m33004b().equals(bmVar.m33004b());
        }
        if (cfVar != null && cfVar2 != null) {
            return cfVar.equals(cfVar2);
        }
        if (cfVar != null) {
            return cfVar.equals(bmVar.m33003a(cfVar.mo6121h()));
        }
        return m33003a(cfVar2.mo6121h()).equals(cfVar2);
    }

    public int hashCode() {
        return 1;
    }

    private final cf m33003a(cf cfVar) {
        if (this.f35226c == null) {
            synchronized (this) {
                if (this.f35226c != null) {
                } else {
                    try {
                        if (this.f35224a != null) {
                            this.f35226c = (cf) cfVar.mo6117d().mo6128a(this.f35224a, this.f35225b);
                            this.f35227d = this.f35224a;
                        } else {
                            this.f35226c = cfVar;
                            this.f35227d = C7203j.f35320a;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        this.f35226c = cfVar;
                        this.f35227d = C7203j.f35320a;
                    }
                }
            }
        }
        return this.f35226c;
    }

    public final C7203j m33004b() {
        if (this.f35227d != null) {
            return this.f35227d;
        }
        if (this.f35224a != null) {
            return this.f35224a;
        }
        synchronized (this) {
            if (this.f35227d != null) {
                C7203j c7203j = this.f35227d;
                return c7203j;
            }
            if (this.f35226c == null) {
                this.f35227d = C7203j.f35320a;
            } else {
                this.f35227d = this.f35226c.mo6022c();
            }
            c7203j = this.f35227d;
            return c7203j;
        }
    }

    static {
        ah.m32878a();
    }
}
