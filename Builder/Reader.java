public class Reader {

    private Converter converter;

    //Constructor
    public Reader(Converter converter) {
        this.converter = converter;
    }

    //Metodo
    public void parseInpunt(String element) {
        switch (element) {
            case "LINE":
                converter.makeLine();
                break;
            
            case "PARRAFO":
                converter.makeParagraph();
                break;

            case "TABLA":
                break;

            default:
                system.out.println("Opcion no valida");
                break;
        }
    }

}