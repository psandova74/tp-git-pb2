package SalaDeCine;

public class SalaDeCine {
	private final Integer MAXIMO_DE_FILAS;
	private final Integer MAXIMO_DE_BUTACAS;
	private Integer salaDeCine[][];

	public SalaDeCine(Integer maximoDeFilas, Integer maximoDeButacas) {
		MAXIMO_DE_FILAS=maximoDeFilas;
		MAXIMO_DE_BUTACAS=maximoDeButacas;
		salaDeCine=new Integer[maximoDeFilas][maximoDeButacas];
		inicializarSalaDeCine();
	}
	
	public void inicializarSalaDeCine() {
		for (int i=0;i<MAXIMO_DE_FILAS;i++) {
			for (int j=0;j<MAXIMO_DE_BUTACAS;j++) {
				salaDeCine[i][j]=0;
			}	
		}
	}
	
	public Boolean consultarButaca(Integer fila, Integer butaca) {
		if (salaDeCine[fila][butaca]==0) {
			return true;
		}
		return false;
	}
	
	//4. Consultar la cantidad total de butacas ocupadas
	public Integer cantidadButacasOcupadas() {
		Integer cantidadButacas=0;
		for (int i=0;i<MAXIMO_DE_FILAS;i++) {
			for (int j=0;j<MAXIMO_DE_BUTACAS;j++) {
				if (salaDeCine[i][j]==1) {
					cantidadButacas++;
				}
			}	
		}
		return cantidadButacas;
		
	}

}
