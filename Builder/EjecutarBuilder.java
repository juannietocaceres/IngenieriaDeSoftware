public class EjecutarBuilder {

    public static void main(String[] args) {
        Converter objConvASCII = new ASCIIConverter();
        Converter objConvPS = new PostScriptConverter();
        Converter objConvPDF = new PDFConverter();

        Reader objLector1 = new Reader(objConvASCII);

        objLector1.parseInpunt("LINEA");
        objLector1.parseInpunt("PARRAFO");
        objLector1.parseInpunt("TABLA");


    }
}