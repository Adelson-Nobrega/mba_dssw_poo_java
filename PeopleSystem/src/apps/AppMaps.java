package apps;

import pessoas.Funcionario;

import java.util.HashMap;
import java.util.Map;

public class AppMaps {
    static void main() {

        Map<Integer, Funcionario> bancoDeDadosFacilRH = new HashMap<>();

        Funcionario func1 = new Funcionario();
        func1.setNome("João da Silva");
        func1.setMatricula(01);

        bancoDeDadosFacilRH.put(func1.getMatricula(), func1);

        for (Map.Entry<Integer, Funcionario> registro : bancoDeDadosFacilRH.entrySet()) {
            IO.println("Matrícula: " + registro.getKey() + ", Nome: " + registro.getValue().getNome());
        }
    }
}
