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
}

