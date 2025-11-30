/*
5. Implement the Template Method Pattern for a data mining application that ana-
lyzes corporate documents in various formats as shown.
*/

abstract class DataMining {

    public final String mineData (String path) {
        Object file = openFile(path);
        Object rawData = extractData(file);
        Object data = parseData(rawData);
        Object analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }

    public String openFile (String path) {
        System.out.println("File opened successfully");
    }

    public String analyzeData (Object data) {
        System.out.println("Anayzing data ...");
    }

    public void sendReport (Object rawdata) {
        System.out.println("Preparing report ...");
    }

    public void closeFile (Object data) {
        System.out.println("File closed successfully");
    }

    public abstract Object extractData(Object file);
    public abstract Object parseData(Object rawData);
}

// SubClasses
class DocDataMiner extends DataMining {

    @Override
    public Object extractData (Object data) {
        System.out.print("Extracting data from Doc File");
    }

    @Override 
    public Object parseData (Object rawData) {
        System.out.println("Parsing doc data")
    }

}

class PDFDataMiner extends DataMining {

    @Override
    public Object extractData (Object data) {
        System.out.println("Extracting data from PDF file");
    }

    @Override
    public Object parseData (Object rawData) {
        System.out.println("Parsing PDF data");
    }

}

class CSVDataMiner extends DataMining {

    @Override 
    public Object extractData (Object data) {
        System.out.println("Extracting data from CSV file");
    }

    @Override
    public Object void parseData (Object rawData) {
        System.out.println("Parsing CSV data");
    }

}

// Client Code
public class DataMiningApp {
    
    public static void main (String args[]) {
        
        DataMining docMiner = new DocDataMiner ();
        docMiner.mine("document.doc");

        DataMining csvMiner = new CSVDataMiner ();
        csvMiner.mine("data.csv");

        DataMining pdfMiner = new PDFDataMiner ();
        pdfMiner.mine("report.pdf");
    }

}
