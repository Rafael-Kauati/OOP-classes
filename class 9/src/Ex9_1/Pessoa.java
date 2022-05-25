package Ex9_1;


import Ex9_1.Date.Date;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int cc;
    private Date nascimento;

    public  Pessoa(String nome, int cc, Date nascimento) {
        setNome(nome);
        setCc(cc);
        setNascimento(nascimento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setNascimento(Date nascimento){
        boolean valid = Date.isValidData(nascimento.getDay(), nascimento.getMonth(), nascimento.getYear());
        if(valid){this.nascimento =  new Date(nascimento.getDay(), nascimento.getMonth(), nascimento.getYear());}
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Pessoa pessoa = ( Pessoa ) o;
        return cc == pessoa.cc && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "nome : '" + nome + '\'' +
                ", cartão de cidadão : " + cc +
                ", nascimento : " + nascimento.formatData() +
                '}';
    }
}
