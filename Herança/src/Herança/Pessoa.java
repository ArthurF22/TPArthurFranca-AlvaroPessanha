package Herança;

import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date datadenascimento;
    public String cidadenascimento;
    public String nomedamae;
    public String nomedopai;
    public String cidademoradia;
    
     
    public Pessoa(String nome, String cpf, Date data, String cnascimento, String nomedamae, String nomedopai, String cmoradia) {
        this.nome = nome;
        this.cpf = cpf;
        this.datadenascimento = data;
        this.cidadenascimento = cnascimento;
        this.nomedamae = nomedamae;
        this.nomedopai = nomedopai;
        this.cidademoradia = cmoradia;
        
    }
    public class Aluno extends Pessoa {
    public Aluno(String _nome, String _cpf, Date _data, String _cnascimento, String _nomedamae, String _nomedopai, String _cmoradia) {
        super(_nome, _cpf, _data, _cnascimento, _nomedamae, _nomedopai, _cmoradia);
    }
   
    }
}
    
    
   
  
  
  
  
  
  

  
  
  
  
  
  
  
