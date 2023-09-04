package enums;

public enum TipodeSetor {

    REPTEIS("JACARE, JABUTI, TARTARUGA, COBRA"), AVES("AVESTRUZ, ARARA, TUCANO, PINGUIM, PAPAGAIO, PAVAO, CISNE, FLAMINGO" ), PRIMATAS("MACACO, LEMURE" ),
    MAMIFEROS( "ELEFANTE, GIRAFA, HIPOPOTAMO, LEAO, LOBO, LONTRA, ONCA_PINTADA, TAMANDUA, TIGRE, URSO, VEADO, ZEBRA");
     private String animal;

     TipodeSetor(String animal) {
        this.animal= animal;
    }

public String getanimal(){
    return animal;
} 


}

