/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiasystem;

import java.io.File;
import utils.LeituraEscritaConfigBanco;
import view.FrmConnect;
import view.FrmTelaLogin;

/**
 *
 * @author wesle
 */
public class AcademiaSystem {

    /**
     * @param args the command line arguments
     */
    public AcademiaSystem() {
    }

    public static void main(String[] args) {

        LeituraEscritaConfigBanco existe = new LeituraEscritaConfigBanco();
                
        if (existe.fileExist()) {
            FrmTelaLogin.main(args);
        } else {
            FrmConnect.main(args);
        }

    }
}

