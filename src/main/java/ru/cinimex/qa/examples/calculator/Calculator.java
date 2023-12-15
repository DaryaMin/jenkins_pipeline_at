package ru.cinimex.qa.examples.calculator;

import io.qameta.allure.Step;

public class Calculator {
    @Step("Осуществление вычисления")
    public int execute(char sign, int a, int b){
        switch (sign) {
            case ('+'):
                return Math.addExact(a, b);
            case ('-'):
                return Math.subtractExact(a, b);
            case ('*'):
                return Math.multiplyExact(a, b);
            case ('/'):
                return Math.floorDiv(a, b);
            case ('^'):
                return (int) Math.pow(a, b);
            case ('%'):
                return Math.floorMod(a, b);
        }
        return 0;
    }


}
