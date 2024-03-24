/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractprojetctmethod;

import abstractprojetctmethod.economicos.CarrosEconomicos;
import abstractprojetctmethod.economicos.MotocicletasEconomicas;

/**
 *
 * @author Admin
 */
public class FabricaDeVeiculosEconomicos implements FabricaDeVeiculos{

    @Override
    public Carro criarCarro() {
        return new CarrosEconomicos();
    }

    @Override
    public Motocicleta criarMotocicleta() {
        return new MotocicletasEconomicas();
    }
    
}
