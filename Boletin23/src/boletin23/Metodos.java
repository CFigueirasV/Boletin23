package boletin23;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
class Metodos {
    public  int pedirNumeroPersoas() throws ForaDeRangoException {
        int idades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de persoas:"));
        if(idades>50 || idades<0){
            throw new ForaDeRangoException("O número de persoas na cola está fora dos límites");
        }
        return idades;
    }
}