

public class CuartaEntrega{
	
	
        //34. ¿Qué es un algoritmo?
            
        //Un algoritmo es un conjunto de pasos bien definidos para resolver un problema determinado.
        
        /*35. Escriba dos algoritmos en Java y esos mismos dos algoritmos
        en C para resolver el mismo problema. Por ejemplo, puede escribir un algo-
        ritmo recursivo y otro iterativo (con un bucle) para resolver el problema de la suma de los n primeros números naturales. */	
        
        // Algoritmo Iterativo en Java para sumar los n primeros números naturales
        public static int sumaN (int n){ 
            
            int resul = 0;
            
            while ( n > 0){
                resul += n;
                n--;
            }
            return resul;
        }
        
        // Algoritmo Recursivo en Java para sumar los n primeros números naturales
        public static int sumaNRecursivo (int n){
            
            if( n == 0){
                return 0;
            }
            return n + sumaNRecursivo(n - 1);
        }
        
        /*36. Defina O(n) en términos de un límite de cociente de funciones. 
        
        La notación O(n) indica que el tiempo de ejecución de un algoritmo crece proporcionalmente a la entrada n.
        En términos de un límite, se define como:
        lim(x -> ∞) f(x)/x = k, donde k es una constante positiva */
            
            
        /*37. La fórmula para calcular el espacio recorrido por un móvil que se deja caer al vacío (suponiendo v0 = 0)
        es e = 1/2 gt^2, donde g es la aceleración de la gravedad en la superficie de la tierra, y t el tiempo que está cayendo el móvil. ¿Cuál es la complejidad temporal de este cálculo en función de t?
            
        La complejidad temporal de este cálculo es O(1), ya que se realizan un número constante de operaciones.        */
        
        /*38. Indique la complejidad temporal asintótica de los siguientes
        métodos:
        public static String primero(ArrayList<String> lista){
            return lista.get(0);
        }
        Tiene una complejidad de O(1)
        
        public static String nEsimo(ArrayList<String> lista, int n){
            return lista.get(n);
        }
        Tiene una complejidad de O(1) */
            
        /*39. Calcule la complejidad temporal de los algoritmos del ejercicio 35.
        
        Ambos algoritmos tienen una complejidad de O(n), ya que el número de pasos es directamente proporcional a n.*/
            
            
        /*40. Resuelva cualquiera de los apartados del ejercicio 11 y calcule
        su complejidad temporal.
            
            public static int sumaN(int n){ // Suma de n numeros: O(n)
        
                int suma = 0;
                
                for(int i =0; i<=n; i++){
                
                    suma += i;
                }
                return suma;
            }
        
            public static int factorialN(int n){ // Factorial de n: O(n)
        
                int producto = 1;
                
                for(int i =1; i<=n; i++){
                
                    producto *= i;
                }
                return producto;
            }
        
            public static int potenciaN(int base,int n){ // Potencia n-ésima de un numero natural: O(n)
        
                int result = 1;
                for(int i = 0;i<n;i++){
                    
                    result *= base;
                }
                return result;
            }
        
            public static int sumaLista(List<Integer> lista){ //Suma de los elementos de una lista: O(n)
        
                int suma = 0;
                for(int num : lista){
                    
                    suma +=  num;   
                }
                return suma;
            }
        
            public static double mediaLista(List<Integer> lista){ //Media de una lista de elementos: O(n)
                
                if(lista.isEmpty()){
                    
                    return 0;
                }
                
                double media = 0;
                
                for(int num : lista){
                
                    media += num ;
                }
                return media/lista.size();
            }
        
        
            public static double sumaDesviacionLista(List<Integer> lista){ //Sumatorio de las desviaciones: O(n)
        
        
                double media = mediaLista(lista);
                double resultado = 0;
        
                for(Integer num : lista){
                    
                    resultado += Math.pow(num - media,2);
                }
        
                return Math.sqrt(resultado/lista.size()- 1);
            }
        
            public static int sumaPares(int n){ //Suma de los primeros elementos pares hasta n: O(n) 
        
                int result = 0;
        
                if( n % 2 == 1){
                    n--;
                }
        
                while(n>0){
        
                    result += n;
                    n -= 2;
                }
                return result;
            }
        
            public static int sumaListaPares(List<Integer> lista){ //suma de los elementos pares de la lista: O(n)
        
                int result = 0;
        
                for (Integer num : lista){
        
                    if( num % 2 == 0){
        
                        result += num;
                    }
                }
        
                return result;
            }
        
            public static List<Integer> obtenerListaPar(List<Integer> lista){ //devuelve una lista con solo numeros pares: O(n)
        
                List<Integer> result = new ArrayList<>();
        
                for (Integer num : lista){
        
                    if( num % 2 == 0){
        
                        result.add(num);
                    }
                }
        
                return result;
            }
        
            public static List<Integer> ListaHastaN(int n){ //devuelve la lista hasta los n terminos pares: O(n)
        
                List<Integer> lista = new ArrayList<>();
                if( n % 2 == 1){
        
                    n--;
                }
                while(n != 0){
                    lista.add(n);
                    n -= 2;
                }
                return lista;
            }
        

            public static int calcularProductoEscalar(List<Integer> lista1,List<Integer> lista2){ //producto vectorial de dos listas: O(n)
        
                int result = 0; 
        
                for(int i = 0; i < lista1.size(); i++){
        
                    result += (lista1.get(i) * lista2.get(i));
                }
                return result;
            }
        
        
        
            public static long FibonacciN(int n){ // n termino de la serie de Fibonacci: O(n) 
        
                long a= 0;
                long b = 1;
                long result = 0;
        
                if( n == 0){
            return 0;
            }
                if( n == 1){
            return 1;	
            }
        
                for(int i=2;i < n; i++){
        
                    result = b + a;
                    a = b;
                    b= result;
                }
                return result; 
            } */
            
            
            
        
            
