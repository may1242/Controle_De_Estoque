public class Produto {
    private int id;
    private String;
    private double preco;
    private int quantEstoque;

    public Produto(int id,String nome, double preco, int quantEstoque){
        this.id = id;
        this.nome =  nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public void adicionar(int quantidade){
        quantstoque += quantidade;
    }

    public void remover(int quantidade){
        quantEstoque -= quantidade;
    }

    public void  exibirDados(){
        Sysytem.out.println("ID " + id);
        System.out.println("Nome " + nome);
        System.out.println("Preço R$" + preco);
        System.out.println("Quantidade em estoque " + quantidade);
    }
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id
    }
    public double getPreco(){
        return preco;
    }

    public void setQuantidade
}
