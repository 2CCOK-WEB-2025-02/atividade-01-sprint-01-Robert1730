package school.sptech.sprint1_nota1.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioAquecimentoController {

    @GetMapping("/ex-00/{numero}")
    public Boolean exercicioAquecimento(@PathVariable int numero) {
        Boolean resposta = null;
            resposta = numero % 2 == 0;
            // Só lembrar que é basicamente o % é o operador de resto (Qualquer número que não é divísivel por 2 vai retornar mais do que 0
            // Primeira versão que eu pensei:
            //      resposta = Math.abs(numero) % 2 > 0 || numero == 0 ? false : true;
            // Versão mais simplificada mas um teco menos legível: return numero % 2 == 0
        return resposta;
    }

}