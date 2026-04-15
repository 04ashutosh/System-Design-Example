package com.prototype;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("        Prototype Pattern Demo            ");
        System.out.println("==========================================\n");

        List<String> startingTags = new ArrayList<>();
        startingTags.add("Java");
        startingTags.add("DesignPatterns");

        Document originalDoc  = new Document("My Initial Report","This is a the content",startingTags);

        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("ReportTemplate",originalDoc);

        // ==========================================
        //  TEST 1: SHALLOW COPY (The Danger Zone!)
        // ==========================================
        System.out.println(">>> 1. Testing SHALLOW Copy");
        Document shallowCopy = (Document) registry.getPrototype("ReportTemplate");
        shallowCopy.setTitle("Shallow Copied Report");
        shallowCopy.addTag("Shallow-Tag-Added!"); // We add a tag to the CLONE
        System.out.println("Original: " + originalDoc);
        System.out.println("Copy    : " + shallowCopy);
        System.out.println("Notice how 'Shallow-Tag-Added!' bled into the Original because they share the same List reference!");

        // ==========================================
        //  TEST 2: DEEP COPY (The Safe Way)
        // ==========================================
        System.out.println("\n>>> 2. Testing DEEP Copy");
        // Resetting original's tags for a clean deep copy test
        originalDoc.getTags().remove("Shallow-Tag-Added!");
        Document deepCopy = (Document) registry.getDeepPrototype("ReportTemplate");
        deepCopy.setTitle("Deep Copied Report");
        deepCopy.addTag("Deep-Tag-Added!"); // We add a tag to the CLONE
        System.out.println("Original: " + originalDoc);
        System.out.println("Copy    : " + deepCopy);
        System.out.println("Perfect! The original remains untouched because the deep copy created a brand new List.");
    }
}