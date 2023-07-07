public class Cuenta {

   private String propietario;
   private double saldo;
   private String nroCuenta;
   
   public Cuenta( double saldo ) {
      this.saldo = saldo;
      nroCuenta = generarNroCuenta();
   }
   
   public String getPropietario() {
      return propietario;
   }
   
   public double getSaldo() {
      return saldo;
   }
   
   public String getNroCuenta() {
      return nroCuenta;
   }
   
   public void setSaldo( double cantidad ) {
      saldo += cantidad;
   }
   
   public void setPropietario( String propietario ) {
      this.propietario = propietario;
   }
   
   @Override
   public String toString() {
      return "\n - Propietario: " + propietario + 
             "\n - Nro de Cuenta: " + nroCuenta + 
             "\n - Saldo: " + saldo;
   }
   
   private String generarNroCuenta() {
      String nro = "";
      
      for ( int i = 0; i < 10; i++ ) {
         int numero = ( int ) ( Math.random() * 10 );
         nro += numero;
      }
      
      return nro;
   }
   
}