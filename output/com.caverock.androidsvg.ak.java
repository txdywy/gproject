package com.caverock.androidsvg;

public final class com.caverock.androidsvg.ak extends com.caverock.androidsvg.bn
{

    public String a;
    public com.caverock.androidsvg.bn b;

    ak(String p0, com.caverock.androidsvg.bn p1) {
        com.caverock.androidsvg.bn();
        this.a = p0;
        this.b = p1;
    }

    public final String toString() {
        v1 = String.valueOf(this.b);
        return (String.valueOf(this.a).length() + 1 + String.valueOf(v1).length()) + this.a + " " + v1;
    }

}
