/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht2;

/**
 *
 * @author Vito Corleone
 */
public class Run {
        public static void main(String[] args) {
        // Kamil je moeder
        // oook de jouwe
            
        HighSpace highSpace = new HighSpace();
        IGetHigh.INSTANCE.GetDiskFreeSpaceA("C:\\", highSpace);
        System.out.println(highSpace.toString());
        }
}
