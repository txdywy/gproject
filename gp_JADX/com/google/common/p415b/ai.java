package com.google.common.p415b;

import com.google.common.p414a.C6937m;

final class ai extends ag {
    ai(Comparable comparable) {
        super((Comparable) C6937m.m31623a((Object) comparable));
    }

    final boolean mo5874a(Comparable comparable) {
        return bw.m31776b(this.a, comparable) < 0;
    }

    final void mo5873a(StringBuilder stringBuilder) {
        stringBuilder.append('(').append(this.a);
    }

    final void mo5875b(StringBuilder stringBuilder) {
        stringBuilder.append(this.a).append(']');
    }

    public final int hashCode() {
        return this.a.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 2).append("/").append(valueOf).append("\\").toString();
    }
}
