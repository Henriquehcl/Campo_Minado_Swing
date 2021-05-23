package cm.campo.minado.model;

//@FunctionalInterface
public interface CampoObservador {
	
	public default void eventoOcorreu(Campo campo, CampoEvento evento) {
		
	}

}
