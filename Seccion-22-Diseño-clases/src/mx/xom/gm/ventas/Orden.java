package mx.xom.gm.ventas;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int  contadorOrdenes;
    private  int contadorProductos;
    private static final int MAX_PRODUCTO = 10;

    public Orden() {
        //Hacemos un acumulador para idOrden
      this.idOrden = ++Orden.contadorOrdenes;
      
      //Inicializamos el arreglo para indicar cuantos espacios tendra
      this.productos = new Producto[Orden.MAX_PRODUCTO];
    }

    public void agregarProducto(Producto producto) {
        
        //condicion para que se ejecute el agregado de los productos
        if(this.contadorProductos < Orden.MAX_PRODUCTO){
            this.productos[this.contadorProductos++] = producto;
            
        }
        else{
            System.out.println("Se ha superodo el maximo de Produductos: " + Orden.MAX_PRODUCTO);
        }
        
    }

    public double calcularTotal() {
        //Declaramos variable de tipo local para guardar el resultado de la suma de precios
        double total = 0;
        
        for (int i = 0; i < contadorProductos; i++) {
            
            //Hay 2 formas de hacer la suma de los precios de los elementos que hay dentro del arreglo
            
          //Forma 1:
          
           // Producto producto = this.productos[i];
            //total += producto.getPrecio();//total = total + producto.getPrecio()
          
            
          //Forma 2:
          
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        //Imprimimos el ID de la orden  de 
        System.out.println("Id orden: " + this.idOrden);
        
        //Declaramos una variable local para guardar el resultado que viene del metodo calcular total para poder imprimirlo
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        
        System.out.println("Productos de la orden ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }

}