        /*41. Calcule la complejidad temporal y espacial de cualquiera de los algoritmos (recursivos) del ejercicio 2
         (salvo los referentes a la serie de Fibonacci). Compare dichas complejidades con el algoritmo iterativo para
        resolver el mismo problema.
        
        public static int sumaN(int n){  //Suma de n terminos positivos: O(n)
                
                if(n < 0){
                    throw new IllegalArgumentException("El número debe ser positivo.");
                }
                if(n == 0){
                    return 0;
                }
        
            return n + sumaN(n-1);
            }
        
            public static int factorialN(int n){ //Factorial de n: O(n)
            
                if(n < 0){
                    
                    throw new IllegalArgumentException("El número debe ser positivo.");
                }
                if(n == 0){
                    
                    return 1;
                }   
        
                return n * factorialN(n-1);
            }
        
            public static int potenciaN(int base, int n){  //Potencia n-ésima de un numero natural: O(log(n))
           
                if(n < 0){
                    
                    throw new IllegalArgumentException("El número debe ser positivo.");
                }   
        
                if(n == 0){
                    
                    return 1; 
                }
                int PotMitad= potenciaN(base, n/2);
                if( n % 2 == 0){
                    
                    return PotMitad * PotMitad;
                }
        
                return base * PotMitad * PotMitad;
            }
        
        
            public static int sumaLista(List<Integer> lista, int indice){ //Suma de los elementos de una lista: O(n)
            
                if(lista == null){
                    
                    throw new IllegalArgumentException("La lista no puede ser nula.");
                }
                if(indice < 0 || indice > lista.size()){
                    
                    throw new IllegalArgumentException("Indice fuera de rango.");
                }
                if(indice == lista.size()){
                    
                    return 0;
                }
                
                return lista.get(indice) + sumaLista(lista, indice + 1);
            }
        
        
            public static double mediaLista(List<Integer> lista){  //Media aritmética de una lista: O(n)
            
                if(lista == null){
                    
                    throw new IllegalArgumentException("La lista no puede ser nula.");
                }	
                if(lista.isEmpty()){
                    
                    return 0;
                }
                int suma = sumaLista(lista,0);
                return (double) suma/lista.size();
            }
        
            public static double sumaDesviacionLista(List<Integer> lista, int indice){ //Sumatorio de las desviaciones: O(n)
        
                double media = mediaLista(lista); //Metodo del apartado 5.
                
                if(indice < 0 || indice > lista.size()){
                    
                    throw new IllegalArgumentException("Indice fuera de rango.");
                }
                if(indice == lista.size()){
        
                    return 0;
                }
                double diferencia = lista.get(indice)-media;
                return Math.pow(diferencia,2) + sumaDesviacionLista(lista, indice+1);
            }
        
            public static double DesviaciónLista(List<Integer> lista){ 	//Desviación típica de una lista: O(n)
                
                if(lista == null){
                    
                    throw new IllegalArgumentException("La lista no puede ser nula.");
                }	
                if(lista.isEmpty()){
                    
                    return 0;
                }
                
                double sumaDesviacion = sumaDesviacionLista(lista, 0);
                return Math.sqrt(sumaDesviacion / lista.size());
            }
        
        
            public static int sumaPares(int n){	//La suma de los primeros números pares hasta n: O(n) 
        
                if(n<2){
                    
                    return 0;
                }
                if(n % 2 == 1){
                    
                    n--;
                }
        
                return n + sumaPares(n-2);
            }
        
            public static int sumaParesLista(List<Integer> lista,int indice){  //La suma de los elementos pares de una lista: O(n)
        
                if(lista == null){
                    
                    throw new IllegalArgumentException("La lista no puede ser nula.");
                }	
                if(indice < 0 || indice > lista.size()){
                    
                    throw new IllegalArgumentException("Indice fuera de rango.");
                }
                if(indice == lista.size()){
                    
                    return 0;
                }
                if(lista.get(indice) % 2 == 0){
                    
                    return lista.get(indice) + sumaParesLista(lista,indice+1);
                }else{
                    return sumaParesLista(lista,indice+1);
                }
            }
        
            public static List<Integer> obtenerListaPar(List<Integer> lista,int indice){ //Un nuevo array en el mismo orden de los numeros pares: O(n)
                
                if(lista == null){
                    
                    throw new IllegalArgumentException("La lista no puede ser nula.");
                }	
                if(indice < 0 || indice > lista.size()){
                    
                    throw new IllegalArgumentException("Indice fuera de rango.");
                }
                if(indice == lista.size()){
                
                    return new ArrayList<>();
                }
                
                List<Integer> resultado = obtenerListaPar(lista,indice +1);
                if(lista.get(indice) % 2 == 0){
                    
                    resultado.add(0,lista.get(indice));
                }
                
                return resultado;
            }
        
            public static List<Integer> listaParN(int n){   //Lista de pares hasta n O(n)
                
                if(n < 0){
                    
                    throw new IllegalArgumentException("El parametro debe ser positivo");
                }	
                
                
                if(n%2 == 1){
                    
                    n--;
                }
                
                return auxliarListaParN(n, 2, new ArrayList<>());
            }
            private static List<Integer> auxliarListaParN(int n,int indice,List<Integer> resul){    
        
                if(indice > n){
                    return resul;
                }
                resul.add(indice);
                return auxliarListaParN(n, indice+ 2, resul);
            }
           
            public static int productoEscalar(List<Integer> vectorA,List<Integer> vectorB,int indice){ // producto escalar de dos vectores O(n)
                
                if(vectorA == null){
                    throw new IllegalArgumentException("La lista no puede ser nula.");
                }	
                if(vectorB == null){
                    throw new IllegalArgumentException("La lista no puede ser nula.");
                }	
                if(indice < 0 || indice > vectorA.size()){
                    throw new IllegalArgumentException("Indice fuera de rango.");
                }
                if(indice == vectorA.size()){
                
                    return 0;
                }
                if(vectorA.size() != vectorB.size()){
        
                    throw new IllegalArgumentException("Los vectores tienen diferente longitud"); 
                }
        
                return vectorA.get(indice) * vectorB.get(indice) + productoEscalar(vectorA,vectorB,indice+1);
            } */
            
            
        /*42. Sea un conjunto A con cardinalidad n, y sea l un algoritmo que ejecuta una instrucción para cada 
        elemento del producto cartesiano de A × A. Calcule la complejidad temporal de l en función de n.
        
        La complejidad temporal del algoritmo que recorre el producto cartesiano de un conjunto A × A es O(n^2),
        ya que para cada elemento de A, se generan n pares con todos los elementos de A.*/
            
            
        /*43. Calcule la complejidad temporal del siguiente método:
        public static double sumaEltosMatriz(double matriz[][]){
            double suma = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                suma+=matriz[i][j];
            }
        }
        return suma;
        }
        La complejidad es: O(n^2), ya que son dos bucles anidados que van en función de la longitud de la matriz*/
            
 
        /*44.Escriba un algoritmo que busque un número en un array de
        enteros. Calcule su complejidad temporal en el caso peor, en el caso mejor y
        en el caso promedio. Su cabecera será la siguiente:
        
        public static boolean buscar(int e, int[] array){
            
            int dch = array.length -1;
            int izq = 0;
            
            while(izq <= dch){
            
                medio = (dch - izq)/2;
                
                if(e > array[medio]){
                    izq = medio +1;
                }
                else if(e < array[medio]){
                    dch = medio -1;
                }
                else if( e == array[medio]){
                    return true;
                } 
            }
            return false;
        }
        La complejidad temporal en el peor caso, en el caso mejor y en el caso promedio es:
        - Peor caso: O(log(n)) (cuando el número está al final o no está en el array)
        - Mejor caso: O(1) (cuando el número se encuentra en la primera comparación)
        - Caso promedio: O(log(n)) (por la naturaleza de la búsqueda binaria).
        */
            
