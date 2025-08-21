package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    private ExercicioDificilResponse resposta;

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
            // Teste novamente no Github
        int n1 = 0;
        int n2 = 1;
        int soma = 1;

        if (n < 0){
            resposta = new ExercicioDificilResponse(0,0);
        } else if (n == 1) {
            resposta = new ExercicioDificilResponse(1,1);
        }else{
            for(int i = 2; i <= n; i++){
                int aux = n1 + n2;
                n1 = n2;
                n2 = aux;
                soma += n2;
                resposta = new ExercicioDificilResponse(n2,soma);
            }
        } return resposta;

    }

}