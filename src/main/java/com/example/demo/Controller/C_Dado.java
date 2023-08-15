package com.example.demo.Controller;



import com.example.demo.Model.M_Resultado;
import com.example.demo.Service.S_Dado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class C_Dado {
    @GetMapping("/")
    public String holleWord(){
        return "Home/home";
    }
    @PostMapping("/")
    public String postHome(@RequestParam("qtdDados")int qtdDados,
                           @RequestParam("qtdFaces")int qtdFaces,
                            Model model){
        M_Resultado jogada = S_Dado.Jogada(qtdDados, qtdFaces);
        model.addAttribute("maximo", jogada.getMaior());
        model.addAttribute("soma", jogada.getSoma());
        model.addAttribute("Resultados", jogada.getResultados());
        return "Home/home";
    }


}
