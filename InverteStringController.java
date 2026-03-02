package controller;
//RECEBE UMA STRING E INVERTE SUAS POSIÇÕES
public class InverteStringController {

	public InverteStringController() {
		super();
	}
	    public String inverteString(String s) {
	        //CONDIÇÃO DE PARADA
	        if (s.length() <= 1) {
	            return s;
	        }
	        //CHAMADA
	        return s.substring(s.length() - 1) + inverteString(s.substring(0, s.length() - 1));
	    }
}