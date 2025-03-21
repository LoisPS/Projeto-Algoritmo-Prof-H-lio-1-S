//Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit.
//Faça um algoritmo para ler uma temperatura Celsius e imprimi-la em Fahrenheit (pesquise como fazer este tipo de conversão).

//PORTUGOL

//VAR
//   TCelsios, TFahrenheit: Real

//INICIO
//   Escreva("Digite a temperatura em Celsius:")
//   Leia(TCelsius)
   
//   TFahrenheit <- (TCelsius * 9 / 5) + 32

// RESULTADO
//   Escreva("A temperatura em Fahrenheit é", TFahrenheit)

//Fim

//TESTE DE MESA 

// Entrada (°C)| Cálculo (°F=°C*9/5+32).  | Saída (°F)|
// 0           | (0*9/5)=0+32=32.0        | 32.0      |
// 25.0        | (25.0**9/5)=45+32=77.0   | 77.0      |


package javaapplicationconvertemp;
import javax.swing.JOptionPane;

public class JavaApplicationConverTemp {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
        double TCelsius = Double.parseDouble(input);
        double TFahrenheit = (TCelsius *9/5)+ 32;
        
        JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit é:" + TFahrenheit + "°F");
    }
    
}
