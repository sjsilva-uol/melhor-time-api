package br.com.pagseguro.melhortimeAPI;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "funcionarios")
public class FuncionarioController {

    @GetMapping
    public Funcionario get(){
        Funcionario func = new Funcionario();
        func.setCargo("Líder Técnico");
        func.setId(1L);
        func.setNome("Samuel");
        func.setSalario(new BigDecimal(50000));
        return func;
    }
    @PostMapping
    public Funcionario post(@RequestBody Funcionario funcionario){
        funcionario.setId(1L);
        return funcionario;
    }
}
