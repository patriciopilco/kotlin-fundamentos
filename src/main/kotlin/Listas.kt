fun main() {

    // Lista no mutable
    val listaNombre = listOf<String>("Nombre1","Nombre2","Nombre3");
    println(listaNombre);

    //Lista mutable
    val listaVacia = mutableListOf<String>();
    println(listaVacia);
    //Añadir elemento a lista
    listaVacia.add("Nombre1");
    println(listaVacia);

    //Operación obtener valor de la lista
    // 1. get
    val valor1 = listaVacia.get(0);
    println(valor1);
    //2. con operador indexado
    val valor2 = listaVacia[0];
    println(valor2);

    // Busca el primero de las lista
    val primerValor = listaVacia.first();
    println("Retorna el primer valor de la lista:${primerValor}");

    //Busca el primero de la lista en caso de estar null devuelve vacio
    val primerValorONull = listaVacia.firstOrNull();
    println("Retorna el primer valor de la lista en caso de ser null retorna vacio:${primerValorONull}");

    // Remover de acuerdo a un index
    val removerAt = listaVacia.removeAt(0);
    println("removerAt:${removerAt}");
    println("listaVacia:${listaVacia}");

    // Remover bajo una condición
    val removerIf = listaVacia.removeIf{caracteres -> caracteres.length >3}
    println("removerAf:${removerIf}");
    println("listaVacia:${listaVacia}");
}