        /*45. Escriba un algoritmo recursivo para buscar un número en un
        array ordenado de enteros. Su cabecera será la misma que la del ejercicio 43.
        Calcule su complejidad en el caso peor
        
        
        public static boolean buscarR(int e,int[] array){
        
            return buscarRauxiliar(e, array,0,array.length);
        }
        
        private static boolean buscarRauxiliar(int e,int[] array,int izq,int dch){
        
            if(izq > dch){
                return false;
            }
        
            
            int medio = (dch-izq)/2;
            
        
            if(e == array[medio]){
                return true;
            }else if(e > array[medio]){
                return buscarRauxiliar(e,array,medio + 1,dch);
            }else if(e < array[medio]){
                return buscarRauxiliar(e,array,izq,medio - 1);
            }
        }
        Este algoritmo tiene una complejidad de O(log(n)) en el peor caso, al igual que el algoritmo iterativo.
        La diferencia es que el espacio utilizado es O(log(n)) debido a las llamadas recursivas.
        */	
            
        /*46. Calcule las complejidades temporal y espacial del algoritmo
        recursivo para calcular el elemento n-ésimo de la sucesión de Fibonacci
        
        El algoritmo tiene una complejidad temporal de O(2^n) 
        y una complejidad espacial de O(n), ya que la recursión genera múltiples llamadas.*/
            
            
        /*47. Se tiene el siguiente método. Utilizando el profiler de Netbeans se han medido los tiempos de ejecución
        de diferentes llamadas al método (véase el cuadro 1). Explique los resultados
        
        La complejidad teórica de un algoritmo O(n) se refleja en los resultados, 
        ya que el tiempo de ejecución aumenta proporcionalmente con el tamaño de la entrada.*/
            
            
        /*48. Se tiene el siguiente método: Utilizando el profiler de Netbeans se han medido los tiempos de ejecución
        de diferentes llamadas al método (véase el cuadro 2). Explique los resultados
        
        El tiempo de ejecución aumenta de forma cuadrática con el tamaño de la entrada, 
        lo que es consistente con la complejidad O(n^2).  */
            
            
        /*49. Explique la definición que se muestra a continuación:
        Sean dos funciones T : N → N y f : N → N. Se dice que T (n) es de orden
        f (n), y se escribe T (n) ∈ O(f (n)), si y sólo si existen dos números naturales
        k y n0 tales que, para todo m, también natural, que cumpla m > n0, entonces
        T (m) ≤ k · f (m).
        
        Se dice que T(n) pertenece a O(f(n)) si existe una constante k tal que T(n) ≤ k * f(n) para todo n mayor a n0. */
            
            
        /*50.Asumiendo la definición del ejercicio 49, se pide
        
        1) Para k = 4 y n0 = 0, T(n) pertenece a O(log(n)).
        2) Para k = 1 y n0 = 0, T(n) pertenece a O(n).
        3) El cambio de base entre logaritmos no afecta a la notación Big-O, ya que es una constante multiplicativa.
        
        */
            
        
        /*51.Estudie de forma comparativa entre ellas el crecimiento de las siguientes funciones reales de variable real:
        1. f0(x) = 1,
        2. f1(x) = x,
        3. f2(x) = x2,
        4. f3(x) = log2(x), y
        5. f4(x) = 2^x.
        
        El orden de crecimiento es f4 > f2 > f1 > f3 > f0, 
        ya que 2^x crece más rápido que x^2, que a su vez crece más rápido que x, y log(x) crece más lentamente que x. */	
            
            
        /*52.Calcule la complejidad temporal asintótica del método
        
        public static int f(int n) {
            if (n == 0) return 1;
            else if (n < 0) return -1;
            else{
                int m = 1/f(n/2) + f(n/2);
                return sumaNPrimeros(m);
            }
        } 
        La complejidad temporal de este método depende del número de llamadas recursivas, 
        y su análisis depende de las operaciones dentro de cada llamada. 
        Por lo tanto su complejidad es O(n * log(n)).
        
        /*53. La complejidad en el caso peor de la inserción en un array
        list es diferente si el array list está ordenado de si no lo está. ¿Es cierta esta
        afirmación? Justifique la respuesta.
        
        En un array no ordenado, la inserción puede requerir mover todos los elementos,
        lo que tiene una complejidad de O(n). En un array ordenado, la inserción puede ser más eficiente 
        con búsqueda binaria (O(log(n))) para encontrar la posición, pero aún requiere mover elementos (O(n)).*/
        
        
        /*54. Suponga que una instrucción tarda en ejecutarse 10 ns, y que
        el tamaño de la entrada es n = 100, se pide calcular el tiempo requerido para
        los siguientes números de ejecuciones. Para hacerlo mas sencillo asusimos base 10:
        1. log(n),	-> 2*10ns  = 20ns  				->	50ns			-> 5ms
        2. n,		-> 100*10ns = 1000ns			->	1ms				-> 100s
        3. nlog(n), ->	100*2*10ns = 2000ns			->	5ms 			-> 500s
        4. n2,		-> 100*100*10ns = 100000ns		->	100s			-> 10000000 s
        5. n8 y		-> 10^7 s						->	10^32s			-> 10^37 s
        6. 10n.		-> 10^92 s						->	10^100000*10ns	-> 10^100000ms
        Realice los cálculos anteriores, pero ahora bajo los siguientes supuestos:
        1. n = 100.000.
        2. n = 100.000 y el tiempo de instrucción (o bloque de instrucciones) 1
        ms

        Dado un tiempo de ejecución de 10 ns por instrucción y n = 100, 
        los tiempos para las distintas complejidades de O(log(n)), O(n), O(nlog(n)), O(n^2), y O(10^n) 
        aumentan de acuerdo con la fórmula de la complejidad temporal.
        */
        
        /*55. Explique por qué el problema del ajedrez todavía no está
        resuelto.
        
        El problema del ajedrez no está resuelto porque la cantidad de movimientos
        posibles crece de manera exponencial, lo que lleva a una complejidad 
        extremadamente alta (O(50^n) para n turnos).*/
            
}