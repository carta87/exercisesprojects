package EjerciosPlatzi;

public class TableVerdad {


    public static void main(String[] args) {
        boolean bancoCliente = true;
        int cuentaCliente = 0;
        String bancoDestino = "bancolombia";
        int saldoCliente = 1_500_000;
        int cuentaDestino = 23;
        int HoraDeTransferencia = 0;
        int valorTansferencia = 1_000_000;
        int costroTransferencia = 100_000;
        int resultado = 0;


        if(bancoCliente ){
            if ( valorTansferencia < saldoCliente ){
                cuentaCliente = + saldoCliente - costroTransferencia;
                System.out.println( "transferencia efectiva. nuevo saldo en tu cuenta: "  + cuentaCliente +

                        " con un costo de " + costroTransferencia + " fue enviada a " + bancoDestino);
            }else {
                System.out.println(" no tienes saldo sufiente");
            }
        } else {
            System.out.println("no eres cliente del banco");
        }

       /* cuentaDestino = (saldoCliente > valorTansferencia  )?(valorTansferencia-saldoCliente);*/

        resultado = valorTansferencia > saldoCliente? valorTansferencia:saldoCliente;
        System.out.println( "operador ternario " + resultado);
    }


}
