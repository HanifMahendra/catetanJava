Learn java language from my resources
case 8:
    try {
        CSVDataExporter exporter = new CSVDataExporter();
        exporter.exportKurir(perusahaan.getDaftarKurir());
        exporter.exportPaket(perusahaan.getDaftarPaket());

        System.out.println("Data berhasil di-export ke CSV!");
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    break;
