public class IfDeclaracion {
    public static void main(String[] args) {
        boolean isBluetudEstado = true;
        int enviarCorreo = 3;

        if(isBluetudEstado){
           enviarCorreo++;
           System.out.println("archivo enviado");
        } else {
            System.out.println("enciende tu Bluetud");
        }
        System.out.println(isBluetudEstado);
        System.out.println(enviarCorreo);
    }
}
