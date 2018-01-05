package com.google.protobuf;

import java.util.Arrays;
import java.util.Stack;

final class db {
    public final Stack f35329a = new Stack();

    db() {
    }

    final void m33235a(C7203j c7203j) {
        C7203j c7203j2 = c7203j;
        while (!c7203j2.mo6181f()) {
            if (c7203j2 instanceof da) {
                da daVar = (da) c7203j2;
                m33235a(daVar.f35325f);
                c7203j2 = daVar.f35326g;
            } else {
                String valueOf = String.valueOf(c7203j2.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Has a new type of ByteString been created? Found ").append(valueOf).toString());
            }
        }
        int a = m33234a(c7203j2.mo6170a());
        int i = da.f35323d[a + 1];
        if (this.f35329a.isEmpty() || ((C7203j) this.f35329a.peek()).mo6170a() >= i) {
            this.f35329a.push(c7203j2);
            return;
        }
        int i2 = da.f35323d[a];
        C7203j c7203j3 = (C7203j) this.f35329a.pop();
        while (!this.f35329a.isEmpty() && ((C7203j) this.f35329a.peek()).mo6170a() < i2) {
            c7203j3 = new da((C7203j) this.f35329a.pop(), c7203j3);
        }
        c7203j2 = new da(c7203j3, c7203j2);
        while (!this.f35329a.isEmpty()) {
            if (((C7203j) this.f35329a.peek()).mo6170a() >= da.f35323d[m33234a(c7203j2.mo6170a()) + 1]) {
                break;
            }
            c7203j2 = new da((C7203j) this.f35329a.pop(), c7203j2);
        }
        this.f35329a.push(c7203j2);
    }

    private static int m33234a(int i) {
        int binarySearch = Arrays.binarySearch(da.f35323d, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }
}
