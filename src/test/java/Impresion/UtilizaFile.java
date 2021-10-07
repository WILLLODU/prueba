package Impresion;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class UtilizaFile {
	
	GenerarEvidencia ImprEvi;
	
	public void PasoDelScript (String descripcionPaso) throws InvalidFormatException, IOException, HeadlessException, AWTException {
		ImprEvi.OpenFile(1, descripcionPaso);
		ImprEvi.screenshoot();
	
	}
	public void InicializaFile () throws InvalidFormatException, IOException, HeadlessException, AWTException {
		ImprEvi.defineVariables();
	}
	
	public void GeneraEvidencia (String NombreArchivo) throws IOException {
		ImprEvi.CloseFile(NombreArchivo);
	}

}
