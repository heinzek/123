/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author test
 */
public class ZESPOLONE {

    //Pola
    private double _re;
    private double _im;
    //Konstruktor
    public ZESPOLONE()
    {_re=0;
        _im=0;
    }
    public ZESPOLONE(double re)
    {_re=re;
        _im=0;
    }
    public ZESPOLONE(double re,double im)
    {_re=re;
        _im=im;
    }

    public String toString(ZESPOLONE Z)
    {String s,j;
        double m_im;
        m_im=Math.abs(Z._im);
        if (Z._im>0) j="+j"; else j="-j";
        s=String.valueOf(Z._re)+j+String.valueOf(m_im);
        return s;

    }
    ZESPOLONE dodaj(ZESPOLONE Z1, ZESPOLONE Z2)
    {
        return new ZESPOLONE(Z1._re+Z2._re,Z1._im+Z2._im);
    }
}
