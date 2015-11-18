package com.evanlennick.testexample;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SomeClassTest {

    @Test
    public void testSomeClass() {
        SomeClass someClass = new SomeClass();

        assertThat(someClass.getSomeValue()).isEqualTo("some value");
    }
    
}
