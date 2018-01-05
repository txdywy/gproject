package com.google.archivepatcher.p406a;

public enum C6872h {
    LEVEL1_STRATEGY0_NOWRAP(1, 0, true),
    LEVEL2_STRATEGY0_NOWRAP(2, 0, true),
    LEVEL3_STRATEGY0_NOWRAP(3, 0, true),
    LEVEL4_STRATEGY0_NOWRAP(4, 0, true),
    LEVEL5_STRATEGY0_NOWRAP(5, 0, true),
    LEVEL6_STRATEGY0_NOWRAP(6, 0, true),
    LEVEL7_STRATEGY0_NOWRAP(7, 0, true),
    LEVEL8_STRATEGY0_NOWRAP(8, 0, true),
    LEVEL9_STRATEGY0_NOWRAP(9, 0, true),
    LEVEL1_STRATEGY1_NOWRAP(1, 1, true),
    LEVEL2_STRATEGY1_NOWRAP(2, 1, true),
    LEVEL3_STRATEGY1_NOWRAP(3, 1, true),
    LEVEL4_STRATEGY1_NOWRAP(4, 1, true),
    LEVEL5_STRATEGY1_NOWRAP(5, 1, true),
    LEVEL6_STRATEGY1_NOWRAP(6, 1, true),
    LEVEL7_STRATEGY1_NOWRAP(7, 1, true),
    LEVEL8_STRATEGY1_NOWRAP(8, 1, true),
    LEVEL9_STRATEGY1_NOWRAP(9, 1, true),
    LEVEL1_STRATEGY2_NOWRAP(1, 2, true),
    LEVEL2_STRATEGY2_NOWRAP(2, 2, true),
    LEVEL3_STRATEGY2_NOWRAP(3, 2, true),
    LEVEL4_STRATEGY2_NOWRAP(4, 2, true),
    LEVEL5_STRATEGY2_NOWRAP(5, 2, true),
    LEVEL6_STRATEGY2_NOWRAP(6, 2, true),
    LEVEL7_STRATEGY2_NOWRAP(7, 2, true),
    LEVEL8_STRATEGY2_NOWRAP(8, 2, true),
    LEVEL9_STRATEGY2_NOWRAP(9, 2, true),
    LEVEL1_STRATEGY0_WRAP(1, 0, false),
    LEVEL2_STRATEGY0_WRAP(2, 0, false),
    LEVEL3_STRATEGY0_WRAP(3, 0, false),
    LEVEL4_STRATEGY0_WRAP(4, 0, false),
    LEVEL5_STRATEGY0_WRAP(5, 0, false),
    LEVEL6_STRATEGY0_WRAP(6, 0, false),
    LEVEL7_STRATEGY0_WRAP(7, 0, false),
    LEVEL8_STRATEGY0_WRAP(8, 0, false),
    LEVEL9_STRATEGY0_WRAP(9, 0, false),
    LEVEL1_STRATEGY1_WRAP(1, 1, false),
    LEVEL2_STRATEGY1_WRAP(2, 1, false),
    LEVEL3_STRATEGY1_WRAP(3, 1, false),
    LEVEL4_STRATEGY1_WRAP(4, 1, false),
    LEVEL5_STRATEGY1_WRAP(5, 1, false),
    LEVEL6_STRATEGY1_WRAP(6, 1, false),
    LEVEL7_STRATEGY1_WRAP(7, 1, false),
    LEVEL8_STRATEGY1_WRAP(8, 1, false),
    LEVEL9_STRATEGY1_WRAP(9, 1, false),
    LEVEL1_STRATEGY2_WRAP(1, 2, false),
    LEVEL2_STRATEGY2_WRAP(2, 2, false),
    LEVEL3_STRATEGY2_WRAP(3, 2, false),
    LEVEL4_STRATEGY2_WRAP(4, 2, false),
    LEVEL5_STRATEGY2_WRAP(5, 2, false),
    LEVEL6_STRATEGY2_WRAP(6, 2, false),
    LEVEL7_STRATEGY2_WRAP(7, 2, false),
    LEVEL8_STRATEGY2_WRAP(8, 2, false),
    LEVEL9_STRATEGY2_WRAP(9, 2, false);
    
    public final int ac;
    public final int ad;
    public final boolean ae;

    private C6872h(int i, int i2, boolean z) {
        if (i <= 0 || i > 9 || i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException("Only levels 1-9 and strategies 0-2 are valid.");
        }
        this.ac = i;
        this.ad = i2;
        this.ae = z;
    }

