/*
Líder: Pâmela
Membros: Pâmela, Rafael Ribeiro, Matheus Tavares, Bryan e Johrdan.

Regras dos impostos:

DEPENDENTES:
Valor de cada dependente R$189,59
Como calcular o desconto de cada dependente:
Multiplicar a quantidade de cada dependente pelo valor

FGTS:
8% do salário do empregado, que deve ser pago pelo empregador.

IR: 
Calcular o salário base de IR antes de calcular o IR.
Salário base para IR - salarioBaseIr = salarioBruto - (INSS + DESCONTODEPENDENTES).

Salário Base:           Alíquota:   Dedução:
0.000,00 até 1.903,98   isento      000,00
1.903,99 até 2.826,65   7,50%       142,80
2.826,66 até 3.751,05   15,00%      354,80
3.751,06 até 4.664,68   22,50%      636,13
Acima de 4.664,68       27,50%      869,36

INSS:
Abater partes do salário de acordo com cada aliquota, pois é abatido X reais e é calculado x% de cada parte do salário

Salário Base:           Alíquota:
0.000,00 até 1.212,00   7,50%      
1.212,01 até 2.427,35   9,00%   
2.427,36 até 3.641,03   12,00%
3.641,04 até 7.087,22   14,00%
*/


package primeiro_projeto_marcos;
import java.util.Scanner; // Importação para o Scanner funcionar
public class Primeiro_projeto_marcos {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in); //Scanner
    
    //Falas 
    String epc = " ";
    String f1 = "Olá esse programa foi desenvolvido com o intuíto de transformar um salário bruto e deixar ele limpo e descriminar um contra-cheque.";
    String f2 = "Um contra-cheque mostra quanto foi descontado de IR, INSS, quanto a empresa pagou de FGTS e quanto é o Salário Limpo";
    String f3 = "Digite seu salário bruto (R$):";
    String f4 = "Você tem dependentes?";
    String f5 = "O valor que você pagará de INSS é de R$";
    String f6 = "O valor que a sua empresa paga de FGTS é de R$";
    String f7 = "O valor que você pagará de IR será de R$";
    String f8 = "Será descontado R$";
    String f9 = " do seu salário de impostos";
    String f10 = "seu salário limpo será R$";
    String f11 = "Digite quantos dependentes você tem";
    String f12 = "O Valor de desconto de dependentes R$";
    String af1 = "Sim";
    
    //String variavel
    String dependentes1 = "null"; // String para o usuario renomear para dizer tem dependentes ou não
    
    //Doubles
    double salbrt = 0;
    double inss = 0;
    double ir = 0;
    double fgts = 0;
    double dependentes0 = 0;
    double descDep = 0;

    
    //Bases para Cálculos
 
    
    //INSS
    double bcinss1 = 1212; // Salário para base 1 INSS
    double bcinss2 = 2427.35; // Salário para base 2 INSS
    double bcinss3 = 3641.03; // Salário para base 3 INSS
    double bcinss4 = 7087.22; // Salário para base 4 INSS  
    double difinss1 = 1212; // Diferença 1 INSS
    double difinss2 = 1215.34; // Diferença 2 INSS
    double difinss3 = 1213.67; // Diferença 3 INSS
    double difinss4 = 3446.18; // Diferença 4 INSS
    double MaxInss = 828.39; // Máximo de inss
    double subinss = 0;
    double rsubinss = 0;
    double basesalinss1 = 0;
    double basesalinss2 = 0;
    double basesalinss3 = 0;
    double alqtinss1 = 0.075; // Aliquota 1 INSS
    double alqtinss2 = 0.09; // Aliquota 2 INSS
    double alqtinss3 = 0.12; // Aliquota 3 INSS
    double alqtinss4 = 0.14; // Aliquota 4 INSS

    
    //IRPF     
    double bcir1 = 1903.98; // Salário para base 1 IR
    double bcir2 = 2826.65; // Salário para base 2 IR
    double bcir3 = 3751.05; // Salário para base 3 IR
    double bcir4 = 4664.68; // Salário para base 4 IR
    double ded0 = 0; // Dedução 0 IR 
    double ded1 = 142.8; // Dedução 1 IR
    double ded2 = 354.8; // Dedução 2 IR
    double ded3 = 636.13; // Dedução 3 IR
    double ded4 = 869.36; // Dedução 4 
    double alqtir0 = 0; // Aliquota 0 IR
    double alqtir1 = 0.075; // Aliquota 1 IR
    double alqtir2 = 0.15; // Aliquota 2 IR
    double alqtir3 = 0.225; // Aliquota 3 IR
    double alqtir4 = 0.275; // Aliquota 4 IR
    double valDep = 189.59; // desconto de dependentes
 
    
    //Interação com o usuário
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(epc);
    System.out.println(f3); // pergunta o salário bruto ao usuário
    salbrt = in.nextDouble(); // Muda o valor do Double com o salário que o usuário digitou
    System.out.println(f4); // Pergunta se o usuário tem dependentes
    dependentes1 = in.next (); // Muda o valor da String de acordo com a resposta
    
    
    //Verificador se tem dependentes
    if(dependentes1.equalsIgnoreCase(af1)) { // Verifica se a resposta é SIM ignorando a caixa do texto
        System.out.println(f11); // Pergunta quantos dependentes
    dependentes0 = in.nextDouble(); // Altera o valor do double da quantidade de dependentes
    descDep = dependentes0 * valDep; // Multiplica a quantidade de dependentes pelo valor unitário de cada dependente
    System.out.println(f12 + descDep); // Avisa ao usuário quanto vai ser o "desconto" de dependentes abatido do IR do mesmo. 
    }
       
    
    //Calculos de cada imposto    
    //FGTS
    double alqtfgts = 0.08; // 8% de FGTS
    fgts = salbrt * alqtfgts; // Calcula 8% do Salário Bruto

    
    //INSS
    if (salbrt <= bcinss1){ // Só entra na condição se o salário é menor ou igual a primeira aliquota (1212)
        inss = salbrt * alqtinss1; // multiplica o salário por 7.5%
    } 
    else if (salbrt > bcinss1 && salbrt <= bcinss2){ // Maior que 1212 e menor ou igual a 2427,35
        basesalinss1 = difinss1 * alqtinss1; // calcula 7.5% de 1212
        subinss = salbrt - difinss1; // subitrai o SalarioBruto de 1212
        if (subinss > 0){ // verifica se é maior que 0
            rsubinss = subinss * alqtinss2;  //calcular 9% do valor
        }
        inss = basesalinss1 + rsubinss; // Soma 7,5% de 1212 com 9% da sobra

    }
    else if (salbrt > bcinss2 && salbrt <= bcinss3){ // Maior que 2427,35 e menor que 3641,03
        basesalinss1 = difinss1 * alqtinss1; // calcula 7.5% de 1212
        basesalinss2 = difinss2 * alqtinss2; // calcula 9% de 1215.34
        subinss = salbrt - (difinss1 + difinss2); //Subitrai o SalarioBruto de 2427,34
        if (subinss > 0 ){ //verifica se é maior que 0
            rsubinss = subinss * alqtinss3; // calcula 12% do valor
        }
        inss = basesalinss1 + basesalinss2 + rsubinss; // Soma 7,5% de 1212 com 9% de 1215,34 com a sobra
    }
    else if (salbrt > bcinss3 && salbrt <= bcinss4){ // Maior que 3641,03 e menor que 7087,22
        basesalinss1 = difinss1 * alqtinss1; // calcula 7.5% de 1212
        basesalinss2 = difinss2 * alqtinss2; // calcula 9% de 1215.34
        basesalinss3 = difinss3 * alqtinss3; // calcula 12% de 1213.67
        subinss = salbrt - (difinss1 + difinss2 + difinss3); // Subtrai o SalarioBruto de 3.641,01
        if (subinss > 0){ // Verifica se é maior que 0
            rsubinss = subinss * alqtinss4; // calculo 14% do valor
        }
        inss = basesalinss1 + basesalinss2 + basesalinss3 + rsubinss; // Soma tudo       
    } else //Se for maior que 7087,22 
        {
        inss = MaxInss; // o valor vai ser 828,39
        }
    
    
    //IRPF
    double baseir = salbrt - (inss + dependentes0); //Subtrai INSS e DEPENDENTES para dar um base para IR

    if (baseir <= bcir1 ){ // verifica se o salário é menor ou igual a R$1.903,98 
        ir = (baseir * alqtir0) - ded0; // ISENTO
    } else if (baseir <= bcir2){ // verifica se o salário é menor ou igual a R$2.826,65
        ir = (baseir * alqtir1) - ded1; // multiplica o salário bruto por 7,5% e abate R$142,80 do resultado
    } else if (baseir <= bcir3) { // verifica se o salário é menor ou igual a R$3.751,05
        ir = (baseir * alqtir2) - ded2; // multiplica o salário bruto por 15% e abate R$354,80 do resultado
    } else if (baseir <= bcir4) { // verifica se o salário é menor ou igual a R$4.664,68
        ir = (baseir * alqtir3) - ded3; // multiplica o salário bruto por 22,5% e abate R$636,13 do resultado
    } else if (baseir >= bcir4){ // verifica se o salário é maior que R$4.664,68
        ir = (baseir * alqtir4) - ded4; // multiplica o salário bruto por 27,5% e abate R$869,36 do resultado
    }
    
    double ttlimpost = inss + ir; // Soma de todos os impostos
    double sallimp = salbrt - ttlimpost; // Subtrai os impostos do salário bruto "limpando o salário"
    
    
    //Contra-cheque
    System.out.println(f6 + fgts);
    System.out.println(f5 + inss);
    System.out.println(f7 + ir);
    System.out.println(f8 + ttlimpost + f9);
    System.out.println(f10 + sallimp);
    }
}    
