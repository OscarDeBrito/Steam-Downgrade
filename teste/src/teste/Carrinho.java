package teste;
import java.util.ArrayList;
public class Carrinho extends ContaJogos {
    private ArrayList<Jogo> Jogo;
    private Jogo game;
    private Pedido pedido
    
    

    //construtor

    public Carrinho(ArrayList<Jogo> Jogo, Jogo game, int quantidadeJogos) {
        super(quantidadeJogos);
        this.Jogo = Jogo;
        this.game = game;
    }

    //get e set
    public ArrayList<Jogo> getJogo() {
        return Jogo;
    }

    public void setJogo(ArrayList<Jogo> Jogo) {
        this.Jogo = Jogo;
    }

    public Jogo getGame() {
        return game;
    }

    public void setGame(Jogo game) {
        this.game = game;
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    
  
    //metodos
    public void removerCarrinho(){
    }
    
    public void verDetalherCarrinho(){
    }
    
}
