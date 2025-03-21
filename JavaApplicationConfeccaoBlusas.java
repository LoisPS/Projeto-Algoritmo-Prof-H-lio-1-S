//Uma confecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos.
//Faça um algoritmo para calcular quantos novelos de lã ela gasta por blusa.

//PORTUGOL

//VAR
//   qBlusas, qNovelos, nPBlusas: Real

//INICIO
//   Escreva("Digite a quantidade de blusas produzidas:")
//   Leia(qBlusas)

//   Escreva("Digite a quantidade de novelos gastos:")
//   Leia(qNovelos) 

//   nPBlusa <- qNovelos/qBlusas 

// RESULTADO
//   Escreva("A quantidade de novelos gastos por blusa é: ", nPBlusa)

//Fim

//TESTE DE MESA 

// | QBlusas   | QNovelos    | NPBlusa   | Cálculo-Saída |                                                 |
// | 20        | 90          | 4.5       | 90/20= 4.5    |
// | 50        | 200         | 4.0       | 200/50= 4.0   |

package javaapplicationconfeccaoblusas;
import javax.swing.JOptionPane;

public class JavaApplicationConfeccaoBlusas {

    public static void main(String[] args) {
        String inputBlusas = JOptionPane.showInputDialog("Digite a quantidade de blusas produzidas:");
        int qBlusas = Integer.parseInt(inputBlusas);

        String inputNovelos = JOptionPane.showInputDialog("Digite a quantidade de novelos gastos:");
        int qNovelos = Integer.parseInt(inputNovelos);

        double nPBlusa = (double) qNovelos / qBlusas;

        JOptionPane.showMessageDialog(null, "A quantidade de novelos gastos por blusa é: " + nPBlusa);
    }
}
