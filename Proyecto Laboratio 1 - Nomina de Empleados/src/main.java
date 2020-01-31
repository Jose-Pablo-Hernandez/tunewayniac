import java.awt.*;

import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {

int cant =1;

    cant = Integer.parseInt(JOptionPane.showInputDialog("DIGITE CANT DE EMPLEADOS: "));

    String[] nombre = new String[cant];
    String[] puesto = new String[cant];
    float[] sueldo_ordinario = new float[cant];
    float[] sueldo_extraord = new float[cant];
    float[] bonificaciones = new float[cant];
    float[] comisiones = new float[cant];
    float[] otros = new float[cant];
    float[] totaldev = new float[cant];
    double[] igss = new double[cant];
    double[] isr = new double[cant];
    float[] anticipos = new float[cant];
    float[] desc = new float[cant];
    float[] otrosdesc = new float[cant];
    double[] totaldesc = new double[cant];
    double[] totalliq = new double[cant];



    for(int i = 0; i < cant;i++){
       nombre[i] = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA PERSONA NO. -"+(i+1));
       puesto[i] = JOptionPane.showInputDialog("DIGITE EL PUESTO DE LA PERSONA NO. -"+(i+1));
       sueldo_ordinario[i]= Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL SUELDO ORDINARIO: "));
        sueldo_extraord[i]= Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL SUELDO EXTRAORDINARIO: "));
       bonificaciones[i]= Float.parseFloat(JOptionPane.showInputDialog("DIGITE LAS BONIFICACIONES: "));
       comisiones[i]= Float.parseFloat(JOptionPane.showInputDialog("DIGITE LAS COMISIONES: "));
       otros[i]= Float.parseFloat(JOptionPane.showInputDialog("DIGITE SI HUBO OTRO TIPO DE MONTO ADICIONAL : "));
       anticipos[i]= Float.parseFloat(JOptionPane.showInputDialog("DIGITE SI HUBO ANTICIPOS : "));
        desc[i]= Float.parseFloat(JOptionPane.showInputDialog("DIGITE SI HUBO DESC.JUD : "));
        otrosdesc[i]= Float.parseFloat(JOptionPane.showInputDialog("DIGITE SI HUBO OTRO TIPO DE DESCUENTOS : "));

            igss[i] = (sueldo_ordinario[i]+sueldo_extraord[i]+comisiones[i]+otros[i])*0.0483;

        if(sueldo_ordinario[i]>=5000){
         isr[i] = sueldo_ordinario[i]*0.0119966;
        }
        else{
            isr[i] =0;
        }
        totaldesc[i] = anticipos[i]+desc[i]+otrosdesc[i]+igss[i]+isr[i];
       totaldev[i] = sueldo_ordinario[i]+sueldo_extraord[i]+bonificaciones[i]+comisiones[i]+otros[i];
       totalliq[i] = totaldev[i] - totaldesc[i];
       }

        float totalsueldo=0;
        float Tsueldo_extraord = 0;
        float Tbonificaciones = 0;
        float Tcomisiones = 0;
        float Totros = 0;
        float Ttotaldev = 0;
        double Tigss = 0;
        double Tisr = 0;
        float Tanticipos = 0;
        float Tdesc = 0;
        float Totrosdesc = 0;
        double Ttotaldesc = 0;
        double Ttotalliq = 0;


        for(int i = 0; i <cant;i++){
         totalsueldo = totalsueldo + sueldo_ordinario[i];
         Tsueldo_extraord =  Tsueldo_extraord+ sueldo_extraord[i];
         Tbonificaciones = Tbonificaciones+bonificaciones[i];
         Tcomisiones =  Tcomisiones+comisiones[i];
         Totros = Totros+otros[i];
         Ttotaldev =  Ttotaldev+totaldev[i];
         Tigss = Tigss+igss[i];
         Tisr = Tisr+isr[i];
         Tanticipos =Tanticipos+anticipos[i];
         Tdesc = Tdesc+desc[i];
         Totrosdesc = Totrosdesc+otrosdesc[i];
         Ttotaldesc = Ttotaldesc+totaldesc[i];
         Ttotalliq = Ttotalliq+totalliq[i] ;

        System.out.print(i+1+". "+nombre[i]);
        System.out.println(" -> "+puesto[i]);
        System.out.println("SUELDO ORD: "+sueldo_ordinario[i]);
        System.out.println("SUELDO EXTRAORD: "+sueldo_extraord[i]);
        System.out.println("BONIFICACIONES: "+bonificaciones[i]);
        System.out.println("COMISIONES: "+comisiones[i]);
        System.out.println("OTROS: "+otros[i]);
        System.out.println("TOTAL VEDENGADO: "+totaldev[i]);
        System.out.println("---------DESCUENTOS---------");
        System.out.println("IGSS: "+igss[i]);
        System.out.println("ISR: "+isr[i]);
        System.out.println("ANTICIPOS: "+anticipos[i]);
        System.out.println("DESC. JUD: "+desc[i]);
        System.out.println("OTROS: "+otrosdesc[i]);
        System.out.println("TOTAL DESCUENTOS: "+totaldesc[i]);
        System.out.println("---------TOTAL LIQUIDO---------");
        System.out.println("TOTAL: "+totalliq[i]);




            System.out.println(" ");
    }



            System.out.println("---------SUMAS---------");
            System.out.println("TOTAL SUELDO ORD: "+totalsueldo);
            System.out.println("SUELDO EXTRAORD: "+Tsueldo_extraord);
            System.out.println("BONIFICACIONES: "+Tbonificaciones);
            System.out.println("COMISIONES: "+Tcomisiones);
            System.out.println("OTROS: "+Totros);
            System.out.println("TOTAL VEDENGADO: "+Ttotaldev);
            System.out.println("---------DESCUENTOS---------");
            System.out.println("IGSS: "+Tigss);
            System.out.println("ISR: "+Tisr);
            System.out.println("ANTICIPOS: "+Tanticipos);
            System.out.println("DESC. JUD: "+Tdesc);
            System.out.println("OTROS: "+Totrosdesc);
            System.out.println("TOTAL DESCUENTOS: "+Ttotaldesc);
            System.out.println("---------TOTAL LIQUIDO---------");
            System.out.println("TOTAL: "+Ttotalliq);


            System.out.println(" ");



    }
}
/* JOptionPane.showMessageDialog(null,"NOMBRE "+nombre[i]);
   JOptionPane.showMessageDialog(null,"PUESTO: "+puesto[i]);*/

