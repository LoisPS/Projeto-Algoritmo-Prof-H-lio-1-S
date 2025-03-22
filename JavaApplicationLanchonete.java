//PORTUGOL

//Var
//inteiro: qSanduiches
// real: qQueijo, qPresunto, qHamburguer

//Inicio
//escreva ("Digite a quantidade de sanduiches:")
//leia(qSanduiches)
//qQueijo <- (2*50* qSanduiches)/1000
//qPresunto <- (1*50* qSanduiches)/1000
//qHamburguer <- (1*100* qSanduiches)/1000

//Saida
//escreva("QQueijo necessario:, qQueijo, "kg")
//escreva("QPresunto necessario:, qPresunto, "kg")
//escreva("QHamburguer necessario:, qHamburguer, "kg")

//Fim

//TESTE DE MESA

// |Entrada (QSanduiches) |    C.Queijo (kg)         |    C.Presunto (kg)     |   C.Hamburguer         |
// |      1               | (1*2*50)=100/1000=0.1    | (1*50)=50/1000=0.0     | (1*100)=100/1000=0.1   |
// |      5               | (5*2*50)/=500/1000=0.5   | (5*50)=250/1000=0.25   | (5*100)=500/1000=0.5   |
// |      10              | (10*2*50)=1000/1000=1.0  | (10*50)=500/1000=0.5   | (10*100)=1000/1000=1.0 |
// |      15              | (15*2*50)=1500/1000=1.5  | (15*50)750/1000=0.75   | (15*100)=1500/1000=1.5 |

package javaapplicationlanchonete;
import javax.swing.JOptionPane;

public class JavaApplicationLanchonete {

    public static void main(String[] args) {
       
        String input = JOptionPane.showInputDialog("Digite a quantidade de sanduíches a fazer:");
        int QSanduiches = Integer.parseInt(input);

        
        int qQueijoGramas = QSanduiches * 2 * 50;
        int qPresuntoGramas = QSanduiches * 1 * 50;
        int qHamburguerGramas = QSanduiches * 1 * 100;

        double qQueijokg = qQueijoGramas / 1000.0;
        double qPresuntokg = qPresuntoGramas / 1000.0;
        double qHamburguerkg = qHamburguerGramas / 1000.0;

        JOptionPane.showMessageDialog(null,
                "Queijo necessário: " + qQueijokg + " kg\n" +
                "Presunto necessário: " + qPresuntokg + " kg\n" +
                "Hambúrguer necessário: " + qHamburguerkg + " kg");
    }
}

