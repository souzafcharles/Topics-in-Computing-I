public class PrincipalPessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("123","João");
        Pessoa p2 = new Pessoa("456","Maria");
        System.out.println(p1.getCpf());
        p1.setCpf("abc");
        System.out.println(p1.getCpf());
        if("abc".compareTo(p1.getCpf())==0){
            System.out.println("Teste realizado com sucesso");
        }else{
            System.out.println("Falha");
        }

    }
}