//A granja Frangotech possui um controle automatizado de cada frango da sua produção.
//No pé direito do frango há um anel com um chip de indentificação; no pé esquerdo são dois anéis para indentificar o tipo de alimento que ele deve consumir.
//Sabendo que o anel com chip custaR$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos.

//PORTUGOL

//VAR
//   qFrangos, custoChip, custoAlimento, gTotal: Real

//INICIO
//   custoChip <- 4.00
//   custoAlimento <- 3.50

//   Escreva("Digite a quantidade de frangos:")
//   Leia(qFrangos) 

//   gTotal <- qFrangos *(custoChip + (20* (custoAlimento))

// RESULTADO
//   Escreva("O gasto total para marcar todos os frangos é: R$", gTotal)

//Fim

//TESTE DE MESA 

// | QFRangos   | CustoChip    | CustoAlimento   | GastoTotal                                            | Saída (R$) |                                                |
// | 25         | 4.00         | 3.50            | 25*(4.00+(2*3.50))=25*(4.00+7.00)=25*11.00= 275.00    | 275.00     |
// | 100        | 4.00         | 3.50            | 100*(4.00+(2*3.50))=100*(4.00+7.00)=100*11.00= 1.100  | 1.100      |


package javaapplicationfrangogranja;
import javax.swing.JOptionPane;

public class JavaApplicationFrangoGranja {

    public static void main(String[] args) {
        
        double custoChip= 4.00;
        double custoAlimento = 3.50;
        
        String input = JOptionPane.showInputDialog("Digite a quantidade de frangos:");
        int qFrangos = Integer.parseInt(input);
        
        double gTotal = qFrangos * (custoChip+ (2* custoAlimento));
        
        JOptionPane.showMessageDialog(null, "o gasto total para marcar todos os frangos é: R$" + gTotal);
    }
    
}
