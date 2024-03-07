import com.celular.Celular;

public class Loja {
    public static void main(String[] args) {
        Celular iphone = new Celular();
        System.out.println(iphone.getNome());
        iphone.Tocar();
        iphone.Pausar();
        iphone.Atender();
    }
}
