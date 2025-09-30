package br.fiap.calculadora.service;


import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double calcular(double num1, double num2, String operador){

        if(operador.equalsIgnoreCase("+")){
            return num1 + num2;
        } else if (operador.equalsIgnoreCase("-")) {
            return num1 - num2;
        } else if (operador.equalsIgnoreCase("*")) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }

    }

}
