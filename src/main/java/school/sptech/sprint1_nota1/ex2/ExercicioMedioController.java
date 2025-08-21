package school.sptech.sprint1_nota1.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioMedioController {

    @GetMapping("/ex-02/{numero}")
    public Boolean exercicioMedio(@PathVariable int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            //Número não primo sempre é dívisivel até a raiz quadrada dele (Sqrt faz a raiz), o que deixa um teco mais performático por não ir até o número tipo, 10007 que é um número primo
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
