package one.digitalinnovation.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataDeHoje = LocalDate.now();


    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;

    }


    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.dataNascimento, dataDeHoje);
    }

    public void mostraInfos(){
        System.out.println(dataDeHoje);
        System.out.println(dataNascimento);
    }

    public boolean ahMaiorDeIdade(){
        return this.getIdade() > 18;
    }
}
