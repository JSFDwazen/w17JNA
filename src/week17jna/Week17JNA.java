/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week17jna;

/**
 *
 * @author Ramòn Janssen
 */
public class Week17JNA {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Kamil je moeder
        
        SystemTime systemTime = new SystemTime();
        IGetTime.INSTANCE.GetSystemTime (systemTime);
        System.out.println(systemTime.toString());
        
        IGetTime.INSTANCE.GetSystemTime (systemTime);
        int begin = systemTime.inMilliseconden();
        for(int i = 0; i< 1000000000; i++);       
        IGetTime.INSTANCE.GetSystemTime (systemTime);
        int eind = systemTime.inMilliseconden();
        int resultaat = eind - begin;
        System.out.println("JNA resultaat: " + resultaat);
        
        long beginNano = System.nanoTime();
        for(int i = 0; i< 1000000000; i++);
        long eindNano = System.nanoTime();
        int resultaatNano = (int) (eindNano / 1000000 - beginNano / 1000000);
        System.out.println("Java liP resultaat: " + resultaatNano);
    }
    
}
