import java.util.ArrayList;

public class Banco {

   private int dineroTotal;
   private ArrayList< Usuario > listaUsuarios;
   private String nombre;

   public Banco( String nombre ) {
      this.nombre = nombre;
      listaUsuarios = new ArrayList<>();
      dineroTotal = 0;
   }

   public void anadirUsuario( Usuario usuario ) {
      listaUsuarios.add( usuario );
   }

   public void eliminarUsuario( Usuario usuario ) {
      int indiceUsuario = buscarUsuario( usuario );
      listaUsuarios.remove( indiceUsuario );
   }

   public String listarUsuarios() {
      String reporte = "--- Listado de Usuarios ---\n";
      
      for ( Usuario usuario : listaUsuarios ) {
         reporte += " - " + usuario.toString() + "\n";
      }
      
      return reporte;
   }
   
   public String verInfoCuenta( String nroCuenta ) {
      return ( buscarCuenta( nroCuenta ) != -1 ) ? listaUsuarios.get( buscarCuenta( nroCuenta ) ).getCuenta().toString() : "No existe la cuenta ingresada";
   }
   
   private int buscarUsuario( Usuario usuario ) {
      int indice = -1;
      int i = 0;

      while ( i < listaUsuarios.size() && indice == -1 ) {
         if ( listaUsuarios.get( i ) == usuario ) {
            indice = i;
         }
         i++;
      }

      return indice;
   }
   
   private int buscarCuenta( String nroCuenta ) { // Retorna el indice del usuario con en nro de cuenta pasada como argumento
      int i = 0;
      int indice = -1;
      
      while ( i < listaUsuarios.size() && indice == -1 ) {
         if ( listaUsuarios.get(i).getCuenta().getNroCuenta().equals( nroCuenta ) ) {
            indice = i;
         }
         i++;
      }
      
      return indice;
   }
   
}