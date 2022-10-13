package one.digitalinnovation.junit;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", LocalDate.of(2004, 1, 1));

        pessoa.mostraInfos();
    }

}
