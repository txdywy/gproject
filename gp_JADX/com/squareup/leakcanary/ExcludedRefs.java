package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class ExcludedRefs implements Serializable {
    public final Map classNames;
    public final Map fieldNameByClassName;
    public final Map staticFieldNameByClassName;
    public final Map threadNames;

    public interface Builder {
        ExcludedRefs build();

        BuilderWithParams clazz(String str);

        BuilderWithParams instanceField(String str, String str2);

        BuilderWithParams staticField(String str, String str2);

        BuilderWithParams thread(String str);
    }

    public final class BuilderWithParams implements Builder {
        public final Map classNames = new LinkedHashMap();
        public final Map fieldNameByClassName = new LinkedHashMap();
        public ParamsBuilder lastParams;
        public final Map staticFieldNameByClassName = new LinkedHashMap();
        public final Map threadNames = new LinkedHashMap();

        BuilderWithParams() {
        }

        public final BuilderWithParams instanceField(String str, String str2) {
            Preconditions.checkNotNull(str, "className");
            Preconditions.checkNotNull(str2, "fieldName");
            Map map = (Map) this.fieldNameByClassName.get(str);
            if (map == null) {
                map = new LinkedHashMap();
                this.fieldNameByClassName.put(str, map);
            }
            this.lastParams = new ParamsBuilder(new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append("field ").append(str).append("#").append(str2).toString());
            map.put(str2, this.lastParams);
            return this;
        }

        public final BuilderWithParams staticField(String str, String str2) {
            Preconditions.checkNotNull(str, "className");
            Preconditions.checkNotNull(str2, "fieldName");
            Map map = (Map) this.staticFieldNameByClassName.get(str);
            if (map == null) {
                map = new LinkedHashMap();
                this.staticFieldNameByClassName.put(str, map);
            }
            this.lastParams = new ParamsBuilder(new StringBuilder((String.valueOf(str).length() + 14) + String.valueOf(str2).length()).append("static field ").append(str).append("#").append(str2).toString());
            map.put(str2, this.lastParams);
            return this;
        }

        public final BuilderWithParams thread(String str) {
            Preconditions.checkNotNull(str, "threadName");
            String str2 = "any threads named ";
            String valueOf = String.valueOf(str);
            this.lastParams = new ParamsBuilder(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.threadNames.put(str, this.lastParams);
            return this;
        }

        public final BuilderWithParams clazz(String str) {
            Preconditions.checkNotNull(str, "className");
            String str2 = "any subclass of ";
            String valueOf = String.valueOf(str);
            this.lastParams = new ParamsBuilder(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.classNames.put(str, this.lastParams);
            return this;
        }

        public final BuilderWithParams named(String str) {
            this.lastParams.name = str;
            return this;
        }

        public final BuilderWithParams reason(String str) {
            this.lastParams.reason = str;
            return this;
        }

        public final BuilderWithParams alwaysExclude() {
            this.lastParams.alwaysExclude = true;
            return this;
        }

        public final ExcludedRefs build() {
            return new ExcludedRefs(this);
        }
    }

    final class ParamsBuilder {
        public boolean alwaysExclude;
        public final String matching;
        public String name;
        public String reason;

        ParamsBuilder(String str) {
            this.matching = str;
        }
    }

    public static Builder builder() {
        return new BuilderWithParams();
    }

    ExcludedRefs(BuilderWithParams builderWithParams) {
        this.fieldNameByClassName = unmodifiableRefStringMap(builderWithParams.fieldNameByClassName);
        this.staticFieldNameByClassName = unmodifiableRefStringMap(builderWithParams.staticFieldNameByClassName);
        this.threadNames = unmodifiableRefMap(builderWithParams.threadNames);
        this.classNames = unmodifiableRefMap(builderWithParams.classNames);
    }

    private final Map unmodifiableRefStringMap(Map map) {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), unmodifiableRefMap((Map) entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private final Map unmodifiableRefMap(Map map) {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), new Exclusion((ParamsBuilder) entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public final String toString() {
        String str = "";
        for (Entry entry : this.fieldNameByClassName.entrySet()) {
            String str2 = (String) entry.getKey();
            for (Entry entry2 : ((Map) entry2.getValue()).entrySet()) {
                String str3 = ((Exclusion) entry2.getValue()).alwaysExclude ? " (always)" : "";
                str = String.valueOf(str);
                String str4 = (String) entry2.getKey();
                str = new StringBuilder((((String.valueOf(str).length() + 11) + String.valueOf(str2).length()) + String.valueOf(str4).length()) + String.valueOf(str3).length()).append(str).append("| Field: ").append(str2).append(".").append(str4).append(str3).append("\n").toString();
            }
        }
        for (Entry entry22 : this.staticFieldNameByClassName.entrySet()) {
            str3 = (String) entry22.getKey();
            for (Entry entry222 : ((Map) entry222.getValue()).entrySet()) {
                str2 = ((Exclusion) entry222.getValue()).alwaysExclude ? " (always)" : "";
                str = String.valueOf(str);
                str4 = (String) entry222.getKey();
                str = new StringBuilder((((String.valueOf(str).length() + 18) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str2).length()).append(str).append("| Static field: ").append(str3).append(".").append(str4).append(str2).append("\n").toString();
            }
        }
        for (Entry entry2222 : this.threadNames.entrySet()) {
            str3 = ((Exclusion) entry2222.getValue()).alwaysExclude ? " (always)" : "";
            str = String.valueOf(str);
            str4 = (String) entry2222.getKey();
            str = new StringBuilder(((String.valueOf(str).length() + 10) + String.valueOf(str4).length()) + String.valueOf(str3).length()).append(str).append("| Thread:").append(str4).append(str3).append("\n").toString();
        }
        for (Entry entry22222 : this.classNames.entrySet()) {
            str3 = ((Exclusion) entry22222.getValue()).alwaysExclude ? " (always)" : "";
            str = String.valueOf(str);
            str4 = (String) entry22222.getKey();
            str = new StringBuilder(((String.valueOf(str).length() + 9) + String.valueOf(str4).length()) + String.valueOf(str3).length()).append(str).append("| Class:").append(str4).append(str3).append("\n").toString();
        }
        return str;
    }
}
