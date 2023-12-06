public class Main {
    public static void main(String[] args) {
        int limite = 100;
        int time_user = 100;
        int payment = 50;
        int temp;
        System.out.printf("Seja bem vindo\n voce usou %d minutos\n",time_user);
        if(time_user > limite){
            temp = (time_user - limite)*2;
            payment += temp;
            System.out.printf("O valor da fatura e de %d",payment);

        }
        else {

            System.out.printf("O valor da fatura e de %d",payment);
        }



    }
}