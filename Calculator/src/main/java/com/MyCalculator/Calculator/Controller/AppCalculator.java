package com.MyCalculator.Calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppCalculator {
    @GetMapping("/home")
    public String display(){
        return "Welcome to Our Calculator App!!";
    }
    //Sum of two numbers
    @GetMapping("/sum")
    public int sum(@RequestParam("num1") int n1, @RequestParam("num2")int n2){
        return n1 + n2;
    }
    //Subtraction of two numbers
    @GetMapping("/sub")
    public int sub(@RequestParam("num1") int n1, @RequestParam("num2")int n2){
        return n1 - n2;
    }
    //Multiplication of two numbers
    @GetMapping("/multiply")
    public int multiply(@RequestParam("num1") int n1, @RequestParam("num2")int n2){
        return n1 * n2;
    }
    //Division of two numbers
    @GetMapping("/division")
    public double division(@RequestParam("num1") int n1, @RequestParam("num2")int n2) {
        return (double) n1 / n2;
    }
}
