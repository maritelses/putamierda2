/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.recuperación.pkg2ª.evaluación;

/**
 *
 * @author elautorsoyyocoñoooo
 */
public class TestMusicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guitarrista guitarrista = new Guitarrista("Ivan Tirado", "48547366R", 1977, Guitarrista.TipoGuitarra.Eléctrica, true);
        Bajista bajista =new Bajista("Joaquin Mahe", "77758475G", 1978, 5);
        Bateria bateria = new Bateria("Juan García", "47384712P", 1973, true);
        Cantante cantante = new Cantante("Luis García", "45634511M", 1974);
        cantante.añadirEstilo("Pop");
        cantante.añadirEstilo("Rock");

        
        Grupo miGrupo = new Grupo(guitarrista, bajista, bateria, cantante);
        
        Concierto c1 = new Concierto("Concierto en la Clave Rock Bar", "Murcia", 120);
        Concierto c2 = new Concierto("Concierto en Klimt", "Cartagena", 155);
        
        miGrupo.añadirConcierto(c1);
        miGrupo.añadirConcierto(c2);
        
        miGrupo.mostrarSueldos();
        System.out.println("DATOS DEL GRUPO: \n"+miGrupo);
        
     Grupo miGrupo1 = new Grupo(guitarrista, bajista, bateria, bateria);
        
    }
    
}
