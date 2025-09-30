package br.fiap.calculadora.controller;

import br.fiap.calculadora.service.CalculadoraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;


@Controller
public class CalculadoraController {

    private CalculadoraService service;

    public CalculadoraController(CalculadoraService service){
        this.service = service;
    }

   /* @PostMapping("/calculadora")
    public String calculadora(@RequestParam double num1, @RequestParam double num2, @RequestParam String operador, Model model){

        model.addAttribute("resultado", service.calcular(num1,num2,operador));

        return "index";
    }*/

    @PostMapping("/calculadora")
    public String calculadora(@RequestParam String num1, @RequestParam String num2, @RequestParam String operador, Model model){

        BigDecimal resultado = service.calcular(num1,num2,operador);
        model.addAttribute("resultado", resultado);

        return "index";
    }

}
