/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author multi
 */
import java.io.IOException;
import java.lang.Math;

public class ControllerCalculadora {
Conversor conversor;  
FileData answerData;

    public ControllerCalculadora() {
        conversor = new Conversor();
        answerData=new FileData();
    }


   public String cutString(String text){  
   return text.substring(beginIndex(text),text.length());
  }
   public double numberTwo (String text){
    return conversor.StringToDouble(cutString(text));}
   
public int beginIndex(String text){
for(int i=0;i<text.length();i++){
if(text.charAt(i)=='÷'||text.charAt(i)=='*'||text.charAt(i)=='+'||text.charAt(i)=='-'){
    return i+1;
}  
}
return -1;   }

public double chooseOperation(char operation, double numberOne,double numberTwo){
if(operation=='*'){
return Multiplication(numberOne,numberTwo);
}

if(operation=='÷'){
return Division(numberOne,numberTwo);
}

if(operation=='+'){
return Sum(numberOne,numberTwo);
}

if(operation=='-'){
return Subtraction(numberOne,numberTwo);
}
return -1;
}

public double Sum (double numberOne, double numberTwo){

return numberOne+numberTwo;}


public double Subtraction (double numberOne, double numberTwo){

return numberOne-numberTwo;}

public double Multiplication(double numberOne, double numberTwo){

return numberOne*numberTwo;}

public double Division (double numberOne, double numberTwo){

return numberOne/numberTwo;}

public double squireRoot(double number){

return Math.sqrt(number);
}

public double Square(double number){
return number*number;    
}
 public double Fatorial(double number){
     //Condicao parada
     if(number==0){
     return 1;}
     
     //parte recursiva
     return number*Fatorial(number-1);
 }

 public void saveAnswerData(String fileOutput,double number) throws IOException{
 answerData.saveFile(fileOutput, number);
 }
 
 public double loadAnswerData(String fileOutput) throws IOException{
 return (double) answerData.loadFile(fileOutput);
 }
 
}

