/*
3. Implement both a class and an object adapter to convert XML to JSON, and vice
versa for your application.
*/

class XMLProcessor {
    public String processXML (String xmlData) {
        return "Processed XML" + xmlData;
    }
}

class JSONProcessor {
    public String processJSON (String jsonData) {
        return "Processed JSON" + jsonData;
    }
}

class XMLData {
    public String data;
    public XMLData (String data) {
        this.data = data;
    }
}

class JSONData {
    public String data;
    public JSONData (String data) {
        this.data = data;
    }
}

// Class Adapter 1 - JSON To XML
class JsonToXmlClassAdapter extends JSONProcessor {
    public String convertoJson(XMLData xmlData) {
        String processedXML = processXML(xmlData.data);
        return "{data: + processedXML + }";
    }
}

// Object Adapter 1 - JSON To XML
class JsonToXmlObjectAdapter {
    private JSONProcessor jsonProcessor = new JSONProcessor();
    
    public String convertToXml(JSONData jsonData) {
        // Convert JSON to XML format using JsonProcessor
        String processedJson = jsonProcessor.processJSON(jsonData.data);
        return "<root>" + processedJson + "</root>";
    }
}

// Class Adapter 2 - XML to JSON 
class XmlToJsonClassAdapter extends XMLProcessor {
    public String convertToJson(XMLData xmlData) {
        // Convert XML to JSON format
        String processedXml = processJSON(xmlData.data);
        return "{\"data\": \"" + processedXml + "\"}";
    }
}

// Object Adapter 2 - XML to JSON 
class XmlToJsonObjectAdapter {
    private XMLProcessor xmlProcessor = new XMLProcessor();
    
    public String convertToJson(XMLData xmlData) {
        // Convert XML to JSON format using XmlProcessor
        String processedXml = xmlProcessor.processXML(xmlData.data);
        return "{\"data\": \"" + processedXml + "\"}";
    }
}

// Main class
class AdapterPatternExample {
    public static void main(String[] args) {
        // Test Class Adapters
        XmlToJsonClassAdapter xmlToJsonClass = new XmlToJsonClassAdapter();
        JsonToXmlClassAdapter jsonToXmlClass = new JsonToXmlClassAdapter();
        
        XMLData xmlData = new XMLData("<user>John</user>");
        JSONData jsonData = new JSONData("{\"name\": \"John\"}");
        
        System.out.println("XML to JSON (Class): " + xmlToJsonClass.convertToJson(xmlData));
        System.out.println("JSON to XML (Class): " + jsonToXmlClass.convertToXml(jsonData));
        
        // Test Object Adapters
        XmlToJsonObjectAdapter xmlToJsonObject = new XmlToJsonObjectAdapter();
        JsonToXmlObjectAdapter jsonToXmlObject = new JsonToXmlObjectAdapter();
        
        System.out.println("XML to JSON (Object): " + xmlToJsonObject.convertToJson(xmlData));
        System.out.println("JSON to XML (Object): " + jsonToXmlObject.convertToXml(jsonData));
    }
}
