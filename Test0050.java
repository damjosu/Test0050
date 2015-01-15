public class Test0050
{    
    /**
     * Multiplíca dos números dados y devuelve el resultado.
     */
    public int multiplicacion(int num1, int num2)
    {
        int aux1 = num1;
        int aux2 = num2;
        if (num2 > num1)//Se cambian de orden para que el número de iteraciones sea siempre el del número menor.
        {
            aux1 = num2;
            aux2 = num1;
        }    
        int resultado = 0;
        for (int cont = 0; cont < aux2; cont++) // Mientras el contador no llegue al número de iteraciones del número menor, seguira dentro del bucle.
        {
            resultado += aux1;
        }
        return resultado;
    }
    
    /**
     * Divide dos números dados, el primero (dividendo) y el segundo (divisor), y devuelve el resultado.
     */
    public int division(int num1, int num2)
    {
        int resultado = 0; 
        if (!(num1 < 0) || !(num2 <0))// Comprueba que no sean negativos
        {
            if (num1 >= num2) //Comprueba que el dividendo sea mayor que el divisor.
            {   
                int cont = 0;
                resultado = num1;          
                for (cont = 0 ;(resultado - num2) >= 0; cont++) // Mientras que la resta del divisor al dividendo no sea menor que 0 seguirá dentro del bucle.
                {
                    resultado -= num2;               
                }
                resultado = cont;           
            }
        }    
        return resultado;
    }   
    
    /**
     * Devuelve el resto que da la división de los dos números dados, el primero (dividendo) y el segundo (divisor).
     */
    public int modulo(int num1, int num2)
    {
        int resultado = 0;
        if (!(num1 < 0) || !(num2 <0))// Comprueba que no sean negativos.
        {
            if ((multiplicacion(num2, division(num1,num2))) != num1) // Si el cociente multiplicado por el divisor, no da el dividendo es que tiene resto.
            {
                resultado = (num1 - (multiplicacion(division(num1, num2), num2)));
            }
        }
        return resultado;    
    }
    
    /**
     * Devuelve el resultado de la potencia del primer número dado (base), y segundo dado (exponente).
     */
    public int potencia(int num1, int num2)
    {
        int resultado = 0;
        if (!(num1 < 0) || !(num2 <0))// Comprueba que no sean negativos.
        {
            resultado = 1;
            for (int cont = 0; cont < num2; cont++) // Mientras el num1 no se haya multiplicado a si mismo el mismo número de veces que el num2, seguira en el bucle.
            {
                resultado = multiplicacion(resultado, num1);
            }
        }        
        return resultado;        
    }

}