    public static C6872h m31243a(int i, int i2, boolean z) {
        switch ((z ? 1 : 0) + ((i2 * 10) + (i * 100))) {
            case 100:
                return LEVEL1_STRATEGY0_WRAP;
            case 101:
                return LEVEL1_STRATEGY0_NOWRAP;
            case 110:
                return LEVEL1_STRATEGY1_WRAP;
            case 111:
                return LEVEL1_STRATEGY1_NOWRAP;
            case 120:
                return LEVEL1_STRATEGY2_WRAP;
            case 121:
                return LEVEL1_STRATEGY2_NOWRAP;
            case 200:
                return LEVEL2_STRATEGY0_WRAP;
            case 201:
                return LEVEL2_STRATEGY0_NOWRAP;
            case 210:
                return LEVEL2_STRATEGY1_WRAP;
            case 211:
                return LEVEL2_STRATEGY1_NOWRAP;
            case 220:
                return LEVEL2_STRATEGY2_WRAP;
            case 221:
                return LEVEL2_STRATEGY2_NOWRAP;
            case 300:
                return LEVEL3_STRATEGY0_WRAP;
            case 301:
                return LEVEL3_STRATEGY0_NOWRAP;
            case 310:
                return LEVEL3_STRATEGY1_WRAP;
            case 311:
                return LEVEL3_STRATEGY1_NOWRAP;
            case 320:
                return LEVEL3_STRATEGY2_WRAP;
            case 321:
                return LEVEL3_STRATEGY2_NOWRAP;
            case 400:
                return LEVEL4_STRATEGY0_WRAP;
            case 401:
                return LEVEL4_STRATEGY0_NOWRAP;
            case 410:
                return LEVEL4_STRATEGY1_WRAP;
            case 411:
                return LEVEL4_STRATEGY1_NOWRAP;
            case 420:
                return LEVEL4_STRATEGY2_WRAP;
            case 421:
                return LEVEL4_STRATEGY2_NOWRAP;
            case 500:
                return LEVEL5_STRATEGY0_WRAP;
            case 501:
                return LEVEL5_STRATEGY0_NOWRAP;
            case 510:
                return LEVEL5_STRATEGY1_WRAP;
            case 511:
                return LEVEL5_STRATEGY1_NOWRAP;
            case 520:
                return LEVEL5_STRATEGY2_WRAP;
            case 521:
                return LEVEL5_STRATEGY2_NOWRAP;
            case 600:
                return LEVEL6_STRATEGY0_WRAP;
            case 601:
                return LEVEL6_STRATEGY0_NOWRAP;
            case 610:
                return LEVEL6_STRATEGY1_WRAP;
            case 611:
                return LEVEL6_STRATEGY1_NOWRAP;
            case 620:
                return LEVEL6_STRATEGY2_WRAP;
            case 621:
                return LEVEL6_STRATEGY2_NOWRAP;
            case 700:
                return LEVEL7_STRATEGY0_WRAP;
            case 701:
                return LEVEL7_STRATEGY0_NOWRAP;
            case 710:
                return LEVEL7_STRATEGY1_WRAP;
            case 711:
                return LEVEL7_STRATEGY1_NOWRAP;
            case 720:
                return LEVEL7_STRATEGY2_WRAP;
            case 721:
                return LEVEL7_STRATEGY2_NOWRAP;
            case 800:
                return LEVEL8_STRATEGY0_WRAP;
            case 801:
                return LEVEL8_STRATEGY0_NOWRAP;
            case 810:
                return LEVEL8_STRATEGY1_WRAP;
            case 811:
                return LEVEL8_STRATEGY1_NOWRAP;
            case 820:
                return LEVEL8_STRATEGY2_WRAP;
            case 821:
                return LEVEL8_STRATEGY2_NOWRAP;
            case 900:
                return LEVEL9_STRATEGY0_WRAP;
            case 901:
                return LEVEL9_STRATEGY0_NOWRAP;
            case 910:
                return LEVEL9_STRATEGY1_WRAP;
            case 911:
                return LEVEL9_STRATEGY1_NOWRAP;
            case 920:
                return LEVEL9_STRATEGY2_WRAP;
            case 921:
                return LEVEL9_STRATEGY2_NOWRAP;
            default:
                throw new IllegalArgumentException("No such parameters");
        }
    }

    public final String toString() {
        int i = this.ac;
        int i2 = this.ad;
        return "level=" + i + ",strategy=" + i2 + ",nowrap=" + this.ae;
    }
}
