//Três amigos´Carlos, Andre e Felipe, desidiram rachar igualmente a conta de um bar.
//Faça um algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que Carlos e Andre não paguem centavos.
//Ex: uma conta de R$101,53 resulta em R$33,00 para Carlos, R$33,00 para Andre e R$35,53 para Felipe

//PORTUGOL

//VAR
//   TotalConta, Carlos, Andre, Felipe: Real

//INICIO
//   Escreva("Digite o valor total da conta:")
//   Leia(Total da Conta)
   
//   Carlos <- trunc(totalCarlos/3)
//   Andre <- trunc(totalCarlos/3)
//   Felipe <- totalConta - Carlos - Andre

//Rsultado
//   Escreva("Carlos deve pagar;R$ ", Carlos)
//   Escreva("Andre deve pagar;R$ ", Andre)
//   Escreva("Felipe deve pagar;R$ ", Felipe)

//Fim

//TESTE DE MESA 

// Entrada (Conta Total)| Carlos | ANDRE | Felipe|
// R$203,04             | 67,00  | 67,00 | 69,04 |


package javaapplicationdivicaoconta;

import javax.swing.JOptionPane;

public class JavaApplicationDivicaoConta {

    public static void main(String[] args) {
        // Ler o valor total da conta10
        String input = JOptionPane.showInputDialog("Digite o valor total da conta:");
        double TotalConta = Double.parseDouble(input); 
    
        int Carlos = (int)(TotalConta/3);
        int Andre =  (int)(TotalConta/3);
        double Felipe = TotalConta - Carlos - Andre;
        
        JOptionPane.showMessageDialog(null, "Carlos deve pagar: R$"+ Carlos + "\n" + 
                "Andre deve pagar: R$" + Andre + "\n" + 
                "Felipe deve pagar: R$" + String.format ("%.2f",Felipe));
        
    }
}
