package ru.cinimex.qa.examples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.cinimex.qa.examples.constants.SuiteName.REGRESS;
import static ru.cinimex.qa.examples.constants.SuiteName.SMOKE;

public class ProbeTest {
    GetProperties properties = new GetProperties();

    int a = 10;
    int b = 10;
    int c = 1;

    @Tag(SMOKE)
    @Tag(REGRESS)
    @Test
    public void loginCorrect() {
        assertEquals(a, b);
    }

    @Tag(REGRESS)
    @Test
    public void incorrectTest() {
        assertEquals(a, c);
    }


    @Test
    public void parameterTest() {
        String prop = properties.getProperties("url");
        System.out.println(prop);
        assertEquals(prop, "https://www.google.com/");
    }

    @Tag(REGRESS)
    @Test
    public void forGitLAb(){
        System.out.println("test from gitLab part5");
    }


}
