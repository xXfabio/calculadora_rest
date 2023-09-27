package br.com.lobo.calculadora;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lobo.calculadora.exeptions.UnsupportedMathOperationException;

@RestController
public class MathController {

    private final AtomicLong counter =new AtomicLong();

    @RequestMapping(value = "/sum/{operador}/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo,
        @PathVariable(value = "operador") String operador
    )throws Exception{
        if(!isNumeric(numberOne) || !isNumeric(numberOne)){
            throw new UnsupportedMathOperationException("Informe o valor!");
        }
        return convertDouble(numberOne) + convertDouble(numberTwo);
    }
    
    private Double convertDouble(String strNumber){
        if(strNumber == null) return 0D;

        String number = strNumber.replaceAll(",", ".");
        if(isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    private boolean isNumeric(String strNumber){
       if(strNumber == null) return false;
       String number = strNumber.replaceAll(",", ".");
       return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
    
}
