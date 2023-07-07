public class Usuario {

   private Cuenta cuenta;
   private String nombre;

   public Usuario( String nombre ) {
      this.nombre = nombre;
      cuenta = new Cuenta( 0 );
      cuenta.setPropietario( nombre );
   }
   
   public Usuario( String nombre, double saldoInicial ) {
      this.nombre = nombre;
      cuenta = new Cuenta( saldoInicial );
      cuenta.setPropietario( nombre );
   }

   public String consultarSaldo() {
      return "Saldo Actual: " + cuenta.getSaldo() + " Bs.";
   }

   public String depositarDinero( double cantidad ) {
      cuenta.setSaldo( cantidad );
      return "Se han depositado " +  cantidad + " Bs. a tu cuenta";
   }

   public String retirarDinero( double cantidad ) {
      if ( cuenta.getSaldo() >= cantidad ) {
         cuenta.setSaldo( -cantidad );
         return "Has retirado " + cantidad + " Bs. de tu cuenta.";
      }
      else {
         return "Saldo insuficiente";
      }
   }
   
   @Override
   public String toString() {
      return "Usuario " + nombre + ". Nro Cuenta: " + cuenta.getNroCuenta();
   }
   
   public Cuenta getCuenta() {
      return cuenta;
   }
   
}