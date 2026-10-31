package br.edu.ufrgs.model.atleta;


public class Atleta{
    int idade;
    
    public Atleta(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String classificaAtleta(){
        if (this.getIdade() == 15) {
            return "Menor";
        } 
        else if (this.getIdade() >= 16 && this.getIdade() <= 17) {
            return "Menor e Juvenil";
        }
        else if (this.getIdade() >= 18 && this.getIdade() <= 19) {
            return "Juvenil";
        }
        else if (this.getIdade() >= 20 && this.getIdade() <= 34) {
            return "Adulto";
        }
        else if(this.getIdade() >= 35) {
            return "Master";
        }
        else {
            return "Idade Inválida";
        }
    }
}


