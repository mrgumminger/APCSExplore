
//********************************************************************
//  PianoKeys.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the declaration, initialization, and use of an
//  integer variable.
//********************************************************************
public class PianoKeys
{
    //-----------------------------------------------------------------
    //  Prints the number of keys on a piano.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        int keys, pedals;
        keys=88;
        pedals =3;
        keys=pedals;
        System.out.println ("A piano has " + keys + " keys,");
        System.out.println ("and " + pedals + " pedals.");
    }
}

