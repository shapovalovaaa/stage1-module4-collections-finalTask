package com.epam.mjc.collections.combined;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        return projects.entrySet()
                .stream()
                .filter(pair -> pair.getValue().contains(developer))
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo).reversed())
                .collect(Collectors.toList());
    }
}
