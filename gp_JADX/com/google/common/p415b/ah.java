package com.google.common.p415b;

final class ah extends ag {
    public static final ah f34281b = new ah();

    private ah() {
        super(null);
    }

    final Comparable mo5872a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    final boolean mo5874a(Comparable comparable) {
        return false;
    }

    final void mo5873a(StringBuilder stringBuilder) {
        throw new AssertionError();
    }

    final void mo5875b(StringBuilder stringBuilder) {
        stringBuilder.append("+∞)");
    }

    public final int mo5871a(ag agVar) {
        return agVar == this ? 0 : 1;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return mo5871a((ag) obj);
    }
}
