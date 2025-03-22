//Uma confecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos.
//Faça um algoritmo para calcular quantos novelos de lã ela gasta por blusa.

//PORTUGOL

//VAR
//   qLatas350ml, gG600ml, qG2L, TotalLitros: Real

//INICIO
//   Escreva("Digite a quantidade de latas de 350ml:")
//   Leia(qLatas350ml)

//   Escreva("Digite a quantidade de garrafas de 600ml:")
//   Leia(qG600ml) 

//   Escreva("Digite a quantidade de garrafas de 2L:")
//   Leia(qG2L)

//   TotalLitros <- (qLatas350ml *0.350) + (qG600ml*0.600) + (qG2L *2) 

// RESULTADO
//   Escreva("O total de litros de refrigerante comprado é: ", TotalLitros,"Litros")

//Fim

//TESTE DE MESA 

// | QLatas350ml   | QG600ml   | QG2L  | Cálculo                                       | TotalLitros |                                                 |
// | 10            | 5          | 3    | (10*0.350)+(5*0.600)+(3*2)=3.5+3.0+6.0=12.5   | 12.5        |
// | 20            | 10         | 4    | (20*0.350)+(10*0.600)+(4*2)=7.0+6.0+8.0=21.0  | 21.0        |

package javaapplicationlitrosrefri;
import javax.swing.JOptionPane;

public class JavaApplicationLitrosRefri {

    public static void main(String[] args) {
        String inputLatas = JOptionPane.showInputDialog("Digite a quantidade de latas de 350ml:");
        int qLatas350ml = Integer.parseInt(inputLatas);

        String inputG600ml = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 600ml:");
        int qG600ml = Integer.parseInt(inputG600ml);

        String inputG2L = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 2L:");
        int qG2L = Integer.parseInt(inputG2L);

        double totalLitros = (qLatas350ml * 0.350) + (qG600ml * 0.600) + (qG2L * 2.0);

        JOptionPane.showMessageDialog(null, "O total de litros de refrigerante comprado é: " + totalLitros + " litros");
    }
}
