package ejercicio_practico_1;

import javax.swing.JOptionPane;

public class Ejercicio_Practico_1 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
        int NFact = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de facturas a archivar"));
        double Total = 0;
        Register Regi = new Register("", 0, 0, 0.0, 0, 0, 0);
        Regi.setCId(Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del cliente")));

        for (int i = 0; i < NFact; i++) {

            Regi.setFNumber(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de factura")));
            Regi.setFAmount(Double.parseDouble(JOptionPane.showInputDialog("Digite el monto de la factura")));
            Regi.setFMonth(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de mes de la factura, sinedo 1 Enero y 12 Diciembre")));
            Regi.setFYear(Integer.parseInt(JOptionPane.showInputDialog("Digite el año de la factura")));
            Regi.setFStatus(Integer.parseInt(JOptionPane.showInputDialog("Digite el estado de la factura, donde 1 sea factura pagada y 2 factura no pagada")));
            if (Regi.getFStatus() == 2) {
                Total = Total + Regi.getFAmount();
            }
        }
        JOptionPane.showMessageDialog(null, "El cliente " + Regi.getCName() + "tiene un saldo a pagar de " + Total);
        double MPlan = Double.parseDouble(JOptionPane.showInputDialog("Digite La cantidad de meses que desea el Realizar el plan de cuatas"));
        double plan = ((Total * 0.05) + Total) / MPlan;

        
    }

}
