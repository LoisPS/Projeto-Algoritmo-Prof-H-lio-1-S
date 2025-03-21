//A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.
//Faça um algoritmo para calcular e imprimir o salário bruto e o salário liquido de um determinado funcionario.
//Considere que o salario liquido é igual ao salário bruto descontando-se 10% de impostos.

//PORTUGOL

//VAR
//   HNormais, HExtras, sBruto,sLiquido: Real

//INICIO
//   Escreva("Digite a quantidade de horas trabalhadas:")
//   Leia(HNormais)
//   Escreva("Digite a quantidade de horas extras trabalhadas:")
//   Leia(HExtras) 

//   sBruto <- (hNormais *10 ) + (hExtras *15)
//   sLiquido <- sBruto *9

// RESULTADO
//   Escreva("Salário Bruto: R$", sBruto)
//   Escreva("Salário Liquido: R$", sLiquido)

//Fim

//TESTE DE MESA 

// | HNormais    | HExtras    | SBruto    | SLiquido | Saída (R$)                                                |
// | 160         | 10         | 1.750     | 1.575    | SB:(160*10)+(10*15)=1.600+150=1.750 / SL: 1.750*0.9=1.575 |
// | 40          | 10         | 550       | 495.00   | SB: (40*10)+(10*15)=400+150=550  / SL: 550.00*0.9=495.00. |



package javaapplicationsalariobruto;

import javax.swing.JOptionPane;

public class JavaApplicationSalarioBruto {

    public static void main(String[] args) { 

        String inputHNormais = JOptionPane.showInputDialog("Digite a quantidade de horas normais trabalhadas:");
        double hNormais = Double.parseDouble(inputHNormais);

        String inputHExtras = JOptionPane.showInputDialog("Digite a quantidade de horas extras trabalhadas:");
        double hExtras = Double.parseDouble(inputHExtras);

        double sBruto = (hNormais * 10) + (hExtras * 15);
        double sLiquido = sBruto * 0.90;

        JOptionPane.showMessageDialog(null,
                "SBruto: R$" + sBruto + "\n" +
                "SLiquido: R$" + sLiquido);
    }
}
