/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht2;

import com.sun.jna.ptr.IntByReference;
import static java.lang.Math.abs;

/**
 *
 * @author Vito Corleone
 */
public class Run {

    public static void main(String[] args) {

        IntByReference lpSectorsPerCluster = new IntByReference();
        IntByReference lpBytesPerSector = new IntByReference();
        IntByReference lpNumberOfFreeClusters = new IntByReference();
        IntByReference lpTotalNumberOfClusters = new IntByReference();
        IGetHigh.INSTANCE.GetDiskFreeSpaceA("C:\\", lpSectorsPerCluster, lpBytesPerSector, lpNumberOfFreeClusters, lpTotalNumberOfClusters);
        
        long totaal =  ((long) lpNumberOfFreeClusters.getValue() * (long) lpSectorsPerCluster.getValue() * (long) lpBytesPerSector.getValue());

        System.out.println("Totaal vrije ruimte: " + abs(totaal) + "Bytes \n");
    }
}
