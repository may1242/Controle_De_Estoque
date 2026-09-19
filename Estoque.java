import java.util.List;

public class Estoque {
    List<Produtos> produtos;

    public void listarProdutos(){
        for(Produto  produto : produto){
            if(produto.getId() == id){
                System.out.println(produto.toString());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public
}
