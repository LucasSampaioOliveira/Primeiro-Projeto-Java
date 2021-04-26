package com.h2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.platform.commons.util.ReflectionUtils.tryToLoadClass;

public class UtilitiesTest {
    private final String classToFind = "com.h2.Utilities";

    public Optional<Class<?>> getAppClass() {
        Try<Class<?>> aClass = tryToLoadClass(classToFind);
        return aClass.toOptional();
    }

    @Test
    public void assertClassExistence() {
        final Optional<Class<?>> maybeClass = getAppClass();
        assertTrue(maybeClass.isPresent(), classToFind + " should be present");
        assertEquals(classToFind, maybeClass.get().getCanonicalName());
    }

    @Disabled
    @Test
    public void testGetFloatValueExistence() {
        /*
         * 1. Method exists
         * 2. isPublic, isStatic, returns float, takes String param
         */
    }

    @Disabled
    @Test
    public void testGetIntValueExistence() {
        /*
         * 1. Method exists
         * 2. isPublic, isStatic, returns int, takes String param
         */
    }

    @Disabled
    @Test
    public void testGetLongValueExistence() {
        /*
         * 1. Method exists
         * 2. isPublic, isStatic, returns long, takes String param
         */
    }

    @Disabled
    @Test
    public void testGetFloatValueCorrectness() {

    }

    @Disabled
    @Test
    public void testGetLongValueCorrectness() {

    }

    @Disabled
    @Test
    public void testGetIntValueCorrectness() {

    }
}
