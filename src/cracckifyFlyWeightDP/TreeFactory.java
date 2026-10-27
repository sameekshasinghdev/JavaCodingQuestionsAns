package cracckifyFlyWeightDP;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TreeFactory {

    private static final Map<String, TreeType> cache =
            new ConcurrentHashMap<>();

    public static TreeType getTreeType(
            String name, String color, String texture) {

        String key = name + "|" + color + "|" + texture;

        return cache.computeIfAbsent(
            key,
            k -> new TreeType(name, color, texture)
        );
    }
}