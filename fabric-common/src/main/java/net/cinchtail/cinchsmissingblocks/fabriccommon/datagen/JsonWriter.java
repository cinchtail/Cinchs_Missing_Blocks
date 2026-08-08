package net.cinchtail.cinchsmissingblocks.fabriccommon.datagen;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class JsonWriter {
    private JsonWriter() {}

    static String write(Object value) {
        StringBuilder out = new StringBuilder();
        append(out, value, 0);
        out.append('\n');
        return out.toString();
    }

    private static void append(StringBuilder out, Object value, int depth) {
        if (value == null) {
            out.append("null");
        } else if (value instanceof String string) {
            quote(out, string);
        } else if (value instanceof Number || value instanceof Boolean) {
            out.append(value);
        } else if (value instanceof Map<?, ?> map) {
            appendMap(out, map, depth);
        } else if (value instanceof List<?> list) {
            appendList(out, list, depth);
        } else {
            throw new IllegalArgumentException("Unsupported JSON value: " + value.getClass());
        }
    }

    private static void appendMap(StringBuilder out, Map<?, ?> map, int depth) {
        out.append('{');
        if (!map.isEmpty()) {
            out.append('\n');
            Iterator<? extends Map.Entry<?, ?>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                var entry = iterator.next();
                indent(out, depth + 1);
                quote(out, String.valueOf(entry.getKey()));
                out.append(": ");
                append(out, entry.getValue(), depth + 1);
                if (iterator.hasNext()) out.append(',');
                out.append('\n');
            }
            indent(out, depth);
        }
        out.append('}');
    }

    private static void appendList(StringBuilder out, List<?> list, int depth) {
        out.append('[');
        if (!list.isEmpty()) {
            out.append('\n');
            for (int i = 0; i < list.size(); i++) {
                indent(out, depth + 1);
                append(out, list.get(i), depth + 1);
                if (i + 1 < list.size()) out.append(',');
                out.append('\n');
            }
            indent(out, depth);
        }
        out.append(']');
    }

    private static void quote(StringBuilder out, String value) {
        out.append('"');
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '"' -> out.append("\\\"");
                case '\\' -> out.append("\\\\");
                case '\n' -> out.append("\\n");
                case '\r' -> out.append("\\r");
                case '\t' -> out.append("\\t");
                default -> {
                    if (c < 0x20) out.append(String.format("\\u%04x", (int)c));
                    else out.append(c);
                }
            }
        }
        out.append('"');
    }

    private static void indent(StringBuilder out, int depth) {
        out.append("  ".repeat(depth));
    }
}
