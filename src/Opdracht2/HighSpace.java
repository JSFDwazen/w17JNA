/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht2;

import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;

/**
 *
 * @author Vito Corleone
 */
public class HighSpace extends Structure {

    public IntByReference lpSectorsPerCluster;
    public IntByReference lpBytesPerSector;
    public IntByReference lpNumberOfFreeClusters;
    public IntByReference lpTotalNumberOfClusters;
    
    
    public String toString(){   
      StringBuilder sb = new StringBuilder();
      sb.append("Dit is kut: \n" );
      sb.append("Sectors per cluster: " + lpSectorsPerCluster + "\n");
      sb.append("Bytes pet sector: " + lpBytesPerSector + "\n");
      sb.append("Nummer vrije clusters: " + lpNumberOfFreeClusters + "\n");
      sb.append("Totaal clusters: " + lpTotalNumberOfClusters + "\n");
      sb.append("\n");
      long totaal = (long) (lpNumberOfFreeClusters.getValue() * lpSectorsPerCluster.getValue() * lpBytesPerSector.getValue());
      sb.append("Totaal vrije ruimte: " + totaal + "\n");
      return sb.toString();
    }
}
