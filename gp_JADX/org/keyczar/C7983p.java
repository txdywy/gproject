package org.keyczar;

import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
import org.keyczar.p571c.C7986f;
import org.keyczar.p572d.C7996b;

public abstract class C7983p {
    public final int f40984h;
    public ArrayList f40985i = new ArrayList();
    public C8014v f40986j = new C8014v();

    protected C7983p(int i) {
        this.f40984h = i;
    }

    protected abstract byte[] mo6649a();

    abstract JSONObject mo6650b();

    protected abstract C7986f mo6651c();

    public boolean equals(Object obj) {
        try {
            return Arrays.equals(((C7983p) obj).mo6649a(), mo6649a());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return C7996b.m38197b(mo6649a());
    }

    protected Iterable mo6655d() {
        return this.f40985i;
    }

    public String toString() {
        return mo6650b().toString();
    }
}
