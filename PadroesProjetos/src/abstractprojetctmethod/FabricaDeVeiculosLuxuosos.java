/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractprojetctmethod;

import abstractprojetctmethod.economicos.CarrosEconomicos;
import abstractprojetctmethod.luxuosos.CarrosLuxuosos;
import abstractprojetctmethod.luxuosos.MotocicletasLuxuosas;

/**
 *
 * @author Admin
 */
public class FabricaDeVeiculosLuxuosos implements FabricaDeVeiculos{

    @Override
    public Carro criarCarro() {
        return new CarrosLuxuosos();}

    @Override
    public Motocicleta criarMotocicleta() {
        return new MotocicletasLuxuosas();
    }
    
}
