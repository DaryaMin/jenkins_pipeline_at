package ru.cinimex.qa.examples.calculator;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("EPIC")
public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    @DisplayName("Проверка суммирования")
    public void summTest(){
        check('+',5, 3, 8);
        check('+',5,0, 5);
    }

    @Test
    @DisplayName("Проверка вычитания")
    public void subtractionTest(){
        check('-',5, 3,  2);
        check('-',5,0, 5);
    }

    @Test
    @DisplayName("Проверка умножения")
    public void multiplicationTest(){
        check('*',5, 3,  15);
        check('*',5,0, 0);
    }

    @Test()
    @DisplayName("Проверка деления")
    public void divisionTest(){
        check('/',5, 3,  1);
        check('/',5,1, 5);
    }

    @Test
    @DisplayName("Проверка деления на 0, ожидаем ArithmeticException, что делить на ноль нельзя")
    public void divisionByZeroTest(){
        Assertions.assertThrows(ArithmeticException.class, () -> check('/',5,0, 0));
    }

    @Step("Проверка вычисления: {firstVariable} {operation} {secondVariable} = {expected}")
    public void check(char operation, int firstVariable, int secondVariable, int expected){
        Assertions.assertEquals(expected, calc.execute(operation, firstVariable, secondVariable),
                "Некореектное вычисление: " + firstVariable + operation + secondVariable);
    }
}
