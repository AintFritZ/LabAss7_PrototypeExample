class DocumentRegistry {
    PdfDocument pdfPrototype;
    TextDocument textDocumentPrototype;
    SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createPdf(String fileName, String author, int pages, String name) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.fileName = fileName;
        doc.author = author;
        doc.pageCount = pages;
        doc.name = name;
        return doc;
    }

    public Document createText(int filePath, String encoding, int words) {
        TextDocument doc = (TextDocument) textDocumentPrototype.clone();
        doc.filePath = filePath;
        doc.encoding = encoding;
        doc.wordCount = words;
        return doc;
    }

    public Document createSpreadsheet(String name, int rows, int cols) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.spreadsheetName = name;
        doc.rowCount = rows;
        doc.columnCount = cols;
        return doc;
    }
}