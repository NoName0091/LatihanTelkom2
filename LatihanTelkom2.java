/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihantelkom2;

	import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LatihanTelkom2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	int angka;
        Scanner input=new Scanner(System.in);
        System.out.println(" Menentukan Bilangan Ganjil & Genap ");
        System.out.print("Masukan Bilangan = ");
        angka=input.nextInt();
        
        if (angka%2==0){
            System.out.println("Bilangan "+angka+" Adalah Bilangan Genap");
        }else {
             System.out.println("Bilangan "+angka+" Adalah Bilangan Ganjil");
        }
    
  }
}
